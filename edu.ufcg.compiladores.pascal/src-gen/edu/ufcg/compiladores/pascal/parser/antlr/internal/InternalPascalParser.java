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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'var'", "':'", "','", "':='", "'+'", "'-'", "'*'", "'div'", "'mod'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'boolean'", "'integer'", "'string'"
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
    // InternalPascal.g:78:1: rulePascal returns [EObject current=null] : ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )? ;
    public final EObject rulePascal() throws RecognitionException {
        EObject current = null;

        EObject lv_head_0_0 = null;

        EObject lv_declarations_1_0 = null;

        EObject lv_scope_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:84:2: ( ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )? )
            // InternalPascal.g:85:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )?
            {
            // InternalPascal.g:85:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:86:3: ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )*
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

                    // InternalPascal.g:105:3: ( (lv_declarations_1_0= rulevar_decl ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPascal.g:106:4: (lv_declarations_1_0= rulevar_decl )
                    	    {
                    	    // InternalPascal.g:106:4: (lv_declarations_1_0= rulevar_decl )
                    	    // InternalPascal.g:107:5: lv_declarations_1_0= rulevar_decl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_declarations_1_0=rulevar_decl();

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
                    	      						"edu.ufcg.compiladores.pascal.Pascal.var_decl");
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalPascal.g:124:3: ( (lv_scope_2_0= ruleatrib ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPascal.g:125:4: (lv_scope_2_0= ruleatrib )
                    	    {
                    	    // InternalPascal.g:125:4: (lv_scope_2_0= ruleatrib )
                    	    // InternalPascal.g:126:5: lv_scope_2_0= ruleatrib
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_scope_2_0=ruleatrib();

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
                    	      						"edu.ufcg.compiladores.pascal.Pascal.atrib");
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
            otherlv_0=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulevar_decl"
    // InternalPascal.g:192:1: entryRulevar_decl returns [EObject current=null] : iv_rulevar_decl= rulevar_decl EOF ;
    public final EObject entryRulevar_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_decl = null;


        try {
            // InternalPascal.g:192:49: (iv_rulevar_decl= rulevar_decl EOF )
            // InternalPascal.g:193:2: iv_rulevar_decl= rulevar_decl EOF
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
    // InternalPascal.g:199:1: rulevar_decl returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) ;
    public final EObject rulevar_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_var_list_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:205:2: ( (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) )
            // InternalPascal.g:206:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            {
            // InternalPascal.g:206:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            // InternalPascal.g:207:3: otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVar_declAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:211:3: ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=14 && LA4_1<=15)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:212:4: ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:212:4: ( (lv_var_list_1_0= rulevar_list ) )
            	    // InternalPascal.g:213:5: (lv_var_list_1_0= rulevar_list )
            	    {
            	    // InternalPascal.g:213:5: (lv_var_list_1_0= rulevar_list )
            	    // InternalPascal.g:214:6: lv_var_list_1_0= rulevar_list
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_var_list_1_0=rulevar_list();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVar_declRule());
            	      						}
            	      						add(
            	      							current,
            	      							"var_list",
            	      							lv_var_list_1_0,
            	      							"edu.ufcg.compiladores.pascal.Pascal.var_list");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVar_declAccess().getColonKeyword_1_1());
            	      			
            	    }
            	    // InternalPascal.g:235:4: ( (lv_type_3_0= ruleType ) )
            	    // InternalPascal.g:236:5: (lv_type_3_0= ruleType )
            	    {
            	    // InternalPascal.g:236:5: (lv_type_3_0= ruleType )
            	    // InternalPascal.g:237:6: lv_type_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_type_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVar_declRule());
            	      						}
            	      						add(
            	      							current,
            	      							"type",
            	      							lv_type_3_0,
            	      							"edu.ufcg.compiladores.pascal.Pascal.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3());
            	      			
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
    // $ANTLR end "rulevar_decl"


    // $ANTLR start "entryRulevar_list"
    // InternalPascal.g:263:1: entryRulevar_list returns [EObject current=null] : iv_rulevar_list= rulevar_list EOF ;
    public final EObject entryRulevar_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_list = null;


        try {
            // InternalPascal.g:263:49: (iv_rulevar_list= rulevar_list EOF )
            // InternalPascal.g:264:2: iv_rulevar_list= rulevar_list EOF
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
    // InternalPascal.g:270:1: rulevar_list returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) ) ;
    public final EObject rulevar_list() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:276:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) ) )
            // InternalPascal.g:277:2: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) )
            {
            // InternalPascal.g:277:2: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==14) ) {
                    alt6=1;
                }
                else if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:278:3: ( (lv_identifier_0_0= RULE_ID ) )
                    {
                    // InternalPascal.g:278:3: ( (lv_identifier_0_0= RULE_ID ) )
                    // InternalPascal.g:279:4: (lv_identifier_0_0= RULE_ID )
                    {
                    // InternalPascal.g:279:4: (lv_identifier_0_0= RULE_ID )
                    // InternalPascal.g:280:5: lv_identifier_0_0= RULE_ID
                    {
                    lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_identifier_0_0, grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVar_listRule());
                      					}
                      					addWithLastConsumed(
                      						current,
                      						"identifier",
                      						lv_identifier_0_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:297:3: ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ )
                    {
                    // InternalPascal.g:297:3: ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ )
                    // InternalPascal.g:298:4: ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+
                    {
                    // InternalPascal.g:298:4: ( (lv_identifier_1_0= RULE_ID ) )
                    // InternalPascal.g:299:5: (lv_identifier_1_0= RULE_ID )
                    {
                    // InternalPascal.g:299:5: (lv_identifier_1_0= RULE_ID )
                    // InternalPascal.g:300:6: lv_identifier_1_0= RULE_ID
                    {
                    lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identifier_1_0, grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVar_listRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"identifier",
                      							lv_identifier_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVar_listAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalPascal.g:320:4: ( (lv_vars_3_0= rulevar_list ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_2 = input.LA(2);

                            if ( (synpred6_InternalPascal()) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPascal.g:321:5: (lv_vars_3_0= rulevar_list )
                    	    {
                    	    // InternalPascal.g:321:5: (lv_vars_3_0= rulevar_list )
                    	    // InternalPascal.g:322:6: lv_vars_3_0= rulevar_list
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_vars_3_0=rulevar_list();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getVar_listRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"vars",
                    	      							lv_vars_3_0,
                    	      							"edu.ufcg.compiladores.pascal.Pascal.var_list");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


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
    // $ANTLR end "rulevar_list"


    // $ANTLR start "entryRuleatrib"
    // InternalPascal.g:344:1: entryRuleatrib returns [EObject current=null] : iv_ruleatrib= ruleatrib EOF ;
    public final EObject entryRuleatrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatrib = null;


        try {
            // InternalPascal.g:344:46: (iv_ruleatrib= ruleatrib EOF )
            // InternalPascal.g:345:2: iv_ruleatrib= ruleatrib EOF
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
    // InternalPascal.g:351:1: ruleatrib returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleatrib() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:357:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) )
            // InternalPascal.g:358:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            {
            // InternalPascal.g:358:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            // InternalPascal.g:359:3: ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';'
            {
            // InternalPascal.g:359:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:360:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:360:4: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:361:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_0_0, grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAtribRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:381:3: ( (lv_exp_2_0= ruleexpression ) )
            // InternalPascal.g:382:4: (lv_exp_2_0= ruleexpression )
            {
            // InternalPascal.g:382:4: (lv_exp_2_0= ruleexpression )
            // InternalPascal.g:383:5: lv_exp_2_0= ruleexpression
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

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:408:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:408:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:409:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:415:1: ruleexpression returns [EObject current=null] : ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:421:2: ( ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* ) )
            // InternalPascal.g:422:2: ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* )
            {
            // InternalPascal.g:422:2: ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* )
            // InternalPascal.g:423:3: ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )*
            {
            // InternalPascal.g:423:3: ( (lv_value_0_0= ruleSomeValue ) )
            // InternalPascal.g:424:4: (lv_value_0_0= ruleSomeValue )
            {
            // InternalPascal.g:424:4: (lv_value_0_0= ruleSomeValue )
            // InternalPascal.g:425:5: lv_value_0_0= ruleSomeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_value_0_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"edu.ufcg.compiladores.pascal.Pascal.SomeValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:442:3: ( (lv_exp_1_0= rulesecondExp ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:443:4: (lv_exp_1_0= rulesecondExp )
            	    {
            	    // InternalPascal.g:443:4: (lv_exp_1_0= rulesecondExp )
            	    // InternalPascal.g:444:5: lv_exp_1_0= rulesecondExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_exp_1_0=rulesecondExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exp",
            	      						lv_exp_1_0,
            	      						"edu.ufcg.compiladores.pascal.Pascal.secondExp");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesecondExp"
    // InternalPascal.g:465:1: entryRulesecondExp returns [EObject current=null] : iv_rulesecondExp= rulesecondExp EOF ;
    public final EObject entryRulesecondExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesecondExp = null;


        try {
            // InternalPascal.g:465:50: (iv_rulesecondExp= rulesecondExp EOF )
            // InternalPascal.g:466:2: iv_rulesecondExp= rulesecondExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSecondExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesecondExp=rulesecondExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesecondExp; 
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
    // $ANTLR end "entryRulesecondExp"


    // $ANTLR start "rulesecondExp"
    // InternalPascal.g:472:1: rulesecondExp returns [EObject current=null] : ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* ) ;
    public final EObject rulesecondExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:478:2: ( ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* ) )
            // InternalPascal.g:479:2: ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* )
            {
            // InternalPascal.g:479:2: ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* )
            // InternalPascal.g:480:3: ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )*
            {
            // InternalPascal.g:480:3: ( (lv_op_0_0= ruleoperator ) )
            // InternalPascal.g:481:4: (lv_op_0_0= ruleoperator )
            {
            // InternalPascal.g:481:4: (lv_op_0_0= ruleoperator )
            // InternalPascal.g:482:5: lv_op_0_0= ruleoperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_op_0_0=ruleoperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSecondExpRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"edu.ufcg.compiladores.pascal.Pascal.operator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:499:3: ( (lv_value_1_0= ruleSomeValue ) )
            // InternalPascal.g:500:4: (lv_value_1_0= ruleSomeValue )
            {
            // InternalPascal.g:500:4: (lv_value_1_0= ruleSomeValue )
            // InternalPascal.g:501:5: lv_value_1_0= ruleSomeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_value_1_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSecondExpRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"edu.ufcg.compiladores.pascal.Pascal.SomeValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:518:3: ( (lv_exp_2_0= rulesecondExp ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:519:4: (lv_exp_2_0= rulesecondExp )
            	    {
            	    // InternalPascal.g:519:4: (lv_exp_2_0= rulesecondExp )
            	    // InternalPascal.g:520:5: lv_exp_2_0= rulesecondExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_exp_2_0=rulesecondExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSecondExpRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exp",
            	      						lv_exp_2_0,
            	      						"edu.ufcg.compiladores.pascal.Pascal.secondExp");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulesecondExp"


    // $ANTLR start "entryRuleoperator"
    // InternalPascal.g:541:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // InternalPascal.g:541:48: (iv_ruleoperator= ruleoperator EOF )
            // InternalPascal.g:542:2: iv_ruleoperator= ruleoperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoperator=ruleoperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoperator.getText(); 
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
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // InternalPascal.g:548:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_arit_op_0= rulearit_op | this_rel_op_1= rulerel_op ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_arit_op_0 = null;

        AntlrDatatypeRuleToken this_rel_op_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:554:2: ( (this_arit_op_0= rulearit_op | this_rel_op_1= rulerel_op ) )
            // InternalPascal.g:555:2: (this_arit_op_0= rulearit_op | this_rel_op_1= rulerel_op )
            {
            // InternalPascal.g:555:2: (this_arit_op_0= rulearit_op | this_rel_op_1= rulerel_op )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=21)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=22 && LA9_0<=27)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:556:3: this_arit_op_0= rulearit_op
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arit_op_0=rulearit_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_arit_op_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:567:3: this_rel_op_1= rulerel_op
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rel_op_1=rulerel_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rel_op_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRulearit_op"
    // InternalPascal.g:581:1: entryRulearit_op returns [String current=null] : iv_rulearit_op= rulearit_op EOF ;
    public final String entryRulearit_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearit_op = null;


        try {
            // InternalPascal.g:581:47: (iv_rulearit_op= rulearit_op EOF )
            // InternalPascal.g:582:2: iv_rulearit_op= rulearit_op EOF
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
    // InternalPascal.g:588:1: rulearit_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken rulearit_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:594:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) )
            // InternalPascal.g:595:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            {
            // InternalPascal.g:595:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:596:3: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:602:3: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:608:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:614:3: kw= 'div'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArit_opAccess().getDivKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:620:3: kw= 'mod'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:629:1: entryRulerel_op returns [String current=null] : iv_rulerel_op= rulerel_op EOF ;
    public final String entryRulerel_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op = null;


        try {
            // InternalPascal.g:629:46: (iv_rulerel_op= rulerel_op EOF )
            // InternalPascal.g:630:2: iv_rulerel_op= rulerel_op EOF
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
    // InternalPascal.g:636:1: rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken rulerel_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:642:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) )
            // InternalPascal.g:643:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
            {
            // InternalPascal.g:643:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
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
                    // InternalPascal.g:644:3: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:650:3: kw= '<'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:656:3: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:662:3: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:668:3: kw= '='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:674:3: kw= '<>'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5());
                      		
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


    // $ANTLR start "entryRuleSomeValue"
    // InternalPascal.g:683:1: entryRuleSomeValue returns [String current=null] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final String entryRuleSomeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSomeValue = null;


        try {
            // InternalPascal.g:683:49: (iv_ruleSomeValue= ruleSomeValue EOF )
            // InternalPascal.g:684:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSomeValue=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeValue.getText(); 
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
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // InternalPascal.g:690:1: ruleSomeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleSomeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalPascal.g:696:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalPascal.g:697:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalPascal.g:697:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
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
                    // InternalPascal.g:698:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:706:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:714:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2());
                      		
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
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "ruleType"
    // InternalPascal.g:725:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPascal.g:731:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) )
            // InternalPascal.g:732:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            {
            // InternalPascal.g:732:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
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
                    // InternalPascal.g:733:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalPascal.g:733:3: (enumLiteral_0= 'boolean' )
                    // InternalPascal.g:734:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:741:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalPascal.g:741:3: (enumLiteral_1= 'integer' )
                    // InternalPascal.g:742:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:749:3: (enumLiteral_2= 'string' )
                    {
                    // InternalPascal.g:749:3: (enumLiteral_2= 'string' )
                    // InternalPascal.g:750:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleType"

    // $ANTLR start synpred6_InternalPascal
    public final void synpred6_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_vars_3_0 = null;


        // InternalPascal.g:321:5: ( (lv_vars_3_0= rulevar_list ) )
        // InternalPascal.g:321:5: (lv_vars_3_0= rulevar_list )
        {
        // InternalPascal.g:321:5: (lv_vars_3_0= rulevar_list )
        // InternalPascal.g:322:6: lv_vars_3_0= rulevar_list
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_vars_3_0=rulevar_list();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalPascal

    // $ANTLR start synpred8_InternalPascal
    public final void synpred8_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_exp_2_0 = null;


        // InternalPascal.g:519:4: ( (lv_exp_2_0= rulesecondExp ) )
        // InternalPascal.g:519:4: (lv_exp_2_0= rulesecondExp )
        {
        // InternalPascal.g:519:4: (lv_exp_2_0= rulesecondExp )
        // InternalPascal.g:520:5: lv_exp_2_0= rulesecondExp
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_exp_2_0=rulesecondExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalPascal

    // Delegated rules

    public final boolean synpred6_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\14\1\uffff\13\0\1\uffff";
    static final String dfa_4s = "\1\33\1\uffff\13\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\2\1\5\1\10\1\12\1\6\1\0\1\1\1\3\1\7\1\11\1\4\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 518:3: ( (lv_exp_2_0= rulesecondExp ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPascal()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000FFE0002L});

}