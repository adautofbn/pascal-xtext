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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_MULTI_LINE_COMMENT", "RULE_SINGLE_LINE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'+'", "'-'", "'*'", "'div'", "'mod'", "'>'", "'<'", "'>='", "'<='", "'boolean'", "'integer'", "'string'", "'program'", "';'", "'var'", "':'", "'='", "','", "'begin'", "'end'", "'.'", "':='"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int RULE_SINGLE_LINE_COMMENT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_MULTI_LINE_COMMENT=8;
    public static final int RULE_ML_COMMENT=10;
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

            if ( (LA1_0==28) ) {
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


    // $ANTLR start "entryRulevar_block"
    // InternalPascal.g:104:1: entryRulevar_block : rulevar_block EOF ;
    public final void entryRulevar_block() throws RecognitionException {
        try {
            // InternalPascal.g:105:1: ( rulevar_block EOF )
            // InternalPascal.g:106:1: rulevar_block EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevar_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockRule()); 
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
    // $ANTLR end "entryRulevar_block"


    // $ANTLR start "rulevar_block"
    // InternalPascal.g:113:1: rulevar_block : ( ( rule__Var_block__Group__0 ) ) ;
    public final void rulevar_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:117:2: ( ( ( rule__Var_block__Group__0 ) ) )
            // InternalPascal.g:118:2: ( ( rule__Var_block__Group__0 ) )
            {
            // InternalPascal.g:118:2: ( ( rule__Var_block__Group__0 ) )
            // InternalPascal.g:119:3: ( rule__Var_block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getGroup()); 
            }
            // InternalPascal.g:120:3: ( rule__Var_block__Group__0 )
            // InternalPascal.g:120:4: rule__Var_block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getGroup()); 
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
    // $ANTLR end "rulevar_block"


    // $ANTLR start "entryRulevar_decl"
    // InternalPascal.g:129:1: entryRulevar_decl : rulevar_decl EOF ;
    public final void entryRulevar_decl() throws RecognitionException {
        try {
            // InternalPascal.g:130:1: ( rulevar_decl EOF )
            // InternalPascal.g:131:1: rulevar_decl EOF
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
    // InternalPascal.g:138:1: rulevar_decl : ( ( rule__Var_decl__Group__0 ) ) ;
    public final void rulevar_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:142:2: ( ( ( rule__Var_decl__Group__0 ) ) )
            // InternalPascal.g:143:2: ( ( rule__Var_decl__Group__0 ) )
            {
            // InternalPascal.g:143:2: ( ( rule__Var_decl__Group__0 ) )
            // InternalPascal.g:144:3: ( rule__Var_decl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup()); 
            }
            // InternalPascal.g:145:3: ( rule__Var_decl__Group__0 )
            // InternalPascal.g:145:4: rule__Var_decl__Group__0
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
    // InternalPascal.g:154:1: entryRulevar_list : rulevar_list EOF ;
    public final void entryRulevar_list() throws RecognitionException {
        try {
            // InternalPascal.g:155:1: ( rulevar_list EOF )
            // InternalPascal.g:156:1: rulevar_list EOF
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
    // InternalPascal.g:163:1: rulevar_list : ( ( rule__Var_list__Group__0 ) ) ;
    public final void rulevar_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:167:2: ( ( ( rule__Var_list__Group__0 ) ) )
            // InternalPascal.g:168:2: ( ( rule__Var_list__Group__0 ) )
            {
            // InternalPascal.g:168:2: ( ( rule__Var_list__Group__0 ) )
            // InternalPascal.g:169:3: ( rule__Var_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getGroup()); 
            }
            // InternalPascal.g:170:3: ( rule__Var_list__Group__0 )
            // InternalPascal.g:170:4: rule__Var_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getGroup()); 
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


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:179:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascal.g:180:1: ( ruleblock EOF )
            // InternalPascal.g:181:1: ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:188:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:192:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascal.g:193:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascal.g:193:2: ( ( rule__Block__Group__0 ) )
            // InternalPascal.g:194:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalPascal.g:195:3: ( rule__Block__Group__0 )
            // InternalPascal.g:195:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:204:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:205:1: ( rulestatement EOF )
            // InternalPascal.g:206:1: rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:213:1: rulestatement : ( ( ( rule__Statement__Atrib_blockAssignment ) ) ( ( rule__Statement__Atrib_blockAssignment )* ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:217:2: ( ( ( ( rule__Statement__Atrib_blockAssignment ) ) ( ( rule__Statement__Atrib_blockAssignment )* ) ) )
            // InternalPascal.g:218:2: ( ( ( rule__Statement__Atrib_blockAssignment ) ) ( ( rule__Statement__Atrib_blockAssignment )* ) )
            {
            // InternalPascal.g:218:2: ( ( ( rule__Statement__Atrib_blockAssignment ) ) ( ( rule__Statement__Atrib_blockAssignment )* ) )
            // InternalPascal.g:219:3: ( ( rule__Statement__Atrib_blockAssignment ) ) ( ( rule__Statement__Atrib_blockAssignment )* )
            {
            // InternalPascal.g:219:3: ( ( rule__Statement__Atrib_blockAssignment ) )
            // InternalPascal.g:220:4: ( rule__Statement__Atrib_blockAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAtrib_blockAssignment()); 
            }
            // InternalPascal.g:221:4: ( rule__Statement__Atrib_blockAssignment )
            // InternalPascal.g:221:5: rule__Statement__Atrib_blockAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Statement__Atrib_blockAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAtrib_blockAssignment()); 
            }

            }

            // InternalPascal.g:224:3: ( ( rule__Statement__Atrib_blockAssignment )* )
            // InternalPascal.g:225:4: ( rule__Statement__Atrib_blockAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAtrib_blockAssignment()); 
            }
            // InternalPascal.g:226:4: ( rule__Statement__Atrib_blockAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:226:5: rule__Statement__Atrib_blockAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Statement__Atrib_blockAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAtrib_blockAssignment()); 
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleatrib"
    // InternalPascal.g:236:1: entryRuleatrib : ruleatrib EOF ;
    public final void entryRuleatrib() throws RecognitionException {
        try {
            // InternalPascal.g:237:1: ( ruleatrib EOF )
            // InternalPascal.g:238:1: ruleatrib EOF
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
    // InternalPascal.g:245:1: ruleatrib : ( ( rule__Atrib__Group__0 ) ) ;
    public final void ruleatrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:249:2: ( ( ( rule__Atrib__Group__0 ) ) )
            // InternalPascal.g:250:2: ( ( rule__Atrib__Group__0 ) )
            {
            // InternalPascal.g:250:2: ( ( rule__Atrib__Group__0 ) )
            // InternalPascal.g:251:3: ( rule__Atrib__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getGroup()); 
            }
            // InternalPascal.g:252:3: ( rule__Atrib__Group__0 )
            // InternalPascal.g:252:4: rule__Atrib__Group__0
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
    // InternalPascal.g:261:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:262:1: ( ruleexpression EOF )
            // InternalPascal.g:263:1: ruleexpression EOF
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
    // InternalPascal.g:270:1: ruleexpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:274:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalPascal.g:275:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalPascal.g:275:2: ( ( rule__Expression__Alternatives ) )
            // InternalPascal.g:276:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalPascal.g:277:3: ( rule__Expression__Alternatives )
            // InternalPascal.g:277:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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


    // $ANTLR start "entryRulearit_expression"
    // InternalPascal.g:286:1: entryRulearit_expression : rulearit_expression EOF ;
    public final void entryRulearit_expression() throws RecognitionException {
        try {
            // InternalPascal.g:287:1: ( rulearit_expression EOF )
            // InternalPascal.g:288:1: rulearit_expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulearit_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionRule()); 
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
    // $ANTLR end "entryRulearit_expression"


    // $ANTLR start "rulearit_expression"
    // InternalPascal.g:295:1: rulearit_expression : ( ( rule__Arit_expression__Group__0 ) ) ;
    public final void rulearit_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:299:2: ( ( ( rule__Arit_expression__Group__0 ) ) )
            // InternalPascal.g:300:2: ( ( rule__Arit_expression__Group__0 ) )
            {
            // InternalPascal.g:300:2: ( ( rule__Arit_expression__Group__0 ) )
            // InternalPascal.g:301:3: ( rule__Arit_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:302:3: ( rule__Arit_expression__Group__0 )
            // InternalPascal.g:302:4: rule__Arit_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arit_expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionAccess().getGroup()); 
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
    // $ANTLR end "rulearit_expression"


    // $ANTLR start "entryRulerepetitive_arit_expression"
    // InternalPascal.g:311:1: entryRulerepetitive_arit_expression : rulerepetitive_arit_expression EOF ;
    public final void entryRulerepetitive_arit_expression() throws RecognitionException {
        try {
            // InternalPascal.g:312:1: ( rulerepetitive_arit_expression EOF )
            // InternalPascal.g:313:1: rulerepetitive_arit_expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerepetitive_arit_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionRule()); 
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
    // $ANTLR end "entryRulerepetitive_arit_expression"


    // $ANTLR start "rulerepetitive_arit_expression"
    // InternalPascal.g:320:1: rulerepetitive_arit_expression : ( ( rule__Repetitive_arit_expression__Group__0 ) ) ;
    public final void rulerepetitive_arit_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:324:2: ( ( ( rule__Repetitive_arit_expression__Group__0 ) ) )
            // InternalPascal.g:325:2: ( ( rule__Repetitive_arit_expression__Group__0 ) )
            {
            // InternalPascal.g:325:2: ( ( rule__Repetitive_arit_expression__Group__0 ) )
            // InternalPascal.g:326:3: ( rule__Repetitive_arit_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:327:3: ( rule__Repetitive_arit_expression__Group__0 )
            // InternalPascal.g:327:4: rule__Repetitive_arit_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getGroup()); 
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
    // $ANTLR end "rulerepetitive_arit_expression"


    // $ANTLR start "entryRulerel_expression"
    // InternalPascal.g:336:1: entryRulerel_expression : rulerel_expression EOF ;
    public final void entryRulerel_expression() throws RecognitionException {
        try {
            // InternalPascal.g:337:1: ( rulerel_expression EOF )
            // InternalPascal.g:338:1: rulerel_expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerel_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionRule()); 
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
    // $ANTLR end "entryRulerel_expression"


    // $ANTLR start "rulerel_expression"
    // InternalPascal.g:345:1: rulerel_expression : ( ( rule__Rel_expression__Group__0 ) ) ;
    public final void rulerel_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:349:2: ( ( ( rule__Rel_expression__Group__0 ) ) )
            // InternalPascal.g:350:2: ( ( rule__Rel_expression__Group__0 ) )
            {
            // InternalPascal.g:350:2: ( ( rule__Rel_expression__Group__0 ) )
            // InternalPascal.g:351:3: ( rule__Rel_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:352:3: ( rule__Rel_expression__Group__0 )
            // InternalPascal.g:352:4: rule__Rel_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getGroup()); 
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
    // $ANTLR end "rulerel_expression"


    // $ANTLR start "entryRulearit_op"
    // InternalPascal.g:361:1: entryRulearit_op : rulearit_op EOF ;
    public final void entryRulearit_op() throws RecognitionException {
        try {
            // InternalPascal.g:362:1: ( rulearit_op EOF )
            // InternalPascal.g:363:1: rulearit_op EOF
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
    // InternalPascal.g:370:1: rulearit_op : ( ( rule__Arit_op__Alternatives ) ) ;
    public final void rulearit_op() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:374:2: ( ( ( rule__Arit_op__Alternatives ) ) )
            // InternalPascal.g:375:2: ( ( rule__Arit_op__Alternatives ) )
            {
            // InternalPascal.g:375:2: ( ( rule__Arit_op__Alternatives ) )
            // InternalPascal.g:376:3: ( rule__Arit_op__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_opAccess().getAlternatives()); 
            }
            // InternalPascal.g:377:3: ( rule__Arit_op__Alternatives )
            // InternalPascal.g:377:4: rule__Arit_op__Alternatives
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
    // InternalPascal.g:386:1: entryRulerel_op : rulerel_op EOF ;
    public final void entryRulerel_op() throws RecognitionException {
        try {
            // InternalPascal.g:387:1: ( rulerel_op EOF )
            // InternalPascal.g:388:1: rulerel_op EOF
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
    // InternalPascal.g:395:1: rulerel_op : ( ( rule__Rel_op__Alternatives ) ) ;
    public final void rulerel_op() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:399:2: ( ( ( rule__Rel_op__Alternatives ) ) )
            // InternalPascal.g:400:2: ( ( rule__Rel_op__Alternatives ) )
            {
            // InternalPascal.g:400:2: ( ( rule__Rel_op__Alternatives ) )
            // InternalPascal.g:401:3: ( rule__Rel_op__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_opAccess().getAlternatives()); 
            }
            // InternalPascal.g:402:3: ( rule__Rel_op__Alternatives )
            // InternalPascal.g:402:4: rule__Rel_op__Alternatives
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


    // $ANTLR start "entryRulesome_value"
    // InternalPascal.g:411:1: entryRulesome_value : rulesome_value EOF ;
    public final void entryRulesome_value() throws RecognitionException {
        try {
            // InternalPascal.g:412:1: ( rulesome_value EOF )
            // InternalPascal.g:413:1: rulesome_value EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSome_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSome_valueRule()); 
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
    // $ANTLR end "entryRulesome_value"


    // $ANTLR start "rulesome_value"
    // InternalPascal.g:420:1: rulesome_value : ( ( rule__Some_value__Alternatives ) ) ;
    public final void rulesome_value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:424:2: ( ( ( rule__Some_value__Alternatives ) ) )
            // InternalPascal.g:425:2: ( ( rule__Some_value__Alternatives ) )
            {
            // InternalPascal.g:425:2: ( ( rule__Some_value__Alternatives ) )
            // InternalPascal.g:426:3: ( rule__Some_value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSome_valueAccess().getAlternatives()); 
            }
            // InternalPascal.g:427:3: ( rule__Some_value__Alternatives )
            // InternalPascal.g:427:4: rule__Some_value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Some_value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSome_valueAccess().getAlternatives()); 
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
    // $ANTLR end "rulesome_value"


    // $ANTLR start "entryRuleopen_par"
    // InternalPascal.g:436:1: entryRuleopen_par : ruleopen_par EOF ;
    public final void entryRuleopen_par() throws RecognitionException {
        try {
            // InternalPascal.g:437:1: ( ruleopen_par EOF )
            // InternalPascal.g:438:1: ruleopen_par EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpen_parRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleopen_par();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpen_parRule()); 
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
    // $ANTLR end "entryRuleopen_par"


    // $ANTLR start "ruleopen_par"
    // InternalPascal.g:445:1: ruleopen_par : ( ( '(' )? ) ;
    public final void ruleopen_par() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:449:2: ( ( ( '(' )? ) )
            // InternalPascal.g:450:2: ( ( '(' )? )
            {
            // InternalPascal.g:450:2: ( ( '(' )? )
            // InternalPascal.g:451:3: ( '(' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpen_parAccess().getLeftParenthesisKeyword()); 
            }
            // InternalPascal.g:452:3: ( '(' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:452:4: '('
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpen_parAccess().getLeftParenthesisKeyword()); 
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
    // $ANTLR end "ruleopen_par"


    // $ANTLR start "entryRuleclose_par"
    // InternalPascal.g:461:1: entryRuleclose_par : ruleclose_par EOF ;
    public final void entryRuleclose_par() throws RecognitionException {
        try {
            // InternalPascal.g:462:1: ( ruleclose_par EOF )
            // InternalPascal.g:463:1: ruleclose_par EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClose_parRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleclose_par();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClose_parRule()); 
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
    // $ANTLR end "entryRuleclose_par"


    // $ANTLR start "ruleclose_par"
    // InternalPascal.g:470:1: ruleclose_par : ( ( ')' )? ) ;
    public final void ruleclose_par() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:474:2: ( ( ( ')' )? ) )
            // InternalPascal.g:475:2: ( ( ')' )? )
            {
            // InternalPascal.g:475:2: ( ( ')' )? )
            // InternalPascal.g:476:3: ( ')' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClose_parAccess().getRightParenthesisKeyword()); 
            }
            // InternalPascal.g:477:3: ( ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:477:4: ')'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClose_parAccess().getRightParenthesisKeyword()); 
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
    // $ANTLR end "ruleclose_par"


    // $ANTLR start "ruletype"
    // InternalPascal.g:486:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:490:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:491:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:491:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:492:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalPascal.g:493:3: ( rule__Type__Alternatives )
            // InternalPascal.g:493:4: rule__Type__Alternatives
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
    // $ANTLR end "ruletype"


    // $ANTLR start "rule__Var_block__Alternatives_1"
    // InternalPascal.g:501:1: rule__Var_block__Alternatives_1 : ( ( ( rule__Var_block__Var_statementsAssignment_1_0 ) ) | ( ( rule__Var_block__Var_statementsAssignment_1_1 ) ) );
    public final void rule__Var_block__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:505:1: ( ( ( rule__Var_block__Var_statementsAssignment_1_0 ) ) | ( ( rule__Var_block__Var_statementsAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==33) ) {
                    alt5=2;
                }
                else if ( (LA5_1==31) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==29) ) {
                            int LA5_7 = input.LA(5);

                            if ( (synpred5_InternalPascal()) ) {
                                alt5=1;
                            }
                            else if ( (true) ) {
                                alt5=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA5_4==32) ) {
                            alt5=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 26:
                        {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==29) ) {
                            int LA5_7 = input.LA(5);

                            if ( (synpred5_InternalPascal()) ) {
                                alt5=1;
                            }
                            else if ( (true) ) {
                                alt5=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA5_5==32) ) {
                            alt5=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA5_6 = input.LA(4);

                        if ( (LA5_6==29) ) {
                            int LA5_7 = input.LA(5);

                            if ( (synpred5_InternalPascal()) ) {
                                alt5=1;
                            }
                            else if ( (true) ) {
                                alt5=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA5_6==32) ) {
                            alt5=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:506:2: ( ( rule__Var_block__Var_statementsAssignment_1_0 ) )
                    {
                    // InternalPascal.g:506:2: ( ( rule__Var_block__Var_statementsAssignment_1_0 ) )
                    // InternalPascal.g:507:3: ( rule__Var_block__Var_statementsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_blockAccess().getVar_statementsAssignment_1_0()); 
                    }
                    // InternalPascal.g:508:3: ( rule__Var_block__Var_statementsAssignment_1_0 )
                    // InternalPascal.g:508:4: rule__Var_block__Var_statementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_block__Var_statementsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_blockAccess().getVar_statementsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:512:2: ( ( rule__Var_block__Var_statementsAssignment_1_1 ) )
                    {
                    // InternalPascal.g:512:2: ( ( rule__Var_block__Var_statementsAssignment_1_1 ) )
                    // InternalPascal.g:513:3: ( rule__Var_block__Var_statementsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_blockAccess().getVar_statementsAssignment_1_1()); 
                    }
                    // InternalPascal.g:514:3: ( rule__Var_block__Var_statementsAssignment_1_1 )
                    // InternalPascal.g:514:4: rule__Var_block__Var_statementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_block__Var_statementsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_blockAccess().getVar_statementsAssignment_1_1()); 
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
    // $ANTLR end "rule__Var_block__Alternatives_1"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalPascal.g:522:1: rule__Expression__Alternatives : ( ( rulearit_expression ) | ( rulerel_expression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:526:1: ( ( rulearit_expression ) | ( rulerel_expression ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=16 && LA6_1<=20)||LA6_1==29) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=21 && LA6_1<=24)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=16 && LA6_2<=20)||LA6_2==29) ) {
                    alt6=1;
                }
                else if ( ((LA6_2>=21 && LA6_2<=24)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF||(LA6_3>=16 && LA6_3<=20)||LA6_3==29) ) {
                    alt6=1;
                }
                else if ( ((LA6_3>=21 && LA6_3<=24)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==EOF||(LA6_4>=16 && LA6_4<=20)||LA6_4==29) ) {
                    alt6=1;
                }
                else if ( ((LA6_4>=21 && LA6_4<=24)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt6=2;
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
                    // InternalPascal.g:527:2: ( rulearit_expression )
                    {
                    // InternalPascal.g:527:2: ( rulearit_expression )
                    // InternalPascal.g:528:3: rulearit_expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getArit_expressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulearit_expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getArit_expressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:533:2: ( rulerel_expression )
                    {
                    // InternalPascal.g:533:2: ( rulerel_expression )
                    // InternalPascal.g:534:3: rulerel_expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getRel_expressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerel_expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getRel_expressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Arit_op__Alternatives"
    // InternalPascal.g:543:1: rule__Arit_op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) );
    public final void rule__Arit_op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:547:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
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
                    // InternalPascal.g:548:2: ( '+' )
                    {
                    // InternalPascal.g:548:2: ( '+' )
                    // InternalPascal.g:549:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:554:2: ( '-' )
                    {
                    // InternalPascal.g:554:2: ( '-' )
                    // InternalPascal.g:555:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:560:2: ( '*' )
                    {
                    // InternalPascal.g:560:2: ( '*' )
                    // InternalPascal.g:561:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:566:2: ( 'div' )
                    {
                    // InternalPascal.g:566:2: ( 'div' )
                    // InternalPascal.g:567:3: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getDivKeyword_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArit_opAccess().getDivKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:572:2: ( 'mod' )
                    {
                    // InternalPascal.g:572:2: ( 'mod' )
                    // InternalPascal.g:573:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArit_opAccess().getModKeyword_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:582:1: rule__Rel_op__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Rel_op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:586:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascal.g:587:2: ( '>' )
                    {
                    // InternalPascal.g:587:2: ( '>' )
                    // InternalPascal.g:588:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:593:2: ( '<' )
                    {
                    // InternalPascal.g:593:2: ( '<' )
                    // InternalPascal.g:594:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:599:2: ( '>=' )
                    {
                    // InternalPascal.g:599:2: ( '>=' )
                    // InternalPascal.g:600:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:605:2: ( '<=' )
                    {
                    // InternalPascal.g:605:2: ( '<=' )
                    // InternalPascal.g:606:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); 
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


    // $ANTLR start "rule__Some_value__Alternatives"
    // InternalPascal.g:615:1: rule__Some_value__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) );
    public final void rule__Some_value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:619:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPascal.g:620:2: ( RULE_ID )
                    {
                    // InternalPascal.g:620:2: ( RULE_ID )
                    // InternalPascal.g:621:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSome_valueAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSome_valueAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:626:2: ( RULE_INT )
                    {
                    // InternalPascal.g:626:2: ( RULE_INT )
                    // InternalPascal.g:627:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSome_valueAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSome_valueAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:632:2: ( RULE_STRING )
                    {
                    // InternalPascal.g:632:2: ( RULE_STRING )
                    // InternalPascal.g:633:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSome_valueAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSome_valueAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:638:2: ( RULE_BOOLEAN )
                    {
                    // InternalPascal.g:638:2: ( RULE_BOOLEAN )
                    // InternalPascal.g:639:3: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSome_valueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSome_valueAccess().getBOOLEANTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Some_value__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPascal.g:648:1: rule__Type__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'string' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:652:1: ( ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'string' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:653:2: ( ( 'boolean' ) )
                    {
                    // InternalPascal.g:653:2: ( ( 'boolean' ) )
                    // InternalPascal.g:654:3: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    }
                    // InternalPascal.g:655:3: ( 'boolean' )
                    // InternalPascal.g:655:4: 'boolean'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:659:2: ( ( 'integer' ) )
                    {
                    // InternalPascal.g:659:2: ( ( 'integer' ) )
                    // InternalPascal.g:660:3: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }
                    // InternalPascal.g:661:3: ( 'integer' )
                    // InternalPascal.g:661:4: 'integer'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:665:2: ( ( 'string' ) )
                    {
                    // InternalPascal.g:665:2: ( ( 'string' ) )
                    // InternalPascal.g:666:3: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    }
                    // InternalPascal.g:667:3: ( 'string' )
                    // InternalPascal.g:667:4: 'string'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:675:1: rule__Pascal__Group__0 : rule__Pascal__Group__0__Impl rule__Pascal__Group__1 ;
    public final void rule__Pascal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:679:1: ( rule__Pascal__Group__0__Impl rule__Pascal__Group__1 )
            // InternalPascal.g:680:2: rule__Pascal__Group__0__Impl rule__Pascal__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalPascal.g:687:1: rule__Pascal__Group__0__Impl : ( ( rule__Pascal__HeadAssignment_0 ) ) ;
    public final void rule__Pascal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:691:1: ( ( ( rule__Pascal__HeadAssignment_0 ) ) )
            // InternalPascal.g:692:1: ( ( rule__Pascal__HeadAssignment_0 ) )
            {
            // InternalPascal.g:692:1: ( ( rule__Pascal__HeadAssignment_0 ) )
            // InternalPascal.g:693:2: ( rule__Pascal__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getHeadAssignment_0()); 
            }
            // InternalPascal.g:694:2: ( rule__Pascal__HeadAssignment_0 )
            // InternalPascal.g:694:3: rule__Pascal__HeadAssignment_0
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
    // InternalPascal.g:702:1: rule__Pascal__Group__1 : rule__Pascal__Group__1__Impl rule__Pascal__Group__2 ;
    public final void rule__Pascal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:706:1: ( rule__Pascal__Group__1__Impl rule__Pascal__Group__2 )
            // InternalPascal.g:707:2: rule__Pascal__Group__1__Impl rule__Pascal__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPascal.g:714:1: rule__Pascal__Group__1__Impl : ( ( rule__Pascal__DeclarationsAssignment_1 )* ) ;
    public final void rule__Pascal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:718:1: ( ( ( rule__Pascal__DeclarationsAssignment_1 )* ) )
            // InternalPascal.g:719:1: ( ( rule__Pascal__DeclarationsAssignment_1 )* )
            {
            // InternalPascal.g:719:1: ( ( rule__Pascal__DeclarationsAssignment_1 )* )
            // InternalPascal.g:720:2: ( rule__Pascal__DeclarationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getDeclarationsAssignment_1()); 
            }
            // InternalPascal.g:721:2: ( rule__Pascal__DeclarationsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:721:3: rule__Pascal__DeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Pascal__DeclarationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPascal.g:729:1: rule__Pascal__Group__2 : rule__Pascal__Group__2__Impl ;
    public final void rule__Pascal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:733:1: ( rule__Pascal__Group__2__Impl )
            // InternalPascal.g:734:2: rule__Pascal__Group__2__Impl
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
    // InternalPascal.g:740:1: rule__Pascal__Group__2__Impl : ( ( rule__Pascal__ScopeAssignment_2 )* ) ;
    public final void rule__Pascal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:744:1: ( ( ( rule__Pascal__ScopeAssignment_2 )* ) )
            // InternalPascal.g:745:1: ( ( rule__Pascal__ScopeAssignment_2 )* )
            {
            // InternalPascal.g:745:1: ( ( rule__Pascal__ScopeAssignment_2 )* )
            // InternalPascal.g:746:2: ( rule__Pascal__ScopeAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getScopeAssignment_2()); 
            }
            // InternalPascal.g:747:2: ( rule__Pascal__ScopeAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:747:3: rule__Pascal__ScopeAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Pascal__ScopeAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPascal.g:756:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:760:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:761:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:768:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:772:1: ( ( 'program' ) )
            // InternalPascal.g:773:1: ( 'program' )
            {
            // InternalPascal.g:773:1: ( 'program' )
            // InternalPascal.g:774:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:783:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:787:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:788:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalPascal.g:795:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:800:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:800:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:801:2: ( rule__Program__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:802:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:802:3: rule__Program__NameAssignment_1
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
    // InternalPascal.g:810:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:814:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:815:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:821:1: rule__Program__Group__2__Impl : ( ';' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:825:1: ( ( ';' ) )
            // InternalPascal.g:826:1: ( ';' )
            {
            // InternalPascal.g:826:1: ( ';' )
            // InternalPascal.g:827:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Var_block__Group__0"
    // InternalPascal.g:837:1: rule__Var_block__Group__0 : rule__Var_block__Group__0__Impl rule__Var_block__Group__1 ;
    public final void rule__Var_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:841:1: ( rule__Var_block__Group__0__Impl rule__Var_block__Group__1 )
            // InternalPascal.g:842:2: rule__Var_block__Group__0__Impl rule__Var_block__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Var_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_block__Group__1();

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
    // $ANTLR end "rule__Var_block__Group__0"


    // $ANTLR start "rule__Var_block__Group__0__Impl"
    // InternalPascal.g:849:1: rule__Var_block__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:853:1: ( ( 'var' ) )
            // InternalPascal.g:854:1: ( 'var' )
            {
            // InternalPascal.g:854:1: ( 'var' )
            // InternalPascal.g:855:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getVarKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__Var_block__Group__0__Impl"


    // $ANTLR start "rule__Var_block__Group__1"
    // InternalPascal.g:864:1: rule__Var_block__Group__1 : rule__Var_block__Group__1__Impl ;
    public final void rule__Var_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:868:1: ( rule__Var_block__Group__1__Impl )
            // InternalPascal.g:869:2: rule__Var_block__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_block__Group__1__Impl();

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
    // $ANTLR end "rule__Var_block__Group__1"


    // $ANTLR start "rule__Var_block__Group__1__Impl"
    // InternalPascal.g:875:1: rule__Var_block__Group__1__Impl : ( ( ( rule__Var_block__Alternatives_1 ) ) ( ( rule__Var_block__Alternatives_1 )* ) ) ;
    public final void rule__Var_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:879:1: ( ( ( ( rule__Var_block__Alternatives_1 ) ) ( ( rule__Var_block__Alternatives_1 )* ) ) )
            // InternalPascal.g:880:1: ( ( ( rule__Var_block__Alternatives_1 ) ) ( ( rule__Var_block__Alternatives_1 )* ) )
            {
            // InternalPascal.g:880:1: ( ( ( rule__Var_block__Alternatives_1 ) ) ( ( rule__Var_block__Alternatives_1 )* ) )
            // InternalPascal.g:881:2: ( ( rule__Var_block__Alternatives_1 ) ) ( ( rule__Var_block__Alternatives_1 )* )
            {
            // InternalPascal.g:881:2: ( ( rule__Var_block__Alternatives_1 ) )
            // InternalPascal.g:882:3: ( rule__Var_block__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getAlternatives_1()); 
            }
            // InternalPascal.g:883:3: ( rule__Var_block__Alternatives_1 )
            // InternalPascal.g:883:4: rule__Var_block__Alternatives_1
            {
            pushFollow(FOLLOW_3);
            rule__Var_block__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getAlternatives_1()); 
            }

            }

            // InternalPascal.g:886:2: ( ( rule__Var_block__Alternatives_1 )* )
            // InternalPascal.g:887:3: ( rule__Var_block__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getAlternatives_1()); 
            }
            // InternalPascal.g:888:3: ( rule__Var_block__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:888:4: rule__Var_block__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Var_block__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Var_block__Group__1__Impl"


    // $ANTLR start "rule__Var_decl__Group__0"
    // InternalPascal.g:898:1: rule__Var_decl__Group__0 : rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 ;
    public final void rule__Var_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:902:1: ( rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 )
            // InternalPascal.g:903:2: rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPascal.g:910:1: rule__Var_decl__Group__0__Impl : ( ( rule__Var_decl__Var_idAssignment_0 ) ) ;
    public final void rule__Var_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:914:1: ( ( ( rule__Var_decl__Var_idAssignment_0 ) ) )
            // InternalPascal.g:915:1: ( ( rule__Var_decl__Var_idAssignment_0 ) )
            {
            // InternalPascal.g:915:1: ( ( rule__Var_decl__Var_idAssignment_0 ) )
            // InternalPascal.g:916:2: ( rule__Var_decl__Var_idAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_idAssignment_0()); 
            }
            // InternalPascal.g:917:2: ( rule__Var_decl__Var_idAssignment_0 )
            // InternalPascal.g:917:3: rule__Var_decl__Var_idAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Var_idAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_idAssignment_0()); 
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
    // InternalPascal.g:925:1: rule__Var_decl__Group__1 : rule__Var_decl__Group__1__Impl rule__Var_decl__Group__2 ;
    public final void rule__Var_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:929:1: ( rule__Var_decl__Group__1__Impl rule__Var_decl__Group__2 )
            // InternalPascal.g:930:2: rule__Var_decl__Group__1__Impl rule__Var_decl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Var_decl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__2();

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
    // InternalPascal.g:937:1: rule__Var_decl__Group__1__Impl : ( ':' ) ;
    public final void rule__Var_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:941:1: ( ( ':' ) )
            // InternalPascal.g:942:1: ( ':' )
            {
            // InternalPascal.g:942:1: ( ':' )
            // InternalPascal.g:943:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getColonKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getColonKeyword_1()); 
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


    // $ANTLR start "rule__Var_decl__Group__2"
    // InternalPascal.g:952:1: rule__Var_decl__Group__2 : rule__Var_decl__Group__2__Impl rule__Var_decl__Group__3 ;
    public final void rule__Var_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:956:1: ( rule__Var_decl__Group__2__Impl rule__Var_decl__Group__3 )
            // InternalPascal.g:957:2: rule__Var_decl__Group__2__Impl rule__Var_decl__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Var_decl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__3();

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
    // $ANTLR end "rule__Var_decl__Group__2"


    // $ANTLR start "rule__Var_decl__Group__2__Impl"
    // InternalPascal.g:964:1: rule__Var_decl__Group__2__Impl : ( ( rule__Var_decl__Var_typeAssignment_2 ) ) ;
    public final void rule__Var_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:968:1: ( ( ( rule__Var_decl__Var_typeAssignment_2 ) ) )
            // InternalPascal.g:969:1: ( ( rule__Var_decl__Var_typeAssignment_2 ) )
            {
            // InternalPascal.g:969:1: ( ( rule__Var_decl__Var_typeAssignment_2 ) )
            // InternalPascal.g:970:2: ( rule__Var_decl__Var_typeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_typeAssignment_2()); 
            }
            // InternalPascal.g:971:2: ( rule__Var_decl__Var_typeAssignment_2 )
            // InternalPascal.g:971:3: rule__Var_decl__Var_typeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Var_typeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_typeAssignment_2()); 
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
    // $ANTLR end "rule__Var_decl__Group__2__Impl"


    // $ANTLR start "rule__Var_decl__Group__3"
    // InternalPascal.g:979:1: rule__Var_decl__Group__3 : rule__Var_decl__Group__3__Impl rule__Var_decl__Group__4 ;
    public final void rule__Var_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:983:1: ( rule__Var_decl__Group__3__Impl rule__Var_decl__Group__4 )
            // InternalPascal.g:984:2: rule__Var_decl__Group__3__Impl rule__Var_decl__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Var_decl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__4();

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
    // $ANTLR end "rule__Var_decl__Group__3"


    // $ANTLR start "rule__Var_decl__Group__3__Impl"
    // InternalPascal.g:991:1: rule__Var_decl__Group__3__Impl : ( ( rule__Var_decl__Group_3__0 )? ) ;
    public final void rule__Var_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:995:1: ( ( ( rule__Var_decl__Group_3__0 )? ) )
            // InternalPascal.g:996:1: ( ( rule__Var_decl__Group_3__0 )? )
            {
            // InternalPascal.g:996:1: ( ( rule__Var_decl__Group_3__0 )? )
            // InternalPascal.g:997:2: ( rule__Var_decl__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getGroup_3()); 
            }
            // InternalPascal.g:998:2: ( rule__Var_decl__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:998:3: rule__Var_decl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var_decl__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Var_decl__Group__3__Impl"


    // $ANTLR start "rule__Var_decl__Group__4"
    // InternalPascal.g:1006:1: rule__Var_decl__Group__4 : rule__Var_decl__Group__4__Impl ;
    public final void rule__Var_decl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1010:1: ( rule__Var_decl__Group__4__Impl )
            // InternalPascal.g:1011:2: rule__Var_decl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__4__Impl();

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
    // $ANTLR end "rule__Var_decl__Group__4"


    // $ANTLR start "rule__Var_decl__Group__4__Impl"
    // InternalPascal.g:1017:1: rule__Var_decl__Group__4__Impl : ( ';' ) ;
    public final void rule__Var_decl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1021:1: ( ( ';' ) )
            // InternalPascal.g:1022:1: ( ';' )
            {
            // InternalPascal.g:1022:1: ( ';' )
            // InternalPascal.g:1023:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getSemicolonKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Var_decl__Group__4__Impl"


    // $ANTLR start "rule__Var_decl__Group_3__0"
    // InternalPascal.g:1033:1: rule__Var_decl__Group_3__0 : rule__Var_decl__Group_3__0__Impl rule__Var_decl__Group_3__1 ;
    public final void rule__Var_decl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1037:1: ( rule__Var_decl__Group_3__0__Impl rule__Var_decl__Group_3__1 )
            // InternalPascal.g:1038:2: rule__Var_decl__Group_3__0__Impl rule__Var_decl__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Var_decl__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_3__1();

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
    // $ANTLR end "rule__Var_decl__Group_3__0"


    // $ANTLR start "rule__Var_decl__Group_3__0__Impl"
    // InternalPascal.g:1045:1: rule__Var_decl__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Var_decl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1049:1: ( ( '=' ) )
            // InternalPascal.g:1050:1: ( '=' )
            {
            // InternalPascal.g:1050:1: ( '=' )
            // InternalPascal.g:1051:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getEqualsSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Var_decl__Group_3__0__Impl"


    // $ANTLR start "rule__Var_decl__Group_3__1"
    // InternalPascal.g:1060:1: rule__Var_decl__Group_3__1 : rule__Var_decl__Group_3__1__Impl ;
    public final void rule__Var_decl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1064:1: ( rule__Var_decl__Group_3__1__Impl )
            // InternalPascal.g:1065:2: rule__Var_decl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_3__1__Impl();

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
    // $ANTLR end "rule__Var_decl__Group_3__1"


    // $ANTLR start "rule__Var_decl__Group_3__1__Impl"
    // InternalPascal.g:1071:1: rule__Var_decl__Group_3__1__Impl : ( ( rule__Var_decl__ValueAssignment_3_1 ) ) ;
    public final void rule__Var_decl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1075:1: ( ( ( rule__Var_decl__ValueAssignment_3_1 ) ) )
            // InternalPascal.g:1076:1: ( ( rule__Var_decl__ValueAssignment_3_1 ) )
            {
            // InternalPascal.g:1076:1: ( ( rule__Var_decl__ValueAssignment_3_1 ) )
            // InternalPascal.g:1077:2: ( rule__Var_decl__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getValueAssignment_3_1()); 
            }
            // InternalPascal.g:1078:2: ( rule__Var_decl__ValueAssignment_3_1 )
            // InternalPascal.g:1078:3: rule__Var_decl__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__Var_decl__Group_3__1__Impl"


    // $ANTLR start "rule__Var_list__Group__0"
    // InternalPascal.g:1087:1: rule__Var_list__Group__0 : rule__Var_list__Group__0__Impl rule__Var_list__Group__1 ;
    public final void rule__Var_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1091:1: ( rule__Var_list__Group__0__Impl rule__Var_list__Group__1 )
            // InternalPascal.g:1092:2: rule__Var_list__Group__0__Impl rule__Var_list__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Var_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__1();

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
    // $ANTLR end "rule__Var_list__Group__0"


    // $ANTLR start "rule__Var_list__Group__0__Impl"
    // InternalPascal.g:1099:1: rule__Var_list__Group__0__Impl : ( ( rule__Var_list__Var_idAssignment_0 ) ) ;
    public final void rule__Var_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1103:1: ( ( ( rule__Var_list__Var_idAssignment_0 ) ) )
            // InternalPascal.g:1104:1: ( ( rule__Var_list__Var_idAssignment_0 ) )
            {
            // InternalPascal.g:1104:1: ( ( rule__Var_list__Var_idAssignment_0 ) )
            // InternalPascal.g:1105:2: ( rule__Var_list__Var_idAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_idAssignment_0()); 
            }
            // InternalPascal.g:1106:2: ( rule__Var_list__Var_idAssignment_0 )
            // InternalPascal.g:1106:3: rule__Var_list__Var_idAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Var_idAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_idAssignment_0()); 
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
    // $ANTLR end "rule__Var_list__Group__0__Impl"


    // $ANTLR start "rule__Var_list__Group__1"
    // InternalPascal.g:1114:1: rule__Var_list__Group__1 : rule__Var_list__Group__1__Impl rule__Var_list__Group__2 ;
    public final void rule__Var_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1118:1: ( rule__Var_list__Group__1__Impl rule__Var_list__Group__2 )
            // InternalPascal.g:1119:2: rule__Var_list__Group__1__Impl rule__Var_list__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Var_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__2();

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
    // $ANTLR end "rule__Var_list__Group__1"


    // $ANTLR start "rule__Var_list__Group__1__Impl"
    // InternalPascal.g:1126:1: rule__Var_list__Group__1__Impl : ( ( rule__Var_list__Group_1__0 )* ) ;
    public final void rule__Var_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1130:1: ( ( ( rule__Var_list__Group_1__0 )* ) )
            // InternalPascal.g:1131:1: ( ( rule__Var_list__Group_1__0 )* )
            {
            // InternalPascal.g:1131:1: ( ( rule__Var_list__Group_1__0 )* )
            // InternalPascal.g:1132:2: ( rule__Var_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:1133:2: ( rule__Var_list__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1133:3: rule__Var_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Var_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Var_list__Group__1__Impl"


    // $ANTLR start "rule__Var_list__Group__2"
    // InternalPascal.g:1141:1: rule__Var_list__Group__2 : rule__Var_list__Group__2__Impl rule__Var_list__Group__3 ;
    public final void rule__Var_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1145:1: ( rule__Var_list__Group__2__Impl rule__Var_list__Group__3 )
            // InternalPascal.g:1146:2: rule__Var_list__Group__2__Impl rule__Var_list__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Var_list__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__3();

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
    // $ANTLR end "rule__Var_list__Group__2"


    // $ANTLR start "rule__Var_list__Group__2__Impl"
    // InternalPascal.g:1153:1: rule__Var_list__Group__2__Impl : ( ':' ) ;
    public final void rule__Var_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1157:1: ( ( ':' ) )
            // InternalPascal.g:1158:1: ( ':' )
            {
            // InternalPascal.g:1158:1: ( ':' )
            // InternalPascal.g:1159:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getColonKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Var_list__Group__2__Impl"


    // $ANTLR start "rule__Var_list__Group__3"
    // InternalPascal.g:1168:1: rule__Var_list__Group__3 : rule__Var_list__Group__3__Impl rule__Var_list__Group__4 ;
    public final void rule__Var_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1172:1: ( rule__Var_list__Group__3__Impl rule__Var_list__Group__4 )
            // InternalPascal.g:1173:2: rule__Var_list__Group__3__Impl rule__Var_list__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Var_list__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__4();

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
    // $ANTLR end "rule__Var_list__Group__3"


    // $ANTLR start "rule__Var_list__Group__3__Impl"
    // InternalPascal.g:1180:1: rule__Var_list__Group__3__Impl : ( ( rule__Var_list__Var_typeAssignment_3 ) ) ;
    public final void rule__Var_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1184:1: ( ( ( rule__Var_list__Var_typeAssignment_3 ) ) )
            // InternalPascal.g:1185:1: ( ( rule__Var_list__Var_typeAssignment_3 ) )
            {
            // InternalPascal.g:1185:1: ( ( rule__Var_list__Var_typeAssignment_3 ) )
            // InternalPascal.g:1186:2: ( rule__Var_list__Var_typeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_typeAssignment_3()); 
            }
            // InternalPascal.g:1187:2: ( rule__Var_list__Var_typeAssignment_3 )
            // InternalPascal.g:1187:3: rule__Var_list__Var_typeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Var_typeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_typeAssignment_3()); 
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
    // $ANTLR end "rule__Var_list__Group__3__Impl"


    // $ANTLR start "rule__Var_list__Group__4"
    // InternalPascal.g:1195:1: rule__Var_list__Group__4 : rule__Var_list__Group__4__Impl ;
    public final void rule__Var_list__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1199:1: ( rule__Var_list__Group__4__Impl )
            // InternalPascal.g:1200:2: rule__Var_list__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__4__Impl();

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
    // $ANTLR end "rule__Var_list__Group__4"


    // $ANTLR start "rule__Var_list__Group__4__Impl"
    // InternalPascal.g:1206:1: rule__Var_list__Group__4__Impl : ( ';' ) ;
    public final void rule__Var_list__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1210:1: ( ( ';' ) )
            // InternalPascal.g:1211:1: ( ';' )
            {
            // InternalPascal.g:1211:1: ( ';' )
            // InternalPascal.g:1212:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getSemicolonKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Var_list__Group__4__Impl"


    // $ANTLR start "rule__Var_list__Group_1__0"
    // InternalPascal.g:1222:1: rule__Var_list__Group_1__0 : rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 ;
    public final void rule__Var_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1226:1: ( rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 )
            // InternalPascal.g:1227:2: rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:1234:1: rule__Var_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Var_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1238:1: ( ( ',' ) )
            // InternalPascal.g:1239:1: ( ',' )
            {
            // InternalPascal.g:1239:1: ( ',' )
            // InternalPascal.g:1240:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getCommaKeyword_1_0()); 
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
    // InternalPascal.g:1249:1: rule__Var_list__Group_1__1 : rule__Var_list__Group_1__1__Impl ;
    public final void rule__Var_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1253:1: ( rule__Var_list__Group_1__1__Impl )
            // InternalPascal.g:1254:2: rule__Var_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__1__Impl();

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
    // InternalPascal.g:1260:1: rule__Var_list__Group_1__1__Impl : ( ( rule__Var_list__Var_idsAssignment_1_1 ) ) ;
    public final void rule__Var_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1264:1: ( ( ( rule__Var_list__Var_idsAssignment_1_1 ) ) )
            // InternalPascal.g:1265:1: ( ( rule__Var_list__Var_idsAssignment_1_1 ) )
            {
            // InternalPascal.g:1265:1: ( ( rule__Var_list__Var_idsAssignment_1_1 ) )
            // InternalPascal.g:1266:2: ( rule__Var_list__Var_idsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_idsAssignment_1_1()); 
            }
            // InternalPascal.g:1267:2: ( rule__Var_list__Var_idsAssignment_1_1 )
            // InternalPascal.g:1267:3: rule__Var_list__Var_idsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Var_idsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_idsAssignment_1_1()); 
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


    // $ANTLR start "rule__Block__Group__0"
    // InternalPascal.g:1276:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1280:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:1281:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalPascal.g:1288:1: rule__Block__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1292:1: ( ( 'begin' ) )
            // InternalPascal.g:1293:1: ( 'begin' )
            {
            // InternalPascal.g:1293:1: ( 'begin' )
            // InternalPascal.g:1294:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBeginKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBeginKeyword_0()); 
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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalPascal.g:1303:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1307:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:1308:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalPascal.g:1315:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementsAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1319:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) )
            // InternalPascal.g:1320:1: ( ( rule__Block__StatementsAssignment_1 ) )
            {
            // InternalPascal.g:1320:1: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalPascal.g:1321:2: ( rule__Block__StatementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            }
            // InternalPascal.g:1322:2: ( rule__Block__StatementsAssignment_1 )
            // InternalPascal.g:1322:3: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalPascal.g:1330:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1334:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:1335:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalPascal.g:1342:1: rule__Block__Group__2__Impl : ( 'end' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1346:1: ( ( 'end' ) )
            // InternalPascal.g:1347:1: ( 'end' )
            {
            // InternalPascal.g:1347:1: ( 'end' )
            // InternalPascal.g:1348:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getEndKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getEndKeyword_2()); 
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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalPascal.g:1357:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1361:1: ( rule__Block__Group__3__Impl )
            // InternalPascal.g:1362:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalPascal.g:1368:1: rule__Block__Group__3__Impl : ( '.' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1372:1: ( ( '.' ) )
            // InternalPascal.g:1373:1: ( '.' )
            {
            // InternalPascal.g:1373:1: ( '.' )
            // InternalPascal.g:1374:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getFullStopKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getFullStopKeyword_3()); 
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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Atrib__Group__0"
    // InternalPascal.g:1384:1: rule__Atrib__Group__0 : rule__Atrib__Group__0__Impl rule__Atrib__Group__1 ;
    public final void rule__Atrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1388:1: ( rule__Atrib__Group__0__Impl rule__Atrib__Group__1 )
            // InternalPascal.g:1389:2: rule__Atrib__Group__0__Impl rule__Atrib__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:1396:1: rule__Atrib__Group__0__Impl : ( ( rule__Atrib__Var_idAssignment_0 ) ) ;
    public final void rule__Atrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1400:1: ( ( ( rule__Atrib__Var_idAssignment_0 ) ) )
            // InternalPascal.g:1401:1: ( ( rule__Atrib__Var_idAssignment_0 ) )
            {
            // InternalPascal.g:1401:1: ( ( rule__Atrib__Var_idAssignment_0 ) )
            // InternalPascal.g:1402:2: ( rule__Atrib__Var_idAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getVar_idAssignment_0()); 
            }
            // InternalPascal.g:1403:2: ( rule__Atrib__Var_idAssignment_0 )
            // InternalPascal.g:1403:3: rule__Atrib__Var_idAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Var_idAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getVar_idAssignment_0()); 
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
    // InternalPascal.g:1411:1: rule__Atrib__Group__1 : rule__Atrib__Group__1__Impl rule__Atrib__Group__2 ;
    public final void rule__Atrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1415:1: ( rule__Atrib__Group__1__Impl rule__Atrib__Group__2 )
            // InternalPascal.g:1416:2: rule__Atrib__Group__1__Impl rule__Atrib__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPascal.g:1423:1: rule__Atrib__Group__1__Impl : ( ':=' ) ;
    public final void rule__Atrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1427:1: ( ( ':=' ) )
            // InternalPascal.g:1428:1: ( ':=' )
            {
            // InternalPascal.g:1428:1: ( ':=' )
            // InternalPascal.g:1429:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:1438:1: rule__Atrib__Group__2 : rule__Atrib__Group__2__Impl rule__Atrib__Group__3 ;
    public final void rule__Atrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1442:1: ( rule__Atrib__Group__2__Impl rule__Atrib__Group__3 )
            // InternalPascal.g:1443:2: rule__Atrib__Group__2__Impl rule__Atrib__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalPascal.g:1450:1: rule__Atrib__Group__2__Impl : ( ( rule__Atrib__ExpAssignment_2 ) ) ;
    public final void rule__Atrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1454:1: ( ( ( rule__Atrib__ExpAssignment_2 ) ) )
            // InternalPascal.g:1455:1: ( ( rule__Atrib__ExpAssignment_2 ) )
            {
            // InternalPascal.g:1455:1: ( ( rule__Atrib__ExpAssignment_2 ) )
            // InternalPascal.g:1456:2: ( rule__Atrib__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getExpAssignment_2()); 
            }
            // InternalPascal.g:1457:2: ( rule__Atrib__ExpAssignment_2 )
            // InternalPascal.g:1457:3: rule__Atrib__ExpAssignment_2
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
    // InternalPascal.g:1465:1: rule__Atrib__Group__3 : rule__Atrib__Group__3__Impl ;
    public final void rule__Atrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1469:1: ( rule__Atrib__Group__3__Impl )
            // InternalPascal.g:1470:2: rule__Atrib__Group__3__Impl
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
    // InternalPascal.g:1476:1: rule__Atrib__Group__3__Impl : ( ';' ) ;
    public final void rule__Atrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1480:1: ( ( ';' ) )
            // InternalPascal.g:1481:1: ( ';' )
            {
            // InternalPascal.g:1481:1: ( ';' )
            // InternalPascal.g:1482:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Arit_expression__Group__0"
    // InternalPascal.g:1492:1: rule__Arit_expression__Group__0 : rule__Arit_expression__Group__0__Impl rule__Arit_expression__Group__1 ;
    public final void rule__Arit_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1496:1: ( rule__Arit_expression__Group__0__Impl rule__Arit_expression__Group__1 )
            // InternalPascal.g:1497:2: rule__Arit_expression__Group__0__Impl rule__Arit_expression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Arit_expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Arit_expression__Group__1();

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
    // $ANTLR end "rule__Arit_expression__Group__0"


    // $ANTLR start "rule__Arit_expression__Group__0__Impl"
    // InternalPascal.g:1504:1: rule__Arit_expression__Group__0__Impl : ( ( rule__Arit_expression__ValueAssignment_0 ) ) ;
    public final void rule__Arit_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1508:1: ( ( ( rule__Arit_expression__ValueAssignment_0 ) ) )
            // InternalPascal.g:1509:1: ( ( rule__Arit_expression__ValueAssignment_0 ) )
            {
            // InternalPascal.g:1509:1: ( ( rule__Arit_expression__ValueAssignment_0 ) )
            // InternalPascal.g:1510:2: ( rule__Arit_expression__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionAccess().getValueAssignment_0()); 
            }
            // InternalPascal.g:1511:2: ( rule__Arit_expression__ValueAssignment_0 )
            // InternalPascal.g:1511:3: rule__Arit_expression__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arit_expression__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionAccess().getValueAssignment_0()); 
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
    // $ANTLR end "rule__Arit_expression__Group__0__Impl"


    // $ANTLR start "rule__Arit_expression__Group__1"
    // InternalPascal.g:1519:1: rule__Arit_expression__Group__1 : rule__Arit_expression__Group__1__Impl ;
    public final void rule__Arit_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1523:1: ( rule__Arit_expression__Group__1__Impl )
            // InternalPascal.g:1524:2: rule__Arit_expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arit_expression__Group__1__Impl();

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
    // $ANTLR end "rule__Arit_expression__Group__1"


    // $ANTLR start "rule__Arit_expression__Group__1__Impl"
    // InternalPascal.g:1530:1: rule__Arit_expression__Group__1__Impl : ( ( rule__Arit_expression__ExpAssignment_1 )* ) ;
    public final void rule__Arit_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1534:1: ( ( ( rule__Arit_expression__ExpAssignment_1 )* ) )
            // InternalPascal.g:1535:1: ( ( rule__Arit_expression__ExpAssignment_1 )* )
            {
            // InternalPascal.g:1535:1: ( ( rule__Arit_expression__ExpAssignment_1 )* )
            // InternalPascal.g:1536:2: ( rule__Arit_expression__ExpAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionAccess().getExpAssignment_1()); 
            }
            // InternalPascal.g:1537:2: ( rule__Arit_expression__ExpAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=16 && LA16_0<=20)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1537:3: rule__Arit_expression__ExpAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Arit_expression__ExpAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionAccess().getExpAssignment_1()); 
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
    // $ANTLR end "rule__Arit_expression__Group__1__Impl"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__0"
    // InternalPascal.g:1546:1: rule__Repetitive_arit_expression__Group__0 : rule__Repetitive_arit_expression__Group__0__Impl rule__Repetitive_arit_expression__Group__1 ;
    public final void rule__Repetitive_arit_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1550:1: ( rule__Repetitive_arit_expression__Group__0__Impl rule__Repetitive_arit_expression__Group__1 )
            // InternalPascal.g:1551:2: rule__Repetitive_arit_expression__Group__0__Impl rule__Repetitive_arit_expression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Repetitive_arit_expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__Group__1();

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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__0"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__0__Impl"
    // InternalPascal.g:1558:1: rule__Repetitive_arit_expression__Group__0__Impl : ( ( rule__Repetitive_arit_expression__OpAssignment_0 ) ) ;
    public final void rule__Repetitive_arit_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1562:1: ( ( ( rule__Repetitive_arit_expression__OpAssignment_0 ) ) )
            // InternalPascal.g:1563:1: ( ( rule__Repetitive_arit_expression__OpAssignment_0 ) )
            {
            // InternalPascal.g:1563:1: ( ( rule__Repetitive_arit_expression__OpAssignment_0 ) )
            // InternalPascal.g:1564:2: ( rule__Repetitive_arit_expression__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getOpAssignment_0()); 
            }
            // InternalPascal.g:1565:2: ( rule__Repetitive_arit_expression__OpAssignment_0 )
            // InternalPascal.g:1565:3: rule__Repetitive_arit_expression__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getOpAssignment_0()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__0__Impl"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__1"
    // InternalPascal.g:1573:1: rule__Repetitive_arit_expression__Group__1 : rule__Repetitive_arit_expression__Group__1__Impl rule__Repetitive_arit_expression__Group__2 ;
    public final void rule__Repetitive_arit_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1577:1: ( rule__Repetitive_arit_expression__Group__1__Impl rule__Repetitive_arit_expression__Group__2 )
            // InternalPascal.g:1578:2: rule__Repetitive_arit_expression__Group__1__Impl rule__Repetitive_arit_expression__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Repetitive_arit_expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__Group__2();

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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__1"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__1__Impl"
    // InternalPascal.g:1585:1: rule__Repetitive_arit_expression__Group__1__Impl : ( ( rule__Repetitive_arit_expression__ValueAssignment_1 ) ) ;
    public final void rule__Repetitive_arit_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1589:1: ( ( ( rule__Repetitive_arit_expression__ValueAssignment_1 ) ) )
            // InternalPascal.g:1590:1: ( ( rule__Repetitive_arit_expression__ValueAssignment_1 ) )
            {
            // InternalPascal.g:1590:1: ( ( rule__Repetitive_arit_expression__ValueAssignment_1 ) )
            // InternalPascal.g:1591:2: ( rule__Repetitive_arit_expression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getValueAssignment_1()); 
            }
            // InternalPascal.g:1592:2: ( rule__Repetitive_arit_expression__ValueAssignment_1 )
            // InternalPascal.g:1592:3: rule__Repetitive_arit_expression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__1__Impl"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__2"
    // InternalPascal.g:1600:1: rule__Repetitive_arit_expression__Group__2 : rule__Repetitive_arit_expression__Group__2__Impl ;
    public final void rule__Repetitive_arit_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1604:1: ( rule__Repetitive_arit_expression__Group__2__Impl )
            // InternalPascal.g:1605:2: rule__Repetitive_arit_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repetitive_arit_expression__Group__2__Impl();

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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__2"


    // $ANTLR start "rule__Repetitive_arit_expression__Group__2__Impl"
    // InternalPascal.g:1611:1: rule__Repetitive_arit_expression__Group__2__Impl : ( ( rule__Repetitive_arit_expression__ExpAssignment_2 )* ) ;
    public final void rule__Repetitive_arit_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1615:1: ( ( ( rule__Repetitive_arit_expression__ExpAssignment_2 )* ) )
            // InternalPascal.g:1616:1: ( ( rule__Repetitive_arit_expression__ExpAssignment_2 )* )
            {
            // InternalPascal.g:1616:1: ( ( rule__Repetitive_arit_expression__ExpAssignment_2 )* )
            // InternalPascal.g:1617:2: ( rule__Repetitive_arit_expression__ExpAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getExpAssignment_2()); 
            }
            // InternalPascal.g:1618:2: ( rule__Repetitive_arit_expression__ExpAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred25_InternalPascal()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred25_InternalPascal()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred25_InternalPascal()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred25_InternalPascal()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred25_InternalPascal()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:1618:3: rule__Repetitive_arit_expression__ExpAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Repetitive_arit_expression__ExpAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getExpAssignment_2()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__Group__2__Impl"


    // $ANTLR start "rule__Rel_expression__Group__0"
    // InternalPascal.g:1627:1: rule__Rel_expression__Group__0 : rule__Rel_expression__Group__0__Impl rule__Rel_expression__Group__1 ;
    public final void rule__Rel_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1631:1: ( rule__Rel_expression__Group__0__Impl rule__Rel_expression__Group__1 )
            // InternalPascal.g:1632:2: rule__Rel_expression__Group__0__Impl rule__Rel_expression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Rel_expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__1();

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
    // $ANTLR end "rule__Rel_expression__Group__0"


    // $ANTLR start "rule__Rel_expression__Group__0__Impl"
    // InternalPascal.g:1639:1: rule__Rel_expression__Group__0__Impl : ( ( rule__Rel_expression__OpenAssignment_0 ) ) ;
    public final void rule__Rel_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1643:1: ( ( ( rule__Rel_expression__OpenAssignment_0 ) ) )
            // InternalPascal.g:1644:1: ( ( rule__Rel_expression__OpenAssignment_0 ) )
            {
            // InternalPascal.g:1644:1: ( ( rule__Rel_expression__OpenAssignment_0 ) )
            // InternalPascal.g:1645:2: ( rule__Rel_expression__OpenAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getOpenAssignment_0()); 
            }
            // InternalPascal.g:1646:2: ( rule__Rel_expression__OpenAssignment_0 )
            // InternalPascal.g:1646:3: rule__Rel_expression__OpenAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__OpenAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getOpenAssignment_0()); 
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
    // $ANTLR end "rule__Rel_expression__Group__0__Impl"


    // $ANTLR start "rule__Rel_expression__Group__1"
    // InternalPascal.g:1654:1: rule__Rel_expression__Group__1 : rule__Rel_expression__Group__1__Impl rule__Rel_expression__Group__2 ;
    public final void rule__Rel_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1658:1: ( rule__Rel_expression__Group__1__Impl rule__Rel_expression__Group__2 )
            // InternalPascal.g:1659:2: rule__Rel_expression__Group__1__Impl rule__Rel_expression__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Rel_expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__2();

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
    // $ANTLR end "rule__Rel_expression__Group__1"


    // $ANTLR start "rule__Rel_expression__Group__1__Impl"
    // InternalPascal.g:1666:1: rule__Rel_expression__Group__1__Impl : ( ( rule__Rel_expression__FirstAssignment_1 ) ) ;
    public final void rule__Rel_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1670:1: ( ( ( rule__Rel_expression__FirstAssignment_1 ) ) )
            // InternalPascal.g:1671:1: ( ( rule__Rel_expression__FirstAssignment_1 ) )
            {
            // InternalPascal.g:1671:1: ( ( rule__Rel_expression__FirstAssignment_1 ) )
            // InternalPascal.g:1672:2: ( rule__Rel_expression__FirstAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getFirstAssignment_1()); 
            }
            // InternalPascal.g:1673:2: ( rule__Rel_expression__FirstAssignment_1 )
            // InternalPascal.g:1673:3: rule__Rel_expression__FirstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__FirstAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getFirstAssignment_1()); 
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
    // $ANTLR end "rule__Rel_expression__Group__1__Impl"


    // $ANTLR start "rule__Rel_expression__Group__2"
    // InternalPascal.g:1681:1: rule__Rel_expression__Group__2 : rule__Rel_expression__Group__2__Impl rule__Rel_expression__Group__3 ;
    public final void rule__Rel_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1685:1: ( rule__Rel_expression__Group__2__Impl rule__Rel_expression__Group__3 )
            // InternalPascal.g:1686:2: rule__Rel_expression__Group__2__Impl rule__Rel_expression__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Rel_expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__3();

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
    // $ANTLR end "rule__Rel_expression__Group__2"


    // $ANTLR start "rule__Rel_expression__Group__2__Impl"
    // InternalPascal.g:1693:1: rule__Rel_expression__Group__2__Impl : ( ( rule__Rel_expression__OpAssignment_2 ) ) ;
    public final void rule__Rel_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1697:1: ( ( ( rule__Rel_expression__OpAssignment_2 ) ) )
            // InternalPascal.g:1698:1: ( ( rule__Rel_expression__OpAssignment_2 ) )
            {
            // InternalPascal.g:1698:1: ( ( rule__Rel_expression__OpAssignment_2 ) )
            // InternalPascal.g:1699:2: ( rule__Rel_expression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getOpAssignment_2()); 
            }
            // InternalPascal.g:1700:2: ( rule__Rel_expression__OpAssignment_2 )
            // InternalPascal.g:1700:3: rule__Rel_expression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getOpAssignment_2()); 
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
    // $ANTLR end "rule__Rel_expression__Group__2__Impl"


    // $ANTLR start "rule__Rel_expression__Group__3"
    // InternalPascal.g:1708:1: rule__Rel_expression__Group__3 : rule__Rel_expression__Group__3__Impl rule__Rel_expression__Group__4 ;
    public final void rule__Rel_expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1712:1: ( rule__Rel_expression__Group__3__Impl rule__Rel_expression__Group__4 )
            // InternalPascal.g:1713:2: rule__Rel_expression__Group__3__Impl rule__Rel_expression__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Rel_expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__4();

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
    // $ANTLR end "rule__Rel_expression__Group__3"


    // $ANTLR start "rule__Rel_expression__Group__3__Impl"
    // InternalPascal.g:1720:1: rule__Rel_expression__Group__3__Impl : ( ( rule__Rel_expression__SecondAssignment_3 ) ) ;
    public final void rule__Rel_expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1724:1: ( ( ( rule__Rel_expression__SecondAssignment_3 ) ) )
            // InternalPascal.g:1725:1: ( ( rule__Rel_expression__SecondAssignment_3 ) )
            {
            // InternalPascal.g:1725:1: ( ( rule__Rel_expression__SecondAssignment_3 ) )
            // InternalPascal.g:1726:2: ( rule__Rel_expression__SecondAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getSecondAssignment_3()); 
            }
            // InternalPascal.g:1727:2: ( rule__Rel_expression__SecondAssignment_3 )
            // InternalPascal.g:1727:3: rule__Rel_expression__SecondAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__SecondAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getSecondAssignment_3()); 
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
    // $ANTLR end "rule__Rel_expression__Group__3__Impl"


    // $ANTLR start "rule__Rel_expression__Group__4"
    // InternalPascal.g:1735:1: rule__Rel_expression__Group__4 : rule__Rel_expression__Group__4__Impl ;
    public final void rule__Rel_expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1739:1: ( rule__Rel_expression__Group__4__Impl )
            // InternalPascal.g:1740:2: rule__Rel_expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__Group__4__Impl();

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
    // $ANTLR end "rule__Rel_expression__Group__4"


    // $ANTLR start "rule__Rel_expression__Group__4__Impl"
    // InternalPascal.g:1746:1: rule__Rel_expression__Group__4__Impl : ( ( rule__Rel_expression__CloseAssignment_4 ) ) ;
    public final void rule__Rel_expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1750:1: ( ( ( rule__Rel_expression__CloseAssignment_4 ) ) )
            // InternalPascal.g:1751:1: ( ( rule__Rel_expression__CloseAssignment_4 ) )
            {
            // InternalPascal.g:1751:1: ( ( rule__Rel_expression__CloseAssignment_4 ) )
            // InternalPascal.g:1752:2: ( rule__Rel_expression__CloseAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getCloseAssignment_4()); 
            }
            // InternalPascal.g:1753:2: ( rule__Rel_expression__CloseAssignment_4 )
            // InternalPascal.g:1753:3: rule__Rel_expression__CloseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rel_expression__CloseAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getCloseAssignment_4()); 
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
    // $ANTLR end "rule__Rel_expression__Group__4__Impl"


    // $ANTLR start "rule__Pascal__HeadAssignment_0"
    // InternalPascal.g:1762:1: rule__Pascal__HeadAssignment_0 : ( ruleprogram ) ;
    public final void rule__Pascal__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1766:1: ( ( ruleprogram ) )
            // InternalPascal.g:1767:2: ( ruleprogram )
            {
            // InternalPascal.g:1767:2: ( ruleprogram )
            // InternalPascal.g:1768:3: ruleprogram
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
    // InternalPascal.g:1777:1: rule__Pascal__DeclarationsAssignment_1 : ( rulevar_block ) ;
    public final void rule__Pascal__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1781:1: ( ( rulevar_block ) )
            // InternalPascal.g:1782:2: ( rulevar_block )
            {
            // InternalPascal.g:1782:2: ( rulevar_block )
            // InternalPascal.g:1783:3: rulevar_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getDeclarationsVar_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getDeclarationsVar_blockParserRuleCall_1_0()); 
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
    // InternalPascal.g:1792:1: rule__Pascal__ScopeAssignment_2 : ( ruleblock ) ;
    public final void rule__Pascal__ScopeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1796:1: ( ( ruleblock ) )
            // InternalPascal.g:1797:2: ( ruleblock )
            {
            // InternalPascal.g:1797:2: ( ruleblock )
            // InternalPascal.g:1798:3: ruleblock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getScopeBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getScopeBlockParserRuleCall_2_0()); 
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
    // InternalPascal.g:1807:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1811:1: ( ( RULE_ID ) )
            // InternalPascal.g:1812:2: ( RULE_ID )
            {
            // InternalPascal.g:1812:2: ( RULE_ID )
            // InternalPascal.g:1813:3: RULE_ID
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


    // $ANTLR start "rule__Var_block__Var_statementsAssignment_1_0"
    // InternalPascal.g:1822:1: rule__Var_block__Var_statementsAssignment_1_0 : ( rulevar_decl ) ;
    public final void rule__Var_block__Var_statementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1826:1: ( ( rulevar_decl ) )
            // InternalPascal.g:1827:2: ( rulevar_decl )
            {
            // InternalPascal.g:1827:2: ( rulevar_decl )
            // InternalPascal.g:1828:3: rulevar_decl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getVar_statementsVar_declParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_decl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getVar_statementsVar_declParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Var_block__Var_statementsAssignment_1_0"


    // $ANTLR start "rule__Var_block__Var_statementsAssignment_1_1"
    // InternalPascal.g:1837:1: rule__Var_block__Var_statementsAssignment_1_1 : ( rulevar_list ) ;
    public final void rule__Var_block__Var_statementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1841:1: ( ( rulevar_list ) )
            // InternalPascal.g:1842:2: ( rulevar_list )
            {
            // InternalPascal.g:1842:2: ( rulevar_list )
            // InternalPascal.g:1843:3: rulevar_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_blockAccess().getVar_statementsVar_listParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_blockAccess().getVar_statementsVar_listParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Var_block__Var_statementsAssignment_1_1"


    // $ANTLR start "rule__Var_decl__Var_idAssignment_0"
    // InternalPascal.g:1852:1: rule__Var_decl__Var_idAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var_decl__Var_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1856:1: ( ( RULE_ID ) )
            // InternalPascal.g:1857:2: ( RULE_ID )
            {
            // InternalPascal.g:1857:2: ( RULE_ID )
            // InternalPascal.g:1858:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_idIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_idIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Var_decl__Var_idAssignment_0"


    // $ANTLR start "rule__Var_decl__Var_typeAssignment_2"
    // InternalPascal.g:1867:1: rule__Var_decl__Var_typeAssignment_2 : ( ruletype ) ;
    public final void rule__Var_decl__Var_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1871:1: ( ( ruletype ) )
            // InternalPascal.g:1872:2: ( ruletype )
            {
            // InternalPascal.g:1872:2: ( ruletype )
            // InternalPascal.g:1873:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getVar_typeTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getVar_typeTypeEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__Var_decl__Var_typeAssignment_2"


    // $ANTLR start "rule__Var_decl__ValueAssignment_3_1"
    // InternalPascal.g:1882:1: rule__Var_decl__ValueAssignment_3_1 : ( rulesome_value ) ;
    public final void rule__Var_decl__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1886:1: ( ( rulesome_value ) )
            // InternalPascal.g:1887:2: ( rulesome_value )
            {
            // InternalPascal.g:1887:2: ( rulesome_value )
            // InternalPascal.g:1888:3: rulesome_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_declAccess().getValueSome_valueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_declAccess().getValueSome_valueParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Var_decl__ValueAssignment_3_1"


    // $ANTLR start "rule__Var_list__Var_idAssignment_0"
    // InternalPascal.g:1897:1: rule__Var_list__Var_idAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var_list__Var_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1901:1: ( ( RULE_ID ) )
            // InternalPascal.g:1902:2: ( RULE_ID )
            {
            // InternalPascal.g:1902:2: ( RULE_ID )
            // InternalPascal.g:1903:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_idIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_idIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Var_list__Var_idAssignment_0"


    // $ANTLR start "rule__Var_list__Var_idsAssignment_1_1"
    // InternalPascal.g:1912:1: rule__Var_list__Var_idsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var_list__Var_idsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1916:1: ( ( RULE_ID ) )
            // InternalPascal.g:1917:2: ( RULE_ID )
            {
            // InternalPascal.g:1917:2: ( RULE_ID )
            // InternalPascal.g:1918:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_idsIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_idsIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Var_list__Var_idsAssignment_1_1"


    // $ANTLR start "rule__Var_list__Var_typeAssignment_3"
    // InternalPascal.g:1927:1: rule__Var_list__Var_typeAssignment_3 : ( ruletype ) ;
    public final void rule__Var_list__Var_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1931:1: ( ( ruletype ) )
            // InternalPascal.g:1932:2: ( ruletype )
            {
            // InternalPascal.g:1932:2: ( ruletype )
            // InternalPascal.g:1933:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_listAccess().getVar_typeTypeEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_listAccess().getVar_typeTypeEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__Var_list__Var_typeAssignment_3"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalPascal.g:1942:1: rule__Block__StatementsAssignment_1 : ( rulestatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1946:1: ( ( rulestatement ) )
            // InternalPascal.g:1947:2: ( rulestatement )
            {
            // InternalPascal.g:1947:2: ( rulestatement )
            // InternalPascal.g:1948:3: rulestatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__Statement__Atrib_blockAssignment"
    // InternalPascal.g:1957:1: rule__Statement__Atrib_blockAssignment : ( ruleatrib ) ;
    public final void rule__Statement__Atrib_blockAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1961:1: ( ( ruleatrib ) )
            // InternalPascal.g:1962:2: ( ruleatrib )
            {
            // InternalPascal.g:1962:2: ( ruleatrib )
            // InternalPascal.g:1963:3: ruleatrib
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAtrib_blockAtribParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleatrib();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAtrib_blockAtribParserRuleCall_0()); 
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
    // $ANTLR end "rule__Statement__Atrib_blockAssignment"


    // $ANTLR start "rule__Atrib__Var_idAssignment_0"
    // InternalPascal.g:1972:1: rule__Atrib__Var_idAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atrib__Var_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1976:1: ( ( RULE_ID ) )
            // InternalPascal.g:1977:2: ( RULE_ID )
            {
            // InternalPascal.g:1977:2: ( RULE_ID )
            // InternalPascal.g:1978:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribAccess().getVar_idIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribAccess().getVar_idIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Atrib__Var_idAssignment_0"


    // $ANTLR start "rule__Atrib__ExpAssignment_2"
    // InternalPascal.g:1987:1: rule__Atrib__ExpAssignment_2 : ( ruleexpression ) ;
    public final void rule__Atrib__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1991:1: ( ( ruleexpression ) )
            // InternalPascal.g:1992:2: ( ruleexpression )
            {
            // InternalPascal.g:1992:2: ( ruleexpression )
            // InternalPascal.g:1993:3: ruleexpression
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


    // $ANTLR start "rule__Arit_expression__ValueAssignment_0"
    // InternalPascal.g:2002:1: rule__Arit_expression__ValueAssignment_0 : ( rulesome_value ) ;
    public final void rule__Arit_expression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2006:1: ( ( rulesome_value ) )
            // InternalPascal.g:2007:2: ( rulesome_value )
            {
            // InternalPascal.g:2007:2: ( rulesome_value )
            // InternalPascal.g:2008:3: rulesome_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionAccess().getValueSome_valueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionAccess().getValueSome_valueParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Arit_expression__ValueAssignment_0"


    // $ANTLR start "rule__Arit_expression__ExpAssignment_1"
    // InternalPascal.g:2017:1: rule__Arit_expression__ExpAssignment_1 : ( rulerepetitive_arit_expression ) ;
    public final void rule__Arit_expression__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2021:1: ( ( rulerepetitive_arit_expression ) )
            // InternalPascal.g:2022:2: ( rulerepetitive_arit_expression )
            {
            // InternalPascal.g:2022:2: ( rulerepetitive_arit_expression )
            // InternalPascal.g:2023:3: rulerepetitive_arit_expression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerepetitive_arit_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Arit_expression__ExpAssignment_1"


    // $ANTLR start "rule__Repetitive_arit_expression__OpAssignment_0"
    // InternalPascal.g:2032:1: rule__Repetitive_arit_expression__OpAssignment_0 : ( rulearit_op ) ;
    public final void rule__Repetitive_arit_expression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2036:1: ( ( rulearit_op ) )
            // InternalPascal.g:2037:2: ( rulearit_op )
            {
            // InternalPascal.g:2037:2: ( rulearit_op )
            // InternalPascal.g:2038:3: rulearit_op
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getOpArit_opParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulearit_op();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getOpArit_opParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__OpAssignment_0"


    // $ANTLR start "rule__Repetitive_arit_expression__ValueAssignment_1"
    // InternalPascal.g:2047:1: rule__Repetitive_arit_expression__ValueAssignment_1 : ( rulesome_value ) ;
    public final void rule__Repetitive_arit_expression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2051:1: ( ( rulesome_value ) )
            // InternalPascal.g:2052:2: ( rulesome_value )
            {
            // InternalPascal.g:2052:2: ( rulesome_value )
            // InternalPascal.g:2053:3: rulesome_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getValueSome_valueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getValueSome_valueParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__ValueAssignment_1"


    // $ANTLR start "rule__Repetitive_arit_expression__ExpAssignment_2"
    // InternalPascal.g:2062:1: rule__Repetitive_arit_expression__ExpAssignment_2 : ( rulerepetitive_arit_expression ) ;
    public final void rule__Repetitive_arit_expression__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2066:1: ( ( rulerepetitive_arit_expression ) )
            // InternalPascal.g:2067:2: ( rulerepetitive_arit_expression )
            {
            // InternalPascal.g:2067:2: ( rulerepetitive_arit_expression )
            // InternalPascal.g:2068:3: rulerepetitive_arit_expression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepetitive_arit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerepetitive_arit_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepetitive_arit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Repetitive_arit_expression__ExpAssignment_2"


    // $ANTLR start "rule__Rel_expression__OpenAssignment_0"
    // InternalPascal.g:2077:1: rule__Rel_expression__OpenAssignment_0 : ( ruleopen_par ) ;
    public final void rule__Rel_expression__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2081:1: ( ( ruleopen_par ) )
            // InternalPascal.g:2082:2: ( ruleopen_par )
            {
            // InternalPascal.g:2082:2: ( ruleopen_par )
            // InternalPascal.g:2083:3: ruleopen_par
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getOpenOpen_parParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleopen_par();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getOpenOpen_parParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Rel_expression__OpenAssignment_0"


    // $ANTLR start "rule__Rel_expression__FirstAssignment_1"
    // InternalPascal.g:2092:1: rule__Rel_expression__FirstAssignment_1 : ( rulesome_value ) ;
    public final void rule__Rel_expression__FirstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2096:1: ( ( rulesome_value ) )
            // InternalPascal.g:2097:2: ( rulesome_value )
            {
            // InternalPascal.g:2097:2: ( rulesome_value )
            // InternalPascal.g:2098:3: rulesome_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getFirstSome_valueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getFirstSome_valueParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Rel_expression__FirstAssignment_1"


    // $ANTLR start "rule__Rel_expression__OpAssignment_2"
    // InternalPascal.g:2107:1: rule__Rel_expression__OpAssignment_2 : ( rulerel_op ) ;
    public final void rule__Rel_expression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2111:1: ( ( rulerel_op ) )
            // InternalPascal.g:2112:2: ( rulerel_op )
            {
            // InternalPascal.g:2112:2: ( rulerel_op )
            // InternalPascal.g:2113:3: rulerel_op
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getOpRel_opParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerel_op();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getOpRel_opParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Rel_expression__OpAssignment_2"


    // $ANTLR start "rule__Rel_expression__SecondAssignment_3"
    // InternalPascal.g:2122:1: rule__Rel_expression__SecondAssignment_3 : ( rulesome_value ) ;
    public final void rule__Rel_expression__SecondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2126:1: ( ( rulesome_value ) )
            // InternalPascal.g:2127:2: ( rulesome_value )
            {
            // InternalPascal.g:2127:2: ( rulesome_value )
            // InternalPascal.g:2128:3: rulesome_value
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getSecondSome_valueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesome_value();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getSecondSome_valueParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Rel_expression__SecondAssignment_3"


    // $ANTLR start "rule__Rel_expression__CloseAssignment_4"
    // InternalPascal.g:2137:1: rule__Rel_expression__CloseAssignment_4 : ( ruleclose_par ) ;
    public final void rule__Rel_expression__CloseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2141:1: ( ( ruleclose_par ) )
            // InternalPascal.g:2142:2: ( ruleclose_par )
            {
            // InternalPascal.g:2142:2: ( ruleclose_par )
            // InternalPascal.g:2143:3: ruleclose_par
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRel_expressionAccess().getCloseClose_parParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleclose_par();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRel_expressionAccess().getCloseClose_parParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Rel_expression__CloseAssignment_4"

    // $ANTLR start synpred5_InternalPascal
    public final void synpred5_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:506:2: ( ( ( rule__Var_block__Var_statementsAssignment_1_0 ) ) )
        // InternalPascal.g:506:2: ( ( rule__Var_block__Var_statementsAssignment_1_0 ) )
        {
        // InternalPascal.g:506:2: ( ( rule__Var_block__Var_statementsAssignment_1_0 ) )
        // InternalPascal.g:507:3: ( rule__Var_block__Var_statementsAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getVar_blockAccess().getVar_statementsAssignment_1_0()); 
        }
        // InternalPascal.g:508:3: ( rule__Var_block__Var_statementsAssignment_1_0 )
        // InternalPascal.g:508:4: rule__Var_block__Var_statementsAssignment_1_0
        {
        pushFollow(FOLLOW_2);
        rule__Var_block__Var_statementsAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalPascal

    // $ANTLR start synpred25_InternalPascal
    public final void synpred25_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:1618:3: ( rule__Repetitive_arit_expression__ExpAssignment_2 )
        // InternalPascal.g:1618:3: rule__Repetitive_arit_expression__ExpAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Repetitive_arit_expression__ExpAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalPascal

    // Delegated rules

    public final boolean synpred25_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000040F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});

}