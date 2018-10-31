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

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'program'", "';'", "'var'", "':'", "','", "':='", "'Boolean'", "'Integer'", "'String'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;

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
    // InternalPascal.g:65:1: entryRulePascal returns [EObject current=null] : iv_rulePascal= rulePascal EOF ;
    public final EObject entryRulePascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePascal = null;


        try {
            // InternalPascal.g:65:47: (iv_rulePascal= rulePascal EOF )
            // InternalPascal.g:66:2: iv_rulePascal= rulePascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePascal=rulePascal();

            state._fsp--;

             current =iv_rulePascal; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:72:1: rulePascal returns [EObject current=null] : ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* ) ;
    public final EObject rulePascal() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;

        EObject lv_element_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:78:2: ( ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* ) )
            // InternalPascal.g:79:2: ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* )
            {
            // InternalPascal.g:79:2: ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* )
            // InternalPascal.g:80:3: ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )*
            {
            // InternalPascal.g:80:3: ( (lv_element_0_0= ruleprogram ) )
            // InternalPascal.g:81:4: (lv_element_0_0= ruleprogram )
            {
            // InternalPascal.g:81:4: (lv_element_0_0= ruleprogram )
            // InternalPascal.g:82:5: lv_element_0_0= ruleprogram
            {

            					newCompositeNode(grammarAccess.getPascalAccess().getElementProgramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_element_0_0=ruleprogram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPascalRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_0_0,
            						"edu.ufcg.compiladores.pascal.Pascal.program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:99:3: ( (lv_element_1_0= rulevar_decl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:100:4: (lv_element_1_0= rulevar_decl )
            	    {
            	    // InternalPascal.g:100:4: (lv_element_1_0= rulevar_decl )
            	    // InternalPascal.g:101:5: lv_element_1_0= rulevar_decl
            	    {

            	    					newCompositeNode(grammarAccess.getPascalAccess().getElementVar_declParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_element_1_0=rulevar_decl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPascalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_1_0,
            	    						"edu.ufcg.compiladores.pascal.Pascal.var_decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPascal.g:118:3: ( (lv_element_2_0= ruleatrib ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:119:4: (lv_element_2_0= ruleatrib )
            	    {
            	    // InternalPascal.g:119:4: (lv_element_2_0= ruleatrib )
            	    // InternalPascal.g:120:5: lv_element_2_0= ruleatrib
            	    {

            	    					newCompositeNode(grammarAccess.getPascalAccess().getElementAtribParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_element_2_0=ruleatrib();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPascalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_2_0,
            	    						"edu.ufcg.compiladores.pascal.Pascal.atrib");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:141:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:141:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:142:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:148:1: ruleprogram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascal.g:154:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPascal.g:155:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:155:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalPascal.g:156:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:186:1: entryRulevar_decl returns [EObject current=null] : iv_rulevar_decl= rulevar_decl EOF ;
    public final EObject entryRulevar_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_decl = null;


        try {
            // InternalPascal.g:186:49: (iv_rulevar_decl= rulevar_decl EOF )
            // InternalPascal.g:187:2: iv_rulevar_decl= rulevar_decl EOF
            {
             newCompositeNode(grammarAccess.getVar_declRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_decl=rulevar_decl();

            state._fsp--;

             current =iv_rulevar_decl; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:193:1: rulevar_decl returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) ;
    public final EObject rulevar_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_var_list_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:199:2: ( (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) )
            // InternalPascal.g:200:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            {
            // InternalPascal.g:200:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            // InternalPascal.g:201:3: otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVar_declAccess().getVarKeyword_0());
            		
            // InternalPascal.g:205:3: ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>=14 && LA3_1<=15)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:206:4: ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:206:4: ( (lv_var_list_1_0= rulevar_list ) )
            	    // InternalPascal.g:207:5: (lv_var_list_1_0= rulevar_list )
            	    {
            	    // InternalPascal.g:207:5: (lv_var_list_1_0= rulevar_list )
            	    // InternalPascal.g:208:6: lv_var_list_1_0= rulevar_list
            	    {

            	    						newCompositeNode(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_var_list_1_0=rulevar_list();

            	    state._fsp--;


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

            	    otherlv_2=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVar_declAccess().getColonKeyword_1_1());
            	    			
            	    // InternalPascal.g:229:4: ( (lv_type_3_0= ruleType ) )
            	    // InternalPascal.g:230:5: (lv_type_3_0= ruleType )
            	    {
            	    // InternalPascal.g:230:5: (lv_type_3_0= ruleType )
            	    // InternalPascal.g:231:6: lv_type_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_type_3_0=ruleType();

            	    state._fsp--;


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

            	    otherlv_4=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:257:1: entryRulevar_list returns [EObject current=null] : iv_rulevar_list= rulevar_list EOF ;
    public final EObject entryRulevar_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_list = null;


        try {
            // InternalPascal.g:257:49: (iv_rulevar_list= rulevar_list EOF )
            // InternalPascal.g:258:2: iv_rulevar_list= rulevar_list EOF
            {
             newCompositeNode(grammarAccess.getVar_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_list=rulevar_list();

            state._fsp--;

             current =iv_rulevar_list; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:264:1: rulevar_list returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* ) ;
    public final EObject rulevar_list() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        EObject lv_var_list_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:270:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* ) )
            // InternalPascal.g:271:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* )
            {
            // InternalPascal.g:271:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* )
            // InternalPascal.g:272:3: ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )*
            {
            // InternalPascal.g:272:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:273:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:273:4: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:274:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_identifier_0_0, grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0());
            				

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

            // InternalPascal.g:290:3: (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:291:4: otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVar_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:295:4: ( (lv_var_list_2_0= rulevar_list ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPascal.g:296:5: (lv_var_list_2_0= rulevar_list )
            	    	    {
            	    	    // InternalPascal.g:296:5: (lv_var_list_2_0= rulevar_list )
            	    	    // InternalPascal.g:297:6: lv_var_list_2_0= rulevar_list
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVar_listAccess().getVar_listVar_listParserRuleCall_1_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_var_list_2_0=rulevar_list();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVar_listRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"var_list",
            	    	    							lv_var_list_2_0,
            	    	    							"edu.ufcg.compiladores.pascal.Pascal.var_list");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:319:1: entryRuleatrib returns [EObject current=null] : iv_ruleatrib= ruleatrib EOF ;
    public final EObject entryRuleatrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatrib = null;


        try {
            // InternalPascal.g:319:46: (iv_ruleatrib= ruleatrib EOF )
            // InternalPascal.g:320:2: iv_ruleatrib= ruleatrib EOF
            {
             newCompositeNode(grammarAccess.getAtribRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleatrib=ruleatrib();

            state._fsp--;

             current =iv_ruleatrib; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:326:1: ruleatrib returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleatrib() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:332:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' ) )
            // InternalPascal.g:333:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' )
            {
            // InternalPascal.g:333:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' )
            // InternalPascal.g:334:3: ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';'
            {
            // InternalPascal.g:334:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:335:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:335:4: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:336:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_identifier_0_0, grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:356:3: ( (lv_value_2_0= ruleSomeValue ) )
            // InternalPascal.g:357:4: (lv_value_2_0= ruleSomeValue )
            {
            // InternalPascal.g:357:4: (lv_value_2_0= ruleSomeValue )
            // InternalPascal.g:358:5: lv_value_2_0= ruleSomeValue
            {

            					newCompositeNode(grammarAccess.getAtribAccess().getValueSomeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleSomeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtribRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"edu.ufcg.compiladores.pascal.Pascal.SomeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSomeValue"
    // InternalPascal.g:383:1: entryRuleSomeValue returns [String current=null] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final String entryRuleSomeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSomeValue = null;


        try {
            // InternalPascal.g:383:49: (iv_ruleSomeValue= ruleSomeValue EOF )
            // InternalPascal.g:384:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
             newCompositeNode(grammarAccess.getSomeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeValue=ruleSomeValue();

            state._fsp--;

             current =iv_ruleSomeValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:390:1: ruleSomeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSomeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;


        	enterRule();

        try {
            // InternalPascal.g:396:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalPascal.g:397:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalPascal.g:397:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt6=4;
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
            case RULE_ANY_OTHER:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:398:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:406:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:414:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:422:3: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    			current.merge(this_ANY_OTHER_3);
                    		

                    			newLeafNode(this_ANY_OTHER_3, grammarAccess.getSomeValueAccess().getANY_OTHERTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:433:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPascal.g:439:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) ) )
            // InternalPascal.g:440:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) )
            {
            // InternalPascal.g:440:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:441:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalPascal.g:441:3: (enumLiteral_0= 'Boolean' )
                    // InternalPascal.g:442:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:449:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalPascal.g:449:3: (enumLiteral_1= 'Integer' )
                    // InternalPascal.g:450:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:457:3: (enumLiteral_2= 'String' )
                    {
                    // InternalPascal.g:457:3: (enumLiteral_2= 'String' )
                    // InternalPascal.g:458:4: enumLiteral_2= 'String'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000F0L});

}