package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.Sensor
import cpsml.Actuator
import cpsml.DataType
import com.ibm.icu.text.SearchIterator.ElementComparisonType

class ComponentGenerator {
	
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
	
	def dispatch searchForInt(Sensor comp) {
		var searching = true
		for (f : comp.function) {
			if (f.returnDataType==DataType.INT) {
				searching = false
			}
		}
		if (searching==false) {
			'''import java.util.Random;'''
		}
	}
	
	def dispatch searchForInt(Actuator comp) {
		var searching = true
		for (f : comp.function) {
			if (f.returnDataType==DataType.INT) {
				searching = false
			}
		}
		if (searching==false) {
			'''import java.util.Random;'''
		}
	}
	
	
	def dispatch generate(String packageName, Sensor comp)
	'''
	package «packageName».component;
	
	import java.util.List;
	«searchForInt(comp)»
	
	public class «comp.name» {
		
		private String name;
		private double frequency;
		private String topic;
		private int internalStepCount;
		
		public «comp.name»(String name) {
			this.name = name;
			this.frequency = 0.25;
			this.topic = "«comp.topic»";
			this.internalStepCount = 0;
		}
		
		public String getName() {
			return name;
		}
		
		public String getTopic(){
			return this.topic;
		}
		
		«FOR f : comp.function»
		
		public «formatDataType(f.returnDataType)» «f.name.toFirstLower»(){
			System.out.println("    🟣  Sensor timed function execution: " + this.name + " -> «f.name.toFirstLower»() returning type «f.returnDataType»");
			«IF f.returnDataType==DataType.INT»
				return new Random().nextInt(100);
			«ELSEIF f.returnDataType==DataType.STRING»
				return "_DummyString_";
			«ELSE»
				return;
			«ENDIF»
			}
		«ENDFOR»
		
		public void addMessageToNodeOutgoingCache(String topic, String msgContent, String recipient, List<String> msgOutCache) {
			msgOutCache.add(topic + "-" + recipient + "-" + msgContent);
		}
		
		public void step(List<String> msgOutCache) {
			if (this.internalStepCount % (1/frequency) == 0 ) {
				«FOR f : comp.function»
					addMessageToNodeOutgoingCache(this.topic, "" + this.«f.name.toFirstLower»(), "NONE" , msgOutCache);
				«ENDFOR»
				
			}
			this.internalStepCount++;
		}
	}
	
	'''
	
	def dispatch generate(String packageName, Actuator comp)
	'''
	package production.component;
	
	import java.util.Arrays;
	import java.util.Iterator;
	«searchForInt(comp)»
	
	public class «comp.name»{
		
		private String name;
		private int runs;
		private int ratedRuns;
		private String topic;
		
		public «comp.name»(String name) {
			this.name = name;
			this.runs = 70;
			this.ratedRuns = 100;
			this.topic = "«comp.topic»";
		}
		
		«FOR f : comp.function»
				public «formatDataType(f.returnDataType)» «f.name.toFirstLower»(«FOR p : f.parameter SEPARATOR ","»«formatDataType(p.dataType)» «p.name.toFirstLower»«ENDFOR»){
					System.out.println("    🔵  Actuator called function execution: " + this.name + " -> «f.name.toFirstLower»() returning type «f.returnDataType»");
					«IF f.returnDataType==DataType.INT»
						return new Random().nextInt(100);
					«ELSEIF f.returnDataType==DataType.STRING»
						return "_DummyString_";
					«ELSE»
						return;
					«ENDIF»
					}
			«IF f.parameter.length>0»
					public void «f.name.toFirstLower»(String[] input){
						Iterator<String> inputIter = Arrays.asList(input).iterator();
						
						«f.name.toFirstLower»( Integer.parseInt(inputIter.next()));
						return;
					}
			«ENDIF»
		«ENDFOR»
			
		public String getName() {
			return name;
		}
		
		public String getTopic(){
			return this.topic;
		}
		
		public void step(){
		}
	}
	'''
}