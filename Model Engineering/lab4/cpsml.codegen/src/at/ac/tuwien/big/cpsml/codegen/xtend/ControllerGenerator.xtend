package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.Controller

class ControllerGenerator {
		
	def generate(String packageName, Controller controller)
	//# TODO: Validate
	'''
	package «packageName».controller;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	
	import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
	import at.ac.tuwien.big.cpsml.codegen.lib.MessagingElement;
	import at.ac.tuwien.big.cpsml.codegen.lib.DataSource;
	
	
	public class «controller.name» implements MessagingElement { // CHANGE
	
		private String name;
		private List<String> topics;
		private Map<Linkable,List<String>> publicationLinks;
		private Map<Linkable,List<String>> subscriptionLinks;
		private DataSource<String> dataSource;
		private List<String> messageQueryCache;
		private List<String> messageGeneratorCache;
		
		
		public «controller.name»(String name, DataSource<String> dataSource) {
			this.name = name;
			
			this.topics = Arrays.asList(
			
			«FOR t : controller.topics SEPARATOR ','»
				"«t»"
			«ENDFOR»
			);
			
			this.dataSource = dataSource;
			this.publicationLinks = new HashMap<>();
			this.subscriptionLinks = new HashMap<>();
			this.messageGeneratorCache = new ArrayList<String>();
		}
		
		public String toString(){
			return name;
		}
		
		private List<String> mergeStringLists(List<String> s1, List<String> s2) {
			List<String> merged = new ArrayList<String>();
			merged.addAll(s1);
			merged.addAll(s2);
			return merged;
		}
				
		@Override
		public void addPublication(Linkable mB, List<String> topics) {
			publicationLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
			System.out.println("    🟦 «controller.name» added new Publication on " + topics.toString() +" to "+ mB.toString()); // CHANGE
		}
	
		@Override
		public void addSubscription(Linkable mB, List<String> topics) {
			subscriptionLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
			System.out.println("    🟥 «controller.name» added new Subscription on " + topics.toString() +" to "+ mB.toString()); // CHANGE
		}
	
		public void generateMessages(){
			// Messages format: topic-recipient-content
			String content = dataSource.next();
			if (content == null) {
				content = "";
			}
			messageGeneratorCache.add(content);
		}
		
		@Override
		public void sendAllMessages() {
			for (String msg : messageGeneratorCache){
				for (Map.Entry<Linkable,List<String>> plink : publicationLinks.entrySet()) {
					if (plink.getValue().contains(msg.split("-")[0])){
						this.sendMessage(plink.getKey(), msg);
					}
				}
			}
		}
		
		@Override
		public void sendMessage(Linkable mB, String msg) {
					System.out.println("    📤 Publishing message to MessageBroker " + mB.toString());
					mB.queueMessage(msg);
		}
	
		@Override
		public String queryMessages() {
			for (Entry<Linkable, List<String>> link : publicationLinks.entrySet()) {
				for (String topic: this.topics){
					messageQueryCache.addAll(link.getKey().retrieveMessages(topic, this.name));
				}
			};
			return null;
		}
	
		public void step(){
			generateMessages();
			if (messageGeneratorCache.get(0).equals("")) {
				System.out.println("    ℹ️ No new message from " + this.name);
			} else {
				sendAllMessages();
			}
			messageGeneratorCache.clear();
		}
	}
	
	'''
	
}