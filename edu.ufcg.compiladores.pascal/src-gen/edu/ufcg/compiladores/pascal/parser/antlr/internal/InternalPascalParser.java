package edu.ufcg.compiladores.pascal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.ufcg.compiladores.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_MULTI_LINE_COMMENT", "RULE_SINGLE_LINE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'var'", "':'", "'='", "','", "'begin'", "'end'", "'.'", "':='", "'+'", "'-'", "'*'", "'div'", "'mod'", "'>'", "'<'", "'>='", "'<='", "'('", "')'", "'boolean'", "'integer'", "'string'"
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePascal"
    // InternalPascal.g:71:1: entryRulePascal returns [EObject current=null] : iv_rulePascal= rulePascal EOF ;
    public final EObject entryRulePascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePascal = null;


        try {
            // InternalPascal.g:71:47: (iv_rulePascal= rulePascal EOF )
            // InternalPascal.g:72:2: iv_rulePascal= rulePascal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPascalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePascal=rulePascal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePascal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePascal"


    // $ANTLR start "rulePascal"
    // InternalPascal.g:78:1: rulePascal returns [EObject current=null] : ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )? ;
    public final EObject rulePascal() throws RecognitionException {
        EObject current = null;

        EObject lv_head_0_0 = null;

        EObject lv_declarations_1_0 = null;

        EObject lv_scope_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:84:2: ( ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )? )
            // InternalPascal.g:85:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )?
            {
            // InternalPascal.g:85:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:86:3: ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )*
                    {
                    // InternalPascal.g:86:3: ( (lv_head_0_0= ruleprogram ) )
                    // InternalPascal.g:87:4: (lv_head_0_0= ruleprogram )
                    {
                    // InternalPascal.g:87:4: (lv_head_0_0= ruleprogram )
                    // InternalPascal.g:88:5: lv_head_0_0= ruleprogram
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_head_0_0=ruleprogram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPascalRule());
                      					}
                      					set(
                      						current,
                      						"head",
                      						lv_head_0_0,
                      						"edu.ufcg.compiladores.pascal.Pascal.program");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }

                    // InternalPascal.g:105:3: ( (lv_declarations_1_0= rulevar_block ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPascal.g:106:4: (lv_declarations_1_0= rulevar_block )
                    	    {
                    	    // InternalPascal.g:106:4: (lv_declarations_1_0= rulevar_block )
                    	    // InternalPascal.g:107:5: lv_declarations_1_0= rulevar_block
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPascalAccess().getDeclarationsVar_blockParserRuleCall_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_declarations_1_0=rulevar_block();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElementForParent(grammarAccess.getPascalRule());
                    	      					}
                    	      					add(
                    	      						current,
                    	      						"declarations",
                    	      						lv_declarations_1_0,
                    	      						"edu.ufcg.compiladores.pascal.Pascal.var_block");
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalPascal.g:124:3: ( (lv_scope_2_0= ruleblock ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPascal.g:125:4: (lv_scope_2_0= ruleblock )
                    	    {
                    	    // InternalPascal.g:125:4: (lv_scope_2_0= ruleblock )
                    	    // InternalPascal.g:126:5: lv_scope_2_0= ruleblock
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPascalAccess().getScopeBlockParserRuleCall_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_scope_2_0=ruleblock();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElementForParent(grammarAccess.getPascalRule());
                    	      					}
                    	      					add(
                    	      						current,
                    	      						"scope",
                    	      						lv_scope_2_0,
                    	      						"edu.ufcg.compiladores.pascal.Pascal.block");
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:147:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:147:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:148:2: iv_ruleprogram= ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:154:1: ruleprogram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascal.g:160:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPascal.g:161:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:161:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalPascal.g:162:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
              		
            }
            // InternalPascal.g:166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:167:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:168:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgramRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRulevar_block"
    // InternalPascal.g:192:1: entryRulevar_block returns [EObject current=null] : iv_rulevar_block= rulevar_block EOF ;
    public final EObject entryRulevar_block() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_block = null;


        try {
            // InternalPascal.g:192:50: (iv_rulevar_block= rulevar_block EOF )
            // InternalPascal.g:193:2: iv_rulevar_block= rulevar_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevar_block=rulevar_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevar_block; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_block"


    // $ANTLR start "rulevar_block"
    // InternalPascal.g:199:1: rulevar_block returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ ) ;
    public final EObject rulevar_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_statements_1_0 = null;

        EObject lv_var_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:205:2: ( (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ ) )
            // InternalPascal.g:206:2: (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ )
            {
            // InternalPascal.g:206:2: (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ )
            // InternalPascal.g:207:3: otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVar_blockAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:211:3: ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:212:4: ( (lv_var_statements_1_0= rulevar_decl ) )
            	    {
            	    // InternalPascal.g:212:4: ( (lv_var_statements_1_0= rulevar_decl ) )
            	    // InternalPascal.g:213:5: (lv_var_statements_1_0= rulevar_decl )
            	    {
            	    // InternalPascal.g:213:5: (lv_var_statements_1_0= rulevar_decl )
            	    // InternalPascal.g:214:6: lv_var_statements_1_0= rulevar_decl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVar_blockAccess().getVar_statementsVar_declParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_var_statements_1_0=rulevar_decl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVar_blockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"var_statements",
            	      							lv_var_statements_1_0,
            	      							"edu.ufcg.compiladores.pascal.Pascal.var_decl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:232:4: ( (lv_var_statements_2_0= rulevar_list ) )
            	    {
            	    // InternalPascal.g:232:4: ( (lv_var_statements_2_0= rulevar_list ) )
            	    // InternalPascal.g:233:5: (lv_var_statements_2_0= rulevar_list )
            	    {
            	    // InternalPascal.g:233:5: (lv_var_statements_2_0= rulevar_list )
            	    // InternalPascal.g:234:6: lv_var_statements_2_0= rulevar_list
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVar_blockAccess().getVar_statementsVar_listParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_var_statements_2_0=rulevar_list();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVar_blockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"var_statements",
            	      							lv_var_statements_2_0,
            	      							"edu.ufcg.compiladores.pascal.Pascal.var_list");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_block"


    // $ANTLR start "entryRulevar_decl"
    // InternalPascal.g:256:1: entryRulevar_decl returns [EObject current=null] : iv_rulevar_decl= rulevar_decl EOF ;
    public final EObject entryRulevar_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_decl = null;


        try {
            // InternalPascal.g:256:49: (iv_rulevar_decl= rulevar_decl EOF )
            // InternalPascal.g:257:2: iv_rulevar_decl= rulevar_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_declRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevar_decl=rulevar_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevar_decl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_decl"


    // $ANTLR start "rulevar_decl"
    // InternalPascal.g:263:1: rulevar_decl returns [EObject current=null] : ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' ) ;
    public final EObject rulevar_decl() throws RecognitionException {
        EObject current = null;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_var_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:269:2: ( ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' ) )
            // InternalPascal.g:270:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' )
            {
            // InternalPascal.g:270:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' )
            // InternalPascal.g:271:3: ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';'
            {
            // InternalPascal.g:271:3: ( (lv_var_id_0_0= RULE_ID ) )
            // InternalPascal.g:272:4: (lv_var_id_0_0= RULE_ID )
            {
            // InternalPascal.g:272:4: (lv_var_id_0_0= RULE_ID )
            // InternalPascal.g:273:5: lv_var_id_0_0= RULE_ID
            {
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_var_id_0_0, grammarAccess.getVar_declAccess().getVar_idIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVar_declRule());
              					}
              					setWithLastConsumed(
              						current,
              						"var_id",
              						lv_var_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVar_declAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:293:3: ( (lv_var_type_2_0= ruletype ) )
            // InternalPascal.g:294:4: (lv_var_type_2_0= ruletype )
            {
            // InternalPascal.g:294:4: (lv_var_type_2_0= ruletype )
            // InternalPascal.g:295:5: lv_var_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVar_declAccess().getVar_typeTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_var_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVar_declRule());
              					}
              					set(
              						current,
              						"var_type",
              						lv_var_type_2_0,
              						"edu.ufcg.compiladores.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:312:3: (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:313:4: otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVar_declAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalPascal.g:317:4: ( (lv_value_4_0= rulesome_value ) )
                    // InternalPascal.g:318:5: (lv_value_4_0= rulesome_value )
                    {
                    // InternalPascal.g:318:5: (lv_value_4_0= rulesome_value )
                    // InternalPascal.g:319:6: lv_value_4_0= rulesome_value
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVar_declAccess().getValueSome_valueParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_value_4_0=rulesome_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVar_declRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"edu.ufcg.compiladores.pascal.Pascal.some_value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVar_declAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_decl"


    // $ANTLR start "entryRulevar_list"
    // InternalPascal.g:345:1: entryRulevar_list returns [EObject current=null] : iv_rulevar_list= rulevar_list EOF ;
    public final EObject entryRulevar_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_list = null;


        try {
            // InternalPascal.g:345:49: (iv_rulevar_list= rulevar_list EOF )
            // InternalPascal.g:346:2: iv_rulevar_list= rulevar_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevar_list=rulevar_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevar_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_list"


    // $ANTLR start "rulevar_list"
    // InternalPascal.g:352:1: rulevar_list returns [EObject current=null] : ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' ) ;
    public final EObject rulevar_list() throws RecognitionException {
        EObject current = null;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token lv_var_ids_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_var_type_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:358:2: ( ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' ) )
            // InternalPascal.g:359:2: ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' )
            {
            // InternalPascal.g:359:2: ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' )
            // InternalPascal.g:360:3: ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';'
            {
            // InternalPascal.g:360:3: ( (lv_var_id_0_0= RULE_ID ) )
            // InternalPascal.g:361:4: (lv_var_id_0_0= RULE_ID )
            {
            // InternalPascal.g:361:4: (lv_var_id_0_0= RULE_ID )
            // InternalPascal.g:362:5: lv_var_id_0_0= RULE_ID
            {
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_var_id_0_0, grammarAccess.getVar_listAccess().getVar_idIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVar_listRule());
              					}
              					setWithLastConsumed(
              						current,
              						"var_id",
              						lv_var_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:378:3: (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:379:4: otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVar_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:383:4: ( (lv_var_ids_2_0= RULE_ID ) )
            	    // InternalPascal.g:384:5: (lv_var_ids_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:384:5: (lv_var_ids_2_0= RULE_ID )
            	    // InternalPascal.g:385:6: lv_var_ids_2_0= RULE_ID
            	    {
            	    lv_var_ids_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_var_ids_2_0, grammarAccess.getVar_listAccess().getVar_idsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVar_listRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"var_ids",
            	      							lv_var_ids_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVar_listAccess().getColonKeyword_2());
              		
            }
            // InternalPascal.g:406:3: ( (lv_var_type_4_0= ruletype ) )
            // InternalPascal.g:407:4: (lv_var_type_4_0= ruletype )
            {
            // InternalPascal.g:407:4: (lv_var_type_4_0= ruletype )
            // InternalPascal.g:408:5: lv_var_type_4_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVar_listAccess().getVar_typeTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_var_type_4_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVar_listRule());
              					}
              					set(
              						current,
              						"var_type",
              						lv_var_type_4_0,
              						"edu.ufcg.compiladores.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVar_listAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:433:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:433:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:434:2: iv_ruleblock= ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:440:1: ruleblock returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:446:2: ( (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' ) )
            // InternalPascal.g:447:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' )
            {
            // InternalPascal.g:447:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' )
            // InternalPascal.g:448:3: otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:452:3: ( (lv_statements_1_0= rulestatement ) )
            // InternalPascal.g:453:4: (lv_statements_1_0= rulestatement )
            {
            // InternalPascal.g:453:4: (lv_statements_1_0= rulestatement )
            // InternalPascal.g:454:5: lv_statements_1_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_statements_1_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					add(
              						current,
              						"statements",
              						lv_statements_1_0,
              						"edu.ufcg.compiladores.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getEndKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getFullStopKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:483:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:483:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:484:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:490:1: rulestatement returns [EObject current=null] : ( (lv_atrib_block_0_0= ruleatrib ) )+ ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_atrib_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:496:2: ( ( (lv_atrib_block_0_0= ruleatrib ) )+ )
            // InternalPascal.g:497:2: ( (lv_atrib_block_0_0= ruleatrib ) )+
            {
            // InternalPascal.g:497:2: ( (lv_atrib_block_0_0= ruleatrib ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:498:3: (lv_atrib_block_0_0= ruleatrib )
            	    {
            	    // InternalPascal.g:498:3: (lv_atrib_block_0_0= ruleatrib )
            	    // InternalPascal.g:499:4: lv_atrib_block_0_0= ruleatrib
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStatementAccess().getAtrib_blockAtribParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_atrib_block_0_0=ruleatrib();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStatementRule());
            	      				}
            	      				add(
            	      					current,
            	      					"atrib_block",
            	      					lv_atrib_block_0_0,
            	      					"edu.ufcg.compiladores.pascal.Pascal.atrib");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleatrib"
    // InternalPascal.g:519:1: entryRuleatrib returns [EObject current=null] : iv_ruleatrib= ruleatrib EOF ;
    public final EObject entryRuleatrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatrib = null;


        try {
            // InternalPascal.g:519:46: (iv_ruleatrib= ruleatrib EOF )
            // InternalPascal.g:520:2: iv_ruleatrib= ruleatrib EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtribRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleatrib=ruleatrib();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleatrib; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleatrib"


    // $ANTLR start "ruleatrib"
    // InternalPascal.g:526:1: ruleatrib returns [EObject current=null] : ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleatrib() throws RecognitionException {
        EObject current = null;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:532:2: ( ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) )
            // InternalPascal.g:533:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            {
            // InternalPascal.g:533:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            // InternalPascal.g:534:3: ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';'
            {
            // InternalPascal.g:534:3: ( (lv_var_id_0_0= RULE_ID ) )
            // InternalPascal.g:535:4: (lv_var_id_0_0= RULE_ID )
            {
            // InternalPascal.g:535:4: (lv_var_id_0_0= RULE_ID )
            // InternalPascal.g:536:5: lv_var_id_0_0= RULE_ID
            {
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_var_id_0_0, grammarAccess.getAtribAccess().getVar_idIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAtribRule());
              					}
              					setWithLastConsumed(
              						current,
              						"var_id",
              						lv_var_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:556:3: ( (lv_exp_2_0= ruleexpression ) )
            // InternalPascal.g:557:4: (lv_exp_2_0= ruleexpression )
            {
            // InternalPascal.g:557:4: (lv_exp_2_0= ruleexpression )
            // InternalPascal.g:558:5: lv_exp_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_exp_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"edu.ufcg.compiladores.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleatrib"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:583:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:583:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:584:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:590:1: ruleexpression returns [EObject current=null] : (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject this_arit_expression_0 = null;

        EObject this_rel_expression_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:596:2: ( (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression ) )
            // InternalPascal.g:597:2: (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression )
            {
            // InternalPascal.g:597:2: (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=29 && LA8_1<=32)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==15||(LA8_1>=24 && LA8_1<=28)) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=29 && LA8_2<=32)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==15||(LA8_2>=24 && LA8_2<=28)) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA8_3 = input.LA(2);

                if ( ((LA8_3>=29 && LA8_3<=32)) ) {
                    alt8=2;
                }
                else if ( (LA8_3==EOF||LA8_3==15||(LA8_3>=24 && LA8_3<=28)) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA8_4 = input.LA(2);

                if ( ((LA8_4>=29 && LA8_4<=32)) ) {
                    alt8=2;
                }
                else if ( (LA8_4==EOF||LA8_4==15||(LA8_4>=24 && LA8_4<=28)) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascal.g:598:3: this_arit_expression_0= rulearit_expression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getArit_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arit_expression_0=rulearit_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_arit_expression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:610:3: this_rel_expression_1= rulerel_expression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getRel_expressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rel_expression_1=rulerel_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_rel_expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulearit_expression"
    // InternalPascal.g:625:1: entryRulearit_expression returns [EObject current=null] : iv_rulearit_expression= rulearit_expression EOF ;
    public final EObject entryRulearit_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearit_expression = null;


        try {
            // InternalPascal.g:625:56: (iv_rulearit_expression= rulearit_expression EOF )
            // InternalPascal.g:626:2: iv_rulearit_expression= rulearit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArit_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearit_expression=rulearit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearit_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearit_expression"


    // $ANTLR start "rulearit_expression"
    // InternalPascal.g:632:1: rulearit_expression returns [EObject current=null] : ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* ) ;
    public final EObject rulearit_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:638:2: ( ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* ) )
            // InternalPascal.g:639:2: ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* )
            {
            // InternalPascal.g:639:2: ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* )
            // InternalPascal.g:640:3: ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )*
            {
            // InternalPascal.g:640:3: ( (lv_value_0_0= rulesome_value ) )
            // InternalPascal.g:641:4: (lv_value_0_0= rulesome_value )
            {
            // InternalPascal.g:641:4: (lv_value_0_0= rulesome_value )
            // InternalPascal.g:642:5: lv_value_0_0= rulesome_value
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArit_expressionAccess().getValueSome_valueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_value_0_0=rulesome_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArit_expressionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"edu.ufcg.compiladores.pascal.Pascal.some_value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:659:3: ( (lv_exp_1_0= rulerepetitive_arit_expression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:660:4: (lv_exp_1_0= rulerepetitive_arit_expression )
            	    {
            	    // InternalPascal.g:660:4: (lv_exp_1_0= rulerepetitive_arit_expression )
            	    // InternalPascal.g:661:5: lv_exp_1_0= rulerepetitive_arit_expression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getArit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_exp_1_0=rulerepetitive_arit_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getArit_expressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exp",
            	      						lv_exp_1_0,
            	      						"edu.ufcg.compiladores.pascal.Pascal.repetitive_arit_expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearit_expression"


    // $ANTLR start "entryRulerepetitive_arit_expression"
    // InternalPascal.g:682:1: entryRulerepetitive_arit_expression returns [EObject current=null] : iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF ;
    public final EObject entryRulerepetitive_arit_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_arit_expression = null;


        try {
            // InternalPascal.g:682:67: (iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF )
            // InternalPascal.g:683:2: iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepetitive_arit_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_arit_expression=rulerepetitive_arit_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerepetitive_arit_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetitive_arit_expression"


    // $ANTLR start "rulerepetitive_arit_expression"
    // InternalPascal.g:689:1: rulerepetitive_arit_expression returns [EObject current=null] : ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* ) ;
    public final EObject rulerepetitive_arit_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:695:2: ( ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* ) )
            // InternalPascal.g:696:2: ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* )
            {
            // InternalPascal.g:696:2: ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* )
            // InternalPascal.g:697:3: ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )*
            {
            // InternalPascal.g:697:3: ( (lv_op_0_0= rulearit_op ) )
            // InternalPascal.g:698:4: (lv_op_0_0= rulearit_op )
            {
            // InternalPascal.g:698:4: (lv_op_0_0= rulearit_op )
            // InternalPascal.g:699:5: lv_op_0_0= rulearit_op
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepetitive_arit_expressionAccess().getOpArit_opParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_op_0_0=rulearit_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepetitive_arit_expressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"edu.ufcg.compiladores.pascal.Pascal.arit_op");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:716:3: ( (lv_value_1_0= rulesome_value ) )
            // InternalPascal.g:717:4: (lv_value_1_0= rulesome_value )
            {
            // InternalPascal.g:717:4: (lv_value_1_0= rulesome_value )
            // InternalPascal.g:718:5: lv_value_1_0= rulesome_value
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepetitive_arit_expressionAccess().getValueSome_valueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_value_1_0=rulesome_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepetitive_arit_expressionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"edu.ufcg.compiladores.pascal.Pascal.some_value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:735:3: ( (lv_exp_2_0= rulerepetitive_arit_expression ) )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred11_InternalPascal()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred11_InternalPascal()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred11_InternalPascal()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred11_InternalPascal()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred11_InternalPascal()) ) {
                        alt10=1;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:736:4: (lv_exp_2_0= rulerepetitive_arit_expression )
            	    {
            	    // InternalPascal.g:736:4: (lv_exp_2_0= rulerepetitive_arit_expression )
            	    // InternalPascal.g:737:5: lv_exp_2_0= rulerepetitive_arit_expression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRepetitive_arit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_exp_2_0=rulerepetitive_arit_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRepetitive_arit_expressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exp",
            	      						lv_exp_2_0,
            	      						"edu.ufcg.compiladores.pascal.Pascal.repetitive_arit_expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_arit_expression"


    // $ANTLR start "entryRulerel_expression"
    // InternalPascal.g:758:1: entryRulerel_expression returns [EObject current=null] : iv_rulerel_expression= rulerel_expression EOF ;
    public final EObject entryRulerel_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerel_expression = null;


        try {
            // InternalPascal.g:758:55: (iv_rulerel_expression= rulerel_expression EOF )
            // InternalPascal.g:759:2: iv_rulerel_expression= rulerel_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRel_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerel_expression=rulerel_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerel_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_expression"


    // $ANTLR start "rulerel_expression"
    // InternalPascal.g:765:1: rulerel_expression returns [EObject current=null] : ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) ) ;
    public final EObject rulerel_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_open_0_0 = null;

        AntlrDatatypeRuleToken lv_first_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        AntlrDatatypeRuleToken lv_second_3_0 = null;

        AntlrDatatypeRuleToken lv_close_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:771:2: ( ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) ) )
            // InternalPascal.g:772:2: ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) )
            {
            // InternalPascal.g:772:2: ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) )
            // InternalPascal.g:773:3: ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) )
            {
            // InternalPascal.g:773:3: ( (lv_open_0_0= ruleopen_par ) )
            // InternalPascal.g:774:4: (lv_open_0_0= ruleopen_par )
            {
            // InternalPascal.g:774:4: (lv_open_0_0= ruleopen_par )
            // InternalPascal.g:775:5: lv_open_0_0= ruleopen_par
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRel_expressionAccess().getOpenOpen_parParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_open_0_0=ruleopen_par();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRel_expressionRule());
              					}
              					set(
              						current,
              						"open",
              						lv_open_0_0,
              						"edu.ufcg.compiladores.pascal.Pascal.open_par");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:792:3: ( (lv_first_1_0= rulesome_value ) )
            // InternalPascal.g:793:4: (lv_first_1_0= rulesome_value )
            {
            // InternalPascal.g:793:4: (lv_first_1_0= rulesome_value )
            // InternalPascal.g:794:5: lv_first_1_0= rulesome_value
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRel_expressionAccess().getFirstSome_valueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_first_1_0=rulesome_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRel_expressionRule());
              					}
              					set(
              						current,
              						"first",
              						lv_first_1_0,
              						"edu.ufcg.compiladores.pascal.Pascal.some_value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:811:3: ( (lv_op_2_0= rulerel_op ) )
            // InternalPascal.g:812:4: (lv_op_2_0= rulerel_op )
            {
            // InternalPascal.g:812:4: (lv_op_2_0= rulerel_op )
            // InternalPascal.g:813:5: lv_op_2_0= rulerel_op
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRel_expressionAccess().getOpRel_opParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_op_2_0=rulerel_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRel_expressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_2_0,
              						"edu.ufcg.compiladores.pascal.Pascal.rel_op");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:830:3: ( (lv_second_3_0= rulesome_value ) )
            // InternalPascal.g:831:4: (lv_second_3_0= rulesome_value )
            {
            // InternalPascal.g:831:4: (lv_second_3_0= rulesome_value )
            // InternalPascal.g:832:5: lv_second_3_0= rulesome_value
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRel_expressionAccess().getSecondSome_valueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_second_3_0=rulesome_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRel_expressionRule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_3_0,
              						"edu.ufcg.compiladores.pascal.Pascal.some_value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:849:3: ( (lv_close_4_0= ruleclose_par ) )
            // InternalPascal.g:850:4: (lv_close_4_0= ruleclose_par )
            {
            // InternalPascal.g:850:4: (lv_close_4_0= ruleclose_par )
            // InternalPascal.g:851:5: lv_close_4_0= ruleclose_par
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRel_expressionAccess().getCloseClose_parParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_close_4_0=ruleclose_par();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRel_expressionRule());
              					}
              					set(
              						current,
              						"close",
              						lv_close_4_0,
              						"edu.ufcg.compiladores.pascal.Pascal.close_par");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_expression"


    // $ANTLR start "entryRulearit_op"
    // InternalPascal.g:872:1: entryRulearit_op returns [String current=null] : iv_rulearit_op= rulearit_op EOF ;
    public final String entryRulearit_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearit_op = null;


        try {
            // InternalPascal.g:872:47: (iv_rulearit_op= rulearit_op EOF )
            // InternalPascal.g:873:2: iv_rulearit_op= rulearit_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArit_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearit_op=rulearit_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearit_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearit_op"


    // $ANTLR start "rulearit_op"
    // InternalPascal.g:879:1: rulearit_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken rulearit_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:885:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) )
            // InternalPascal.g:886:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            {
            // InternalPascal.g:886:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPascal.g:887:3: kw= '+'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:893:3: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:899:3: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:905:3: kw= 'div'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getDivKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:911:3: kw= 'mod'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getModKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearit_op"


    // $ANTLR start "entryRulerel_op"
    // InternalPascal.g:920:1: entryRulerel_op returns [String current=null] : iv_rulerel_op= rulerel_op EOF ;
    public final String entryRulerel_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op = null;


        try {
            // InternalPascal.g:920:46: (iv_rulerel_op= rulerel_op EOF )
            // InternalPascal.g:921:2: iv_rulerel_op= rulerel_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRel_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerel_op=rulerel_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerel_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op"


    // $ANTLR start "rulerel_op"
    // InternalPascal.g:927:1: rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulerel_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:933:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalPascal.g:934:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalPascal.g:934:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:935:3: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:941:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:947:3: kw= '>='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:953:3: kw= '<='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op"


    // $ANTLR start "entryRulesome_value"
    // InternalPascal.g:962:1: entryRulesome_value returns [String current=null] : iv_rulesome_value= rulesome_value EOF ;
    public final String entryRulesome_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesome_value = null;


        try {
            // InternalPascal.g:962:50: (iv_rulesome_value= rulesome_value EOF )
            // InternalPascal.g:963:2: iv_rulesome_value= rulesome_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSome_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesome_value=rulesome_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesome_value.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesome_value"


    // $ANTLR start "rulesome_value"
    // InternalPascal.g:969:1: rulesome_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken rulesome_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;


        	enterRule();

        try {
            // InternalPascal.g:975:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalPascal.g:976:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalPascal.g:976:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:977:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getSome_valueAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:985:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getSome_valueAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:993:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getSome_valueAccess().getSTRINGTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1001:3: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BOOLEAN_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BOOLEAN_3, grammarAccess.getSome_valueAccess().getBOOLEANTerminalRuleCall_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesome_value"


    // $ANTLR start "entryRuleopen_par"
    // InternalPascal.g:1012:1: entryRuleopen_par returns [String current=null] : iv_ruleopen_par= ruleopen_par EOF ;
    public final String entryRuleopen_par() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleopen_par = null;


        try {
            // InternalPascal.g:1012:48: (iv_ruleopen_par= ruleopen_par EOF )
            // InternalPascal.g:1013:2: iv_ruleopen_par= ruleopen_par EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpen_parRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleopen_par=ruleopen_par();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleopen_par.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleopen_par"


    // $ANTLR start "ruleopen_par"
    // InternalPascal.g:1019:1: ruleopen_par returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' )? ;
    public final AntlrDatatypeRuleToken ruleopen_par() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1025:2: ( (kw= '(' )? )
            // InternalPascal.g:1026:2: (kw= '(' )?
            {
            // InternalPascal.g:1026:2: (kw= '(' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1027:3: kw= '('
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpen_parAccess().getLeftParenthesisKeyword());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleopen_par"


    // $ANTLR start "entryRuleclose_par"
    // InternalPascal.g:1036:1: entryRuleclose_par returns [String current=null] : iv_ruleclose_par= ruleclose_par EOF ;
    public final String entryRuleclose_par() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclose_par = null;


        try {
            // InternalPascal.g:1036:49: (iv_ruleclose_par= ruleclose_par EOF )
            // InternalPascal.g:1037:2: iv_ruleclose_par= ruleclose_par EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClose_parRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleclose_par=ruleclose_par();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclose_par.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclose_par"


    // $ANTLR start "ruleclose_par"
    // InternalPascal.g:1043:1: ruleclose_par returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ')' )? ;
    public final AntlrDatatypeRuleToken ruleclose_par() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1049:2: ( (kw= ')' )? )
            // InternalPascal.g:1050:2: (kw= ')' )?
            {
            // InternalPascal.g:1050:2: (kw= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1051:3: kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getClose_parAccess().getRightParenthesisKeyword());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclose_par"


    // $ANTLR start "ruletype"
    // InternalPascal.g:1060:1: ruletype returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) ;
    public final Enumerator ruletype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPascal.g:1066:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) )
            // InternalPascal.g:1067:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            {
            // InternalPascal.g:1067:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1068:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalPascal.g:1068:3: (enumLiteral_0= 'boolean' )
                    // InternalPascal.g:1069:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1076:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalPascal.g:1076:3: (enumLiteral_1= 'integer' )
                    // InternalPascal.g:1077:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1084:3: (enumLiteral_2= 'string' )
                    {
                    // InternalPascal.g:1084:3: (enumLiteral_2= 'string' )
                    // InternalPascal.g:1085:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"

    // $ANTLR start synpred4_InternalPascal
    public final void synpred4_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_var_statements_1_0 = null;


        // InternalPascal.g:212:4: ( ( (lv_var_statements_1_0= rulevar_decl ) ) )
        // InternalPascal.g:212:4: ( (lv_var_statements_1_0= rulevar_decl ) )
        {
        // InternalPascal.g:212:4: ( (lv_var_statements_1_0= rulevar_decl ) )
        // InternalPascal.g:213:5: (lv_var_statements_1_0= rulevar_decl )
        {
        // InternalPascal.g:213:5: (lv_var_statements_1_0= rulevar_decl )
        // InternalPascal.g:214:6: lv_var_statements_1_0= rulevar_decl
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getVar_blockAccess().getVar_statementsVar_declParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_var_statements_1_0=rulevar_decl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalPascal

    // $ANTLR start synpred5_InternalPascal
    public final void synpred5_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_var_statements_2_0 = null;


        // InternalPascal.g:232:4: ( ( (lv_var_statements_2_0= rulevar_list ) ) )
        // InternalPascal.g:232:4: ( (lv_var_statements_2_0= rulevar_list ) )
        {
        // InternalPascal.g:232:4: ( (lv_var_statements_2_0= rulevar_list ) )
        // InternalPascal.g:233:5: (lv_var_statements_2_0= rulevar_list )
        {
        // InternalPascal.g:233:5: (lv_var_statements_2_0= rulevar_list )
        // InternalPascal.g:234:6: lv_var_statements_2_0= rulevar_list
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getVar_blockAccess().getVar_statementsVar_listParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_var_statements_2_0=rulevar_list();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalPascal

    // $ANTLR start synpred11_InternalPascal
    public final void synpred11_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_exp_2_0 = null;


        // InternalPascal.g:736:4: ( (lv_exp_2_0= rulerepetitive_arit_expression ) )
        // InternalPascal.g:736:4: (lv_exp_2_0= rulerepetitive_arit_expression )
        {
        // InternalPascal.g:736:4: (lv_exp_2_0= rulerepetitive_arit_expression )
        // InternalPascal.g:737:5: lv_exp_2_0= rulerepetitive_arit_expression
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getRepetitive_arit_expressionAccess().getExpRepetitive_arit_expressionParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_exp_2_0=rulerepetitive_arit_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalPascal

    // Delegated rules

    public final boolean synpred4_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPascal_fragment(); // can never throw exception
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\21\1\43\1\uffff\3\17\1\uffff\1\0";
    static final String dfa_4s = "\1\24\1\uffff\1\23\1\45\1\uffff\3\22\1\uffff\1\0";
    static final String dfa_5s = "\1\uffff\1\3\2\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_6s = "\11\uffff\1\0}>";
    static final String[] dfa_7s = {
            "\1\2\13\uffff\1\1\3\uffff\1\1",
            "",
            "\1\3\1\uffff\1\4",
            "\1\5\1\6\1\7",
            "",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10",
            "",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 211:3: ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalPascal()) ) {s = 8;}

                        else if ( (synpred5_InternalPascal()) ) {s = 4;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000002000000F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});

}