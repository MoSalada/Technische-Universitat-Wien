package at.ac.tuwien.big.cpsml.codegen.xtend

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import cpsml.CPS

class CpsmlGenerator extends AbstractGenerator {
			
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
				
				val cps = input.allContents.filter(CPS).next
				val controllerGenerator = new ControllerGenerator
				val envGenerator = new EnvironmentGenerator
				val messageBrokerGenerator = new MessageBrokerGenerator
				val nodeGenerator = new NodeGenerator
				val compGenerator = new ComponentGenerator
				cps.controller.forEach [ contr |
					fsa.generateFile("production/controller/" + contr.name + ".java", controllerGenerator.generate("production",contr))
				]
				
				cps.environment.forEach [ env |
					fsa.generateFile("production/environment/" + env.name + ".java", envGenerator.generate("production",env))
				]
				cps.messageBroker.forEach [ m |
					fsa.generateFile("production/messageBroker/" + m.name + ".java", messageBrokerGenerator.generate("production", m));
				]
				cps.environment.forEach [ e | 
					e.node.forEach[ n |
						fsa.generateFile("production/node/" + n.name + ".java", nodeGenerator.generate("production",n));
					]
				]
				cps.environment.forEach [ e | 
					e.node.forEach[ n |
						n.component.forEach [ c |
							fsa.generateFile("production/component/" + c.name + ".java", compGenerator.generate("production",c));
						]
					]
				]
				
				val runnerGenerator = new RunnerGenerator
				fsa.generateFile("production/" + cps.name.toFirstUpper + "Runner.java", runnerGenerator.generate(cps))
	}
	
}