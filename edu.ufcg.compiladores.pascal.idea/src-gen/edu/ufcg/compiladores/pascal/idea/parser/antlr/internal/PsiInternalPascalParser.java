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
    // PsiInternalPascal.g:59:1: rulePascal returns [Boolean current=false] : ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )? ;
    public final Boolean rulePascal() throws RecognitionException {
        Boolean current = false;

        Boolean lv_head_0_0 = null;

        Boolean lv_declarations_1_0 = null;

        Boolean lv_scope_2_0 = null;


        try {
            // PsiInternalPascal.g:60:1: ( ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )? )
            // PsiInternalPascal.g:61:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )?
            {
            // PsiInternalPascal.g:61:2: ( ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalPascal.g:62:3: ( (lv_head_0_0= ruleprogram ) ) ( (lv_declarations_1_0= rulevar_block ) )* ( (lv_scope_2_0= ruleblock ) )*
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

                    // PsiInternalPascal.g:77:3: ( (lv_declarations_1_0= rulevar_block ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // PsiInternalPascal.g:78:4: (lv_declarations_1_0= rulevar_block )
                    	    {
                    	    // PsiInternalPascal.g:78:4: (lv_declarations_1_0= rulevar_block )
                    	    // PsiInternalPascal.g:79:5: lv_declarations_1_0= rulevar_block
                    	    {

                    	    					markComposite(elementTypeProvider.getPascal_DeclarationsVar_blockParserRuleCall_1_0ElementType());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_declarations_1_0=rulevar_block();

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

                    // PsiInternalPascal.g:92:3: ( (lv_scope_2_0= ruleblock ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // PsiInternalPascal.g:93:4: (lv_scope_2_0= ruleblock )
                    	    {
                    	    // PsiInternalPascal.g:93:4: (lv_scope_2_0= ruleblock )
                    	    // PsiInternalPascal.g:94:5: lv_scope_2_0= ruleblock
                    	    {

                    	    					markComposite(elementTypeProvider.getPascal_ScopeBlockParserRuleCall_2_0ElementType());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_scope_2_0=ruleblock();

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
            		
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

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
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRulevar_block"
    // PsiInternalPascal.g:156:1: entryRulevar_block returns [Boolean current=false] : iv_rulevar_block= rulevar_block EOF ;
    public final Boolean entryRulevar_block() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevar_block = null;


        try {
            // PsiInternalPascal.g:156:51: (iv_rulevar_block= rulevar_block EOF )
            // PsiInternalPascal.g:157:2: iv_rulevar_block= rulevar_block EOF
            {
             markComposite(elementTypeProvider.getVar_blockElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_block=rulevar_block();

            state._fsp--;

             current =iv_rulevar_block; 
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
    // $ANTLR end "entryRulevar_block"


    // $ANTLR start "rulevar_block"
    // PsiInternalPascal.g:163:1: rulevar_block returns [Boolean current=false] : (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ ) ;
    public final Boolean rulevar_block() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_var_statements_1_0 = null;

        Boolean lv_var_statements_2_0 = null;


        try {
            // PsiInternalPascal.g:164:1: ( (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ ) )
            // PsiInternalPascal.g:165:2: (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ )
            {
            // PsiInternalPascal.g:165:2: (otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+ )
            // PsiInternalPascal.g:166:3: otherlv_0= 'var' ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+
            {

            			markLeaf(elementTypeProvider.getVar_block_VarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalPascal.g:173:3: ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // PsiInternalPascal.g:174:4: ( (lv_var_statements_1_0= rulevar_decl ) )
            	    {
            	    // PsiInternalPascal.g:174:4: ( (lv_var_statements_1_0= rulevar_decl ) )
            	    // PsiInternalPascal.g:175:5: (lv_var_statements_1_0= rulevar_decl )
            	    {
            	    // PsiInternalPascal.g:175:5: (lv_var_statements_1_0= rulevar_decl )
            	    // PsiInternalPascal.g:176:6: lv_var_statements_1_0= rulevar_decl
            	    {

            	    						markComposite(elementTypeProvider.getVar_block_Var_statementsVar_declParserRuleCall_1_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_var_statements_1_0=rulevar_decl();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalPascal.g:190:4: ( (lv_var_statements_2_0= rulevar_list ) )
            	    {
            	    // PsiInternalPascal.g:190:4: ( (lv_var_statements_2_0= rulevar_list ) )
            	    // PsiInternalPascal.g:191:5: (lv_var_statements_2_0= rulevar_list )
            	    {
            	    // PsiInternalPascal.g:191:5: (lv_var_statements_2_0= rulevar_list )
            	    // PsiInternalPascal.g:192:6: lv_var_statements_2_0= rulevar_list
            	    {

            	    						markComposite(elementTypeProvider.getVar_block_Var_statementsVar_listParserRuleCall_1_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_var_statements_2_0=rulevar_list();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

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
    // $ANTLR end "rulevar_block"


    // $ANTLR start "entryRulevar_decl"
    // PsiInternalPascal.g:210:1: entryRulevar_decl returns [Boolean current=false] : iv_rulevar_decl= rulevar_decl EOF ;
    public final Boolean entryRulevar_decl() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevar_decl = null;


        try {
            // PsiInternalPascal.g:210:50: (iv_rulevar_decl= rulevar_decl EOF )
            // PsiInternalPascal.g:211:2: iv_rulevar_decl= rulevar_decl EOF
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
    // PsiInternalPascal.g:217:1: rulevar_decl returns [Boolean current=false] : ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' ) ;
    public final Boolean rulevar_decl() throws RecognitionException {
        Boolean current = false;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Boolean lv_var_type_2_0 = null;

        Boolean lv_value_4_0 = null;


        try {
            // PsiInternalPascal.g:218:1: ( ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' ) )
            // PsiInternalPascal.g:219:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' )
            {
            // PsiInternalPascal.g:219:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';' )
            // PsiInternalPascal.g:220:3: ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_var_type_2_0= ruletype ) ) (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )? otherlv_5= ';'
            {
            // PsiInternalPascal.g:220:3: ( (lv_var_id_0_0= RULE_ID ) )
            // PsiInternalPascal.g:221:4: (lv_var_id_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:221:4: (lv_var_id_0_0= RULE_ID )
            // PsiInternalPascal.g:222:5: lv_var_id_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getVar_decl_Var_idIDTerminalRuleCall_0_0ElementType());
            				
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_var_id_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getVar_decl_ColonKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalPascal.g:244:3: ( (lv_var_type_2_0= ruletype ) )
            // PsiInternalPascal.g:245:4: (lv_var_type_2_0= ruletype )
            {
            // PsiInternalPascal.g:245:4: (lv_var_type_2_0= ruletype )
            // PsiInternalPascal.g:246:5: lv_var_type_2_0= ruletype
            {

            					markComposite(elementTypeProvider.getVar_decl_Var_typeTypeEnumRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_10);
            lv_var_type_2_0=ruletype();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:259:3: (otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalPascal.g:260:4: otherlv_3= '=' ( (lv_value_4_0= rulesome_value ) )
                    {

                    				markLeaf(elementTypeProvider.getVar_decl_EqualsSignKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalPascal.g:267:4: ( (lv_value_4_0= rulesome_value ) )
                    // PsiInternalPascal.g:268:5: (lv_value_4_0= rulesome_value )
                    {
                    // PsiInternalPascal.g:268:5: (lv_value_4_0= rulesome_value )
                    // PsiInternalPascal.g:269:6: lv_value_4_0= rulesome_value
                    {

                    						markComposite(elementTypeProvider.getVar_decl_ValueSome_valueParserRuleCall_3_1_0ElementType());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_4_0=rulesome_value();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getVar_decl_SemicolonKeyword_4ElementType());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			doneLeaf(otherlv_5);
            		

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
    // PsiInternalPascal.g:294:1: entryRulevar_list returns [Boolean current=false] : iv_rulevar_list= rulevar_list EOF ;
    public final Boolean entryRulevar_list() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulevar_list = null;


        try {
            // PsiInternalPascal.g:294:50: (iv_rulevar_list= rulevar_list EOF )
            // PsiInternalPascal.g:295:2: iv_rulevar_list= rulevar_list EOF
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
    // PsiInternalPascal.g:301:1: rulevar_list returns [Boolean current=false] : ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' ) ;
    public final Boolean rulevar_list() throws RecognitionException {
        Boolean current = false;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token lv_var_ids_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Boolean lv_var_type_4_0 = null;


        try {
            // PsiInternalPascal.g:302:1: ( ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' ) )
            // PsiInternalPascal.g:303:2: ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' )
            {
            // PsiInternalPascal.g:303:2: ( ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';' )
            // PsiInternalPascal.g:304:3: ( (lv_var_id_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_var_type_4_0= ruletype ) ) otherlv_5= ';'
            {
            // PsiInternalPascal.g:304:3: ( (lv_var_id_0_0= RULE_ID ) )
            // PsiInternalPascal.g:305:4: (lv_var_id_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:305:4: (lv_var_id_0_0= RULE_ID )
            // PsiInternalPascal.g:306:5: lv_var_id_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getVar_list_Var_idIDTerminalRuleCall_0_0ElementType());
            				
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_var_id_0_0);
            				

            }


            }

            // PsiInternalPascal.g:321:3: (otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalPascal.g:322:4: otherlv_1= ',' ( (lv_var_ids_2_0= RULE_ID ) )
            	    {

            	    				markLeaf(elementTypeProvider.getVar_list_CommaKeyword_1_0ElementType());
            	    			
            	    otherlv_1=(Token)match(input,19,FOLLOW_5); 

            	    				doneLeaf(otherlv_1);
            	    			
            	    // PsiInternalPascal.g:329:4: ( (lv_var_ids_2_0= RULE_ID ) )
            	    // PsiInternalPascal.g:330:5: (lv_var_ids_2_0= RULE_ID )
            	    {
            	    // PsiInternalPascal.g:330:5: (lv_var_ids_2_0= RULE_ID )
            	    // PsiInternalPascal.g:331:6: lv_var_ids_2_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getVar_list_Var_idsIDTerminalRuleCall_1_1_0ElementType());
            	    					
            	    lv_var_ids_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    						doneLeaf(lv_var_ids_2_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getVar_list_ColonKeyword_2ElementType());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalPascal.g:354:3: ( (lv_var_type_4_0= ruletype ) )
            // PsiInternalPascal.g:355:4: (lv_var_type_4_0= ruletype )
            {
            // PsiInternalPascal.g:355:4: (lv_var_type_4_0= ruletype )
            // PsiInternalPascal.g:356:5: lv_var_type_4_0= ruletype
            {

            					markComposite(elementTypeProvider.getVar_list_Var_typeTypeEnumRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_6);
            lv_var_type_4_0=ruletype();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getVar_list_SemicolonKeyword_4ElementType());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			doneLeaf(otherlv_5);
            		

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


    // $ANTLR start "entryRuleblock"
    // PsiInternalPascal.g:380:1: entryRuleblock returns [Boolean current=false] : iv_ruleblock= ruleblock EOF ;
    public final Boolean entryRuleblock() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleblock = null;


        try {
            // PsiInternalPascal.g:380:47: (iv_ruleblock= ruleblock EOF )
            // PsiInternalPascal.g:381:2: iv_ruleblock= ruleblock EOF
            {
             markComposite(elementTypeProvider.getBlockElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // PsiInternalPascal.g:387:1: ruleblock returns [Boolean current=false] : (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' ) ;
    public final Boolean ruleblock() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_statements_1_0 = null;


        try {
            // PsiInternalPascal.g:388:1: ( (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' ) )
            // PsiInternalPascal.g:389:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' )
            {
            // PsiInternalPascal.g:389:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.' )
            // PsiInternalPascal.g:390:3: otherlv_0= 'begin' ( (lv_statements_1_0= rulestatement ) ) otherlv_2= 'end' otherlv_3= '.'
            {

            			markLeaf(elementTypeProvider.getBlock_BeginKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalPascal.g:397:3: ( (lv_statements_1_0= rulestatement ) )
            // PsiInternalPascal.g:398:4: (lv_statements_1_0= rulestatement )
            {
            // PsiInternalPascal.g:398:4: (lv_statements_1_0= rulestatement )
            // PsiInternalPascal.g:399:5: lv_statements_1_0= rulestatement
            {

            					markComposite(elementTypeProvider.getBlock_StatementsStatementParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_13);
            lv_statements_1_0=rulestatement();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getBlock_EndKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			doneLeaf(otherlv_2);
            		

            			markLeaf(elementTypeProvider.getBlock_FullStopKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_2); 

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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement"
    // PsiInternalPascal.g:430:1: entryRulestatement returns [Boolean current=false] : iv_rulestatement= rulestatement EOF ;
    public final Boolean entryRulestatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulestatement = null;


        try {
            // PsiInternalPascal.g:430:51: (iv_rulestatement= rulestatement EOF )
            // PsiInternalPascal.g:431:2: iv_rulestatement= rulestatement EOF
            {
             markComposite(elementTypeProvider.getStatementElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // PsiInternalPascal.g:437:1: rulestatement returns [Boolean current=false] : ( (lv_atrib_block_0_0= ruleatrib ) )+ ;
    public final Boolean rulestatement() throws RecognitionException {
        Boolean current = false;

        Boolean lv_atrib_block_0_0 = null;


        try {
            // PsiInternalPascal.g:438:1: ( ( (lv_atrib_block_0_0= ruleatrib ) )+ )
            // PsiInternalPascal.g:439:2: ( (lv_atrib_block_0_0= ruleatrib ) )+
            {
            // PsiInternalPascal.g:439:2: ( (lv_atrib_block_0_0= ruleatrib ) )+
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
            	    // PsiInternalPascal.g:440:3: (lv_atrib_block_0_0= ruleatrib )
            	    {
            	    // PsiInternalPascal.g:440:3: (lv_atrib_block_0_0= ruleatrib )
            	    // PsiInternalPascal.g:441:4: lv_atrib_block_0_0= ruleatrib
            	    {

            	    				markComposite(elementTypeProvider.getStatement_Atrib_blockAtribParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_7);
            	    lv_atrib_block_0_0=ruleatrib();

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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleatrib"
    // PsiInternalPascal.g:457:1: entryRuleatrib returns [Boolean current=false] : iv_ruleatrib= ruleatrib EOF ;
    public final Boolean entryRuleatrib() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleatrib = null;


        try {
            // PsiInternalPascal.g:457:47: (iv_ruleatrib= ruleatrib EOF )
            // PsiInternalPascal.g:458:2: iv_ruleatrib= ruleatrib EOF
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
    // PsiInternalPascal.g:464:1: ruleatrib returns [Boolean current=false] : ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) ;
    public final Boolean ruleatrib() throws RecognitionException {
        Boolean current = false;

        Token lv_var_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_exp_2_0 = null;


        try {
            // PsiInternalPascal.g:465:1: ( ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' ) )
            // PsiInternalPascal.g:466:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            {
            // PsiInternalPascal.g:466:2: ( ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';' )
            // PsiInternalPascal.g:467:3: ( (lv_var_id_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleexpression ) ) otherlv_3= ';'
            {
            // PsiInternalPascal.g:467:3: ( (lv_var_id_0_0= RULE_ID ) )
            // PsiInternalPascal.g:468:4: (lv_var_id_0_0= RULE_ID )
            {
            // PsiInternalPascal.g:468:4: (lv_var_id_0_0= RULE_ID )
            // PsiInternalPascal.g:469:5: lv_var_id_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAtrib_Var_idIDTerminalRuleCall_0_0ElementType());
            				
            lv_var_id_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_var_id_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getAtrib_ColonEqualsSignKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalPascal.g:491:3: ( (lv_exp_2_0= ruleexpression ) )
            // PsiInternalPascal.g:492:4: (lv_exp_2_0= ruleexpression )
            {
            // PsiInternalPascal.g:492:4: (lv_exp_2_0= ruleexpression )
            // PsiInternalPascal.g:493:5: lv_exp_2_0= ruleexpression
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
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // PsiInternalPascal.g:517:1: entryRuleexpression returns [Boolean current=false] : iv_ruleexpression= ruleexpression EOF ;
    public final Boolean entryRuleexpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleexpression = null;


        try {
            // PsiInternalPascal.g:517:52: (iv_ruleexpression= ruleexpression EOF )
            // PsiInternalPascal.g:518:2: iv_ruleexpression= ruleexpression EOF
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
    // PsiInternalPascal.g:524:1: ruleexpression returns [Boolean current=false] : (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression ) ;
    public final Boolean ruleexpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_arit_expression_0 = null;

        Boolean this_rel_expression_1 = null;


        try {
            // PsiInternalPascal.g:525:1: ( (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression ) )
            // PsiInternalPascal.g:526:2: (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression )
            {
            // PsiInternalPascal.g:526:2: (this_arit_expression_0= rulearit_expression | this_rel_expression_1= rulerel_expression )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==EOF||LA8_3==15||(LA8_3>=24 && LA8_3<=28)) ) {
                    alt8=1;
                }
                else if ( ((LA8_3>=29 && LA8_3<=32)) ) {
                    alt8=2;
                }
                else {
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
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // PsiInternalPascal.g:527:3: this_arit_expression_0= rulearit_expression
                    {

                    			markComposite(elementTypeProvider.getExpression_Arit_expressionParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_arit_expression_0=rulearit_expression();

                    state._fsp--;


                    			current = this_arit_expression_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:536:3: this_rel_expression_1= rulerel_expression
                    {

                    			markComposite(elementTypeProvider.getExpression_Rel_expressionParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_rel_expression_1=rulerel_expression();

                    state._fsp--;


                    			current = this_rel_expression_1;
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulearit_expression"
    // PsiInternalPascal.g:548:1: entryRulearit_expression returns [Boolean current=false] : iv_rulearit_expression= rulearit_expression EOF ;
    public final Boolean entryRulearit_expression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulearit_expression = null;


        try {
            // PsiInternalPascal.g:548:57: (iv_rulearit_expression= rulearit_expression EOF )
            // PsiInternalPascal.g:549:2: iv_rulearit_expression= rulearit_expression EOF
            {
             markComposite(elementTypeProvider.getArit_expressionElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulearit_expression=rulearit_expression();

            state._fsp--;

             current =iv_rulearit_expression; 
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
    // $ANTLR end "entryRulearit_expression"


    // $ANTLR start "rulearit_expression"
    // PsiInternalPascal.g:555:1: rulearit_expression returns [Boolean current=false] : ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* ) ;
    public final Boolean rulearit_expression() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_0_0 = null;

        Boolean lv_exp_1_0 = null;


        try {
            // PsiInternalPascal.g:556:1: ( ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* ) )
            // PsiInternalPascal.g:557:2: ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* )
            {
            // PsiInternalPascal.g:557:2: ( ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )* )
            // PsiInternalPascal.g:558:3: ( (lv_value_0_0= rulesome_value ) ) ( (lv_exp_1_0= rulerepetitive_arit_expression ) )*
            {
            // PsiInternalPascal.g:558:3: ( (lv_value_0_0= rulesome_value ) )
            // PsiInternalPascal.g:559:4: (lv_value_0_0= rulesome_value )
            {
            // PsiInternalPascal.g:559:4: (lv_value_0_0= rulesome_value )
            // PsiInternalPascal.g:560:5: lv_value_0_0= rulesome_value
            {

            					markComposite(elementTypeProvider.getArit_expression_ValueSome_valueParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_17);
            lv_value_0_0=rulesome_value();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:573:3: ( (lv_exp_1_0= rulerepetitive_arit_expression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalPascal.g:574:4: (lv_exp_1_0= rulerepetitive_arit_expression )
            	    {
            	    // PsiInternalPascal.g:574:4: (lv_exp_1_0= rulerepetitive_arit_expression )
            	    // PsiInternalPascal.g:575:5: lv_exp_1_0= rulerepetitive_arit_expression
            	    {

            	    					markComposite(elementTypeProvider.getArit_expression_ExpRepetitive_arit_expressionParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_exp_1_0=rulerepetitive_arit_expression();

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
            	    break loop9;
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
    // $ANTLR end "rulearit_expression"


    // $ANTLR start "entryRulerepetitive_arit_expression"
    // PsiInternalPascal.g:592:1: entryRulerepetitive_arit_expression returns [Boolean current=false] : iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF ;
    public final Boolean entryRulerepetitive_arit_expression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulerepetitive_arit_expression = null;


        try {
            // PsiInternalPascal.g:592:68: (iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF )
            // PsiInternalPascal.g:593:2: iv_rulerepetitive_arit_expression= rulerepetitive_arit_expression EOF
            {
             markComposite(elementTypeProvider.getRepetitive_arit_expressionElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_arit_expression=rulerepetitive_arit_expression();

            state._fsp--;

             current =iv_rulerepetitive_arit_expression; 
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
    // $ANTLR end "entryRulerepetitive_arit_expression"


    // $ANTLR start "rulerepetitive_arit_expression"
    // PsiInternalPascal.g:599:1: rulerepetitive_arit_expression returns [Boolean current=false] : ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* ) ;
    public final Boolean rulerepetitive_arit_expression() throws RecognitionException {
        Boolean current = false;

        Boolean lv_op_0_0 = null;

        Boolean lv_value_1_0 = null;

        Boolean lv_exp_2_0 = null;


        try {
            // PsiInternalPascal.g:600:1: ( ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* ) )
            // PsiInternalPascal.g:601:2: ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* )
            {
            // PsiInternalPascal.g:601:2: ( ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )* )
            // PsiInternalPascal.g:602:3: ( (lv_op_0_0= rulearit_op ) ) ( (lv_value_1_0= rulesome_value ) ) ( (lv_exp_2_0= rulerepetitive_arit_expression ) )*
            {
            // PsiInternalPascal.g:602:3: ( (lv_op_0_0= rulearit_op ) )
            // PsiInternalPascal.g:603:4: (lv_op_0_0= rulearit_op )
            {
            // PsiInternalPascal.g:603:4: (lv_op_0_0= rulearit_op )
            // PsiInternalPascal.g:604:5: lv_op_0_0= rulearit_op
            {

            					markComposite(elementTypeProvider.getRepetitive_arit_expression_OpArit_opParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_op_0_0=rulearit_op();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:617:3: ( (lv_value_1_0= rulesome_value ) )
            // PsiInternalPascal.g:618:4: (lv_value_1_0= rulesome_value )
            {
            // PsiInternalPascal.g:618:4: (lv_value_1_0= rulesome_value )
            // PsiInternalPascal.g:619:5: lv_value_1_0= rulesome_value
            {

            					markComposite(elementTypeProvider.getRepetitive_arit_expression_ValueSome_valueParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_17);
            lv_value_1_0=rulesome_value();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:632:3: ( (lv_exp_2_0= rulerepetitive_arit_expression ) )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt10=1;
                    }
                    break;
                case 25:
                    {
                    alt10=1;
                    }
                    break;
                case 26:
                    {
                    alt10=1;
                    }
                    break;
                case 27:
                    {
                    alt10=1;
                    }
                    break;
                case 28:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // PsiInternalPascal.g:633:4: (lv_exp_2_0= rulerepetitive_arit_expression )
            	    {
            	    // PsiInternalPascal.g:633:4: (lv_exp_2_0= rulerepetitive_arit_expression )
            	    // PsiInternalPascal.g:634:5: lv_exp_2_0= rulerepetitive_arit_expression
            	    {

            	    					markComposite(elementTypeProvider.getRepetitive_arit_expression_ExpRepetitive_arit_expressionParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_exp_2_0=rulerepetitive_arit_expression();

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
            	    break loop10;
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
    // $ANTLR end "rulerepetitive_arit_expression"


    // $ANTLR start "entryRulerel_expression"
    // PsiInternalPascal.g:651:1: entryRulerel_expression returns [Boolean current=false] : iv_rulerel_expression= rulerel_expression EOF ;
    public final Boolean entryRulerel_expression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulerel_expression = null;


        try {
            // PsiInternalPascal.g:651:56: (iv_rulerel_expression= rulerel_expression EOF )
            // PsiInternalPascal.g:652:2: iv_rulerel_expression= rulerel_expression EOF
            {
             markComposite(elementTypeProvider.getRel_expressionElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulerel_expression=rulerel_expression();

            state._fsp--;

             current =iv_rulerel_expression; 
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
    // $ANTLR end "entryRulerel_expression"


    // $ANTLR start "rulerel_expression"
    // PsiInternalPascal.g:658:1: rulerel_expression returns [Boolean current=false] : ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) ) ;
    public final Boolean rulerel_expression() throws RecognitionException {
        Boolean current = false;

        Boolean lv_open_0_0 = null;

        Boolean lv_first_1_0 = null;

        Boolean lv_op_2_0 = null;

        Boolean lv_second_3_0 = null;

        Boolean lv_close_4_0 = null;


        try {
            // PsiInternalPascal.g:659:1: ( ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) ) )
            // PsiInternalPascal.g:660:2: ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) )
            {
            // PsiInternalPascal.g:660:2: ( ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) ) )
            // PsiInternalPascal.g:661:3: ( (lv_open_0_0= ruleopen_par ) ) ( (lv_first_1_0= rulesome_value ) ) ( (lv_op_2_0= rulerel_op ) ) ( (lv_second_3_0= rulesome_value ) ) ( (lv_close_4_0= ruleclose_par ) )
            {
            // PsiInternalPascal.g:661:3: ( (lv_open_0_0= ruleopen_par ) )
            // PsiInternalPascal.g:662:4: (lv_open_0_0= ruleopen_par )
            {
            // PsiInternalPascal.g:662:4: (lv_open_0_0= ruleopen_par )
            // PsiInternalPascal.g:663:5: lv_open_0_0= ruleopen_par
            {

            					markComposite(elementTypeProvider.getRel_expression_OpenOpen_parParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_open_0_0=ruleopen_par();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:676:3: ( (lv_first_1_0= rulesome_value ) )
            // PsiInternalPascal.g:677:4: (lv_first_1_0= rulesome_value )
            {
            // PsiInternalPascal.g:677:4: (lv_first_1_0= rulesome_value )
            // PsiInternalPascal.g:678:5: lv_first_1_0= rulesome_value
            {

            					markComposite(elementTypeProvider.getRel_expression_FirstSome_valueParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_18);
            lv_first_1_0=rulesome_value();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:691:3: ( (lv_op_2_0= rulerel_op ) )
            // PsiInternalPascal.g:692:4: (lv_op_2_0= rulerel_op )
            {
            // PsiInternalPascal.g:692:4: (lv_op_2_0= rulerel_op )
            // PsiInternalPascal.g:693:5: lv_op_2_0= rulerel_op
            {

            					markComposite(elementTypeProvider.getRel_expression_OpRel_opParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_op_2_0=rulerel_op();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:706:3: ( (lv_second_3_0= rulesome_value ) )
            // PsiInternalPascal.g:707:4: (lv_second_3_0= rulesome_value )
            {
            // PsiInternalPascal.g:707:4: (lv_second_3_0= rulesome_value )
            // PsiInternalPascal.g:708:5: lv_second_3_0= rulesome_value
            {

            					markComposite(elementTypeProvider.getRel_expression_SecondSome_valueParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_19);
            lv_second_3_0=rulesome_value();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalPascal.g:721:3: ( (lv_close_4_0= ruleclose_par ) )
            // PsiInternalPascal.g:722:4: (lv_close_4_0= ruleclose_par )
            {
            // PsiInternalPascal.g:722:4: (lv_close_4_0= ruleclose_par )
            // PsiInternalPascal.g:723:5: lv_close_4_0= ruleclose_par
            {

            					markComposite(elementTypeProvider.getRel_expression_CloseClose_parParserRuleCall_4_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_close_4_0=ruleclose_par();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

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
        }
        return current;
    }
    // $ANTLR end "rulerel_expression"


    // $ANTLR start "entryRulearit_op"
    // PsiInternalPascal.g:740:1: entryRulearit_op returns [Boolean current=false] : iv_rulearit_op= rulearit_op EOF ;
    public final Boolean entryRulearit_op() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulearit_op = null;


        try {
            // PsiInternalPascal.g:740:49: (iv_rulearit_op= rulearit_op EOF )
            // PsiInternalPascal.g:741:2: iv_rulearit_op= rulearit_op EOF
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
    // PsiInternalPascal.g:747:1: rulearit_op returns [Boolean current=false] : (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) ;
    public final Boolean rulearit_op() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:748:1: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' ) )
            // PsiInternalPascal.g:749:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
            {
            // PsiInternalPascal.g:749:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'div' | kw= 'mod' )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // PsiInternalPascal.g:750:3: kw= '+'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_PlusSignKeyword_0ElementType());
                    		
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:758:3: kw= '-'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_HyphenMinusKeyword_1ElementType());
                    		
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:766:3: kw= '*'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_AsteriskKeyword_2ElementType());
                    		
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:774:3: kw= 'div'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_DivKeyword_3ElementType());
                    		
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalPascal.g:782:3: kw= 'mod'
                    {

                    			markLeaf(elementTypeProvider.getArit_op_ModKeyword_4ElementType());
                    		
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // PsiInternalPascal.g:793:1: entryRulerel_op returns [Boolean current=false] : iv_rulerel_op= rulerel_op EOF ;
    public final Boolean entryRulerel_op() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulerel_op = null;


        try {
            // PsiInternalPascal.g:793:48: (iv_rulerel_op= rulerel_op EOF )
            // PsiInternalPascal.g:794:2: iv_rulerel_op= rulerel_op EOF
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
    // PsiInternalPascal.g:800:1: rulerel_op returns [Boolean current=false] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final Boolean rulerel_op() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:801:1: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // PsiInternalPascal.g:802:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // PsiInternalPascal.g:802:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // PsiInternalPascal.g:803:3: kw= '>'
                    {

                    			markLeaf(elementTypeProvider.getRel_op_GreaterThanSignKeyword_0ElementType());
                    		
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:811:3: kw= '<'
                    {

                    			markLeaf(elementTypeProvider.getRel_op_LessThanSignKeyword_1ElementType());
                    		
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:819:3: kw= '>='
                    {

                    			markLeaf(elementTypeProvider.getRel_op_GreaterThanSignEqualsSignKeyword_2ElementType());
                    		
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:827:3: kw= '<='
                    {

                    			markLeaf(elementTypeProvider.getRel_op_LessThanSignEqualsSignKeyword_3ElementType());
                    		
                    kw=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRulesome_value"
    // PsiInternalPascal.g:838:1: entryRulesome_value returns [Boolean current=false] : iv_rulesome_value= rulesome_value EOF ;
    public final Boolean entryRulesome_value() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulesome_value = null;


        try {
            // PsiInternalPascal.g:838:52: (iv_rulesome_value= rulesome_value EOF )
            // PsiInternalPascal.g:839:2: iv_rulesome_value= rulesome_value EOF
            {
             markComposite(elementTypeProvider.getSome_valueElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulesome_value=rulesome_value();

            state._fsp--;

             current =iv_rulesome_value; 
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
    // $ANTLR end "entryRulesome_value"


    // $ANTLR start "rulesome_value"
    // PsiInternalPascal.g:845:1: rulesome_value returns [Boolean current=false] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final Boolean rulesome_value() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;

        try {
            // PsiInternalPascal.g:846:1: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // PsiInternalPascal.g:847:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // PsiInternalPascal.g:847:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // PsiInternalPascal.g:848:3: this_ID_0= RULE_ID
                    {

                    			markLeaf(elementTypeProvider.getSome_value_IDTerminalRuleCall_0ElementType());
                    		
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			doneLeaf(this_ID_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:856:3: this_INT_1= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getSome_value_INTTerminalRuleCall_1ElementType());
                    		
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_1);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:864:3: this_STRING_2= RULE_STRING
                    {

                    			markLeaf(elementTypeProvider.getSome_value_STRINGTerminalRuleCall_2ElementType());
                    		
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			doneLeaf(this_STRING_2);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalPascal.g:872:3: this_BOOLEAN_3= RULE_BOOLEAN
                    {

                    			markLeaf(elementTypeProvider.getSome_value_BOOLEANTerminalRuleCall_3ElementType());
                    		
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			doneLeaf(this_BOOLEAN_3);
                    		

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
    // $ANTLR end "rulesome_value"


    // $ANTLR start "entryRuleopen_par"
    // PsiInternalPascal.g:883:1: entryRuleopen_par returns [Boolean current=false] : iv_ruleopen_par= ruleopen_par EOF ;
    public final Boolean entryRuleopen_par() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleopen_par = null;


        try {
            // PsiInternalPascal.g:883:50: (iv_ruleopen_par= ruleopen_par EOF )
            // PsiInternalPascal.g:884:2: iv_ruleopen_par= ruleopen_par EOF
            {
             markComposite(elementTypeProvider.getOpen_parElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleopen_par=ruleopen_par();

            state._fsp--;

             current =iv_ruleopen_par; 
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
    // $ANTLR end "entryRuleopen_par"


    // $ANTLR start "ruleopen_par"
    // PsiInternalPascal.g:890:1: ruleopen_par returns [Boolean current=false] : (kw= '(' )? ;
    public final Boolean ruleopen_par() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:891:1: ( (kw= '(' )? )
            // PsiInternalPascal.g:892:2: (kw= '(' )?
            {
            // PsiInternalPascal.g:892:2: (kw= '(' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalPascal.g:893:3: kw= '('
                    {

                    			markLeaf(elementTypeProvider.getOpen_par_LeftParenthesisKeywordElementType());
                    		
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // $ANTLR end "ruleopen_par"


    // $ANTLR start "entryRuleclose_par"
    // PsiInternalPascal.g:904:1: entryRuleclose_par returns [Boolean current=false] : iv_ruleclose_par= ruleclose_par EOF ;
    public final Boolean entryRuleclose_par() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleclose_par = null;


        try {
            // PsiInternalPascal.g:904:51: (iv_ruleclose_par= ruleclose_par EOF )
            // PsiInternalPascal.g:905:2: iv_ruleclose_par= ruleclose_par EOF
            {
             markComposite(elementTypeProvider.getClose_parElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleclose_par=ruleclose_par();

            state._fsp--;

             current =iv_ruleclose_par; 
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
    // $ANTLR end "entryRuleclose_par"


    // $ANTLR start "ruleclose_par"
    // PsiInternalPascal.g:911:1: ruleclose_par returns [Boolean current=false] : (kw= ')' )? ;
    public final Boolean ruleclose_par() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPascal.g:912:1: ( (kw= ')' )? )
            // PsiInternalPascal.g:913:2: (kw= ')' )?
            {
            // PsiInternalPascal.g:913:2: (kw= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalPascal.g:914:3: kw= ')'
                    {

                    			markLeaf(elementTypeProvider.getClose_par_RightParenthesisKeywordElementType());
                    		
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // $ANTLR end "ruleclose_par"


    // $ANTLR start "ruletype"
    // PsiInternalPascal.g:925:1: ruletype returns [Boolean current=false] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) ;
    public final Boolean ruletype() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalPascal.g:926:1: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) ) )
            // PsiInternalPascal.g:927:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
            {
            // PsiInternalPascal.g:927:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'string' ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // PsiInternalPascal.g:928:3: (enumLiteral_0= 'boolean' )
                    {
                    // PsiInternalPascal.g:928:3: (enumLiteral_0= 'boolean' )
                    // PsiInternalPascal.g:929:4: enumLiteral_0= 'boolean'
                    {

                    				markLeaf(elementTypeProvider.getType_BOOLEANEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPascal.g:938:3: (enumLiteral_1= 'integer' )
                    {
                    // PsiInternalPascal.g:938:3: (enumLiteral_1= 'integer' )
                    // PsiInternalPascal.g:939:4: enumLiteral_1= 'integer'
                    {

                    				markLeaf(elementTypeProvider.getType_INTEGEREnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalPascal.g:948:3: (enumLiteral_2= 'string' )
                    {
                    // PsiInternalPascal.g:948:3: (enumLiteral_2= 'string' )
                    // PsiInternalPascal.g:949:4: enumLiteral_2= 'string'
                    {

                    				markLeaf(elementTypeProvider.getType_STRINGEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

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
    // $ANTLR end "ruletype"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\21\1\uffff\1\43\3\17\2\uffff";
    static final String dfa_4s = "\1\24\1\uffff\1\23\1\uffff\1\45\3\22\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\1\uffff\1\2\4\uffff\2\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\13\uffff\1\1\3\uffff\1\1",
            "",
            "\1\4\1\uffff\1\3",
            "",
            "\1\5\1\6\1\7",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10",
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
            return "()+ loopback of 173:3: ( ( (lv_var_statements_1_0= rulevar_decl ) ) | ( (lv_var_statements_2_0= rulevar_list ) ) )+";
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