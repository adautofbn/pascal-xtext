/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.idea.highlighting;

import edu.ufcg.compiladores.pascal.idea.lang.PascalLanguage;
import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;

public class PascalSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public PascalSemanticHighlightVisitor() {
		PascalLanguage.INSTANCE.injectMembers(this);
	}
}
