/**
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.block#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#getblock()
 * @model
 * @generated
 */
public interface block extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link edu.ufcg.compiladores.pascal.pascal.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#getblock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatements();

} // block
