package edu.ufcg.compiladores.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( 'program' )
            // InternalPascal.g:11:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( ';' )
            // InternalPascal.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( 'var' )
            // InternalPascal.g:13:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( ':' )
            // InternalPascal.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:15:7: ( '=' )
            // InternalPascal.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:16:7: ( ',' )
            // InternalPascal.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:17:7: ( 'begin' )
            // InternalPascal.g:17:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( 'end' )
            // InternalPascal.g:18:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:19:7: ( '.' )
            // InternalPascal.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:20:7: ( ':=' )
            // InternalPascal.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:21:7: ( '+' )
            // InternalPascal.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:22:7: ( '-' )
            // InternalPascal.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:23:7: ( '*' )
            // InternalPascal.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:24:7: ( 'div' )
            // InternalPascal.g:24:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:25:7: ( 'mod' )
            // InternalPascal.g:25:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:26:7: ( '>' )
            // InternalPascal.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:27:7: ( '<' )
            // InternalPascal.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:28:7: ( '>=' )
            // InternalPascal.g:28:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( '<=' )
            // InternalPascal.g:29:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( '(' )
            // InternalPascal.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( ')' )
            // InternalPascal.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( 'boolean' )
            // InternalPascal.g:32:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( 'integer' )
            // InternalPascal.g:33:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'string' )
            // InternalPascal.g:34:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1094:13: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )* '\\'' )
            // InternalPascal.g:1094:15: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )* '\\''
            {
            match('\''); 
            // InternalPascal.g:1094:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='9')||LA1_0=='='||(LA1_0>='?' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='}')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1096:14: ( ( 'true' | 'false' ) )
            // InternalPascal.g:1096:16: ( 'true' | 'false' )
            {
            // InternalPascal.g:1096:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:1096:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1096:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_MULTI_LINE_COMMENT"
    public final void mRULE_MULTI_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_MULTI_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1098:25: ( ( '{*' ( options {greedy=false; } : . )* '*}' | '(*' ( options {greedy=false; } : . )* '*)' ) )
            // InternalPascal.g:1098:27: ( '{*' ( options {greedy=false; } : . )* '*}' | '(*' ( options {greedy=false; } : . )* '*)' )
            {
            // InternalPascal.g:1098:27: ( '{*' ( options {greedy=false; } : . )* '*}' | '(*' ( options {greedy=false; } : . )* '*)' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='{') ) {
                alt5=1;
            }
            else if ( (LA5_0=='(') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1098:28: '{*' ( options {greedy=false; } : . )* '*}'
                    {
                    match("{*"); 

                    // InternalPascal.g:1098:33: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='*') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='}') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1>='\u0000' && LA3_1<='|')||(LA3_1>='~' && LA3_1<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPascal.g:1098:61: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match("*}"); 


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1098:70: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalPascal.g:1098:75: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='*') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==')') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='(')||(LA4_1>='*' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPascal.g:1098:103: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTI_LINE_COMMENT"

    // $ANTLR start "RULE_SINGLE_LINE_COMMENT"
    public final void mRULE_SINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1100:26: ( '{' (~ ( ( '\\n' | '\\r' ) ) )* '}' ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:1100:28: '{' (~ ( ( '\\n' | '\\r' ) ) )* '}' ( ( '\\r' )? '\\n' )?
            {
            match('{'); 
            // InternalPascal.g:1100:32: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='}') ) {
                    int LA6_1 = input.LA(2);

                    if ( ((LA6_1>='\u0000' && LA6_1<='\t')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='|')||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:1100:32: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('}'); 
            // InternalPascal.g:1100:52: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1100:53: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:1100:53: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPascal.g:1100:53: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_LINE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1102:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:1102:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:1102:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1102:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:1102:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1104:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:1104:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:1104:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:1104:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1106:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:1106:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:1106:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:1106:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1108:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:1108:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:1108:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1108:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPascal.g:1108:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1108:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:1108:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPascal.g:1108:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1110:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:1110:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:1110:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1112:16: ( . )
            // InternalPascal.g:1112:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_STRING | RULE_BOOLEAN | RULE_MULTI_LINE_COMMENT | RULE_SINGLE_LINE_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=34;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalPascal.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:166: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:179: RULE_MULTI_LINE_COMMENT
                {
                mRULE_MULTI_LINE_COMMENT(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:203: RULE_SINGLE_LINE_COMMENT
                {
                mRULE_SINGLE_LINE_COMMENT(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:245: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:277: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\40\1\uffff\1\40\1\44\2\uffff\2\40\4\uffff\2\40\1\61\1\63\1\65\1\uffff\2\40\1\36\2\40\2\36\2\uffff\1\36\2\uffff\1\40\2\uffff\1\40\4\uffff\3\40\4\uffff\2\40\7\uffff\2\40\1\uffff\2\40\6\uffff\1\40\1\121\2\40\1\124\1\125\1\126\4\40\1\uffff\1\75\1\uffff\1\40\1\uffff\2\40\3\uffff\2\40\1\143\1\40\1\64\1\uffff\1\75\1\40\1\146\3\40\1\uffff\1\143\1\40\1\uffff\2\40\1\155\1\156\1\157\1\160\4\uffff";
    static final String DFA17_eofS =
        "\161\uffff";
    static final String DFA17_minS =
        "\1\0\1\162\1\uffff\1\141\1\75\2\uffff\1\145\1\156\4\uffff\1\151\1\157\2\75\1\52\1\uffff\1\156\1\164\1\41\1\162\1\141\1\0\1\101\2\uffff\1\52\2\uffff\1\157\2\uffff\1\162\4\uffff\1\147\1\157\1\144\4\uffff\1\166\1\144\7\uffff\1\164\1\162\1\uffff\1\165\1\154\1\0\5\uffff\1\147\1\60\1\151\1\154\3\60\1\145\1\151\1\145\1\163\3\0\1\162\1\uffff\1\156\1\145\3\uffff\1\147\1\156\1\60\1\145\3\0\1\141\1\60\1\141\1\145\1\147\1\uffff\1\60\1\155\1\uffff\1\156\1\162\4\60\4\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\162\1\uffff\1\141\1\75\2\uffff\1\157\1\156\4\uffff\1\151\1\157\2\75\1\52\1\uffff\1\156\1\164\1\175\1\162\1\141\1\uffff\1\172\2\uffff\1\57\2\uffff\1\157\2\uffff\1\162\4\uffff\1\147\1\157\1\144\4\uffff\1\166\1\144\7\uffff\1\164\1\162\1\uffff\1\165\1\154\1\uffff\5\uffff\1\147\1\172\1\151\1\154\3\172\1\145\1\151\1\145\1\163\3\uffff\1\162\1\uffff\1\156\1\145\3\uffff\1\147\1\156\1\172\1\145\3\uffff\1\141\1\172\1\141\1\145\1\147\1\uffff\1\172\1\155\1\uffff\1\156\1\162\4\172\4\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\2\uffff\1\11\1\13\1\14\1\15\5\uffff\1\25\7\uffff\1\35\1\36\1\uffff\1\41\1\42\1\uffff\1\35\1\2\1\uffff\1\12\1\4\1\5\1\6\3\uffff\1\11\1\13\1\14\1\15\2\uffff\1\22\1\20\1\23\1\21\1\33\1\24\1\25\2\uffff\1\31\3\uffff\1\34\1\36\1\37\1\40\1\41\17\uffff\1\3\2\uffff\1\10\1\16\1\17\14\uffff\1\32\2\uffff\1\7\6\uffff\1\30\1\1\1\26\1\27";
    static final String DFA17_specialS =
        "\1\1\27\uffff\1\3\43\uffff\1\4\20\uffff\1\6\1\2\1\10\13\uffff\1\0\1\7\1\5\23\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\6\36\1\25\1\21\1\22\1\14\1\12\1\6\1\13\1\11\1\34\12\33\1\4\1\2\1\20\1\5\1\17\2\36\32\32\3\36\1\31\1\32\1\36\1\32\1\7\1\32\1\15\1\10\1\27\2\32\1\23\3\32\1\16\2\32\1\1\2\32\1\24\1\26\1\32\1\3\4\32\1\30\uff84\36",
            "\1\37",
            "",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\47\11\uffff\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62",
            "\1\64",
            "",
            "\1\67",
            "\1\70",
            "\1\71\1\uffff\27\71\3\uffff\1\71\1\uffff\41\71\1\uffff\35\71",
            "\1\72",
            "\1\73",
            "\12\75\1\uffff\2\75\1\uffff\34\75\1\74\uffd5\75",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\12\117\1\64\2\117\1\64\34\117\1\115\122\117\1\116\uff82\117",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\122",
            "\1\123",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\117\1\64\2\117\1\64\34\117\1\115\122\117\1\133\uff82\117",
            "\12\117\1\135\2\117\1\134\34\117\1\115\122\117\1\116\uff82\117",
            "\12\117\1\64\2\117\1\64\34\117\1\115\122\117\1\116\uff82\117",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "\12\117\1\135\2\117\1\134\34\117\1\115\122\117\1\116\uff82\117",
            "\12\64\1\135\ufff5\64",
            "\0\64",
            "\1\145",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_STRING | RULE_BOOLEAN | RULE_MULTI_LINE_COMMENT | RULE_SINGLE_LINE_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_91 = input.LA(1);

                        s = -1;
                        if ( (LA17_91=='*') ) {s = 77;}

                        else if ( (LA17_91=='}') ) {s = 78;}

                        else if ( ((LA17_91>='\u0000' && LA17_91<='\t')||(LA17_91>='\u000B' && LA17_91<='\f')||(LA17_91>='\u000E' && LA17_91<=')')||(LA17_91>='+' && LA17_91<='|')||(LA17_91>='~' && LA17_91<='\uFFFF')) ) {s = 79;}

                        else if ( (LA17_91=='\r') ) {s = 92;}

                        else if ( (LA17_91=='\n') ) {s = 93;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='p') ) {s = 1;}

                        else if ( (LA17_0==';') ) {s = 2;}

                        else if ( (LA17_0=='v') ) {s = 3;}

                        else if ( (LA17_0==':') ) {s = 4;}

                        else if ( (LA17_0=='=') ) {s = 5;}

                        else if ( (LA17_0==',') ) {s = 6;}

                        else if ( (LA17_0=='b') ) {s = 7;}

                        else if ( (LA17_0=='e') ) {s = 8;}

                        else if ( (LA17_0=='.') ) {s = 9;}

                        else if ( (LA17_0=='+') ) {s = 10;}

                        else if ( (LA17_0=='-') ) {s = 11;}

                        else if ( (LA17_0=='*') ) {s = 12;}

                        else if ( (LA17_0=='d') ) {s = 13;}

                        else if ( (LA17_0=='m') ) {s = 14;}

                        else if ( (LA17_0=='>') ) {s = 15;}

                        else if ( (LA17_0=='<') ) {s = 16;}

                        else if ( (LA17_0=='(') ) {s = 17;}

                        else if ( (LA17_0==')') ) {s = 18;}

                        else if ( (LA17_0=='i') ) {s = 19;}

                        else if ( (LA17_0=='s') ) {s = 20;}

                        else if ( (LA17_0=='\'') ) {s = 21;}

                        else if ( (LA17_0=='t') ) {s = 22;}

                        else if ( (LA17_0=='f') ) {s = 23;}

                        else if ( (LA17_0=='{') ) {s = 24;}

                        else if ( (LA17_0=='^') ) {s = 25;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='a'||LA17_0=='c'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||(LA17_0>='n' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='r')||LA17_0=='u'||(LA17_0>='w' && LA17_0<='z')) ) {s = 26;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 27;}

                        else if ( (LA17_0=='/') ) {s = 28;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 29;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='!' && LA17_0<='&')||(LA17_0>='?' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='|' && LA17_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_78 = input.LA(1);

                        s = -1;
                        if ( (LA17_78=='*') ) {s = 77;}

                        else if ( (LA17_78=='}') ) {s = 78;}

                        else if ( ((LA17_78>='\u0000' && LA17_78<='\t')||(LA17_78>='\u000B' && LA17_78<='\f')||(LA17_78>='\u000E' && LA17_78<=')')||(LA17_78>='+' && LA17_78<='|')||(LA17_78>='~' && LA17_78<='\uFFFF')) ) {s = 79;}

                        else if ( (LA17_78=='\r') ) {s = 92;}

                        else if ( (LA17_78=='\n') ) {s = 93;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( (LA17_24=='*') ) {s = 60;}

                        else if ( ((LA17_24>='\u0000' && LA17_24<='\t')||(LA17_24>='\u000B' && LA17_24<='\f')||(LA17_24>='\u000E' && LA17_24<=')')||(LA17_24>='+' && LA17_24<='\uFFFF')) ) {s = 61;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( (LA17_60=='*') ) {s = 77;}

                        else if ( (LA17_60=='}') ) {s = 78;}

                        else if ( ((LA17_60>='\u0000' && LA17_60<='\t')||(LA17_60>='\u000B' && LA17_60<='\f')||(LA17_60>='\u000E' && LA17_60<=')')||(LA17_60>='+' && LA17_60<='|')||(LA17_60>='~' && LA17_60<='\uFFFF')) ) {s = 79;}

                        else if ( (LA17_60=='\n'||LA17_60=='\r') ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_93 = input.LA(1);

                        s = -1;
                        if ( ((LA17_93>='\u0000' && LA17_93<='\uFFFF')) ) {s = 52;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( (LA17_77=='}') ) {s = 91;}

                        else if ( (LA17_77=='*') ) {s = 77;}

                        else if ( ((LA17_77>='\u0000' && LA17_77<='\t')||(LA17_77>='\u000B' && LA17_77<='\f')||(LA17_77>='\u000E' && LA17_77<=')')||(LA17_77>='+' && LA17_77<='|')||(LA17_77>='~' && LA17_77<='\uFFFF')) ) {s = 79;}

                        else if ( (LA17_77=='\n'||LA17_77=='\r') ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_92 = input.LA(1);

                        s = -1;
                        if ( (LA17_92=='\n') ) {s = 93;}

                        else if ( ((LA17_92>='\u0000' && LA17_92<='\t')||(LA17_92>='\u000B' && LA17_92<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_79 = input.LA(1);

                        s = -1;
                        if ( (LA17_79=='*') ) {s = 77;}

                        else if ( (LA17_79=='}') ) {s = 78;}

                        else if ( ((LA17_79>='\u0000' && LA17_79<='\t')||(LA17_79>='\u000B' && LA17_79<='\f')||(LA17_79>='\u000E' && LA17_79<=')')||(LA17_79>='+' && LA17_79<='|')||(LA17_79>='~' && LA17_79<='\uFFFF')) ) {s = 79;}

                        else if ( (LA17_79=='\n'||LA17_79=='\r') ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}