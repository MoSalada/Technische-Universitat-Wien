package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.CPS

class RunnerGenerator {
		
	def generate(CPS cps)
	'''
	package production;
	
	import java.util.Arrays;
	import java.util.Map;
	
	import at.ac.tuwien.big.cpsml.codegen.lib.DataSource;
	import at.ac.tuwien.big.cpsml.codegen.lib.CyberPhysicalSystemRunner;
	import at.ac.tuwien.big.cpsml.codegen.lib.Util;
	
	
	«FOR e : cps.environment»
		import production.environment.«e.name»;
	«ENDFOR»
	
	«FOR e : cps.environment»
		«FOR n : e.node»
			import production.node.«n.name»;
		«ENDFOR»
	«ENDFOR»
	
	«FOR m : cps.messageBroker»
		import production.messageBroker.«m.name»;
	«ENDFOR»
	
	
	«FOR c : cps.controller»
		import production.controller.«c.name»;
	«ENDFOR»
	
	public class «cps.name.toFirstUpper + "Runner"» implements CyberPhysicalSystemRunner {
	
		«FOR c : cps.controller»
		private «c.name» «c.name.toFirstLower»;
		«ENDFOR»
		
		«FOR m : cps.messageBroker»
		private «m.name» «m.name.toFirstLower»;
		«ENDFOR»
		
		«FOR e : cps.environment»
		private «e.name» «e.name.toFirstLower»;
		«ENDFOR»
		
		«FOR e : cps.environment»
			«FOR n : e.node»
				private «n.name» «n.name.toFirstLower»;
			«ENDFOR»
		«ENDFOR»
		
		private int stepCount = 0;
		
		@SuppressWarnings("unchecked")
		@Override
		public void setup(Map<String, DataSource<?>> dataSources) {
			System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
			System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
			System.out.println(Util.ANSI_BOLD + "=================================================================================\n" + Util.ANSI_RESET);
			
			//Setup Message Brokers:
			«FOR m : cps.messageBroker»
				«m.name.toFirstLower» = new «m.name»("«m.name.toFirstLower»");
				System.out.println("	Created Message Broker: " + «m.name.toFirstLower».toString());
				
			«ENDFOR»
			
			System.out.println("---------------------------------------------------------------------------------");
	
			//Setup Environments:
			«FOR e : cps.environment»
				«e.name.toFirstLower» = new «e.name»("«e.name.toFirstLower»");
				System.out.println("	Created Environment: " + «e.name.toFirstLower».toString());
				
			«ENDFOR»
			
			System.out.println("---------------------------------------------------------------------------------");
			
			//Setup Nodes:
			
			«FOR e : cps.environment»
				«FOR n : e.node»
					«n.name.toFirstLower» = new «n.name»("«n.name.toFirstLower»");
					System.out.println("	Created Node: «n.name.toFirstLower»");
				«ENDFOR»
			«ENDFOR»
			
			System.out.println("---------------------------------------------------------------------------------");
			
			//Setup Controllers:
			«FOR c : cps.controller»
				«c.name.toFirstLower» = new «c.name»("«c.name.toFirstLower»",(DataSource<String>)dataSources.get("«c.name.toFirstLower»"));
				System.out.println("	Created Controller: «c.name»");
			«ENDFOR»
			System.out.println(Util.ANSI_BOLD + "\n=================================================================================\n" + Util.ANSI_RESET);
			
			//Create MessageLinks 
			«FOR e : cps.environment»
				«FOR n : e.node»
					«FOR s : n.subscription»
						«n.name.toFirstLower».addSubscription(«s.messageBroker.name.toFirstLower», Arrays.asList(«FOR t : s.topics SEPARATOR ","»"«t»"«ENDFOR»));
					«ENDFOR»
					«FOR s : n.publication»
						«n.name.toFirstLower».addPublication(«s.messageBroker.name.toFirstLower», Arrays.asList(«FOR t : s.topics SEPARATOR ","»"«t»"«ENDFOR»));
					«ENDFOR»
				«ENDFOR»
			«ENDFOR»
			
			«FOR c : cps.controller»
				«FOR s : c.subscription»
					«c.name.toFirstLower».addSubscription(«s.messageBroker.name.toFirstLower», Arrays.asList(«FOR t : s.topics SEPARATOR ","»"«t»"«ENDFOR»));
				«ENDFOR»
				«FOR s : c.publication»
					«c.name.toFirstLower».addPublication(«s.messageBroker.name.toFirstLower», Arrays.asList(«FOR t : s.topics SEPARATOR ","»"«t»"«ENDFOR»));
				«ENDFOR»
			«ENDFOR»
			
			System.out.println(Util.ANSI_BOLD + "\n=================================================================================\n" + Util.ANSI_RESET);
		}
		
		@Override
		public void step() {
			stepCount++;
			System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================\n" + Util.ANSI_RESET);
			
			«FOR c : cps.controller»
				«c.name.toFirstLower».step();
			«ENDFOR»
			
			System.out.println("---------------------------------------------------------------------------------");
			
			«FOR e : cps.environment»
				«FOR n : e.node»
					«n.name.toFirstLower».step();
				«ENDFOR»
			«ENDFOR»
			
			System.out.println("---------------------------------------------------------------------------------");
			
			«FOR m : cps.messageBroker»
				«m.name.toFirstLower».step();
			«ENDFOR»
			
			System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		}
	}
	
	
	'''
	
}