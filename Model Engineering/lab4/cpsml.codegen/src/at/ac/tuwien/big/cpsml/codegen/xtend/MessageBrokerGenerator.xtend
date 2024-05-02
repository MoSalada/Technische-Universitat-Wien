package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.MessageBroker

class MessageBrokerGenerator {
	
	def generate(String packageName, MessageBroker messageBroker)
	'''
	package «packageName».messageBroker;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	
	import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
		
	public class «messageBroker.name» implements Linkable{
	
		private String name;
		private List<String> topics;
		
		«FOR t : messageBroker.topics»
			private List<String> «t»Queue;
		«ENDFOR»
		
		public «messageBroker.name»(String name) {
			this.name = name;
			this.topics = Arrays.asList(«FOR t : messageBroker.topics SEPARATOR ','»"«t»"«ENDFOR»);
						
			«FOR t : messageBroker.topics»
				«t»Queue = new ArrayList<String>();
			«ENDFOR»
		}
		
		@Override
		public String toString(){
			return name;
		}
		
		@Override
		public String getTopics(){
			return topics.toString();
		}
		
		@Override
		public void queueMessage(String msg) {
			switch (msg.split("-")[0]){
			«FOR t : messageBroker.topics»
				case "«t»": «t»Queue.add(msg);
					break;
			«ENDFOR»
			}
			System.out.println("    " + this.name + ": 📩️ New Message added to queue " + (msg.split("-")[0]));
		}
		
		@Override
		public List<String> retrieveMessages(String topic, String recipient) {
			List<String> returnMsg = new ArrayList<String>();
			List<String> queue = new ArrayList<String>();
			
			switch (topic){
				«FOR t : messageBroker.topics»
				
				case "«t»": queue = «t»Queue;
					break;
				«ENDFOR»
			}
			
			for (String msg : queue) {
				if (msg.split("-")[1].equals(recipient) | msg.split("-")[1].equals("")) {
					returnMsg.add(msg);
				}
			}
			return returnMsg;
		}
		
		public void step(){
			System.out.println("    📨 " + this.name + " queues info:");
			
			«FOR t : messageBroker.topics»
			System.out.println("        > «t.toFirstUpper»Queue size: " + «t»Queue.size());
			«ENDFOR»
			System.out.print("    "+this.name + " clearing queues ...");
			
			«FOR t : messageBroker.topics»
			«t»Queue.clear();
			System.out.print("«t»Queue cleared,");
			«ENDFOR»
			
			System.out.print(this.name +" clearing completed");
			System.out.println();
			System.out.println();
		}
	}
	
	'''
	
}