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
    // PsiInternalPascal.g:59:1: rulePascal returns [Boolean current=false] : ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )? ;
    public final Boolean rulePascal() throws RecognitionException {
        Boolean current = false;

        Boolean lv_head_0_0 = null;

        Boolean lv_declarations_1_0 = null;

        Boolean lv_scope_2_0 = null;


        try {
            // PsiInternalPascal.g:60:1: ( ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )? )
            // PsiInternalPascal.g:61:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )?
            {
            // PsiInternalPascal.g:61:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalPascal.g:62:3: ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_decl ) )* ( (lv_scope_2_0= ruleatrib ) )*
                    {
                    // PsiInternalPascal.g:62:3: ( (lv_head_0_0= ruleprogram ) )
                    // PsiInternalPascal.g:63:4: (lv_head_0_0= ruleprogram )
                    {
                    // PsiInternalPascal.g:63:4: (lv_head_0_0= ruleprogram )
                    // PsiInternalPascal.g:64:5: lv_head_0_0= ruleprogram
                    {

                    					markComposite(elementTypeProvider.getPascal_HeadProgramParserRuleCall_0_0ElementType());
                    				
                    pushFollow(FOLLOW_3);
                    lv_head_0_0=ruleprogram();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }

                    // PsiInternalPascal.g:77:3: ( (lv_declarations_1_0= rulevar_decl ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // PsiInternalPascal.g:78:4: (lv_declarations_1_0= rulevar_decl )
                    	    {
                    	    // PsiInternalPascal.g:78:4: (lv_declarations_1_0= rulevar_decl )
                    	    // PsiInternalPascal.g:79:5: lv_declarations_1_0= rulevar_decl
                    	    {

                    	    					markComposite(elementTypeProvider.getPascal_DeclarationsVar_declParserRuleCall_1_0ElementType());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_declarations_1_0=rulevar_decl();

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

                    // PsiInternalPascal.g:92:3: ( (lv_scope_2_0= ruleatrib ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // PsiInternalPascal.g:93:4: (lv_scope_2_0= ruleatrib )
                    	    {
                    	    // PsiInternalPascal.g:93:4: (lv_scope_2_0= ruleatrib )
                    	    // PsiInternalPascal.g:94:5: lv_scope_2_0= ruleatrib
                    	    {

                    	    					markComposite(elementTypeProvider.getPascal_ScopeAtribParserRuleCall_2_0ElementType());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_scope_2_0=ruleatrib();

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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // PsiInternalPascal.g:230:1: rulevar_list returns [Boolean current=false] : ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) ) ;
    public final Boolean rulevar_list() throws RecognitionException {
        Boolean current = false;

        Token lv_identifier_0_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Boolean lv_vars_3_0 = null;


        try {
            // PsiInternalPascal.g:231:1: ( ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) ) )
            // PsiInternalPascal.g:232:2: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) )
            {
            // PsiInternalPascal.g:232:2: ( ( (lv_identifier_0_0= RULE_ID ) ) | ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==14) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalPascal.g:233:3: ( (lv_identifier_0_0= RULE_ID ) )
                    {
                    // PsiInternalPascal.g:233:3: ( (lv_identifier_0_0= RULE_ID ) )
                    // PsiInternalPascal.g:234:4: (lv_identifier_0_0= RULE_ID )
                    {
                    // PsiInternalPascal.g:234:4: (lv_identifier_0_0= RULE_ID )
                    // PsiInternalPascal.g:235:5: lv_identifier_0_0= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getVar_list_IdentifierIDTerminalRuleCall_0_0ElementType());
                    				
                    lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_identifier_0_0);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:251:3: ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ )
                    {
                    // PsiInternalPascal.g:251:3: ( ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+ )
                    // PsiInternalPascal.g:252:4: ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_vars_3_0= rulevar_list ) )+
                    {
                    // PsiInternalPascal.g:252:4: ( (lv_identifier_1_0= RULE_ID ) )
                    // PsiInternalPascal.g:253:5: (lv_identifier_1_0= RULE_ID )
                    {
                    // PsiInternalPascal.g:253:5: (lv_identifier_1_0= RULE_ID )
                    // PsiInternalPascal.g:254:6: lv_identifier_1_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getVar_list_IdentifierIDTerminalRuleCall_1_0_0ElementType());
                    					
                    lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_identifier_1_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getVar_list_CommaKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalPascal.g:276:4: ( (lv_vars_3_0= rulevar_list ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // PsiInternalPascal.g:277:5: (lv_vars_3_0= rulevar_list )
                    	    {
                    	    // PsiInternalPascal.g:277:5: (lv_vars_3_0= rulevar_list )
                    	    // PsiInternalPascal.g:278:6: lv_vars_3_0= rulevar_list
                    	    {

                    	    						markComposite(elementTypeProvider.getVar_list_VarsVar_listParserRuleCall_1_2_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_vars_3_0=rulevar_list();

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
                    	    if ( cnt5 >= 1 ) break loop5;
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
    // PsiInternalPascal.g:296:1: entryRuleatrib returns [Boolean current=false] : iv_ruleatrib= ruleatrib EOF ;
    public final Boolean entryRuleatrib() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleatrib = null;


        try {
            // PsiInternalPascal.g:296:47: (iv_ruleatrib= ruleatrib EOF )
            // PsiInternalPascal.g:297:2: iv_ruleatrib= ruleatrib EOF
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
    // PsiInternalPascal.g:303:1: ruleatrib returns [Boolean current=false] : ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) ;
    public final Boolean ruleatrib() throws RecognitionException {
        Boolean current = false;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_exp_2_0 = null;


        try {
            // PsiInternalPascal.g:304:1: ( ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) )
            // PsiInternalPascal.g:305:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            {
            // PsiInternalPascal.g:305:2: ( ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            // PsiInternalPascal.g:306:3: ( (lv_identifier_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';'
            {
            // PsiInternalPascal.g:306:3: ( (lv_identifier_0_0= RULE_ID ) )
            // PsiInternalPascal.g:307:4: (lv_identifier_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:307:4: (lv_identifier_0_0= RULE_ID )
            // PsiInternalPascal.g:308:5: lv_identifier_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAtrib_IdentifierIDTerminalRuleCall_0_0ElementType());
            				
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_identifier_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getAtrib_ColonEqualsSignKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalPascal.g:330:3: ( (lv_exp_2_0= ruleexpression ) )
            // PsiInternalPascal.g:331:4: (lv_exp_2_0= ruleexpression )
            {
            // PsiInternalPascal.g:331:4: (lv_exp_2_0= ruleexpression )
            // PsiInternalPascal.g:332:5: lv_exp_2_0= ruleexpression
            {

            					markComposite(elementTypeProvider.getAtrib_ExpExpressionParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_6);
            lv_exp_2_0=ruleexpression();

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


    // $ANTLR start "entryRuleexpression"
    // PsiInternalPascal.g:356:1: entryRuleexpression returns [Boolean current=false] : iv_ruleexpression= ruleexpression EOF ;
    public final Boolean entryRuleexpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleexpression = null;


        try {
            // PsiInternalPascal.g:356:52: (iv_ruleexpression= ruleexpression EOF )
            // PsiInternalPascal.g:357:2: iv_ruleexpression= ruleexpression EOF
            {
             markComposite(elementTypeProvider.getExpressionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // PsiInternalPascal.g:363:1: ruleexpression returns [Boolean current=false] : ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* ) ;
    public final Boolean ruleexpression() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_0_0 = null;

        Boolean lv_exp_1_0 = null;


        try {
            // PsiInternalPascal.g:364:1: ( ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* ) )
            // PsiInternalPascal.g:365:2: ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* )
            {
            // PsiInternalPascal.g:365:2: ( ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )* )
            // PsiInternalPascal.g:366:3: ( (lv_value_0_0= ruleSomeValue ) ) ( (lv_exp_1_0= rulesecondExp ) )*
            {
            // PsiInternalPascal.g:366:3: ( (lv_value_0_0= ruleSomeValue ) )
            // PsiInternalPascal.g:367:4: (lv_value_0_0= ruleSomeValue )
            {
            // PsiInternalPascal.g:367:4: (lv_value_0_0= ruleSomeValue )
            // PsiInternalPascal.g:368:5: lv_value_0_0= ruleSomeValue
            {

            					markComposite(elementTypeProvider.getExpression_ValueSomeValueParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_12);
            lv_value_0_0=ruleSomeValue();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:381:3: ( (lv_exp_1_0= rulesecondExp ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PsiInternalPascal.g:382:4: (lv_exp_1_0= rulesecondExp )
            	    {
            	    // PsiInternalPascal.g:382:4: (lv_exp_1_0= rulesecondExp )
            	    // PsiInternalPascal.g:383:5: lv_exp_1_0= rulesecondExp
            	    {

            	    					markComposite(elementTypeProvider.getExpression_ExpSecondExpParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_exp_1_0=rulesecondExp();

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
            	    break loop7;
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesecondExp"
    // PsiInternalPascal.g:400:1: entryRulesecondExp returns [Boolean current=false] : iv_rulesecondExp= rulesecondExp EOF ;
    public final Boolean entryRulesecondExp() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulesecondExp = null;


        try {
            // PsiInternalPascal.g:400:51: (iv_rulesecondExp= rulesecondExp EOF )
            // PsiInternalPascal.g:401:2: iv_rulesecondExp= rulesecondExp EOF
            {
             markComposite(elementTypeProvider.getSecondExpElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulesecondExp=rulesecondExp();

            state._fsp--;

             current =iv_rulesecondExp; 
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
    // $ANTLR end "entryRulesecondExp"


    // $ANTLR start "rulesecondExp"
    // PsiInternalPascal.g:407:1: rulesecondExp returns [Boolean current=false] : ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* ) ;
    public final Boolean rulesecondExp() throws RecognitionException {
        Boolean current = false;

        Boolean lv_op_0_0 = null;

        Boolean lv_value_1_0 = null;

        Boolean lv_exp_2_0 = null;


        try {
            // PsiInternalPascal.g:408:1: ( ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* ) )
            // PsiInternalPascal.g:409:2: ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* )
            {
            // PsiInternalPascal.g:409:2: ( ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )* )
            // PsiInternalPascal.g:410:3: ( (lv_op_0_0= ruleoperator ) ) ( (lv_value_1_0= ruleSomeValue ) ) ( (lv_exp_2_0= rulesecondExp ) )*
            {
            // PsiInternalPascal.g:410:3: ( (lv_op_0_0= ruleoperator ) )
            // PsiInternalPascal.g:411:4: (lv_op_0_0= ruleoperator )
            {
            // PsiInternalPascal.g:411:4: (lv_op_0_0= ruleoperator )
            // PsiInternalPascal.g:412:5: lv_op_0_0= ruleoperator
            {

            					markComposite(elementTypeProvider.getSecondExp_OpOperatorParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_op_0_0=ruleoperator();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:425:3: ( (lv_value_1_0= ruleSomeValue ) )
            // PsiInternalPascal.g:426:4: (lv_value_1_0= ruleSomeValue )
            {
            // PsiInternalPascal.g:426:4: (lv_value_1_0= ruleSomeValue )
            // PsiInternalPascal.g:427:5: lv_value_1_0= ruleSomeValue
            {

            					markComposite(elementTypeProvider.getSecondExp_ValueSomeValueParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_12);
            lv_value_1_0=ruleSomeValue();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:440:3: ( (lv_exp_2_0= rulesecondExp ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // PsiInternalPascal.g:441:4: (lv_exp_2_0= rulesecondExp )
            	    {
            	    // PsiInternalPascal.g:441:4: (lv_exp_2_0= rulesecondExp )
            	    // PsiInternalPascal.g:442:5: lv_exp_2_0= rulesecondExp
            	    {

            	    					markComposite(elementTypeProvider.getSecondExp_ExpSecondExpParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_exp_2_0=rulesecondExp();

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
            	    break loop8;
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
    // $ANTLR end "rulesecondExp"


    // $ANTLR start "entryRuleoperator"
    // PsiInternalPascal.g:459:1: entryRuleoperator returns [Boolean current=false] : iv_ruleoperator= ruleoperator EOF ;
    public final Boolean entryRuleoperator() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleoperator = null;


        try {
            // PsiInternalPascal.g:459:50: (iv_ruleoperator= ruleoperator EOF )
            // PsiInternalPascal.g:460:2: iv_ruleoperator= ruleoperator EOF
            {
             markComposite(elementTypeProvider.getOperatorElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator; 
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
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // PsiInternalPascal.g:466:1: ruleoperator returns [Boolean current=false] : ( rulearit_op | rulerel_op ) ;
    public final Boolean ruleoperator() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalPascal.g:467:1: ( ( rulearit_op | rulerel_op ) )
            // PsiInternalPascal.g:468:2: ( rulearit_op | rulerel_op )
            {
            // PsiInternalPascal.g:468:2: ( rulearit_op | rulerel_op )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=21)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=22 && LA9_0<=27)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalPascal.g:469:3: rulearit_op
                    {

                    			markComposite(elementTypeProvider.getOperator_Arit_opParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    rulearit_op();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:477:3: rulerel_op
                    {

                    			markComposite(elementTypeProvider.getOperator_Rel_opParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    rulerel_op();

                    state._fsp--;


                    			doneComposite();
                    		

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
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRulearit_op"
    // PsiInternalPascal.g:488:1: entryRulearit_op returns [Boolean current=false] : iv_rulearit_op= rulearit_op EOF ;
    public final Boolean entryRulearit_op() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulearit_op = null;


        try {
            // PsiInternalPascal.g:488:49: (iv_rulearit_op= rulearit_op EOF )
            // PsiInternalPascal.g:489:2: iv_rulearit_op= rulearit_op EOF
            {
             markComposite(elementTypeProvider.getArit_opElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulearit_op=rulearit_op();

            state._fsp--;

             current =iv_rulearit_op; 
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
    // $ANTLR end "entryRulearit_op"


    // $ANTLR start "rulearit_op"
    // PsiInternalPascal.g:495:1: rulearit_op returns [Boolean current=false] : (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) ;
    public final Boolean rulearit_op() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:496:1: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) )
            // PsiInternalPascal.g:497:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            {
            // PsiInternalPascal.g:497:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // PsiInternalPascal.g:498:3: kw= '+'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_PlusSignKeyword_0ElementType());
                    		
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:506:3: kw= '-'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_HyphenMinusKeyword_1ElementType());
                    		
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:514:3: kw= '*'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_AsteriskKeyword_2ElementType());
                    		
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:522:3: kw= 'div'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_DivKeyword_3ElementType());
                    		
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalPascal.g:530:3: kw= 'mod'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_ModKeyword_4ElementType());
                    		
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

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
    // $ANTLR end "rulearit_op"


    // $ANTLR start "entryRulerel_op"
    // PsiInternalPascal.g:541:1: entryRulerel_op returns [Boolean current=false] : iv_rulerel_op= rulerel_op EOF ;
    public final Boolean entryRulerel_op() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulerel_op = null;


        try {
            // PsiInternalPascal.g:541:48: (iv_rulerel_op= rulerel_op EOF )
            // PsiInternalPascal.g:542:2: iv_rulerel_op= rulerel_op EOF
            {
             markComposite(elementTypeProvider.getRel_opElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulerel_op=rulerel_op();

            state._fsp--;

             current =iv_rulerel_op; 
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
    // $ANTLR end "entryRulerel_op"


    // $ANTLR start "rulerel_op"
    // PsiInternalPascal.g:548:1: rulerel_op returns [Boolean current=false] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) ;
    public final Boolean rulerel_op() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:549:1: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) )
            // PsiInternalPascal.g:550:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
            {
            // PsiInternalPascal.g:550:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // PsiInternalPascal.g:551:3: kw= '>'
                    {

                    			markLeaf(elementTypeProvider.getRel_op_GreaterThanSignKeyword_0ElementType());
                    		
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:559:3: kw= '<'
                    {

                    			markLeaf(elementTypeProvider.getRel_op_LessThanSignKeyword_1ElementType());
                    		
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:567:3: kw= '>='
                    {

                    			markLeaf(elementTypeProvider.getRel_op_GreaterThanSignEqualsSignKeyword_2ElementType());
                    		
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:575:3: kw= '<='
                    {

                    			markLeaf(elementTypeProvider.getRel_op_LessThanSignEqualsSignKeyword_3ElementType());
                    		
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalPascal.g:583:3: kw= '='
                    {

                    			markLeaf(elementTypeProvider.getRel_op_EqualsSignKeyword_4ElementType());
                    		
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalPascal.g:591:3: kw= '<>'
                    {

                    			markLeaf(elementTypeProvider.getRel_op_LessThanSignGreaterThanSignKeyword_5ElementType());
                    		
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

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
    // $ANTLR end "rulerel_op"


    // $ANTLR start "entryRuleSomeValue"
    // PsiInternalPascal.g:602:1: entryRuleSomeValue returns [Boolean current=false] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final Boolean entryRuleSomeValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSomeValue = null;


        try {
            // PsiInternalPascal.g:602:51: (iv_ruleSomeValue= ruleSomeValue EOF )
            // PsiInternalPascal.g:603:2: iv_ruleSomeValue= ruleSomeValue EOF
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
    // PsiInternalPascal.g:609:1: ruleSomeValue returns [Boolean current=false] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final Boolean ruleSomeValue() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

        try {
            // PsiInternalPascal.g:610:1: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // PsiInternalPascal.g:611:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // PsiInternalPascal.g:611:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // PsiInternalPascal.g:612:3: this_ID_0= RULE_ID
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_IDTerminalRuleCall_0ElementType());
                    		
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			doneLeaf(this_ID_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:620:3: this_INT_1= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_INTTerminalRuleCall_1ElementType());
                    		
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_1);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:628:3: this_STRING_2= RULE_STRING
                    {

                    			markLeaf(elementTypeProvider.getSomeValue_STRINGTerminalRuleCall_2ElementType());
                    		
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			doneLeaf(this_STRING_2);
                    		

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
    // PsiInternalPascal.g:639:1: ruleType returns [Boolean current=false] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalPascal.g:640:1: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) )
            // PsiInternalPascal.g:641:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            {
            // PsiInternalPascal.g:641:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // PsiInternalPascal.g:642:3: (enumLiteral_0= 'boolean' )
                    {
                    // PsiInternalPascal.g:642:3: (enumLiteral_0= 'boolean' )
                    // PsiInternalPascal.g:643:4: enumLiteral_0= 'boolean'
                    {

                    				markLeaf(elementTypeProvider.getType_BOOLEANEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:652:3: (enumLiteral_1= 'integer' )
                    {
                    // PsiInternalPascal.g:652:3: (enumLiteral_1= 'integer' )
                    // PsiInternalPascal.g:653:4: enumLiteral_1= 'integer'
                    {

                    				markLeaf(elementTypeProvider.getType_INTEGEREnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:662:3: (enumLiteral_2= 'string' )
                    {
                    // PsiInternalPascal.g:662:3: (enumLiteral_2= 'string' )
                    // PsiInternalPascal.g:663:4: enumLiteral_2= 'string'
                    {

                    				markLeaf(elementTypeProvider.getType_STRINGEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\14\14\uffff";
    static final String dfa_4s = "\1\33\14\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 440:3: ( (lv_exp_2_0= rulesecondExp ) )*";
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