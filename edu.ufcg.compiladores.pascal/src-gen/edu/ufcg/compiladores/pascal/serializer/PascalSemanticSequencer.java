/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.serializer;

import com.google.inject.Inject;
import edu.ufcg.compiladores.pascal.pascal.Pascal;
import edu.ufcg.compiladores.pascal.pascal.PascalPackage;
import edu.ufcg.compiladores.pascal.pascal.arit_expression;
import edu.ufcg.compiladores.pascal.pascal.atrib;
import edu.ufcg.compiladores.pascal.pascal.block;
import edu.ufcg.compiladores.pascal.pascal.program;
import edu.ufcg.compiladores.pascal.pascal.rel_expression;
import edu.ufcg.compiladores.pascal.pascal.repetitive_arit_expression;
import edu.ufcg.compiladores.pascal.pascal.statement;
import edu.ufcg.compiladores.pascal.pascal.var_block;
import edu.ufcg.compiladores.pascal.pascal.var_decl;
import edu.ufcg.compiladores.pascal.pascal.var_list;
import edu.ufcg.compiladores.pascal.services.PascalGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PascalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PascalPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PascalPackage.PASCAL:
				sequence_Pascal(context, (Pascal) semanticObject); 
				return; 
			case PascalPackage.ARIT_EXPRESSION:
				sequence_arit_expression(context, (arit_expression) semanticObject); 
				return; 
			case PascalPackage.ATRIB:
				sequence_atrib(context, (atrib) semanticObject); 
				return; 
			case PascalPackage.BLOCK:
				sequence_block(context, (block) semanticObject); 
				return; 
			case PascalPackage.PROGRAM:
				sequence_program(context, (program) semanticObject); 
				return; 
			case PascalPackage.REL_EXPRESSION:
				sequence_rel_expression(context, (rel_expression) semanticObject); 
				return; 
			case PascalPackage.REPETITIVE_ARIT_EXPRESSION:
				sequence_repetitive_arit_expression(context, (repetitive_arit_expression) semanticObject); 
				return; 
			case PascalPackage.STATEMENT:
				sequence_statement(context, (statement) semanticObject); 
				return; 
			case PascalPackage.VAR_BLOCK:
				sequence_var_block(context, (var_block) semanticObject); 
				return; 
			case PascalPackage.VAR_DECL:
				sequence_var_decl(context, (var_decl) semanticObject); 
				return; 
			case PascalPackage.VAR_LIST:
				sequence_var_list(context, (var_list) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Pascal returns Pascal
	 *
	 * Constraint:
	 *     (head=program declarations+=var_block* scope+=block*)
	 */
	protected void sequence_Pascal(ISerializationContext context, Pascal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expression returns arit_expression
	 *     arit_expression returns arit_expression
	 *
	 * Constraint:
	 *     (value=some_value exp+=repetitive_arit_expression*)
	 */
	protected void sequence_arit_expression(ISerializationContext context, arit_expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     atrib returns atrib
	 *
	 * Constraint:
	 *     (var_id=ID exp=expression)
	 */
	protected void sequence_atrib(ISerializationContext context, atrib semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ATRIB__VAR_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ATRIB__VAR_ID));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ATRIB__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ATRIB__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtribAccess().getVar_idIDTerminalRuleCall_0_0(), semanticObject.getVar_id());
		feeder.accept(grammarAccess.getAtribAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     block returns block
	 *
	 * Constraint:
	 *     statements+=statement
	 */
	protected void sequence_block(ISerializationContext context, block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     program returns program
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_program(ISerializationContext context, program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     expression returns rel_expression
	 *     rel_expression returns rel_expression
	 *
	 * Constraint:
	 *     (open=open_par first=some_value op=rel_op second=some_value close=close_par)
	 */
	protected void sequence_rel_expression(ISerializationContext context, rel_expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REL_EXPRESSION__OPEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REL_EXPRESSION__OPEN));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REL_EXPRESSION__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REL_EXPRESSION__FIRST));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REL_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REL_EXPRESSION__OP));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REL_EXPRESSION__SECOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REL_EXPRESSION__SECOND));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REL_EXPRESSION__CLOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REL_EXPRESSION__CLOSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRel_expressionAccess().getOpenOpen_parParserRuleCall_0_0(), semanticObject.getOpen());
		feeder.accept(grammarAccess.getRel_expressionAccess().getFirstSome_valueParserRuleCall_1_0(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getRel_expressionAccess().getOpRel_opParserRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getRel_expressionAccess().getSecondSome_valueParserRuleCall_3_0(), semanticObject.getSecond());
		feeder.accept(grammarAccess.getRel_expressionAccess().getCloseClose_parParserRuleCall_4_0(), semanticObject.getClose());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     repetitive_arit_expression returns repetitive_arit_expression
	 *
	 * Constraint:
	 *     (op=arit_op value=some_value exp+=repetitive_arit_expression*)
	 */
	protected void sequence_repetitive_arit_expression(ISerializationContext context, repetitive_arit_expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     statement returns statement
	 *
	 * Constraint:
	 *     atrib_block+=atrib+
	 */
	protected void sequence_statement(ISerializationContext context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     var_block returns var_block
	 *
	 * Constraint:
	 *     (var_statements+=var_decl | var_statements+=var_list)+
	 */
	protected void sequence_var_block(ISerializationContext context, var_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     var_decl returns var_decl
	 *
	 * Constraint:
	 *     (var_id=ID var_type=type value=some_value?)
	 */
	protected void sequence_var_decl(ISerializationContext context, var_decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     var_list returns var_list
	 *
	 * Constraint:
	 *     (var_id=ID var_ids+=ID* var_type=type)
	 */
	protected void sequence_var_list(ISerializationContext context, var_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
