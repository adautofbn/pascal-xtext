/*
 * generated by Xtext 2.9.0
 */
grammar InternalPascal;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package edu.ufcg.compiladores.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePascal
entryRulePascal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPascalRule()); }
	iv_rulePascal=rulePascal
	{ $current=$iv_rulePascal.current; }
	EOF;

// Rule Pascal
rulePascal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0());
				}
				lv_head_0_0=ruleprogram
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPascalRule());
					}
					set(
						$current,
						"head",
						lv_head_0_0,
						"edu.ufcg.compiladores.pascal.Pascal.program");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0());
				}
				lv_declarations_1_0=rulevar_decl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPascalRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_1_0,
						"edu.ufcg.compiladores.pascal.Pascal.var_decl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0());
				}
				lv_scope_2_0=ruleatrib
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPascalRule());
					}
					add(
						$current,
						"scope",
						lv_scope_2_0,
						"edu.ufcg.compiladores.pascal.Pascal.atrib");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)?
;

// Entry rule entryRuleprogram
entryRuleprogram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleprogram=ruleprogram
	{ $current=$iv_ruleprogram.current; }
	EOF;

// Rule program
ruleprogram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRulevar_decl
entryRulevar_decl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVar_declRule()); }
	iv_rulevar_decl=rulevar_decl
	{ $current=$iv_rulevar_decl.current; }
	EOF;

// Rule var_decl
rulevar_decl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVar_declAccess().getVarKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0());
					}
					lv_var_list_1_0=rulevar_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVar_declRule());
						}
						add(
							$current,
							"var_list",
							lv_var_list_1_0,
							"edu.ufcg.compiladores.pascal.Pascal.var_list");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getVar_declAccess().getColonKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0());
					}
					lv_type_3_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVar_declRule());
						}
						add(
							$current,
							"type",
							lv_type_3_0,
							"edu.ufcg.compiladores.pascal.Pascal.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3());
			}
		)+
	)
;

// Entry rule entryRulevar_list
entryRulevar_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVar_listRule()); }
	iv_rulevar_list=rulevar_list
	{ $current=$iv_rulevar_list.current; }
	EOF;

// Rule var_list
rulevar_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_identifier_0_0=RULE_ID
				{
					newLeafNode(lv_identifier_0_0, grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVar_listRule());
					}
					addWithLastConsumed(
						$current,
						"identifier",
						lv_identifier_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				(
					lv_identifier_1_0=RULE_ID
					{
						newLeafNode(lv_identifier_1_0, grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVar_listRule());
						}
						addWithLastConsumed(
							$current,
							"identifier",
							lv_identifier_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getVar_listAccess().getCommaKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0());
					}
					lv_vars_3_0=rulevar_list
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVar_listRule());
						}
						add(
							$current,
							"vars",
							lv_vars_3_0,
							"edu.ufcg.compiladores.pascal.Pascal.var_list");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)
	)
;

// Entry rule entryRuleatrib
entryRuleatrib returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtribRule()); }
	iv_ruleatrib=ruleatrib
	{ $current=$iv_ruleatrib.current; }
	EOF;

// Rule atrib
ruleatrib returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_identifier_0_0=RULE_ID
				{
					newLeafNode(lv_identifier_0_0, grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtribRule());
					}
					setWithLastConsumed(
						$current,
						"identifier",
						lv_identifier_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleexpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtribRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"edu.ufcg.compiladores.pascal.Pascal.expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAtribAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleexpression
entryRuleexpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleexpression=ruleexpression
	{ $current=$iv_ruleexpression.current; }
	EOF;

// Rule expression
ruleexpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0());
				}
				lv_value_0_0=ruleSomeValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"edu.ufcg.compiladores.pascal.Pascal.SomeValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0());
				}
				lv_exp_1_0=rulesecondExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					add(
						$current,
						"exp",
						lv_exp_1_0,
						"edu.ufcg.compiladores.pascal.Pascal.secondExp");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulesecondExp
entryRulesecondExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSecondExpRule()); }
	iv_rulesecondExp=rulesecondExp
	{ $current=$iv_rulesecondExp.current; }
	EOF;

// Rule secondExp
rulesecondExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0());
				}
				lv_op_0_0=ruleoperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecondExpRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"edu.ufcg.compiladores.pascal.Pascal.operator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0());
				}
				lv_value_1_0=ruleSomeValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecondExpRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"edu.ufcg.compiladores.pascal.Pascal.SomeValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0());
				}
				lv_exp_2_0=rulesecondExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecondExpRule());
					}
					add(
						$current,
						"exp",
						lv_exp_2_0,
						"edu.ufcg.compiladores.pascal.Pascal.secondExp");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleoperator
entryRuleoperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleoperator=ruleoperator
	{ $current=$iv_ruleoperator.current.getText(); }
	EOF;

// Rule operator
ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0());
		}
		this_arit_op_0=rulearit_op
		{
			$current.merge(this_arit_op_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1());
		}
		this_rel_op_1=rulerel_op
		{
			$current.merge(this_rel_op_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulearit_op
entryRulearit_op returns [String current=null]:
	{ newCompositeNode(grammarAccess.getArit_opRule()); }
	iv_rulearit_op=rulearit_op
	{ $current=$iv_rulearit_op.current.getText(); }
	EOF;

// Rule arit_op
rulearit_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArit_opAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArit_opAccess().getAsteriskKeyword_2());
		}
		    |
		kw='div'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArit_opAccess().getDivKeyword_3());
		}
		    |
		kw='mod'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArit_opAccess().getModKeyword_4());
		}
	)
;

// Entry rule entryRulerel_op
entryRulerel_op returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRel_opRule()); }
	iv_rulerel_op=rulerel_op
	{ $current=$iv_rulerel_op.current.getText(); }
	EOF;

// Rule rel_op
rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignKeyword_1());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3());
		}
		    |
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getEqualsSignKeyword_4());
		}
		    |
		kw='<>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleSomeValue
entryRuleSomeValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSomeValueRule()); }
	iv_ruleSomeValue=ruleSomeValue
	{ $current=$iv_ruleSomeValue.current.getText(); }
	EOF;

// Rule SomeValue
ruleSomeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1());
		}
		    |
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2());
		}
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='boolean'
			{
				$current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='integer'
			{
				$current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='string'
			{
				$current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
