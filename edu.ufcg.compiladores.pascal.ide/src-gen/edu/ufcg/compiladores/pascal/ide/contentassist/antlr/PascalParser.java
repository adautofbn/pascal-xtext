/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.ide.contentassist.antlr;

import com.google.inject.Inject;
import edu.ufcg.compiladores.pascal.ide.contentassist.antlr.internal.InternalPascalParser;
import edu.ufcg.compiladores.pascal.services.PascalGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class PascalParser extends AbstractContentAssistParser {

	@Inject
	private PascalGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPascalParser createParser() {
		InternalPascalParser result = new InternalPascalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPascalParser typedParser = (InternalPascalParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PascalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}