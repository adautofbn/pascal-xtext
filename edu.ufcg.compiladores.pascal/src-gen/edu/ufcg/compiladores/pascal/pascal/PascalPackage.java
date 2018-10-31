/**
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.pascal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufcg.compiladores.pascal.pascal.PascalFactory
 * @model kind="package"
 * @generated
 */
public interface PascalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pascal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufcg.edu/compiladores/pascal/Pascal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pascal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalPackage eINSTANCE = edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.PascalImpl <em>Pascal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalImpl
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getPascal()
   * @generated
   */
  int PASCAL = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Pascal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASCAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.programImpl <em>program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.impl.programImpl
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getprogram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The number of structural features of the '<em>program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.var_declImpl <em>var decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.impl.var_declImpl
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getvar_decl()
   * @generated
   */
  int VAR_DECL = 2;

  /**
   * The feature id for the '<em><b>Var list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VAR_LIST = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = 1;

  /**
   * The number of structural features of the '<em>var decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.var_listImpl <em>var list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.impl.var_listImpl
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getvar_list()
   * @generated
   */
  int VAR_LIST = 3;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_LIST__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Var list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_LIST__VAR_LIST = 1;

  /**
   * The number of structural features of the '<em>var list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.atribImpl <em>atrib</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.impl.atribImpl
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getatrib()
   * @generated
   */
  int ATRIB = 4;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIB__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIB__VALUE = 1;

  /**
   * The number of structural features of the '<em>atrib</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ufcg.compiladores.pascal.pascal.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ufcg.compiladores.pascal.pascal.Type
   * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getType()
   * @generated
   */
  int TYPE = 5;


  /**
   * Returns the meta object for class '{@link edu.ufcg.compiladores.pascal.pascal.Pascal <em>Pascal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pascal</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.Pascal
   * @generated
   */
  EClass getPascal();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ufcg.compiladores.pascal.pascal.Pascal#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.Pascal#getElement()
   * @see #getPascal()
   * @generated
   */
  EReference getPascal_Element();

  /**
   * Returns the meta object for class '{@link edu.ufcg.compiladores.pascal.pascal.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>program</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.program
   * @generated
   */
  EClass getprogram();

  /**
   * Returns the meta object for the attribute '{@link edu.ufcg.compiladores.pascal.pascal.program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.program#getName()
   * @see #getprogram()
   * @generated
   */
  EAttribute getprogram_Name();

  /**
   * Returns the meta object for class '{@link edu.ufcg.compiladores.pascal.pascal.var_decl <em>var decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>var decl</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_decl
   * @generated
   */
  EClass getvar_decl();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ufcg.compiladores.pascal.pascal.var_decl#getVar_list <em>Var list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var list</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_decl#getVar_list()
   * @see #getvar_decl()
   * @generated
   */
  EReference getvar_decl_Var_list();

  /**
   * Returns the meta object for the attribute list '{@link edu.ufcg.compiladores.pascal.pascal.var_decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_decl#getType()
   * @see #getvar_decl()
   * @generated
   */
  EAttribute getvar_decl_Type();

  /**
   * Returns the meta object for class '{@link edu.ufcg.compiladores.pascal.pascal.var_list <em>var list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>var list</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_list
   * @generated
   */
  EClass getvar_list();

  /**
   * Returns the meta object for the attribute list '{@link edu.ufcg.compiladores.pascal.pascal.var_list#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Identifier</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_list#getIdentifier()
   * @see #getvar_list()
   * @generated
   */
  EAttribute getvar_list_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ufcg.compiladores.pascal.pascal.var_list#getVar_list <em>Var list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var list</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.var_list#getVar_list()
   * @see #getvar_list()
   * @generated
   */
  EReference getvar_list_Var_list();

  /**
   * Returns the meta object for class '{@link edu.ufcg.compiladores.pascal.pascal.atrib <em>atrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>atrib</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.atrib
   * @generated
   */
  EClass getatrib();

  /**
   * Returns the meta object for the attribute '{@link edu.ufcg.compiladores.pascal.pascal.atrib#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.atrib#getIdentifier()
   * @see #getatrib()
   * @generated
   */
  EAttribute getatrib_Identifier();

  /**
   * Returns the meta object for the attribute '{@link edu.ufcg.compiladores.pascal.pascal.atrib#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.atrib#getValue()
   * @see #getatrib()
   * @generated
   */
  EAttribute getatrib_Value();

  /**
   * Returns the meta object for enum '{@link edu.ufcg.compiladores.pascal.pascal.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see edu.ufcg.compiladores.pascal.pascal.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PascalFactory getPascalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.PascalImpl <em>Pascal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalImpl
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getPascal()
     * @generated
     */
    EClass PASCAL = eINSTANCE.getPascal();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PASCAL__ELEMENT = eINSTANCE.getPascal_Element();

    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.programImpl <em>program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.impl.programImpl
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getprogram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getprogram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getprogram_Name();

    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.var_declImpl <em>var decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.impl.var_declImpl
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getvar_decl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getvar_decl();

    /**
     * The meta object literal for the '<em><b>Var list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VAR_LIST = eINSTANCE.getvar_decl_Var_list();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__TYPE = eINSTANCE.getvar_decl_Type();

    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.var_listImpl <em>var list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.impl.var_listImpl
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getvar_list()
     * @generated
     */
    EClass VAR_LIST = eINSTANCE.getvar_list();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_LIST__IDENTIFIER = eINSTANCE.getvar_list_Identifier();

    /**
     * The meta object literal for the '<em><b>Var list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_LIST__VAR_LIST = eINSTANCE.getvar_list_Var_list();

    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.impl.atribImpl <em>atrib</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.impl.atribImpl
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getatrib()
     * @generated
     */
    EClass ATRIB = eINSTANCE.getatrib();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIB__IDENTIFIER = eINSTANCE.getatrib_Identifier();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIB__VALUE = eINSTANCE.getatrib_Value();

    /**
     * The meta object literal for the '{@link edu.ufcg.compiladores.pascal.pascal.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ufcg.compiladores.pascal.pascal.Type
     * @see edu.ufcg.compiladores.pascal.pascal.impl.PascalPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //PascalPackage
