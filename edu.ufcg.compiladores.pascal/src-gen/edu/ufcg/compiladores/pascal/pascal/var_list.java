/**
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.var_list#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.var_list#getVar_list <em>Var list</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#getvar_list()
 * @model
 * @generated
 */
public interface var_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute list.
   * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#getvar_list_Identifier()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifier();

  /**
   * Returns the value of the '<em><b>Var list</b></em>' containment reference list.
   * The list contents are of type {@link edu.ufcg.compiladores.pascal.pascal.var_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var list</em>' containment reference list.
   * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#getvar_list_Var_list()
   * @model containment="true"
   * @generated
   */
  EList<var_list> getVar_list();

} // var_list