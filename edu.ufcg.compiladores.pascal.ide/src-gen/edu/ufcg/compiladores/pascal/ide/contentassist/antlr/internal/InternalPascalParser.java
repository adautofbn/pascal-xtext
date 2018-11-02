package edu.ufcg.compiladores.pascal.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.ufcg.compiladores.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'div'", "'mod'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'boolean'", "'integer'", "'string'", "'program'", "';'", "'var'", "':'", "','", "':='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }


    	private PascalGrammarAccess grammarAccess;

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePascal"
    // InternalPascal.g:54:1: entryRulePascal : rulePascal EOF ;
    public final void entryRulePascal() throws RecognitionException {
        try {
            // InternalPascal.g:55:1: ( rulePascal EOF )
            // InternalPascal.g:56:1: rulePascal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePascal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePascal"


    // $ANTLR start "rulePascal"
    // InternalPascal.g:63:1: rulePascal : ( ( rule__Pascal__Group__0 )? ) ;
    public final void rulePascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:67:2: ( ( ( rule__Pascal__Group__0 )? ) )
            // InternalPascal.g:68:2: ( ( rule__Pascal__Group__0 )? )
            {
            // InternalPascal.g:68:2: ( ( rule__Pascal__Group__0 )? )
            // InternalPascal.g:69:3: ( rule__Pascal__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getGroup()); 
            }
            // InternalPascal.g:70:3: ( rule__Pascal__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:70:4: rule__Pascal__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pascal__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:79:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:80:1: ( ruleprogram EOF )
            // InternalPascal.g:81:1: ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:88:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:92:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:93:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:93:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalPascal.g:95:3: ( rule__Program__Group__0 )
            // InternalPascal.g:95:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRulevar_decl"
    // InternalPascal.g:104:1: entryRulevar_decl : rulevar_decl EOF ;
    public final void entryRulevar_decl() throws RecognitionException {
        try {
            // InternalPascal.g:105:1: ( rulevar_decl EOF )
            // InternalPascal.g:106:1: rulevar_decl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevar_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevar_decl"


    // $ANTLR start "rulevar_decl"
    // InternalPascal.g:113:1: rulevar_decl : ( ( rule__Var_decl__Group__0 ) ) ;
    public final void rulevar_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:117:2: ( ( ( rule__Var_decl__Group__0 ) ) )
            // InternalPascal.g:118:2: ( ( rule__Var_decl__Group__0 ) )
            {
            // InternalPascal.g:118:2: ( ( rule__Var_decl__Group__0 ) )
            // InternalPascal.g:119:3: ( rule__Var_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup()); 
            }
            // InternalPascal.g:120:3: ( rule__Var_decl__Group__0 )
            // InternalPascal.g:120:4: rule__Var_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevar_decl"


    // $ANTLR start "entryRulevar_list"
    // InternalPascal.g:129:1: entryRulevar_list : rulevar_list EOF ;
    public final void entryRulevar_list() throws RecognitionException {
        try {
            // InternalPascal.g:130:1: ( rulevar_list EOF )
            // InternalPascal.g:131:1: rulevar_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevar_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevar_list"


    // $ANTLR start "rulevar_list"
    // InternalPascal.g:138:1: rulevar_list : ( ( rule__Var_list__Alternatives ) ) ;
    public final void rulevar_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:142:2: ( ( ( rule__Var_list__Alternatives ) ) )
            // InternalPascal.g:143:2: ( ( rule__Var_list__Alternatives ) )
            {
            // InternalPascal.g:143:2: ( ( rule__Var_list__Alternatives ) )
            // InternalPascal.g:144:3: ( rule__Var_list__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getAlternatives()); 
            }
            // InternalPascal.g:145:3: ( rule__Var_list__Alternatives )
            // InternalPascal.g:145:4: rule__Var_list__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevar_list"


    // $ANTLR start "entryRuleatrib"
    // InternalPascal.g:154:1: entryRuleatrib : ruleatrib EOF ;
    public final void entryRuleatrib() throws RecognitionException {
        try {
            // InternalPascal.g:155:1: ( ruleatrib EOF )
            // InternalPascal.g:156:1: ruleatrib EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleatrib();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleatrib"


    // $ANTLR start "ruleatrib"
    // InternalPascal.g:163:1: ruleatrib : ( ( rule__Atrib__Group__0 ) ) ;
    public final void ruleatrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:167:2: ( ( ( rule__Atrib__Group__0 ) ) )
            // InternalPascal.g:168:2: ( ( rule__Atrib__Group__0 ) )
            {
            // InternalPascal.g:168:2: ( ( rule__Atrib__Group__0 ) )
            // InternalPascal.g:169:3: ( rule__Atrib__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getGroup()); 
            }
            // InternalPascal.g:170:3: ( rule__Atrib__Group__0 )
            // InternalPascal.g:170:4: rule__Atrib__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleatrib"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:179:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:180:1: ( ruleexpression EOF )
            // InternalPascal.g:181:1: ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:188:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:192:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:193:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:193:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:194:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalPascal.g:195:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:195:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesecondExp"
    // InternalPascal.g:204:1: entryRulesecondExp : rulesecondExp EOF ;
    public final void entryRulesecondExp() throws RecognitionException {
        try {
            // InternalPascal.g:205:1: ( rulesecondExp EOF )
            // InternalPascal.g:206:1: rulesecondExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesecondExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesecondExp"


    // $ANTLR start "rulesecondExp"
    // InternalPascal.g:213:1: rulesecondExp : ( ( rule__SecondExp__Group__0 ) ) ;
    public final void rulesecondExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:217:2: ( ( ( rule__SecondExp__Group__0 ) ) )
            // InternalPascal.g:218:2: ( ( rule__SecondExp__Group__0 ) )
            {
            // InternalPascal.g:218:2: ( ( rule__SecondExp__Group__0 ) )
            // InternalPascal.g:219:3: ( rule__SecondExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getGroup()); 
            }
            // InternalPascal.g:220:3: ( rule__SecondExp__Group__0 )
            // InternalPascal.g:220:4: rule__SecondExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecondExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesecondExp"


    // $ANTLR start "entryRuleoperator"
    // InternalPascal.g:229:1: entryRuleoperator : ruleoperator EOF ;
    public final void entryRuleoperator() throws RecognitionException {
        try {
            // InternalPascal.g:230:1: ( ruleoperator EOF )
            // InternalPascal.g:231:1: ruleoperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleoperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // InternalPascal.g:238:1: ruleoperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleoperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:242:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalPascal.g:243:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalPascal.g:243:2: ( ( rule__Operator__Alternatives ) )
            // InternalPascal.g:244:3: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // InternalPascal.g:245:3: ( rule__Operator__Alternatives )
            // InternalPascal.g:245:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRulearit_op"
    // InternalPascal.g:254:1: entryRulearit_op : rulearit_op EOF ;
    public final void entryRulearit_op() throws RecognitionException {
        try {
            // InternalPascal.g:255:1: ( rulearit_op EOF )
            // InternalPascal.g:256:1: rulearit_op EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_opRule()); 
            }
            pushFollow(FOLLOW_1);
            rulearit_op();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_opRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearit_op"


    // $ANTLR start "rulearit_op"
    // InternalPascal.g:263:1: rulearit_op : ( ( rule__Arit_op__Alternatives ) ) ;
    public final void rulearit_op() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:267:2: ( ( ( rule__Arit_op__Alternatives ) ) )
            // InternalPascal.g:268:2: ( ( rule__Arit_op__Alternatives ) )
            {
            // InternalPascal.g:268:2: ( ( rule__Arit_op__Alternatives ) )
            // InternalPascal.g:269:3: ( rule__Arit_op__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_opAccess().getAlternatives()); 
            }
            // InternalPascal.g:270:3: ( rule__Arit_op__Alternatives )
            // InternalPascal.g:270:4: rule__Arit_op__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Arit_op__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_opAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearit_op"


    // $ANTLR start "entryRulerel_op"
    // InternalPascal.g:279:1: entryRulerel_op : rulerel_op EOF ;
    public final void entryRulerel_op() throws RecognitionException {
        try {
            // InternalPascal.g:280:1: ( rulerel_op EOF )
            // InternalPascal.g:281:1: rulerel_op EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_opRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerel_op();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_opRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerel_op"


    // $ANTLR start "rulerel_op"
    // InternalPascal.g:288:1: rulerel_op : ( ( rule__Rel_op__Alternatives ) ) ;
    public final void rulerel_op() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:292:2: ( ( ( rule__Rel_op__Alternatives ) ) )
            // InternalPascal.g:293:2: ( ( rule__Rel_op__Alternatives ) )
            {
            // InternalPascal.g:293:2: ( ( rule__Rel_op__Alternatives ) )
            // InternalPascal.g:294:3: ( rule__Rel_op__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_opAccess().getAlternatives()); 
            }
            // InternalPascal.g:295:3: ( rule__Rel_op__Alternatives )
            // InternalPascal.g:295:4: rule__Rel_op__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rel_op__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_opAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerel_op"


    // $ANTLR start "entryRuleSomeValue"
    // InternalPascal.g:304:1: entryRuleSomeValue : ruleSomeValue EOF ;
    public final void entryRuleSomeValue() throws RecognitionException {
        try {
            // InternalPascal.g:305:1: ( ruleSomeValue EOF )
            // InternalPascal.g:306:1: ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // InternalPascal.g:313:1: ruleSomeValue : ( ( rule__SomeValue__Alternatives ) ) ;
    public final void ruleSomeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:317:2: ( ( ( rule__SomeValue__Alternatives ) ) )
            // InternalPascal.g:318:2: ( ( rule__SomeValue__Alternatives ) )
            {
            // InternalPascal.g:318:2: ( ( rule__SomeValue__Alternatives ) )
            // InternalPascal.g:319:3: ( rule__SomeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }
            // InternalPascal.g:320:3: ( rule__SomeValue__Alternatives )
            // InternalPascal.g:320:4: rule__SomeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SomeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "ruleType"
    // InternalPascal.g:329:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:333:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:334:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:334:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:335:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalPascal.g:336:3: ( rule__Type__Alternatives )
            // InternalPascal.g:336:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Var_list__Alternatives"
    // InternalPascal.g:344:1: rule__Var_list__Alternatives : ( ( ( rule__Var_list__IdentifierAssignment_0 ) ) | ( ( rule__Var_list__Group_1__0 ) ) );
    public final void rule__Var_list__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:348:1: ( ( ( rule__Var_list__IdentifierAssignment_0 ) ) | ( ( rule__Var_list__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==29) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==28) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:349:2: ( ( rule__Var_list__IdentifierAssignment_0 ) )
                    {
                    // InternalPascal.g:349:2: ( ( rule__Var_list__IdentifierAssignment_0 ) )
                    // InternalPascal.g:350:3: ( rule__Var_list__IdentifierAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); 
                    }
                    // InternalPascal.g:351:3: ( rule__Var_list__IdentifierAssignment_0 )
                    // InternalPascal.g:351:4: rule__Var_list__IdentifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_list__IdentifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:355:2: ( ( rule__Var_list__Group_1__0 ) )
                    {
                    // InternalPascal.g:355:2: ( ( rule__Var_list__Group_1__0 ) )
                    // InternalPascal.g:356:3: ( rule__Var_list__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_listAccess().getGroup_1()); 
                    }
                    // InternalPascal.g:357:3: ( rule__Var_list__Group_1__0 )
                    // InternalPascal.g:357:4: rule__Var_list__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_list__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_listAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalPascal.g:365:1: rule__Operator__Alternatives : ( ( rulearit_op ) | ( rulerel_op ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:369:1: ( ( rulearit_op ) | ( rulerel_op ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:370:2: ( rulearit_op )
                    {
                    // InternalPascal.g:370:2: ( rulearit_op )
                    // InternalPascal.g:371:3: rulearit_op
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulearit_op();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:376:2: ( rulerel_op )
                    {
                    // InternalPascal.g:376:2: ( rulerel_op )
                    // InternalPascal.g:377:3: rulerel_op
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerel_op();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Arit_op__Alternatives"
    // InternalPascal.g:386:1: rule__Arit_op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) );
    public final void rule__Arit_op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:390:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPascal.g:391:2: ( '+' )
                    {
                    // InternalPascal.g:391:2: ( '+' )
                    // InternalPascal.g:392:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:397:2: ( '-' )
                    {
                    // InternalPascal.g:397:2: ( '-' )
                    // InternalPascal.g:398:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:403:2: ( '*' )
                    {
                    // InternalPascal.g:403:2: ( '*' )
                    // InternalPascal.g:404:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:409:2: ( 'div' )
                    {
                    // InternalPascal.g:409:2: ( 'div' )
                    // InternalPascal.g:410:3: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getDivKeyword_3()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getDivKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:415:2: ( 'mod' )
                    {
                    // InternalPascal.g:415:2: ( 'mod' )
                    // InternalPascal.g:416:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getModKeyword_4()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getModKeyword_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arit_op__Alternatives"


    // $ANTLR start "rule__Rel_op__Alternatives"
    // InternalPascal.g:425:1: rule__Rel_op__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '<>' ) );
    public final void rule__Rel_op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:429:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '=' ) | ( '<>' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPascal.g:430:2: ( '>' )
                    {
                    // InternalPascal.g:430:2: ( '>' )
                    // InternalPascal.g:431:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:436:2: ( '<' )
                    {
                    // InternalPascal.g:436:2: ( '<' )
                    // InternalPascal.g:437:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:442:2: ( '>=' )
                    {
                    // InternalPascal.g:442:2: ( '>=' )
                    // InternalPascal.g:443:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:448:2: ( '<=' )
                    {
                    // InternalPascal.g:448:2: ( '<=' )
                    // InternalPascal.g:449:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:454:2: ( '=' )
                    {
                    // InternalPascal.g:454:2: ( '=' )
                    // InternalPascal.g:455:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getEqualsSignKeyword_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:460:2: ( '<>' )
                    {
                    // InternalPascal.g:460:2: ( '<>' )
                    // InternalPascal.g:461:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rel_op__Alternatives"


    // $ANTLR start "rule__SomeValue__Alternatives"
    // InternalPascal.g:470:1: rule__SomeValue__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__SomeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:474:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:475:2: ( RULE_ID )
                    {
                    // InternalPascal.g:475:2: ( RULE_ID )
                    // InternalPascal.g:476:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:481:2: ( RULE_INT )
                    {
                    // InternalPascal.g:481:2: ( RULE_INT )
                    // InternalPascal.g:482:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:487:2: ( RULE_STRING )
                    {
                    // InternalPascal.g:487:2: ( RULE_STRING )
                    // InternalPascal.g:488:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeValue__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPascal.g:497:1: rule__Type__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'string' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:501:1: ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'string' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:502:2: ( ( 'boolean' ) )
                    {
                    // InternalPascal.g:502:2: ( ( 'boolean' ) )
                    // InternalPascal.g:503:3: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    }
                    // InternalPascal.g:504:3: ( 'boolean' )
                    // InternalPascal.g:504:4: 'boolean'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:508:2: ( ( 'integer' ) )
                    {
                    // InternalPascal.g:508:2: ( ( 'integer' ) )
                    // InternalPascal.g:509:3: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }
                    // InternalPascal.g:510:3: ( 'integer' )
                    // InternalPascal.g:510:4: 'integer'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:514:2: ( ( 'string' ) )
                    {
                    // InternalPascal.g:514:2: ( ( 'string' ) )
                    // InternalPascal.g:515:3: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    }
                    // InternalPascal.g:516:3: ( 'string' )
                    // InternalPascal.g:516:4: 'string'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Pascal__Group__0"
    // InternalPascal.g:524:1: rule__Pascal__Group__0 : rule__Pascal__Group__0__Impl rule__Pascal__Group__1 ;
    public final void rule__Pascal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:528:1: ( rule__Pascal__Group__0__Impl rule__Pascal__Group__1 )
            // InternalPascal.g:529:2: rule__Pascal__Group__0__Impl rule__Pascal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pascal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pascal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__0"


    // $ANTLR start "rule__Pascal__Group__0__Impl"
    // InternalPascal.g:536:1: rule__Pascal__Group__0__Impl : ( ( rule__Pascal__HeadAssignment_0 ) ) ;
    public final void rule__Pascal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:540:1: ( ( ( rule__Pascal__HeadAssignment_0 ) ) )
            // InternalPascal.g:541:1: ( ( rule__Pascal__HeadAssignment_0 ) )
            {
            // InternalPascal.g:541:1: ( ( rule__Pascal__HeadAssignment_0 ) )
            // InternalPascal.g:542:2: ( rule__Pascal__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getHeadAssignment_0()); 
            }
            // InternalPascal.g:543:2: ( rule__Pascal__HeadAssignment_0 )
            // InternalPascal.g:543:3: rule__Pascal__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__HeadAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getHeadAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__0__Impl"


    // $ANTLR start "rule__Pascal__Group__1"
    // InternalPascal.g:551:1: rule__Pascal__Group__1 : rule__Pascal__Group__1__Impl rule__Pascal__Group__2 ;
    public final void rule__Pascal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:555:1: ( rule__Pascal__Group__1__Impl rule__Pascal__Group__2 )
            // InternalPascal.g:556:2: rule__Pascal__Group__1__Impl rule__Pascal__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Pascal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pascal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__1"


    // $ANTLR start "rule__Pascal__Group__1__Impl"
    // InternalPascal.g:563:1: rule__Pascal__Group__1__Impl : ( ( rule__Pascal__DeclarationsAssignment_1 )* ) ;
    public final void rule__Pascal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:567:1: ( ( ( rule__Pascal__DeclarationsAssignment_1 )* ) )
            // InternalPascal.g:568:1: ( ( rule__Pascal__DeclarationsAssignment_1 )* )
            {
            // InternalPascal.g:568:1: ( ( rule__Pascal__DeclarationsAssignment_1 )* )
            // InternalPascal.g:569:2: ( rule__Pascal__DeclarationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getDeclarationsAssignment_1()); 
            }
            // InternalPascal.g:570:2: ( rule__Pascal__DeclarationsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:570:3: rule__Pascal__DeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Pascal__DeclarationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getDeclarationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__1__Impl"


    // $ANTLR start "rule__Pascal__Group__2"
    // InternalPascal.g:578:1: rule__Pascal__Group__2 : rule__Pascal__Group__2__Impl ;
    public final void rule__Pascal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:582:1: ( rule__Pascal__Group__2__Impl )
            // InternalPascal.g:583:2: rule__Pascal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__2"


    // $ANTLR start "rule__Pascal__Group__2__Impl"
    // InternalPascal.g:589:1: rule__Pascal__Group__2__Impl : ( ( rule__Pascal__ScopeAssignment_2 )* ) ;
    public final void rule__Pascal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:593:1: ( ( ( rule__Pascal__ScopeAssignment_2 )* ) )
            // InternalPascal.g:594:1: ( ( rule__Pascal__ScopeAssignment_2 )* )
            {
            // InternalPascal.g:594:1: ( ( rule__Pascal__ScopeAssignment_2 )* )
            // InternalPascal.g:595:2: ( rule__Pascal__ScopeAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getScopeAssignment_2()); 
            }
            // InternalPascal.g:596:2: ( rule__Pascal__ScopeAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:596:3: rule__Pascal__ScopeAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Pascal__ScopeAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getScopeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascal.g:605:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:609:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:610:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPascal.g:617:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:621:1: ( ( 'program' ) )
            // InternalPascal.g:622:1: ( 'program' )
            {
            // InternalPascal.g:622:1: ( 'program' )
            // InternalPascal.g:623:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPascal.g:632:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:636:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:637:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPascal.g:644:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:648:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:649:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:649:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:650:2: ( rule__Program__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:651:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:651:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPascal.g:659:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:663:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:664:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPascal.g:670:1: rule__Program__Group__2__Impl : ( ';' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:674:1: ( ( ';' ) )
            // InternalPascal.g:675:1: ( ';' )
            {
            // InternalPascal.g:675:1: ( ';' )
            // InternalPascal.g:676:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Var_decl__Group__0"
    // InternalPascal.g:686:1: rule__Var_decl__Group__0 : rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 ;
    public final void rule__Var_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:690:1: ( rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 )
            // InternalPascal.g:691:2: rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Var_decl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__0"


    // $ANTLR start "rule__Var_decl__Group__0__Impl"
    // InternalPascal.g:698:1: rule__Var_decl__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:702:1: ( ( 'var' ) )
            // InternalPascal.g:703:1: ( 'var' )
            {
            // InternalPascal.g:703:1: ( 'var' )
            // InternalPascal.g:704:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVarKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__0__Impl"


    // $ANTLR start "rule__Var_decl__Group__1"
    // InternalPascal.g:713:1: rule__Var_decl__Group__1 : rule__Var_decl__Group__1__Impl ;
    public final void rule__Var_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:717:1: ( rule__Var_decl__Group__1__Impl )
            // InternalPascal.g:718:2: rule__Var_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__1"


    // $ANTLR start "rule__Var_decl__Group__1__Impl"
    // InternalPascal.g:724:1: rule__Var_decl__Group__1__Impl : ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) ) ;
    public final void rule__Var_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:728:1: ( ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) ) )
            // InternalPascal.g:729:1: ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) )
            {
            // InternalPascal.g:729:1: ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) )
            // InternalPascal.g:730:2: ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* )
            {
            // InternalPascal.g:730:2: ( ( rule__Var_decl__Group_1__0 ) )
            // InternalPascal.g:731:3: ( rule__Var_decl__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup_1()); 
            }
            // InternalPascal.g:732:3: ( rule__Var_decl__Group_1__0 )
            // InternalPascal.g:732:4: rule__Var_decl__Group_1__0
            {
            pushFollow(FOLLOW_5);
            rule__Var_decl__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:735:2: ( ( rule__Var_decl__Group_1__0 )* )
            // InternalPascal.g:736:3: ( rule__Var_decl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup_1()); 
            }
            // InternalPascal.g:737:3: ( rule__Var_decl__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( ((LA10_2>=28 && LA10_2<=29)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:737:4: rule__Var_decl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Var_decl__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group__1__Impl"


    // $ANTLR start "rule__Var_decl__Group_1__0"
    // InternalPascal.g:747:1: rule__Var_decl__Group_1__0 : rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1 ;
    public final void rule__Var_decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:751:1: ( rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1 )
            // InternalPascal.g:752:2: rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Var_decl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__0"


    // $ANTLR start "rule__Var_decl__Group_1__0__Impl"
    // InternalPascal.g:759:1: rule__Var_decl__Group_1__0__Impl : ( ( rule__Var_decl__Var_listAssignment_1_0 ) ) ;
    public final void rule__Var_decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:763:1: ( ( ( rule__Var_decl__Var_listAssignment_1_0 ) ) )
            // InternalPascal.g:764:1: ( ( rule__Var_decl__Var_listAssignment_1_0 ) )
            {
            // InternalPascal.g:764:1: ( ( rule__Var_decl__Var_listAssignment_1_0 ) )
            // InternalPascal.g:765:2: ( rule__Var_decl__Var_listAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); 
            }
            // InternalPascal.g:766:2: ( rule__Var_decl__Var_listAssignment_1_0 )
            // InternalPascal.g:766:3: rule__Var_decl__Var_listAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Var_listAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__0__Impl"


    // $ANTLR start "rule__Var_decl__Group_1__1"
    // InternalPascal.g:774:1: rule__Var_decl__Group_1__1 : rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2 ;
    public final void rule__Var_decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:778:1: ( rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2 )
            // InternalPascal.g:779:2: rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Var_decl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__1"


    // $ANTLR start "rule__Var_decl__Group_1__1__Impl"
    // InternalPascal.g:786:1: rule__Var_decl__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Var_decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:790:1: ( ( ':' ) )
            // InternalPascal.g:791:1: ( ':' )
            {
            // InternalPascal.g:791:1: ( ':' )
            // InternalPascal.g:792:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__1__Impl"


    // $ANTLR start "rule__Var_decl__Group_1__2"
    // InternalPascal.g:801:1: rule__Var_decl__Group_1__2 : rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3 ;
    public final void rule__Var_decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:805:1: ( rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3 )
            // InternalPascal.g:806:2: rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Var_decl__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__2"


    // $ANTLR start "rule__Var_decl__Group_1__2__Impl"
    // InternalPascal.g:813:1: rule__Var_decl__Group_1__2__Impl : ( ( rule__Var_decl__TypeAssignment_1_2 ) ) ;
    public final void rule__Var_decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:817:1: ( ( ( rule__Var_decl__TypeAssignment_1_2 ) ) )
            // InternalPascal.g:818:1: ( ( rule__Var_decl__TypeAssignment_1_2 ) )
            {
            // InternalPascal.g:818:1: ( ( rule__Var_decl__TypeAssignment_1_2 ) )
            // InternalPascal.g:819:2: ( rule__Var_decl__TypeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); 
            }
            // InternalPascal.g:820:2: ( rule__Var_decl__TypeAssignment_1_2 )
            // InternalPascal.g:820:3: rule__Var_decl__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__TypeAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__2__Impl"


    // $ANTLR start "rule__Var_decl__Group_1__3"
    // InternalPascal.g:828:1: rule__Var_decl__Group_1__3 : rule__Var_decl__Group_1__3__Impl ;
    public final void rule__Var_decl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:832:1: ( rule__Var_decl__Group_1__3__Impl )
            // InternalPascal.g:833:2: rule__Var_decl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__3"


    // $ANTLR start "rule__Var_decl__Group_1__3__Impl"
    // InternalPascal.g:839:1: rule__Var_decl__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Var_decl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:843:1: ( ( ';' ) )
            // InternalPascal.g:844:1: ( ';' )
            {
            // InternalPascal.g:844:1: ( ';' )
            // InternalPascal.g:845:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Group_1__3__Impl"


    // $ANTLR start "rule__Var_list__Group_1__0"
    // InternalPascal.g:855:1: rule__Var_list__Group_1__0 : rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 ;
    public final void rule__Var_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:859:1: ( rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 )
            // InternalPascal.g:860:2: rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Var_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__0"


    // $ANTLR start "rule__Var_list__Group_1__0__Impl"
    // InternalPascal.g:867:1: rule__Var_list__Group_1__0__Impl : ( ( rule__Var_list__IdentifierAssignment_1_0 ) ) ;
    public final void rule__Var_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:871:1: ( ( ( rule__Var_list__IdentifierAssignment_1_0 ) ) )
            // InternalPascal.g:872:1: ( ( rule__Var_list__IdentifierAssignment_1_0 ) )
            {
            // InternalPascal.g:872:1: ( ( rule__Var_list__IdentifierAssignment_1_0 ) )
            // InternalPascal.g:873:2: ( rule__Var_list__IdentifierAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getIdentifierAssignment_1_0()); 
            }
            // InternalPascal.g:874:2: ( rule__Var_list__IdentifierAssignment_1_0 )
            // InternalPascal.g:874:3: rule__Var_list__IdentifierAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__IdentifierAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getIdentifierAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__0__Impl"


    // $ANTLR start "rule__Var_list__Group_1__1"
    // InternalPascal.g:882:1: rule__Var_list__Group_1__1 : rule__Var_list__Group_1__1__Impl rule__Var_list__Group_1__2 ;
    public final void rule__Var_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:886:1: ( rule__Var_list__Group_1__1__Impl rule__Var_list__Group_1__2 )
            // InternalPascal.g:887:2: rule__Var_list__Group_1__1__Impl rule__Var_list__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Var_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__1"


    // $ANTLR start "rule__Var_list__Group_1__1__Impl"
    // InternalPascal.g:894:1: rule__Var_list__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Var_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:898:1: ( ( ',' ) )
            // InternalPascal.g:899:1: ( ',' )
            {
            // InternalPascal.g:899:1: ( ',' )
            // InternalPascal.g:900:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getCommaKeyword_1_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__1__Impl"


    // $ANTLR start "rule__Var_list__Group_1__2"
    // InternalPascal.g:909:1: rule__Var_list__Group_1__2 : rule__Var_list__Group_1__2__Impl ;
    public final void rule__Var_list__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:913:1: ( rule__Var_list__Group_1__2__Impl )
            // InternalPascal.g:914:2: rule__Var_list__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__2"


    // $ANTLR start "rule__Var_list__Group_1__2__Impl"
    // InternalPascal.g:920:1: rule__Var_list__Group_1__2__Impl : ( ( ( rule__Var_list__VarsAssignment_1_2 ) ) ( ( rule__Var_list__VarsAssignment_1_2 )* ) ) ;
    public final void rule__Var_list__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:924:1: ( ( ( ( rule__Var_list__VarsAssignment_1_2 ) ) ( ( rule__Var_list__VarsAssignment_1_2 )* ) ) )
            // InternalPascal.g:925:1: ( ( ( rule__Var_list__VarsAssignment_1_2 ) ) ( ( rule__Var_list__VarsAssignment_1_2 )* ) )
            {
            // InternalPascal.g:925:1: ( ( ( rule__Var_list__VarsAssignment_1_2 ) ) ( ( rule__Var_list__VarsAssignment_1_2 )* ) )
            // InternalPascal.g:926:2: ( ( rule__Var_list__VarsAssignment_1_2 ) ) ( ( rule__Var_list__VarsAssignment_1_2 )* )
            {
            // InternalPascal.g:926:2: ( ( rule__Var_list__VarsAssignment_1_2 ) )
            // InternalPascal.g:927:3: ( rule__Var_list__VarsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); 
            }
            // InternalPascal.g:928:3: ( rule__Var_list__VarsAssignment_1_2 )
            // InternalPascal.g:928:4: rule__Var_list__VarsAssignment_1_2
            {
            pushFollow(FOLLOW_5);
            rule__Var_list__VarsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); 
            }

            }

            // InternalPascal.g:931:2: ( ( rule__Var_list__VarsAssignment_1_2 )* )
            // InternalPascal.g:932:3: ( rule__Var_list__VarsAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); 
            }
            // InternalPascal.g:933:3: ( rule__Var_list__VarsAssignment_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred20_InternalPascal()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:933:4: rule__Var_list__VarsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Var_list__VarsAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__Group_1__2__Impl"


    // $ANTLR start "rule__Atrib__Group__0"
    // InternalPascal.g:943:1: rule__Atrib__Group__0 : rule__Atrib__Group__0__Impl rule__Atrib__Group__1 ;
    public final void rule__Atrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:947:1: ( rule__Atrib__Group__0__Impl rule__Atrib__Group__1 )
            // InternalPascal.g:948:2: rule__Atrib__Group__0__Impl rule__Atrib__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Atrib__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__0"


    // $ANTLR start "rule__Atrib__Group__0__Impl"
    // InternalPascal.g:955:1: rule__Atrib__Group__0__Impl : ( ( rule__Atrib__IdentifierAssignment_0 ) ) ;
    public final void rule__Atrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:959:1: ( ( ( rule__Atrib__IdentifierAssignment_0 ) ) )
            // InternalPascal.g:960:1: ( ( rule__Atrib__IdentifierAssignment_0 ) )
            {
            // InternalPascal.g:960:1: ( ( rule__Atrib__IdentifierAssignment_0 ) )
            // InternalPascal.g:961:2: ( rule__Atrib__IdentifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); 
            }
            // InternalPascal.g:962:2: ( rule__Atrib__IdentifierAssignment_0 )
            // InternalPascal.g:962:3: rule__Atrib__IdentifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__IdentifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__0__Impl"


    // $ANTLR start "rule__Atrib__Group__1"
    // InternalPascal.g:970:1: rule__Atrib__Group__1 : rule__Atrib__Group__1__Impl rule__Atrib__Group__2 ;
    public final void rule__Atrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:974:1: ( rule__Atrib__Group__1__Impl rule__Atrib__Group__2 )
            // InternalPascal.g:975:2: rule__Atrib__Group__1__Impl rule__Atrib__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Atrib__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__1"


    // $ANTLR start "rule__Atrib__Group__1__Impl"
    // InternalPascal.g:982:1: rule__Atrib__Group__1__Impl : ( ':=' ) ;
    public final void rule__Atrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:986:1: ( ( ':=' ) )
            // InternalPascal.g:987:1: ( ':=' )
            {
            // InternalPascal.g:987:1: ( ':=' )
            // InternalPascal.g:988:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__1__Impl"


    // $ANTLR start "rule__Atrib__Group__2"
    // InternalPascal.g:997:1: rule__Atrib__Group__2 : rule__Atrib__Group__2__Impl rule__Atrib__Group__3 ;
    public final void rule__Atrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1001:1: ( rule__Atrib__Group__2__Impl rule__Atrib__Group__3 )
            // InternalPascal.g:1002:2: rule__Atrib__Group__2__Impl rule__Atrib__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Atrib__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__2"


    // $ANTLR start "rule__Atrib__Group__2__Impl"
    // InternalPascal.g:1009:1: rule__Atrib__Group__2__Impl : ( ( rule__Atrib__ExpAssignment_2 ) ) ;
    public final void rule__Atrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1013:1: ( ( ( rule__Atrib__ExpAssignment_2 ) ) )
            // InternalPascal.g:1014:1: ( ( rule__Atrib__ExpAssignment_2 ) )
            {
            // InternalPascal.g:1014:1: ( ( rule__Atrib__ExpAssignment_2 ) )
            // InternalPascal.g:1015:2: ( rule__Atrib__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getExpAssignment_2()); 
            }
            // InternalPascal.g:1016:2: ( rule__Atrib__ExpAssignment_2 )
            // InternalPascal.g:1016:3: rule__Atrib__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getExpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__2__Impl"


    // $ANTLR start "rule__Atrib__Group__3"
    // InternalPascal.g:1024:1: rule__Atrib__Group__3 : rule__Atrib__Group__3__Impl ;
    public final void rule__Atrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1028:1: ( rule__Atrib__Group__3__Impl )
            // InternalPascal.g:1029:2: rule__Atrib__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__3"


    // $ANTLR start "rule__Atrib__Group__3__Impl"
    // InternalPascal.g:1035:1: rule__Atrib__Group__3__Impl : ( ';' ) ;
    public final void rule__Atrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1039:1: ( ( ';' ) )
            // InternalPascal.g:1040:1: ( ';' )
            {
            // InternalPascal.g:1040:1: ( ';' )
            // InternalPascal.g:1041:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPascal.g:1051:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1055:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:1056:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalPascal.g:1063:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ValueAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1067:1: ( ( ( rule__Expression__ValueAssignment_0 ) ) )
            // InternalPascal.g:1068:1: ( ( rule__Expression__ValueAssignment_0 ) )
            {
            // InternalPascal.g:1068:1: ( ( rule__Expression__ValueAssignment_0 ) )
            // InternalPascal.g:1069:2: ( rule__Expression__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getValueAssignment_0()); 
            }
            // InternalPascal.g:1070:2: ( rule__Expression__ValueAssignment_0 )
            // InternalPascal.g:1070:3: rule__Expression__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPascal.g:1078:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1082:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:1083:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalPascal.g:1089:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ExpAssignment_1 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1093:1: ( ( ( rule__Expression__ExpAssignment_1 )* ) )
            // InternalPascal.g:1094:1: ( ( rule__Expression__ExpAssignment_1 )* )
            {
            // InternalPascal.g:1094:1: ( ( rule__Expression__ExpAssignment_1 )* )
            // InternalPascal.g:1095:2: ( rule__Expression__ExpAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpAssignment_1()); 
            }
            // InternalPascal.g:1096:2: ( rule__Expression__ExpAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:1096:3: rule__Expression__ExpAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Expression__ExpAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__SecondExp__Group__0"
    // InternalPascal.g:1105:1: rule__SecondExp__Group__0 : rule__SecondExp__Group__0__Impl rule__SecondExp__Group__1 ;
    public final void rule__SecondExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1109:1: ( rule__SecondExp__Group__0__Impl rule__SecondExp__Group__1 )
            // InternalPascal.g:1110:2: rule__SecondExp__Group__0__Impl rule__SecondExp__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SecondExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__0"


    // $ANTLR start "rule__SecondExp__Group__0__Impl"
    // InternalPascal.g:1117:1: rule__SecondExp__Group__0__Impl : ( ( rule__SecondExp__OpAssignment_0 ) ) ;
    public final void rule__SecondExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1121:1: ( ( ( rule__SecondExp__OpAssignment_0 ) ) )
            // InternalPascal.g:1122:1: ( ( rule__SecondExp__OpAssignment_0 ) )
            {
            // InternalPascal.g:1122:1: ( ( rule__SecondExp__OpAssignment_0 ) )
            // InternalPascal.g:1123:2: ( rule__SecondExp__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getOpAssignment_0()); 
            }
            // InternalPascal.g:1124:2: ( rule__SecondExp__OpAssignment_0 )
            // InternalPascal.g:1124:3: rule__SecondExp__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SecondExp__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__0__Impl"


    // $ANTLR start "rule__SecondExp__Group__1"
    // InternalPascal.g:1132:1: rule__SecondExp__Group__1 : rule__SecondExp__Group__1__Impl rule__SecondExp__Group__2 ;
    public final void rule__SecondExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1136:1: ( rule__SecondExp__Group__1__Impl rule__SecondExp__Group__2 )
            // InternalPascal.g:1137:2: rule__SecondExp__Group__1__Impl rule__SecondExp__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SecondExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondExp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__1"


    // $ANTLR start "rule__SecondExp__Group__1__Impl"
    // InternalPascal.g:1144:1: rule__SecondExp__Group__1__Impl : ( ( rule__SecondExp__ValueAssignment_1 ) ) ;
    public final void rule__SecondExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1148:1: ( ( ( rule__SecondExp__ValueAssignment_1 ) ) )
            // InternalPascal.g:1149:1: ( ( rule__SecondExp__ValueAssignment_1 ) )
            {
            // InternalPascal.g:1149:1: ( ( rule__SecondExp__ValueAssignment_1 ) )
            // InternalPascal.g:1150:2: ( rule__SecondExp__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getValueAssignment_1()); 
            }
            // InternalPascal.g:1151:2: ( rule__SecondExp__ValueAssignment_1 )
            // InternalPascal.g:1151:3: rule__SecondExp__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecondExp__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__1__Impl"


    // $ANTLR start "rule__SecondExp__Group__2"
    // InternalPascal.g:1159:1: rule__SecondExp__Group__2 : rule__SecondExp__Group__2__Impl ;
    public final void rule__SecondExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1163:1: ( rule__SecondExp__Group__2__Impl )
            // InternalPascal.g:1164:2: rule__SecondExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondExp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__2"


    // $ANTLR start "rule__SecondExp__Group__2__Impl"
    // InternalPascal.g:1170:1: rule__SecondExp__Group__2__Impl : ( ( rule__SecondExp__ExpAssignment_2 )* ) ;
    public final void rule__SecondExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1174:1: ( ( ( rule__SecondExp__ExpAssignment_2 )* ) )
            // InternalPascal.g:1175:1: ( ( rule__SecondExp__ExpAssignment_2 )* )
            {
            // InternalPascal.g:1175:1: ( ( rule__SecondExp__ExpAssignment_2 )* )
            // InternalPascal.g:1176:2: ( rule__SecondExp__ExpAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getExpAssignment_2()); 
            }
            // InternalPascal.g:1177:2: ( rule__SecondExp__ExpAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1177:3: rule__SecondExp__ExpAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SecondExp__ExpAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getExpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__Group__2__Impl"


    // $ANTLR start "rule__Pascal__HeadAssignment_0"
    // InternalPascal.g:1186:1: rule__Pascal__HeadAssignment_0 : ( ruleprogram ) ;
    public final void rule__Pascal__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1190:1: ( ( ruleprogram ) )
            // InternalPascal.g:1191:2: ( ruleprogram )
            {
            // InternalPascal.g:1191:2: ( ruleprogram )
            // InternalPascal.g:1192:3: ruleprogram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__HeadAssignment_0"


    // $ANTLR start "rule__Pascal__DeclarationsAssignment_1"
    // InternalPascal.g:1201:1: rule__Pascal__DeclarationsAssignment_1 : ( rulevar_decl ) ;
    public final void rule__Pascal__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1205:1: ( ( rulevar_decl ) )
            // InternalPascal.g:1206:2: ( rulevar_decl )
            {
            // InternalPascal.g:1206:2: ( rulevar_decl )
            // InternalPascal.g:1207:3: rulevar_decl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__DeclarationsAssignment_1"


    // $ANTLR start "rule__Pascal__ScopeAssignment_2"
    // InternalPascal.g:1216:1: rule__Pascal__ScopeAssignment_2 : ( ruleatrib ) ;
    public final void rule__Pascal__ScopeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1220:1: ( ( ruleatrib ) )
            // InternalPascal.g:1221:2: ( ruleatrib )
            {
            // InternalPascal.g:1221:2: ( ruleatrib )
            // InternalPascal.g:1222:3: ruleatrib
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleatrib();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__ScopeAssignment_2"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalPascal.g:1231:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1235:1: ( ( RULE_ID ) )
            // InternalPascal.g:1236:2: ( RULE_ID )
            {
            // InternalPascal.g:1236:2: ( RULE_ID )
            // InternalPascal.g:1237:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Var_decl__Var_listAssignment_1_0"
    // InternalPascal.g:1246:1: rule__Var_decl__Var_listAssignment_1_0 : ( rulevar_list ) ;
    public final void rule__Var_decl__Var_listAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1250:1: ( ( rulevar_list ) )
            // InternalPascal.g:1251:2: ( rulevar_list )
            {
            // InternalPascal.g:1251:2: ( rulevar_list )
            // InternalPascal.g:1252:3: rulevar_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__Var_listAssignment_1_0"


    // $ANTLR start "rule__Var_decl__TypeAssignment_1_2"
    // InternalPascal.g:1261:1: rule__Var_decl__TypeAssignment_1_2 : ( ruleType ) ;
    public final void rule__Var_decl__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1265:1: ( ( ruleType ) )
            // InternalPascal.g:1266:2: ( ruleType )
            {
            // InternalPascal.g:1266:2: ( ruleType )
            // InternalPascal.g:1267:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_decl__TypeAssignment_1_2"


    // $ANTLR start "rule__Var_list__IdentifierAssignment_0"
    // InternalPascal.g:1276:1: rule__Var_list__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var_list__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1280:1: ( ( RULE_ID ) )
            // InternalPascal.g:1281:2: ( RULE_ID )
            {
            // InternalPascal.g:1281:2: ( RULE_ID )
            // InternalPascal.g:1282:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__IdentifierAssignment_0"


    // $ANTLR start "rule__Var_list__IdentifierAssignment_1_0"
    // InternalPascal.g:1291:1: rule__Var_list__IdentifierAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Var_list__IdentifierAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1295:1: ( ( RULE_ID ) )
            // InternalPascal.g:1296:2: ( RULE_ID )
            {
            // InternalPascal.g:1296:2: ( RULE_ID )
            // InternalPascal.g:1297:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__IdentifierAssignment_1_0"


    // $ANTLR start "rule__Var_list__VarsAssignment_1_2"
    // InternalPascal.g:1306:1: rule__Var_list__VarsAssignment_1_2 : ( rulevar_list ) ;
    public final void rule__Var_list__VarsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1310:1: ( ( rulevar_list ) )
            // InternalPascal.g:1311:2: ( rulevar_list )
            {
            // InternalPascal.g:1311:2: ( rulevar_list )
            // InternalPascal.g:1312:3: rulevar_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var_list__VarsAssignment_1_2"


    // $ANTLR start "rule__Atrib__IdentifierAssignment_0"
    // InternalPascal.g:1321:1: rule__Atrib__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atrib__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1325:1: ( ( RULE_ID ) )
            // InternalPascal.g:1326:2: ( RULE_ID )
            {
            // InternalPascal.g:1326:2: ( RULE_ID )
            // InternalPascal.g:1327:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__IdentifierAssignment_0"


    // $ANTLR start "rule__Atrib__ExpAssignment_2"
    // InternalPascal.g:1336:1: rule__Atrib__ExpAssignment_2 : ( ruleexpression ) ;
    public final void rule__Atrib__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1340:1: ( ( ruleexpression ) )
            // InternalPascal.g:1341:2: ( ruleexpression )
            {
            // InternalPascal.g:1341:2: ( ruleexpression )
            // InternalPascal.g:1342:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atrib__ExpAssignment_2"


    // $ANTLR start "rule__Expression__ValueAssignment_0"
    // InternalPascal.g:1351:1: rule__Expression__ValueAssignment_0 : ( ruleSomeValue ) ;
    public final void rule__Expression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1355:1: ( ( ruleSomeValue ) )
            // InternalPascal.g:1356:2: ( ruleSomeValue )
            {
            // InternalPascal.g:1356:2: ( ruleSomeValue )
            // InternalPascal.g:1357:3: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_0"


    // $ANTLR start "rule__Expression__ExpAssignment_1"
    // InternalPascal.g:1366:1: rule__Expression__ExpAssignment_1 : ( rulesecondExp ) ;
    public final void rule__Expression__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1370:1: ( ( rulesecondExp ) )
            // InternalPascal.g:1371:2: ( rulesecondExp )
            {
            // InternalPascal.g:1371:2: ( rulesecondExp )
            // InternalPascal.g:1372:3: rulesecondExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesecondExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpAssignment_1"


    // $ANTLR start "rule__SecondExp__OpAssignment_0"
    // InternalPascal.g:1381:1: rule__SecondExp__OpAssignment_0 : ( ruleoperator ) ;
    public final void rule__SecondExp__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1385:1: ( ( ruleoperator ) )
            // InternalPascal.g:1386:2: ( ruleoperator )
            {
            // InternalPascal.g:1386:2: ( ruleoperator )
            // InternalPascal.g:1387:3: ruleoperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleoperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__OpAssignment_0"


    // $ANTLR start "rule__SecondExp__ValueAssignment_1"
    // InternalPascal.g:1396:1: rule__SecondExp__ValueAssignment_1 : ( ruleSomeValue ) ;
    public final void rule__SecondExp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1400:1: ( ( ruleSomeValue ) )
            // InternalPascal.g:1401:2: ( ruleSomeValue )
            {
            // InternalPascal.g:1401:2: ( ruleSomeValue )
            // InternalPascal.g:1402:3: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__ValueAssignment_1"


    // $ANTLR start "rule__SecondExp__ExpAssignment_2"
    // InternalPascal.g:1411:1: rule__SecondExp__ExpAssignment_2 : ( rulesecondExp ) ;
    public final void rule__SecondExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1415:1: ( ( rulesecondExp ) )
            // InternalPascal.g:1416:2: ( rulesecondExp )
            {
            // InternalPascal.g:1416:2: ( rulesecondExp )
            // InternalPascal.g:1417:3: rulesecondExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesecondExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondExp__ExpAssignment_2"

    // $ANTLR start synpred20_InternalPascal
    public final void synpred20_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:933:4: ( rule__Var_list__VarsAssignment_1_2 )
        // InternalPascal.g:933:4: rule__Var_list__VarsAssignment_1_2
        {
        pushFollow(FOLLOW_2);
        rule__Var_list__VarsAssignment_1_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalPascal

    // $ANTLR start synpred22_InternalPascal
    public final void synpred22_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:1177:3: ( rule__SecondExp__ExpAssignment_2 )
        // InternalPascal.g:1177:3: rule__SecondExp__ExpAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__SecondExp__ExpAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalPascal

    // Delegated rules

    public final boolean synpred20_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\13\1\uffff\13\0\1\uffff";
    static final String dfa_4s = "\1\32\1\uffff\13\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\10\1\5\1\2\1\11\1\3\1\12\1\6\1\4\1\0\1\7\1\1\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1177:2: ( rule__SecondExp__ExpAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003FF802L});

}