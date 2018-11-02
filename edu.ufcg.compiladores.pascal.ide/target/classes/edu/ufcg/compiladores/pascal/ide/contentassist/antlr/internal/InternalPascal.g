/*
 * generated by Xtext 2.9.0
 */
grammar InternalPascal;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package edu.ufcg.compiladores.pascal.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRulePascal
entryRulePascal
:
{ before(grammarAccess.getPascalRule()); }
	 rulePascal
{ after(grammarAccess.getPascalRule()); } 
	 EOF 
;

// Rule Pascal
rulePascal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPascalAccess().getGroup()); }
		(rule__Pascal__Group__0)?
		{ after(grammarAccess.getPascalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleprogram
entryRuleprogram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleprogram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule program
ruleprogram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulevar_decl
entryRulevar_decl
:
{ before(grammarAccess.getVar_declRule()); }
	 rulevar_decl
{ after(grammarAccess.getVar_declRule()); } 
	 EOF 
;

// Rule var_decl
rulevar_decl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVar_declAccess().getGroup()); }
		(rule__Var_decl__Group__0)
		{ after(grammarAccess.getVar_declAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulevar_list
entryRulevar_list
:
{ before(grammarAccess.getVar_listRule()); }
	 rulevar_list
{ after(grammarAccess.getVar_listRule()); } 
	 EOF 
;

// Rule var_list
rulevar_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVar_listAccess().getAlternatives()); }
		(rule__Var_list__Alternatives)
		{ after(grammarAccess.getVar_listAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleatrib
entryRuleatrib
:
{ before(grammarAccess.getAtribRule()); }
	 ruleatrib
{ after(grammarAccess.getAtribRule()); } 
	 EOF 
;

// Rule atrib
ruleatrib 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtribAccess().getGroup()); }
		(rule__Atrib__Group__0)
		{ after(grammarAccess.getAtribAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleexpression
entryRuleexpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleexpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule expression
ruleexpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup()); }
		(rule__Expression__Group__0)
		{ after(grammarAccess.getExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulesecondExp
entryRulesecondExp
:
{ before(grammarAccess.getSecondExpRule()); }
	 rulesecondExp
{ after(grammarAccess.getSecondExpRule()); } 
	 EOF 
;

// Rule secondExp
rulesecondExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecondExpAccess().getGroup()); }
		(rule__SecondExp__Group__0)
		{ after(grammarAccess.getSecondExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleoperator
entryRuleoperator
:
{ before(grammarAccess.getOperatorRule()); }
	 ruleoperator
{ after(grammarAccess.getOperatorRule()); } 
	 EOF 
;

// Rule operator
ruleoperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulearit_op
entryRulearit_op
:
{ before(grammarAccess.getArit_opRule()); }
	 rulearit_op
{ after(grammarAccess.getArit_opRule()); } 
	 EOF 
;

// Rule arit_op
rulearit_op 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArit_opAccess().getAlternatives()); }
		(rule__Arit_op__Alternatives)
		{ after(grammarAccess.getArit_opAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulerel_op
entryRulerel_op
:
{ before(grammarAccess.getRel_opRule()); }
	 rulerel_op
{ after(grammarAccess.getRel_opRule()); } 
	 EOF 
;

// Rule rel_op
rulerel_op 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRel_opAccess().getAlternatives()); }
		(rule__Rel_op__Alternatives)
		{ after(grammarAccess.getRel_opAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSomeValue
entryRuleSomeValue
:
{ before(grammarAccess.getSomeValueRule()); }
	 ruleSomeValue
{ after(grammarAccess.getSomeValueRule()); } 
	 EOF 
;

// Rule SomeValue
ruleSomeValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSomeValueAccess().getAlternatives()); }
		(rule__SomeValue__Alternatives)
		{ after(grammarAccess.getSomeValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Type
ruleType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); }
		(rule__Var_list__IdentifierAssignment_0)
		{ after(grammarAccess.getVar_listAccess().getIdentifierAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getVar_listAccess().getGroup_1()); }
		(rule__Var_list__Group_1__0)
		{ after(grammarAccess.getVar_listAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0()); }
		rulearit_op
		{ after(grammarAccess.getOperatorAccess().getArit_opParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1()); }
		rulerel_op
		{ after(grammarAccess.getOperatorAccess().getRel_opParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arit_op__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); }
		'+'
		{ after(grammarAccess.getArit_opAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getArit_opAccess().getHyphenMinusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); }
		'*'
		{ after(grammarAccess.getArit_opAccess().getAsteriskKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getArit_opAccess().getDivKeyword_3()); }
		'div'
		{ after(grammarAccess.getArit_opAccess().getDivKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getArit_opAccess().getModKeyword_4()); }
		'mod'
		{ after(grammarAccess.getArit_opAccess().getModKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rel_op__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); }
		'>'
		{ after(grammarAccess.getRel_opAccess().getGreaterThanSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); }
		'<'
		{ after(grammarAccess.getRel_opAccess().getLessThanSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); }
		'>='
		{ after(grammarAccess.getRel_opAccess().getGreaterThanSignEqualsSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); }
		'<='
		{ after(grammarAccess.getRel_opAccess().getLessThanSignEqualsSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getRel_opAccess().getEqualsSignKeyword_4()); }
		'='
		{ after(grammarAccess.getRel_opAccess().getEqualsSignKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5()); }
		'<>'
		{ after(grammarAccess.getRel_opAccess().getLessThanSignGreaterThanSignKeyword_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SomeValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSomeValueAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); }
		RULE_INT
		{ after(grammarAccess.getSomeValueAccess().getINTTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); }
		RULE_STRING
		{ after(grammarAccess.getSomeValueAccess().getSTRINGTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); }
		('boolean')
		{ after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); }
		('integer')
		{ after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
		('string')
		{ after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pascal__Group__0__Impl
	rule__Pascal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPascalAccess().getHeadAssignment_0()); }
	(rule__Pascal__HeadAssignment_0)
	{ after(grammarAccess.getPascalAccess().getHeadAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pascal__Group__1__Impl
	rule__Pascal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPascalAccess().getDeclarationsAssignment_1()); }
	(rule__Pascal__DeclarationsAssignment_1)*
	{ after(grammarAccess.getPascalAccess().getDeclarationsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pascal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPascalAccess().getScopeAssignment_2()); }
	(rule__Pascal__ScopeAssignment_2)*
	{ after(grammarAccess.getPascalAccess().getScopeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
	'program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var_decl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group__0__Impl
	rule__Var_decl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_declAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getVar_declAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVar_declAccess().getGroup_1()); }
		(rule__Var_decl__Group_1__0)
		{ after(grammarAccess.getVar_declAccess().getGroup_1()); }
	)
	(
		{ before(grammarAccess.getVar_declAccess().getGroup_1()); }
		(rule__Var_decl__Group_1__0)*
		{ after(grammarAccess.getVar_declAccess().getGroup_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var_decl__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group_1__0__Impl
	rule__Var_decl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); }
	(rule__Var_decl__Var_listAssignment_1_0)
	{ after(grammarAccess.getVar_declAccess().getVar_listAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group_1__1__Impl
	rule__Var_decl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); }
	':'
	{ after(grammarAccess.getVar_declAccess().getColonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group_1__2__Impl
	rule__Var_decl__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); }
	(rule__Var_decl__TypeAssignment_1_2)
	{ after(grammarAccess.getVar_declAccess().getTypeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_decl__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); }
	';'
	{ after(grammarAccess.getVar_declAccess().getSemicolonKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var_list__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_list__Group_1__0__Impl
	rule__Var_list__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_listAccess().getIdentifierAssignment_1_0()); }
	(rule__Var_list__IdentifierAssignment_1_0)
	{ after(grammarAccess.getVar_listAccess().getIdentifierAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_list__Group_1__1__Impl
	rule__Var_list__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVar_listAccess().getCommaKeyword_1_1()); }
	','
	{ after(grammarAccess.getVar_listAccess().getCommaKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var_list__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); }
		(rule__Var_list__VarsAssignment_1_2)
		{ after(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); }
	)
	(
		{ before(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); }
		(rule__Var_list__VarsAssignment_1_2)*
		{ after(grammarAccess.getVar_listAccess().getVarsAssignment_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atrib__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atrib__Group__0__Impl
	rule__Atrib__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); }
	(rule__Atrib__IdentifierAssignment_0)
	{ after(grammarAccess.getAtribAccess().getIdentifierAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atrib__Group__1__Impl
	rule__Atrib__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); }
	':='
	{ after(grammarAccess.getAtribAccess().getColonEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atrib__Group__2__Impl
	rule__Atrib__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtribAccess().getExpAssignment_2()); }
	(rule__Atrib__ExpAssignment_2)
	{ after(grammarAccess.getAtribAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atrib__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getAtribAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getValueAssignment_0()); }
	(rule__Expression__ValueAssignment_0)
	{ after(grammarAccess.getExpressionAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpAssignment_1()); }
	(rule__Expression__ExpAssignment_1)*
	{ after(grammarAccess.getExpressionAccess().getExpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecondExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondExp__Group__0__Impl
	rule__SecondExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondExpAccess().getOpAssignment_0()); }
	(rule__SecondExp__OpAssignment_0)
	{ after(grammarAccess.getSecondExpAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondExp__Group__1__Impl
	rule__SecondExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondExpAccess().getValueAssignment_1()); }
	(rule__SecondExp__ValueAssignment_1)
	{ after(grammarAccess.getSecondExpAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondExp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondExpAccess().getExpAssignment_2()); }
	(rule__SecondExp__ExpAssignment_2)*
	{ after(grammarAccess.getSecondExpAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pascal__HeadAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0()); }
		ruleprogram
		{ after(grammarAccess.getPascalAccess().getHeadProgramParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__DeclarationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0()); }
		rulevar_decl
		{ after(grammarAccess.getPascalAccess().getDeclarationsVar_declParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pascal__ScopeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0()); }
		ruleatrib
		{ after(grammarAccess.getPascalAccess().getScopeAtribParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__Var_listAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); }
		rulevar_list
		{ after(grammarAccess.getVar_declAccess().getVar_listVar_listParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_decl__TypeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); }
		ruleType
		{ after(grammarAccess.getVar_declAccess().getTypeTypeEnumRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__IdentifierAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__IdentifierAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getVar_listAccess().getIdentifierIDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var_list__VarsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0()); }
		rulevar_list
		{ after(grammarAccess.getVar_listAccess().getVarsVar_listParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__IdentifierAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAtribAccess().getIdentifierIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atrib__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0()); }
		ruleexpression
		{ after(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0()); }
		ruleSomeValue
		{ after(grammarAccess.getExpressionAccess().getValueSomeValueParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ExpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0()); }
		rulesecondExp
		{ after(grammarAccess.getExpressionAccess().getExpSecondExpParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0()); }
		ruleoperator
		{ after(grammarAccess.getSecondExpAccess().getOpOperatorParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0()); }
		ruleSomeValue
		{ after(grammarAccess.getSecondExpAccess().getValueSomeValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondExp__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0()); }
		rulesecondExp
		{ after(grammarAccess.getSecondExpAccess().getExpSecondExpParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
