package at.ac.tuwien.big.cpsml.codegen;


import at.ac.tuwien.big.cpsml.codegen.lib.CyberPhysicalSystemRunner;
import production.ProductionRunner;

public class CyberPhysicalSystemRunnerProvider {

	public static CyberPhysicalSystemRunner getProductionRunner() {
		// TODO: return a CyberPhysicalSystemRunner
		
		ProductionRunner productionRunner = new ProductionRunner();
		
		return productionRunner;
		//return null;
	}	
}
