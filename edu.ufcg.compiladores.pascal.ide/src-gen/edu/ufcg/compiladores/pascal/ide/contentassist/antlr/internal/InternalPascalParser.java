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

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Boolean'", "'Integer'", "'String'", "'program'", "';'", "'var'", "':'", "','", "':='"
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
    // InternalPascal.g:53:1: entryRulePascal : rulePascal EOF ;
    public final void entryRulePascal() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( rulePascal EOF )
            // InternalPascal.g:55:1: rulePascal EOF
            {
             before(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            rulePascal();

            state._fsp--;

             after(grammarAccess.getPascalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:62:1: rulePascal : ( ( rule__Pascal__Group__0 ) ) ;
    public final void rulePascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Pascal__Group__0 ) ) )
            // InternalPascal.g:67:2: ( ( rule__Pascal__Group__0 ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Pascal__Group__0 ) )
            // InternalPascal.g:68:3: ( rule__Pascal__Group__0 )
            {
             before(grammarAccess.getPascalAccess().getGroup()); 
            // InternalPascal.g:69:3: ( rule__Pascal__Group__0 )
            // InternalPascal.g:69:4: rule__Pascal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getGroup()); 

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
    // InternalPascal.g:78:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleprogram EOF )
            // InternalPascal.g:80:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:87:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            // InternalPascal.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // InternalPascal.g:103:1: entryRulevar_decl : rulevar_decl EOF ;
    public final void entryRulevar_decl() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( rulevar_decl EOF )
            // InternalPascal.g:105:1: rulevar_decl EOF
            {
             before(grammarAccess.getVar_declRule()); 
            pushFollow(FOLLOW_1);
            rulevar_decl();

            state._fsp--;

             after(grammarAccess.getVar_declRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:112:1: rulevar_decl : ( ( rule__Var_decl__Group__0 ) ) ;
    public final void rulevar_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Var_decl__Group__0 ) ) )
            // InternalPascal.g:117:2: ( ( rule__Var_decl__Group__0 ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Var_decl__Group__0 ) )
            // InternalPascal.g:118:3: ( rule__Var_decl__Group__0 )
            {
             before(grammarAccess.getVar_declAccess().getGroup()); 
            // InternalPascal.g:119:3: ( rule__Var_decl__Group__0 )
            // InternalPascal.g:119:4: rule__Var_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVar_declAccess().getGroup()); 

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
    // InternalPascal.g:128:1: entryRulevar_list : rulevar_list EOF ;
    public final void entryRulevar_list() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( rulevar_list EOF )
            // InternalPascal.g:130:1: rulevar_list EOF
            {
             before(grammarAccess.getVar_listRule()); 
            pushFollow(FOLLOW_1);
            rulevar_list();

            state._fsp--;

             after(grammarAccess.getVar_listRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:137:1: rulevar_list : ( ( rule__Var_list__Group__0 ) ) ;
    public final void rulevar_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Var_list__Group__0 ) ) )
            // InternalPascal.g:142:2: ( ( rule__Var_list__Group__0 ) )
            {
            // InternalPascal.g:142:2: ( ( rule__Var_list__Group__0 ) )
            // InternalPascal.g:143:3: ( rule__Var_list__Group__0 )
            {
             before(grammarAccess.getVar_listAccess().getGroup()); 
            // InternalPascal.g:144:3: ( rule__Var_list__Group__0 )
            // InternalPascal.g:144:4: rule__Var_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVar_listAccess().getGroup()); 

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
    // InternalPascal.g:153:1: entryRuleatrib : ruleatrib EOF ;
    public final void entryRuleatrib() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( ruleatrib EOF )
            // InternalPascal.g:155:1: ruleatrib EOF
            {
             before(grammarAccess.getAtribRule()); 
            pushFollow(FOLLOW_1);
            ruleatrib();

            state._fsp--;

             after(grammarAccess.getAtribRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:162:1: ruleatrib : ( ( rule__Atrib__Group__0 ) ) ;
    public final void ruleatrib() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Atrib__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Atrib__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Atrib__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Atrib__Group__0 )
            {
             before(grammarAccess.getAtribAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Atrib__Group__0 )
            // InternalPascal.g:169:4: rule__Atrib__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getGroup()); 

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


    // $ANTLR start "entryRuleSomeValue"
    // InternalPascal.g:178:1: entryRuleSomeValue : ruleSomeValue EOF ;
    public final void entryRuleSomeValue() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( ruleSomeValue EOF )
            // InternalPascal.g:180:1: ruleSomeValue EOF
            {
             before(grammarAccess.getSomeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSomeValue();

            state._fsp--;

             after(grammarAccess.getSomeValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:187:1: ruleSomeValue : ( ( rule__SomeValue__Alternatives ) ) ;
    public final void ruleSomeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__SomeValue__Alternatives ) ) )
            // InternalPascal.g:192:2: ( ( rule__SomeValue__Alternatives ) )
            {
            // InternalPascal.g:192:2: ( ( rule__SomeValue__Alternatives ) )
            // InternalPascal.g:193:3: ( rule__SomeValue__Alternatives )
            {
             before(grammarAccess.getSomeValueAccess().getAlternatives()); 
            // InternalPascal.g:194:3: ( rule__SomeValue__Alternatives )
            // InternalPascal.g:194:4: rule__SomeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SomeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSomeValueAccess().getAlternatives()); 

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
    // InternalPascal.g:203:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:207:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:208:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:208:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:209:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPascal.g:210:3: ( rule__Type__Alternatives )
            // InternalPascal.g:210:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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


    // $ANTLR start "rule__SomeValue__Alternatives"
    // InternalPascal.g:218:1: rule__SomeValue__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SomeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:222:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPascal.g:223:2: ( RULE_ID )
                    {
                    // InternalPascal.g:223:2: ( RULE_ID )
                    // InternalPascal.g:224:3: RULE_ID
                    {
                     before(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:229:2: ( RULE_INT )
                    {
                    // InternalPascal.g:229:2: ( RULE_INT )
                    // InternalPascal.g:230:3: RULE_INT
                    {
                     before(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:235:2: ( RULE_STRING )
                    {
                    // InternalPascal.g:235:2: ( RULE_STRING )
                    // InternalPascal.g:236:3: RULE_STRING
                    {
                     before(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:241:2: ( RULE_ANY_OTHER )
                    {
                    // InternalPascal.g:241:2: ( RULE_ANY_OTHER )
                    // InternalPascal.g:242:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSomeValueAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getSomeValueAccess().getANY_OTHERTerminalRuleCall_3()); 

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
    // InternalPascal.g:251:1: rule__Type__Alternatives : ( ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:255:1: ( ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascal.g:256:2: ( ( 'Boolean' ) )
                    {
                    // InternalPascal.g:256:2: ( ( 'Boolean' ) )
                    // InternalPascal.g:257:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // InternalPascal.g:258:3: ( 'Boolean' )
                    // InternalPascal.g:258:4: 'Boolean'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:262:2: ( ( 'Integer' ) )
                    {
                    // InternalPascal.g:262:2: ( ( 'Integer' ) )
                    // InternalPascal.g:263:3: ( 'Integer' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalPascal.g:264:3: ( 'Integer' )
                    // InternalPascal.g:264:4: 'Integer'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:268:2: ( ( 'String' ) )
                    {
                    // InternalPascal.g:268:2: ( ( 'String' ) )
                    // InternalPascal.g:269:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    // InternalPascal.g:270:3: ( 'String' )
                    // InternalPascal.g:270:4: 'String'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 

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
    // InternalPascal.g:278:1: rule__Pascal__Group__0 : rule__Pascal__Group__0__Impl rule__Pascal__Group__1 ;
    public final void rule__Pascal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:282:1: ( rule__Pascal__Group__0__Impl rule__Pascal__Group__1 )
            // InternalPascal.g:283:2: rule__Pascal__Group__0__Impl rule__Pascal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pascal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pascal__Group__1();

            state._fsp--;


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
    // InternalPascal.g:290:1: rule__Pascal__Group__0__Impl : ( ( rule__Pascal__ElementAssignment_0 ) ) ;
    public final void rule__Pascal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:294:1: ( ( ( rule__Pascal__ElementAssignment_0 ) ) )
            // InternalPascal.g:295:1: ( ( rule__Pascal__ElementAssignment_0 ) )
            {
            // InternalPascal.g:295:1: ( ( rule__Pascal__ElementAssignment_0 ) )
            // InternalPascal.g:296:2: ( rule__Pascal__ElementAssignment_0 )
            {
             before(grammarAccess.getPascalAccess().getElementAssignment_0()); 
            // InternalPascal.g:297:2: ( rule__Pascal__ElementAssignment_0 )
            // InternalPascal.g:297:3: rule__Pascal__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getElementAssignment_0()); 

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
    // InternalPascal.g:305:1: rule__Pascal__Group__1 : rule__Pascal__Group__1__Impl rule__Pascal__Group__2 ;
    public final void rule__Pascal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:309:1: ( rule__Pascal__Group__1__Impl rule__Pascal__Group__2 )
            // InternalPascal.g:310:2: rule__Pascal__Group__1__Impl rule__Pascal__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Pascal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pascal__Group__2();

            state._fsp--;


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
    // InternalPascal.g:317:1: rule__Pascal__Group__1__Impl : ( ( rule__Pascal__ElementAssignment_1 )* ) ;
    public final void rule__Pascal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:321:1: ( ( ( rule__Pascal__ElementAssignment_1 )* ) )
            // InternalPascal.g:322:1: ( ( rule__Pascal__ElementAssignment_1 )* )
            {
            // InternalPascal.g:322:1: ( ( rule__Pascal__ElementAssignment_1 )* )
            // InternalPascal.g:323:2: ( rule__Pascal__ElementAssignment_1 )*
            {
             before(grammarAccess.getPascalAccess().getElementAssignment_1()); 
            // InternalPascal.g:324:2: ( rule__Pascal__ElementAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:324:3: rule__Pascal__ElementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Pascal__ElementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPascalAccess().getElementAssignment_1()); 

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
    // InternalPascal.g:332:1: rule__Pascal__Group__2 : rule__Pascal__Group__2__Impl ;
    public final void rule__Pascal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:336:1: ( rule__Pascal__Group__2__Impl )
            // InternalPascal.g:337:2: rule__Pascal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__Group__2__Impl();

            state._fsp--;


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
    // InternalPascal.g:343:1: rule__Pascal__Group__2__Impl : ( ( rule__Pascal__ElementAssignment_2 )* ) ;
    public final void rule__Pascal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:347:1: ( ( ( rule__Pascal__ElementAssignment_2 )* ) )
            // InternalPascal.g:348:1: ( ( rule__Pascal__ElementAssignment_2 )* )
            {
            // InternalPascal.g:348:1: ( ( rule__Pascal__ElementAssignment_2 )* )
            // InternalPascal.g:349:2: ( rule__Pascal__ElementAssignment_2 )*
            {
             before(grammarAccess.getPascalAccess().getElementAssignment_2()); 
            // InternalPascal.g:350:2: ( rule__Pascal__ElementAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:350:3: rule__Pascal__ElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Pascal__ElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPascalAccess().getElementAssignment_2()); 

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
    // InternalPascal.g:359:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:363:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:364:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


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
    // InternalPascal.g:371:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:375:1: ( ( 'program' ) )
            // InternalPascal.g:376:1: ( 'program' )
            {
            // InternalPascal.g:376:1: ( 'program' )
            // InternalPascal.g:377:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // InternalPascal.g:386:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:390:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:391:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


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
    // InternalPascal.g:398:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:402:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:403:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:403:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:404:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalPascal.g:405:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:405:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // InternalPascal.g:413:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:417:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:418:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;


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
    // InternalPascal.g:424:1: rule__Program__Group__2__Impl : ( ';' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:428:1: ( ( ';' ) )
            // InternalPascal.g:429:1: ( ';' )
            {
            // InternalPascal.g:429:1: ( ';' )
            // InternalPascal.g:430:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 

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
    // InternalPascal.g:440:1: rule__Var_decl__Group__0 : rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 ;
    public final void rule__Var_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:444:1: ( rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1 )
            // InternalPascal.g:445:2: rule__Var_decl__Group__0__Impl rule__Var_decl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Var_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1();

            state._fsp--;


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
    // InternalPascal.g:452:1: rule__Var_decl__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:456:1: ( ( 'var' ) )
            // InternalPascal.g:457:1: ( 'var' )
            {
            // InternalPascal.g:457:1: ( 'var' )
            // InternalPascal.g:458:2: 'var'
            {
             before(grammarAccess.getVar_declAccess().getVarKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVar_declAccess().getVarKeyword_0()); 

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
    // InternalPascal.g:467:1: rule__Var_decl__Group__1 : rule__Var_decl__Group__1__Impl ;
    public final void rule__Var_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:471:1: ( rule__Var_decl__Group__1__Impl )
            // InternalPascal.g:472:2: rule__Var_decl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group__1__Impl();

            state._fsp--;


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
    // InternalPascal.g:478:1: rule__Var_decl__Group__1__Impl : ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) ) ;
    public final void rule__Var_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:482:1: ( ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) ) )
            // InternalPascal.g:483:1: ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) )
            {
            // InternalPascal.g:483:1: ( ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* ) )
            // InternalPascal.g:484:2: ( ( rule__Var_decl__Group_1__0 ) ) ( ( rule__Var_decl__Group_1__0 )* )
            {
            // InternalPascal.g:484:2: ( ( rule__Var_decl__Group_1__0 ) )
            // InternalPascal.g:485:3: ( rule__Var_decl__Group_1__0 )
            {
             before(grammarAccess.getVar_declAccess().getGroup_1()); 
            // InternalPascal.g:486:3: ( rule__Var_decl__Group_1__0 )
            // InternalPascal.g:486:4: rule__Var_decl__Group_1__0
            {
            pushFollow(FOLLOW_5);
            rule__Var_decl__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVar_declAccess().getGroup_1()); 

            }

            // InternalPascal.g:489:2: ( ( rule__Var_decl__Group_1__0 )* )
            // InternalPascal.g:490:3: ( rule__Var_decl__Group_1__0 )*
            {
             before(grammarAccess.getVar_declAccess().getGroup_1()); 
            // InternalPascal.g:491:3: ( rule__Var_decl__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_2 = input.LA(2);

                    if ( ((LA5_2>=17 && LA5_2<=18)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:491:4: rule__Var_decl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Var_decl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getVar_declAccess().getGroup_1()); 

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
    // InternalPascal.g:501:1: rule__Var_decl__Group_1__0 : rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1 ;
    public final void rule__Var_decl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:505:1: ( rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1 )
            // InternalPascal.g:506:2: rule__Var_decl__Group_1__0__Impl rule__Var_decl__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Var_decl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__1();

            state._fsp--;


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
    // InternalPascal.g:513:1: rule__Var_decl__Group_1__0__Impl : ( ( rule__Var_decl__Var_listAssignment_1_0 ) ) ;
    public final void rule__Var_decl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:517:1: ( ( ( rule__Var_decl__Var_listAssignment_1_0 ) ) )
            // InternalPascal.g:518:1: ( ( rule__Var_decl__Var_listAssignment_1_0 ) )
            {
            // InternalPascal.g:518:1: ( ( rule__Var_decl__Var_listAssignment_1_0 ) )
            // InternalPascal.g:519:2: ( rule__Var_decl__Var_listAssignment_1_0 )
            {
             before(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); 
            // InternalPascal.g:520:2: ( rule__Var_decl__Var_listAssignment_1_0 )
            // InternalPascal.g:520:3: rule__Var_decl__Var_listAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Var_listAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); 

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
    // InternalPascal.g:528:1: rule__Var_decl__Group_1__1 : rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2 ;
    public final void rule__Var_decl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:532:1: ( rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2 )
            // InternalPascal.g:533:2: rule__Var_decl__Group_1__1__Impl rule__Var_decl__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Var_decl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__2();

            state._fsp--;


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
    // InternalPascal.g:540:1: rule__Var_decl__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Var_decl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:544:1: ( ( ':' ) )
            // InternalPascal.g:545:1: ( ':' )
            {
            // InternalPascal.g:545:1: ( ':' )
            // InternalPascal.g:546:2: ':'
            {
             before(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); 

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
    // InternalPascal.g:555:1: rule__Var_decl__Group_1__2 : rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3 ;
    public final void rule__Var_decl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:559:1: ( rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3 )
            // InternalPascal.g:560:2: rule__Var_decl__Group_1__2__Impl rule__Var_decl__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Var_decl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__3();

            state._fsp--;


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
    // InternalPascal.g:567:1: rule__Var_decl__Group_1__2__Impl : ( ( rule__Var_decl__TypeAssignment_1_2 ) ) ;
    public final void rule__Var_decl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:571:1: ( ( ( rule__Var_decl__TypeAssignment_1_2 ) ) )
            // InternalPascal.g:572:1: ( ( rule__Var_decl__TypeAssignment_1_2 ) )
            {
            // InternalPascal.g:572:1: ( ( rule__Var_decl__TypeAssignment_1_2 ) )
            // InternalPascal.g:573:2: ( rule__Var_decl__TypeAssignment_1_2 )
            {
             before(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); 
            // InternalPascal.g:574:2: ( rule__Var_decl__TypeAssignment_1_2 )
            // InternalPascal.g:574:3: rule__Var_decl__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); 

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
    // InternalPascal.g:582:1: rule__Var_decl__Group_1__3 : rule__Var_decl__Group_1__3__Impl ;
    public final void rule__Var_decl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:586:1: ( rule__Var_decl__Group_1__3__Impl )
            // InternalPascal.g:587:2: rule__Var_decl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_decl__Group_1__3__Impl();

            state._fsp--;


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
    // InternalPascal.g:593:1: rule__Var_decl__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Var_decl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:597:1: ( ( ';' ) )
            // InternalPascal.g:598:1: ( ';' )
            {
            // InternalPascal.g:598:1: ( ';' )
            // InternalPascal.g:599:2: ';'
            {
             before(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); 

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


    // $ANTLR start "rule__Var_list__Group__0"
    // InternalPascal.g:609:1: rule__Var_list__Group__0 : rule__Var_list__Group__0__Impl rule__Var_list__Group__1 ;
    public final void rule__Var_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:613:1: ( rule__Var_list__Group__0__Impl rule__Var_list__Group__1 )
            // InternalPascal.g:614:2: rule__Var_list__Group__0__Impl rule__Var_list__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Var_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_list__Group__1();

            state._fsp--;


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
    // InternalPascal.g:621:1: rule__Var_list__Group__0__Impl : ( ( rule__Var_list__IdentifierAssignment_0 ) ) ;
    public final void rule__Var_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:625:1: ( ( ( rule__Var_list__IdentifierAssignment_0 ) ) )
            // InternalPascal.g:626:1: ( ( rule__Var_list__IdentifierAssignment_0 ) )
            {
            // InternalPascal.g:626:1: ( ( rule__Var_list__IdentifierAssignment_0 ) )
            // InternalPascal.g:627:2: ( rule__Var_list__IdentifierAssignment_0 )
            {
             before(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); 
            // InternalPascal.g:628:2: ( rule__Var_list__IdentifierAssignment_0 )
            // InternalPascal.g:628:3: rule__Var_list__IdentifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__IdentifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); 

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
    // InternalPascal.g:636:1: rule__Var_list__Group__1 : rule__Var_list__Group__1__Impl ;
    public final void rule__Var_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:640:1: ( rule__Var_list__Group__1__Impl )
            // InternalPascal.g:641:2: rule__Var_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group__1__Impl();

            state._fsp--;


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
    // InternalPascal.g:647:1: rule__Var_list__Group__1__Impl : ( ( rule__Var_list__Group_1__0 )* ) ;
    public final void rule__Var_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:651:1: ( ( ( rule__Var_list__Group_1__0 )* ) )
            // InternalPascal.g:652:1: ( ( rule__Var_list__Group_1__0 )* )
            {
            // InternalPascal.g:652:1: ( ( rule__Var_list__Group_1__0 )* )
            // InternalPascal.g:653:2: ( rule__Var_list__Group_1__0 )*
            {
             before(grammarAccess.getVar_listAccess().getGroup_1()); 
            // InternalPascal.g:654:2: ( rule__Var_list__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:654:3: rule__Var_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Var_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVar_listAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Var_list__Group_1__0"
    // InternalPascal.g:663:1: rule__Var_list__Group_1__0 : rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 ;
    public final void rule__Var_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:667:1: ( rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1 )
            // InternalPascal.g:668:2: rule__Var_list__Group_1__0__Impl rule__Var_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Var_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__1();

            state._fsp--;


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
    // InternalPascal.g:675:1: rule__Var_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Var_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:679:1: ( ( ',' ) )
            // InternalPascal.g:680:1: ( ',' )
            {
            // InternalPascal.g:680:1: ( ',' )
            // InternalPascal.g:681:2: ','
            {
             before(grammarAccess.getVar_listAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVar_listAccess().getCommaKeyword_1_0()); 

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
    // InternalPascal.g:690:1: rule__Var_list__Group_1__1 : rule__Var_list__Group_1__1__Impl ;
    public final void rule__Var_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:694:1: ( rule__Var_list__Group_1__1__Impl )
            // InternalPascal.g:695:2: rule__Var_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var_list__Group_1__1__Impl();

            state._fsp--;


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
    // InternalPascal.g:701:1: rule__Var_list__Group_1__1__Impl : ( ( ( rule__Var_list__Var_listAssignment_1_1 ) ) ( ( rule__Var_list__Var_listAssignment_1_1 )* ) ) ;
    public final void rule__Var_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:705:1: ( ( ( ( rule__Var_list__Var_listAssignment_1_1 ) ) ( ( rule__Var_list__Var_listAssignment_1_1 )* ) ) )
            // InternalPascal.g:706:1: ( ( ( rule__Var_list__Var_listAssignment_1_1 ) ) ( ( rule__Var_list__Var_listAssignment_1_1 )* ) )
            {
            // InternalPascal.g:706:1: ( ( ( rule__Var_list__Var_listAssignment_1_1 ) ) ( ( rule__Var_list__Var_listAssignment_1_1 )* ) )
            // InternalPascal.g:707:2: ( ( rule__Var_list__Var_listAssignment_1_1 ) ) ( ( rule__Var_list__Var_listAssignment_1_1 )* )
            {
            // InternalPascal.g:707:2: ( ( rule__Var_list__Var_listAssignment_1_1 ) )
            // InternalPascal.g:708:3: ( rule__Var_list__Var_listAssignment_1_1 )
            {
             before(grammarAccess.getVar_listAccess().getVar_listAssignment_1_1()); 
            // InternalPascal.g:709:3: ( rule__Var_list__Var_listAssignment_1_1 )
            // InternalPascal.g:709:4: rule__Var_list__Var_listAssignment_1_1
            {
            pushFollow(FOLLOW_5);
            rule__Var_list__Var_listAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_listAccess().getVar_listAssignment_1_1()); 

            }

            // InternalPascal.g:712:2: ( ( rule__Var_list__Var_listAssignment_1_1 )* )
            // InternalPascal.g:713:3: ( rule__Var_list__Var_listAssignment_1_1 )*
            {
             before(grammarAccess.getVar_listAccess().getVar_listAssignment_1_1()); 
            // InternalPascal.g:714:3: ( rule__Var_list__Var_listAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:714:4: rule__Var_list__Var_listAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Var_list__Var_listAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getVar_listAccess().getVar_listAssignment_1_1()); 

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


    // $ANTLR start "rule__Atrib__Group__0"
    // InternalPascal.g:724:1: rule__Atrib__Group__0 : rule__Atrib__Group__0__Impl rule__Atrib__Group__1 ;
    public final void rule__Atrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:728:1: ( rule__Atrib__Group__0__Impl rule__Atrib__Group__1 )
            // InternalPascal.g:729:2: rule__Atrib__Group__0__Impl rule__Atrib__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Atrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__1();

            state._fsp--;


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
    // InternalPascal.g:736:1: rule__Atrib__Group__0__Impl : ( ( rule__Atrib__IdentifierAssignment_0 ) ) ;
    public final void rule__Atrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:740:1: ( ( ( rule__Atrib__IdentifierAssignment_0 ) ) )
            // InternalPascal.g:741:1: ( ( rule__Atrib__IdentifierAssignment_0 ) )
            {
            // InternalPascal.g:741:1: ( ( rule__Atrib__IdentifierAssignment_0 ) )
            // InternalPascal.g:742:2: ( rule__Atrib__IdentifierAssignment_0 )
            {
             before(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); 
            // InternalPascal.g:743:2: ( rule__Atrib__IdentifierAssignment_0 )
            // InternalPascal.g:743:3: rule__Atrib__IdentifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__IdentifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); 

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
    // InternalPascal.g:751:1: rule__Atrib__Group__1 : rule__Atrib__Group__1__Impl rule__Atrib__Group__2 ;
    public final void rule__Atrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:755:1: ( rule__Atrib__Group__1__Impl rule__Atrib__Group__2 )
            // InternalPascal.g:756:2: rule__Atrib__Group__1__Impl rule__Atrib__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Atrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__2();

            state._fsp--;


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
    // InternalPascal.g:763:1: rule__Atrib__Group__1__Impl : ( ':=' ) ;
    public final void rule__Atrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:767:1: ( ( ':=' ) )
            // InternalPascal.g:768:1: ( ':=' )
            {
            // InternalPascal.g:768:1: ( ':=' )
            // InternalPascal.g:769:2: ':='
            {
             before(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); 

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
    // InternalPascal.g:778:1: rule__Atrib__Group__2 : rule__Atrib__Group__2__Impl rule__Atrib__Group__3 ;
    public final void rule__Atrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:782:1: ( rule__Atrib__Group__2__Impl rule__Atrib__Group__3 )
            // InternalPascal.g:783:2: rule__Atrib__Group__2__Impl rule__Atrib__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Atrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3();

            state._fsp--;


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
    // InternalPascal.g:790:1: rule__Atrib__Group__2__Impl : ( ( rule__Atrib__ValueAssignment_2 ) ) ;
    public final void rule__Atrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:794:1: ( ( ( rule__Atrib__ValueAssignment_2 ) ) )
            // InternalPascal.g:795:1: ( ( rule__Atrib__ValueAssignment_2 ) )
            {
            // InternalPascal.g:795:1: ( ( rule__Atrib__ValueAssignment_2 ) )
            // InternalPascal.g:796:2: ( rule__Atrib__ValueAssignment_2 )
            {
             before(grammarAccess.getAtribAccess().getValueAssignment_2()); 
            // InternalPascal.g:797:2: ( rule__Atrib__ValueAssignment_2 )
            // InternalPascal.g:797:3: rule__Atrib__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtribAccess().getValueAssignment_2()); 

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
    // InternalPascal.g:805:1: rule__Atrib__Group__3 : rule__Atrib__Group__3__Impl ;
    public final void rule__Atrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:809:1: ( rule__Atrib__Group__3__Impl )
            // InternalPascal.g:810:2: rule__Atrib__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atrib__Group__3__Impl();

            state._fsp--;


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
    // InternalPascal.g:816:1: rule__Atrib__Group__3__Impl : ( ';' ) ;
    public final void rule__Atrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:820:1: ( ( ';' ) )
            // InternalPascal.g:821:1: ( ';' )
            {
            // InternalPascal.g:821:1: ( ';' )
            // InternalPascal.g:822:2: ';'
            {
             before(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); 

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


    // $ANTLR start "rule__Pascal__ElementAssignment_0"
    // InternalPascal.g:832:1: rule__Pascal__ElementAssignment_0 : ( ruleprogram ) ;
    public final void rule__Pascal__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:836:1: ( ( ruleprogram ) )
            // InternalPascal.g:837:2: ( ruleprogram )
            {
            // InternalPascal.g:837:2: ( ruleprogram )
            // InternalPascal.g:838:3: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getElementProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getElementProgramParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Pascal__ElementAssignment_0"


    // $ANTLR start "rule__Pascal__ElementAssignment_1"
    // InternalPascal.g:847:1: rule__Pascal__ElementAssignment_1 : ( rulevar_decl ) ;
    public final void rule__Pascal__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:851:1: ( ( rulevar_decl ) )
            // InternalPascal.g:852:2: ( rulevar_decl )
            {
            // InternalPascal.g:852:2: ( rulevar_decl )
            // InternalPascal.g:853:3: rulevar_decl
            {
             before(grammarAccess.getPascalAccess().getElementVar_declParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_decl();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getElementVar_declParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pascal__ElementAssignment_1"


    // $ANTLR start "rule__Pascal__ElementAssignment_2"
    // InternalPascal.g:862:1: rule__Pascal__ElementAssignment_2 : ( ruleatrib ) ;
    public final void rule__Pascal__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:866:1: ( ( ruleatrib ) )
            // InternalPascal.g:867:2: ( ruleatrib )
            {
            // InternalPascal.g:867:2: ( ruleatrib )
            // InternalPascal.g:868:3: ruleatrib
            {
             before(grammarAccess.getPascalAccess().getElementAtribParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleatrib();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getElementAtribParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pascal__ElementAssignment_2"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalPascal.g:877:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:881:1: ( ( RULE_ID ) )
            // InternalPascal.g:882:2: ( RULE_ID )
            {
            // InternalPascal.g:882:2: ( RULE_ID )
            // InternalPascal.g:883:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalPascal.g:892:1: rule__Var_decl__Var_listAssignment_1_0 : ( rulevar_list ) ;
    public final void rule__Var_decl__Var_listAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:896:1: ( ( rulevar_list ) )
            // InternalPascal.g:897:2: ( rulevar_list )
            {
            // InternalPascal.g:897:2: ( rulevar_list )
            // InternalPascal.g:898:3: rulevar_list
            {
             before(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulevar_list();

            state._fsp--;

             after(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); 

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
    // InternalPascal.g:907:1: rule__Var_decl__TypeAssignment_1_2 : ( ruleType ) ;
    public final void rule__Var_decl__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:911:1: ( ( ruleType ) )
            // InternalPascal.g:912:2: ( ruleType )
            {
            // InternalPascal.g:912:2: ( ruleType )
            // InternalPascal.g:913:3: ruleType
            {
             before(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); 

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
    // InternalPascal.g:922:1: rule__Var_list__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var_list__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:926:1: ( ( RULE_ID ) )
            // InternalPascal.g:927:2: ( RULE_ID )
            {
            // InternalPascal.g:927:2: ( RULE_ID )
            // InternalPascal.g:928:3: RULE_ID
            {
             before(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Var_list__Var_listAssignment_1_1"
    // InternalPascal.g:937:1: rule__Var_list__Var_listAssignment_1_1 : ( rulevar_list ) ;
    public final void rule__Var_list__Var_listAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:941:1: ( ( rulevar_list ) )
            // InternalPascal.g:942:2: ( rulevar_list )
            {
            // InternalPascal.g:942:2: ( rulevar_list )
            // InternalPascal.g:943:3: rulevar_list
            {
             before(grammarAccess.getVar_listAccess().getVar_listVar_listParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_list();

            state._fsp--;

             after(grammarAccess.getVar_listAccess().getVar_listVar_listParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Var_list__Var_listAssignment_1_1"


    // $ANTLR start "rule__Atrib__IdentifierAssignment_0"
    // InternalPascal.g:952:1: rule__Atrib__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atrib__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:956:1: ( ( RULE_ID ) )
            // InternalPascal.g:957:2: ( RULE_ID )
            {
            // InternalPascal.g:957:2: ( RULE_ID )
            // InternalPascal.g:958:3: RULE_ID
            {
             before(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Atrib__ValueAssignment_2"
    // InternalPascal.g:967:1: rule__Atrib__ValueAssignment_2 : ( ruleSomeValue ) ;
    public final void rule__Atrib__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:971:1: ( ( ruleSomeValue ) )
            // InternalPascal.g:972:2: ( ruleSomeValue )
            {
            // InternalPascal.g:972:2: ( ruleSomeValue )
            // InternalPascal.g:973:3: ruleSomeValue
            {
             before(grammarAccess.getAtribAccess().getValueSomeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSomeValue();

            state._fsp--;

             after(grammarAccess.getAtribAccess().getValueSomeValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Atrib__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000F0L});

}