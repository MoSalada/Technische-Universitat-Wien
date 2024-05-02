package at.ac.tuwien.big.cpsml.codegen.xtend

import cpsml.Environment

class EnvironmentGenerator {
	
	public static final String ENV_PACKAGE = "environment"
	
	def generate(String packageName, Environment env)
	'''
	
	
	package «packageName».«ENV_PACKAGE»;
	
	public class «env.name» {
	
		private String name;
	
		public «env.name»(String name) {
			this.name = name;
		}
	
		public String toString(){
			return name;
		}
	
	}
	
	'''
	
}