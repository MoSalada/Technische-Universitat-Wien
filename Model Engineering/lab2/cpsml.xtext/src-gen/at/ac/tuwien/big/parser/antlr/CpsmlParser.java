/*
 * generated by Xtext 2.27.0
 */
package at.ac.tuwien.big.parser.antlr;

import at.ac.tuwien.big.parser.antlr.internal.InternalCpsmlParser;
import at.ac.tuwien.big.services.CpsmlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CpsmlParser extends AbstractAntlrParser {

	@Inject
	private CpsmlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCpsmlParser createParser(XtextTokenStream stream) {
		return new InternalCpsmlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CPS";
	}

	public CpsmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CpsmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
