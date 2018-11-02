/**
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.pascal.impl;

import edu.ufcg.compiladores.pascal.pascal.Pascal;
import edu.ufcg.compiladores.pascal.pascal.PascalFactory;
import edu.ufcg.compiladores.pascal.pascal.PascalPackage;
import edu.ufcg.compiladores.pascal.pascal.Type;
import edu.ufcg.compiladores.pascal.pascal.atrib;
import edu.ufcg.compiladores.pascal.pascal.expression;
import edu.ufcg.compiladores.pascal.pascal.program;
import edu.ufcg.compiladores.pascal.pascal.secondExp;
import edu.ufcg.compiladores.pascal.pascal.var_decl;
import edu.ufcg.compiladores.pascal.pascal.var_list;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalPackageImpl extends EPackageImpl implements PascalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pascalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atribEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secondExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.ufcg.compiladores.pascal.pascal.PascalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PascalPackageImpl()
  {
    super(eNS_URI, PascalFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PascalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PascalPackage init()
  {
    if (isInited) return (PascalPackage)EPackage.Registry.INSTANCE.getEPackage(PascalPackage.eNS_URI);

    // Obtain or create and register package
    PascalPackageImpl thePascalPackage = (PascalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PascalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PascalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePascalPackage.createPackageContents();

    // Initialize created meta-data
    thePascalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePascalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PascalPackage.eNS_URI, thePascalPackage);
    return thePascalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPascal()
  {
    return pascalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPascal_Head()
  {
    return (EReference)pascalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPascal_Declarations()
  {
    return (EReference)pascalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPascal_Scope()
  {
    return (EReference)pascalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprogram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprogram_Name()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvar_decl()
  {
    return var_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar_decl_Var_list()
  {
    return (EReference)var_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvar_decl_Type()
  {
    return (EAttribute)var_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvar_list()
  {
    return var_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvar_list_Identifier()
  {
    return (EAttribute)var_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar_list_Vars()
  {
    return (EReference)var_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getatrib()
  {
    return atribEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getatrib_Identifier()
  {
    return (EAttribute)atribEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getatrib_Exp()
  {
    return (EReference)atribEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_Value()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Exp()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsecondExp()
  {
    return secondExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsecondExp_Op()
  {
    return (EAttribute)secondExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsecondExp_Value()
  {
    return (EAttribute)secondExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsecondExp_Exp()
  {
    return (EReference)secondExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactory getPascalFactory()
  {
    return (PascalFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pascalEClass = createEClass(PASCAL);
    createEReference(pascalEClass, PASCAL__HEAD);
    createEReference(pascalEClass, PASCAL__DECLARATIONS);
    createEReference(pascalEClass, PASCAL__SCOPE);

    programEClass = createEClass(PROGRAM);
    createEAttribute(programEClass, PROGRAM__NAME);

    var_declEClass = createEClass(VAR_DECL);
    createEReference(var_declEClass, VAR_DECL__VAR_LIST);
    createEAttribute(var_declEClass, VAR_DECL__TYPE);

    var_listEClass = createEClass(VAR_LIST);
    createEAttribute(var_listEClass, VAR_LIST__IDENTIFIER);
    createEReference(var_listEClass, VAR_LIST__VARS);

    atribEClass = createEClass(ATRIB);
    createEAttribute(atribEClass, ATRIB__IDENTIFIER);
    createEReference(atribEClass, ATRIB__EXP);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__VALUE);
    createEReference(expressionEClass, EXPRESSION__EXP);

    secondExpEClass = createEClass(SECOND_EXP);
    createEAttribute(secondExpEClass, SECOND_EXP__OP);
    createEAttribute(secondExpEClass, SECOND_EXP__VALUE);
    createEReference(secondExpEClass, SECOND_EXP__EXP);

    // Create enums
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(pascalEClass, Pascal.class, "Pascal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPascal_Head(), this.getprogram(), null, "head", null, 0, 1, Pascal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPascal_Declarations(), this.getvar_decl(), null, "declarations", null, 0, -1, Pascal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPascal_Scope(), this.getatrib(), null, "scope", null, 0, -1, Pascal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programEClass, program.class, "program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprogram_Name(), ecorePackage.getEString(), "name", null, 0, 1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_declEClass, var_decl.class, "var_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvar_decl_Var_list(), this.getvar_list(), null, "var_list", null, 0, -1, var_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvar_decl_Type(), this.getType(), "type", null, 0, -1, var_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_listEClass, var_list.class, "var_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvar_list_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, var_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvar_list_Vars(), this.getvar_list(), null, "vars", null, 0, -1, var_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atribEClass, atrib.class, "atrib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getatrib_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, atrib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getatrib_Exp(), this.getexpression(), null, "exp", null, 0, 1, atrib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getexpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_Exp(), this.getsecondExp(), null, "exp", null, 0, -1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(secondExpEClass, secondExp.class, "secondExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsecondExp_Op(), ecorePackage.getEString(), "op", null, 0, 1, secondExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsecondExp_Value(), ecorePackage.getEString(), "value", null, 0, 1, secondExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsecondExp_Exp(), this.getsecondExp(), null, "exp", null, 0, -1, secondExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.BOOLEAN);
    addEEnumLiteral(typeEEnum, Type.INTEGER);
    addEEnumLiteral(typeEEnum, Type.STRING);

    // Create resource
    createResource(eNS_URI);
  }

} //PascalPackageImpl
