/*
 * generated by Xtext 2.22.0
 */
package at.ac.tuwien.big.ide;

import at.ac.tuwien.big.CpsmlRuntimeModule;
import at.ac.tuwien.big.CpsmlStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CpsmlIdeSetup extends CpsmlStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CpsmlRuntimeModule(), new CpsmlIdeModule()));
	}
	
}
