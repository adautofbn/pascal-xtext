/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PascalStandaloneSetup extends PascalStandaloneSetupGenerated {

	def static void doSetup() {
		new PascalStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
