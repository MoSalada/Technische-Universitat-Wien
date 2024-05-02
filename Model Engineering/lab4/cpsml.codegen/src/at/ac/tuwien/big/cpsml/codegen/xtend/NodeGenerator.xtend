package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.Node
import cpsml.Sensor
import cpsml.Actuator
import cpsml.DataType

class NodeGenerator {
	
	def formatDataType(DataType dt) {
		if (dt==DataType.STRING) {
			'''String'''
		} else if (dt==DataType.INT) {
			'''int'''
		} else if (dt==DataType.BOOLEAN) {
			'''boolean'''
		} else {
			'''void'''
		}
	}
	
	def dispatch componentStep(Sensor sensor)
	'''
	«sensor.name.toFirstLower».step(msgOutCache);
	'''
	def dispatch componentStep(Actuator sensor)
	'''
	'''
	
	def generate(String packageName, Node node)
	'''
	
	
	package «packageName».node;
	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;
	
	
	import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
	import at.ac.tuwien.big.cpsml.codegen.lib.MessagingElement;
	
	«FOR c : node.component»
			import «packageName».component.«c.name.toFirstUpper»;
	«ENDFOR»
	
	public class «node.name» implements MessagingElement {
	
		private String name;
		private Map<Linkable,List<String>> publicationLinks;
		private Map<Linkable,List<String>> subscriptionLinks;
		private List<String> msgInCache;
		private List<String> msgOutCache;
		
		«FOR c : node.component»
			private «c.name» «c.name.toFirstLower»;
		«ENDFOR»
		
		public «node.name»(String name) {
			this.name = name;
			this.publicationLinks = new HashMap<>();
			this.subscriptionLinks = new HashMap<>();
			this.msgInCache = new ArrayList<String>();
			this.msgOutCache = new ArrayList<String>();
			
			«FOR c : node.component»
				«c.name.toFirstLower» = new «c.name»("«c.name.toFirstLower»");
				System.out.println("	Created Component of «node.name»: «c.name»");
			«ENDFOR»
			
		}
		
		private List<String> mergeStringLists(List<String> s1, List<String> s2) {
			List<String> merged = new ArrayList<String>();
			merged.addAll(s1);
			merged.addAll(s2);
			return merged;
		}
		
		// Publication MessagingLinks to the same MessageBroker are merged, combining their topics
		@Override
		public void addPublication(Linkable mB, List<String> topics) {
			publicationLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
			System.out.println("    🟥 «node.name» added new Publication on " + topics.toString() +" to "+ mB.toString());
		}
		
		// Subscription MessagingLinks to the same MessageBroker are merged, combining their topics
		@Override
		public void addSubscription(Linkable mB, List<String> topics) {
			subscriptionLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
			System.out.println("    🟦 «node.name» added new Subscription on " + topics.toString() +" to "+ mB.toString());
		}
	
		public void addMessageToOutgoingCache(String topic, String msgContent, String recipient) {
			msgOutCache.add(topic + "-" + recipient + "-" + msgContent);
		}
		
		public void addMessageToOutgoingCache(String topic, String msgContent) {
			msgOutCache.add(topic + "--" + msgContent);
		}
		
		public void sendMessage(Linkable mB, String msg){
			mB.queueMessage(msg);
		}
		
		@Override
		public void sendAllMessages() {
			for (Entry<Linkable, List<String>> link : publicationLinks.entrySet()) {
				for (String msgOut: msgOutCache){
					if (link.getValue().contains(msgOut.split("-")[0])){
						sendMessage(link.getKey(), msgOut);
					}
				}
			}
		}
	
		@Override
		public String queryMessages() {
			for (Entry<Linkable, List<String>> link : subscriptionLinks.entrySet()) {
				for (String topic: this.getTopics()){
					msgInCache.addAll(link.getKey().retrieveMessages(topic, this.name));
				}
			};
			return null;
		}
		
		public void routeMessages() {
			for (String msg : msgInCache) {
				String msgContent = msg.split("-")[2];
				String msgComponent = msgContent.split("\\.")[0];
				String msgFunction = msgContent.split("\\.")[1];
				String msgFunctionName = msgFunction.split("\\(")[0];
				String[] msgFunctionParameters = {""};
				if (!msgFunction.split("\\(")[1].equals(")")) {
					String msgFunctionParametersConcatenated = msgFunction.split("\\(")[1].split("\\)")[0];
					msgFunctionParameters = msgFunctionParametersConcatenated.split(",");
				}
				switch (msgComponent) {
					
				«FOR c : node.component»
					case "«c.name.toFirstLower»":
								switch (msgFunctionName) {
									«FOR func : c.function»
									case "«func.name»":
										«IF func.hasReturn»«formatDataType(func.returnDataType)» compReturn = «ENDIF»this.«c.name.toFirstLower».«func.name.toFirstLower»(«IF func.parameter.length>0»msgFunctionParameters«ENDIF»);
										addMessageToOutgoingCache(«c.name.toFirstLower».getTopic(), "«c.name.toFirstLower».«func.name»() -> «IF func.hasReturn»"+compReturn«ELSE»EXECUTED"«ENDIF»);
										break;
								«ENDFOR»
								}
						break;
				«ENDFOR»
				default:
					break;
				}
			}
		}
		
		public List<String> getTopics(){
			Set<String> topics = new HashSet<>();
			«FOR c : node.component»
				topics.add(«c.name.toFirstLower».getTopic());
			«ENDFOR»
			return new ArrayList<>(topics);
		}
		public String getName() {
			return name;
		}
		
		public void step(){
			msgInCache.clear();
			msgOutCache.clear();
			
			queryMessages();
			routeMessages();
			
			«FOR c : node.component»
				«componentStep(c)»
			«ENDFOR»
			
			sendAllMessages();
		}
	
	}
	'''
	
}