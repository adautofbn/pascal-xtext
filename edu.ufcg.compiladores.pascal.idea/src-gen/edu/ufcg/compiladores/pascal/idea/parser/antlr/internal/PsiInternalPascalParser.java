package edu.ufcg.compiladores.pascal.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import edu.ufcg.compiladores.pascal.idea.lang.PascalElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import edu.ufcg.compiladores.pascal.services.PascalGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalPascalParser extends AbstractPsiAntlrParser {
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


        public PsiInternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalPascal.g"; }



    	protected PascalGrammarAccess grammarAccess;

    	protected PascalElementTypeProvider elementTypeProvider;

    	public PsiInternalPascalParser(PsiBuilder builder, TokenStream input, PascalElementTypeProvider elementTypeProvider, PascalGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Pascal";
    	}




    // $ANTLR start "entryRulePascal"
    // PsiInternalPascal.g:52:1: entryRulePascal returns [Boolean current=false] : iv_rulePascal= rulePascal EOF ;
    public final Boolean entryRulePascal() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePascal = null;


        try {
            // PsiInternalPascal.g:52:48: (iv_rulePascal= rulePascal EOF )
            // PsiInternalPascal.g:53:2: iv_rulePascal= rulePascal EOF
            {
             markComposite(elementTypeProvider.getPascalElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePascal=rulePascal();

            state._fsp--;

             current =iv_rulePascal; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePascal"


    // $ANTLR start "rulePascal"
    // PsiInternalPascal.g:59:1: rulePascal returns [Boolean current=false] : ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* ) ;
    public final Boolean rulePascal() throws RecognitionException {
        Boolean current = false;

        Boolean lv_element_0_0 = null;

        Boolean lv_element_1_0 = null;

        Boolean lv_element_2_0 = null;


        try {
            // PsiInternalPascal.g:60:1: ( ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* ) )
            // PsiInternalPascal.g:61:2: ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* )
            {
            // PsiInternalPascal.g:61:2: ( ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )* )
            // PsiInternalPascal.g:62:3: ( (lv_element_0_0= ruleprogram ) ) ( (lv_element_1_0= rulevar_decl ) )* ( (lv_element_2_0= ruleatrib ) )*
            {
            // PsiInternalPascal.g:62:3: ( (lv_element_0_0= ruleprogram ) )
            // PsiInternalPascal.g:63:4: (lv_element_0_0= ruleprogram )
            {
            // PsiInternalPascal.g:63:4: (lv_element_0_0= ruleprogram )
            // PsiInternalPascal.g:64:5: lv_element_0_0= ruleprogram
            {

            					markComposite(elementTypeProvider.getPascal_ElementProgramParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_3);
            lv_element_0_0=ruleprogram();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:77:3: ( (lv_element_1_0= rulevar_decl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalPascal.g:78:4: (lv_element_1_0= rulevar_decl )
            	    {
            	    // PsiInternalPascal.g:78:4: (lv_element_1_0= rulevar_decl )
            	    // PsiInternalPascal.g:79:5: lv_element_1_0= rulevar_decl
            	    {

            	    					markComposite(elementTypeProvider.getPascal_ElementVar_declParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_element_1_0=rulevar_decl();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalPascal.g:92:3: ( (lv_element_2_0= ruleatrib ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalPascal.g:93:4: (lv_element_2_0= ruleatrib )
            	    {
            	    // PsiInternalPascal.g:93:4: (lv_element_2_0= ruleatrib )
            	    // PsiInternalPascal.g:94:5: lv_element_2_0= ruleatrib
            	    {

            	    					markComposite(elementTypeProvider.getPascal_ElementAtribParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_element_2_0=ruleatrib();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePascal"


    // $ANTLR start "entryRuleprogram"
    // PsiInternalPascal.g:111:1: entryRuleprogram returns [Boolean current=false] : iv_ruleprogram= ruleprogram EOF ;
    public final Boolean entryRuleprogram() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleprogram = null;


        try {
            // PsiInternalPascal.g:111:49: (iv_ruleprogram= ruleprogram EOF )
            // PsiInternalPascal.g:112:2: iv_ruleprogram= ruleprogram EOF
            {
             markComposite(elementTypeProvider.getProgramElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // PsiInternalPascal.g:118:1: ruleprogram returns [Boolean current=false] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final Boolean ruleprogram() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalPascal.g:119:1: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // PsiInternalPascal.g:120:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // PsiInternalPascal.g:120:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // PsiInternalPascal.g:121:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {

            			markLeaf(elementTypeProvider.getProgram_ProgramKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalPascal.g:128:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPascal.g:129:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPascal.g:129:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPascal.g:130:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getProgram_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getProgram_SemicolonKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRulevar_decl"
    // PsiInternalPascal.g:156:1: entryRulevar_decl returns [Boolean current=false] : iv_rulevar_decl= rulevar_decl EOF ;
    public final Boolean entryRulevar_decl() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevar_decl = null;


        try {
            // PsiInternalPascal.g:156:50: (iv_rulevar_decl= rulevar_decl EOF )
            // PsiInternalPascal.g:157:2: iv_rulevar_decl= rulevar_decl EOF
            {
             markComposite(elementTypeProvider.getVar_declElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_decl=rulevar_decl();

            state._fsp--;

             current =iv_rulevar_decl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_decl"


    // $ANTLR start "rulevar_decl"
    // PsiInternalPascal.g:163:1: rulevar_decl returns [Boolean current=false] : (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) ;
    public final Boolean rulevar_decl() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_var_list_1_0 = null;

        Boolean lv_type_3_0 = null;


        try {
            // PsiInternalPascal.g:164:1: ( (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ ) )
            // PsiInternalPascal.g:165:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            {
            // PsiInternalPascal.g:165:2: (otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+ )
            // PsiInternalPascal.g:166:3: otherlv_0= 'var' ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
            {

            			markLeaf(elementTypeProvider.getVar_decl_VarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalPascal.g:173:3: ( ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )+
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
            	    // PsiInternalPascal.g:174:4: ( (lv_var_list_1_0= rulevar_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
            	    {
            	    // PsiInternalPascal.g:174:4: ( (lv_var_list_1_0= rulevar_list ) )
            	    // PsiInternalPascal.g:175:5: (lv_var_list_1_0= rulevar_list )
            	    {
            	    // PsiInternalPascal.g:175:5: (lv_var_list_1_0= rulevar_list )
            	    // PsiInternalPascal.g:176:6: lv_var_list_1_0= rulevar_list
            	    {

            	    						markComposite(elementTypeProvider.getVar_decl_Var_listVar_listParserRuleCall_1_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_var_list_1_0=rulevar_list();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    				markLeaf(elementTypeProvider.getVar_decl_ColonKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,14,FOLLOW_8); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalPascal.g:196:4: ( (lv_type_3_0= ruleType ) )
            	    // PsiInternalPascal.g:197:5: (lv_type_3_0= ruleType )
            	    {
            	    // PsiInternalPascal.g:197:5: (lv_type_3_0= ruleType )
            	    // PsiInternalPascal.g:198:6: lv_type_3_0= ruleType
            	    {

            	    						markComposite(elementTypeProvider.getVar_decl_TypeTypeEnumRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_type_3_0=ruleType();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    				markLeaf(elementTypeProvider.getVar_decl_SemicolonKeyword_1_3ElementType());
            	    			
            	    otherlv_4=(Token)match(input,12,FOLLOW_4); 

            	    				doneLeaf(otherlv_4);
            	    			

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_decl"


    // $ANTLR start "entryRulevar_list"
    // PsiInternalPascal.g:223:1: entryRulevar_list returns [Boolean current=false] : iv_rulevar_list= rulevar_list EOF ;
    public final Boolean entryRulevar_list() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevar_list = null;


        try {
            // PsiInternalPascal.g:223:50: (iv_rulevar_list= rulevar_list EOF )
            // PsiInternalPascal.g:224:2: iv_rulevar_list= rulevar_list EOF
            {
             markComposite(elementTypeProvider.getVar_listElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_list=rulevar_list();

            state._fsp--;

             current =iv_rulevar_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_list"


    // $ANTLR start "rulevar_list"
    // PsiInternalPascal.g:230:1: rulevar_list returns [Boolean current=false] : ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* ) ;
    public final Boolean rulevar_list() throws RecognitionException {
        Boolean current = false;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Boolean lv_var_list_2_0 = null;


        try {
            // PsiInternalPascal.g:231:1: ( ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* ) )
            // PsiInternalPascal.g:232:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* )
            {
            // PsiInternalPascal.g:232:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )* )
            // PsiInternalPascal.g:233:3: ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )*
            {
            // PsiInternalPascal.g:233:3: ( (lv_identifier_0_0= RULE_ID ) )
            // PsiInternalPascal.g:234:4: (lv_identifier_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:234:4: (lv_identifier_0_0= RULE_ID )
            // PsiInternalPascal.g:235:5: lv_identifier_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getVar_list_IdentifierIDTerminalRuleCall_0_0ElementType());
            				
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_identifier_0_0);
            				

            }


            }

            // PsiInternalPascal.g:250:3: (otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalPascal.g:251:4: otherlv_1= ',' ( (lv_var_list_2_0= rulevar_list ) )+
            	    {

            	    				markLeaf(elementTypeProvider.getVar_list_CommaKeyword_1_0ElementType());
            	    			
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				doneLeaf(otherlv_1);
            	    			
            	    // PsiInternalPascal.g:258:4: ( (lv_var_list_2_0= rulevar_list ) )+
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
            	    	    // PsiInternalPascal.g:259:5: (lv_var_list_2_0= rulevar_list )
            	    	    {
            	    	    // PsiInternalPascal.g:259:5: (lv_var_list_2_0= rulevar_list )
            	    	    // PsiInternalPascal.g:260:6: lv_var_list_2_0= rulevar_list
            	    	    {

            	    	    						markComposite(elementTypeProvider.getVar_list_Var_listVar_listParserRuleCall_1_1_0ElementType());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_var_list_2_0=rulevar_list();

            	    	    state._fsp--;


            	    	    						doneComposite();
            	    	    						if(!current) {
            	    	    							associateWithSemanticElement();
            	    	    							current = true;
            	    	    						}
            	    	    					

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_list"


    // $ANTLR start "entryRuleatrib"
    // PsiInternalPascal.g:278:1: entryRuleatrib returns [Boolean current=false] : iv_ruleatrib= ruleatrib EOF ;
    public final Boolean entryRuleatrib() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleatrib = null;


        try {
            // PsiInternalPascal.g:278:47: (iv_ruleatrib= ruleatrib EOF )
            // PsiInternalPascal.g:279:2: iv_ruleatrib= ruleatrib EOF
            {
             markComposite(elementTypeProvider.getAtribElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleatrib=ruleatrib();

            state._fsp--;

             current =iv_ruleatrib; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleatrib"


    // $ANTLR start "ruleatrib"
    // PsiInternalPascal.g:285:1: ruleatrib returns [Boolean current=false] : ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' ) ;
    public final Boolean ruleatrib() throws RecognitionException {
        Boolean current = false;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_value_2_0 = null;


        try {
            // PsiInternalPascal.g:286:1: ( ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' ) )
            // PsiInternalPascal.g:287:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' )
            {
            // PsiInternalPascal.g:287:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';' )
            // PsiInternalPascal.g:288:3: ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleSomeValue ) ) otherlv_3= ';'
            {
            // PsiInternalPascal.g:288:3: ( (lv_identifier_0_0= RULE_ID ) )
            // PsiInternalPascal.g:289:4: (lv_identifier_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:289:4: (lv_identifier_0_0= RULE_ID )
            // PsiInternalPascal.g:290:5: lv_identifier_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAtrib_IdentifierIDTerminalRuleCall_0_0ElementType());
            				
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_identifier_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getAtrib_ColonEqualsSignKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalPascal.g:312:3: ( (lv_value_2_0= ruleSomeValue ) )
            // PsiInternalPascal.g:313:4: (lv_value_2_0= ruleSomeValue )
            {
            // PsiInternalPascal.g:313:4: (lv_value_2_0= ruleSomeValue )
            // PsiInternalPascal.g:314:5: lv_value_2_0= ruleSomeValue
            {

            					markComposite(elementTypeProvider.getAtrib_ValueSomeValueParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleSomeValue();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getAtrib_SemicolonKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			doneLeaf(otherlv_3);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleatrib"


    // $ANTLR start "entryRuleSomeValue"
    // PsiInternalPascal.g:338:1: entryRuleSomeValue returns [Boolean current=false] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final Boolean entryRuleSomeValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSomeValue = null;


        try {
            // PsiInternalPascal.g:338:51: (iv_ruleSomeValue= ruleSomeValue EOF )
            // PsiInternalPascal.g:339:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
             markComposite(elementTypeProvider.getSomeValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeValue=ruleSomeValue();

            state._fsp--;

             current =iv_ruleSomeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // PsiInternalPascal.g:345:1: ruleSomeValue returns [Boolean current=false] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final Boolean ruleSomeValue() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;

        try {
            // PsiInternalPascal.g:346:1: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // PsiInternalPascal.g:347:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // PsiInternalPascal.g:347:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
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
                    // PsiInternalPascal.g:348:3: this_ID_0= RULE_ID
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_IDTerminalRuleCall_0ElementType());
                    		
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			doneLeaf(this_ID_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:356:3: this_INT_1= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_INTTerminalRuleCall_1ElementType());
                    		
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_1);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:364:3: this_STRING_2= RULE_STRING
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_STRINGTerminalRuleCall_2ElementType());
                    		
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			doneLeaf(this_STRING_2);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:372:3: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_ANY_OTHERTerminalRuleCall_3ElementType());
                    		
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    			doneLeaf(this_ANY_OTHER_3);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "ruleType"
    // PsiInternalPascal.g:383:1: ruleType returns [Boolean current=false] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalPascal.g:384:1: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) ) )
            // PsiInternalPascal.g:385:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) )
            {
            // PsiInternalPascal.g:385:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'String' ) )
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
                    // PsiInternalPascal.g:386:3: (enumLiteral_0= 'Boolean' )
                    {
                    // PsiInternalPascal.g:386:3: (enumLiteral_0= 'Boolean' )
                    // PsiInternalPascal.g:387:4: enumLiteral_0= 'Boolean'
                    {

                    				markLeaf(elementTypeProvider.getType_BOOLEANEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:396:3: (enumLiteral_1= 'Integer' )
                    {
                    // PsiInternalPascal.g:396:3: (enumLiteral_1= 'Integer' )
                    // PsiInternalPascal.g:397:4: enumLiteral_1= 'Integer'
                    {

                    				markLeaf(elementTypeProvider.getType_INTEGEREnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:406:3: (enumLiteral_2= 'String' )
                    {
                    // PsiInternalPascal.g:406:3: (enumLiteral_2= 'String' )
                    // PsiInternalPascal.g:407:4: enumLiteral_2= 'String'
                    {

                    				markLeaf(elementTypeProvider.getType_STRINGEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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