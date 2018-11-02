/**
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.pascal.impl;

import edu.ufcg.compiladores.pascal.pascal.PascalPackage;
import edu.ufcg.compiladores.pascal.pascal.rel_expression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rel expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.impl.rel_expressionImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.impl.rel_expressionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.impl.rel_expressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.impl.rel_expressionImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link edu.ufcg.compiladores.pascal.pascal.impl.rel_expressionImpl#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class rel_expressionImpl extends expressionImpl implements rel_expression
{
  /**
   * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected static final String OPEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected String open = OPEN_EDEFAULT;

  /**
   * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected static final String FIRST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected String first = FIRST_EDEFAULT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final String SECOND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected String second = SECOND_EDEFAULT;

  /**
   * The default value of the '{@link #getClose() <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClose()
   * @generated
   * @ordered
   */
  protected static final String CLOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClose() <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClose()
   * @generated
   * @ordered
   */
  protected String close = CLOSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rel_expressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.REL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpen()
  {
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpen(String newOpen)
  {
    String oldOpen = open;
    open = newOpen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REL_EXPRESSION__OPEN, oldOpen, open));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(String newFirst)
  {
    String oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REL_EXPRESSION__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REL_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(String newSecond)
  {
    String oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REL_EXPRESSION__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClose()
  {
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClose(String newClose)
  {
    String oldClose = close;
    close = newClose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REL_EXPRESSION__CLOSE, oldClose, close));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.REL_EXPRESSION__OPEN:
        return getOpen();
      case PascalPackage.REL_EXPRESSION__FIRST:
        return getFirst();
      case PascalPackage.REL_EXPRESSION__OP:
        return getOp();
      case PascalPackage.REL_EXPRESSION__SECOND:
        return getSecond();
      case PascalPackage.REL_EXPRESSION__CLOSE:
        return getClose();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.REL_EXPRESSION__OPEN:
        setOpen((String)newValue);
        return;
      case PascalPackage.REL_EXPRESSION__FIRST:
        setFirst((String)newValue);
        return;
      case PascalPackage.REL_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case PascalPackage.REL_EXPRESSION__SECOND:
        setSecond((String)newValue);
        return;
      case PascalPackage.REL_EXPRESSION__CLOSE:
        setClose((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.REL_EXPRESSION__OPEN:
        setOpen(OPEN_EDEFAULT);
        return;
      case PascalPackage.REL_EXPRESSION__FIRST:
        setFirst(FIRST_EDEFAULT);
        return;
      case PascalPackage.REL_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case PascalPackage.REL_EXPRESSION__SECOND:
        setSecond(SECOND_EDEFAULT);
        return;
      case PascalPackage.REL_EXPRESSION__CLOSE:
        setClose(CLOSE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.REL_EXPRESSION__OPEN:
        return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT.equals(open);
      case PascalPackage.REL_EXPRESSION__FIRST:
        return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
      case PascalPackage.REL_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case PascalPackage.REL_EXPRESSION__SECOND:
        return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
      case PascalPackage.REL_EXPRESSION__CLOSE:
        return CLOSE_EDEFAULT == null ? close != null : !CLOSE_EDEFAULT.equals(close);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (open: ");
    result.append(open);
    result.append(", first: ");
    result.append(first);
    result.append(", op: ");
    result.append(op);
    result.append(", second: ");
    result.append(second);
    result.append(", close: ");
    result.append(close);
    result.append(')');
    return result.toString();
  }

} //rel_expressionImpl