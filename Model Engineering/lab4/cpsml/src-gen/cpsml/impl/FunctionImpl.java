/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.CpsmlTables;
import cpsml.DataType;
import cpsml.Function;
import cpsml.Parameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.FunctionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link cpsml.impl.FunctionImpl#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link cpsml.impl.FunctionImpl#isHasReturn <em>Has Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NamedElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType RETURN_DATA_TYPE_EDEFAULT = DataType.NULL;

	/**
	 * The cached value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnDataType = RETURN_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasReturn() <em>Has Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RETURN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasReturn() <em>Has Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturn()
	 * @generated
	 * @ordered
	 */
	protected boolean hasReturn = HAS_RETURN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, CpsmlPackage.FUNCTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnDataType() {
		return returnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDataType(DataType newReturnDataType) {
		DataType oldReturnDataType = returnDataType;
		returnDataType = newReturnDataType == null ? RETURN_DATA_TYPE_EDEFAULT : newReturnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.FUNCTION__RETURN_DATA_TYPE,
					oldReturnDataType, returnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasReturn() {
		return hasReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReturn(boolean newHasReturn) {
		boolean oldHasReturn = hasReturn;
		hasReturn = newHasReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.FUNCTION__HAS_RETURN, oldHasReturn,
					hasReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean returnAndNotNull_c3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Function::returnAndNotNull_c3";
		try {
			/**
			 *
			 * inv returnAndNotNull_c3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.hasReturn implies returnDataType <> DataType::NULL
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.FUNCTION___RETURN_AND_NOT_NULL_C3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ boolean hasReturn = this.isHasReturn();
				final /*@NonInvalid*/ Boolean result;
				if (!hasReturn) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ DataType returnDataType = this.getReturnDataType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_returnDataType = returnDataType == null ? null
							: CpsmlTables.ENUMid_DataType
									.getEnumerationLiteralId(ClassUtil.nonNullState(returnDataType.getName()));
					final /*@NonInvalid*/ boolean ne = BOXED_returnDataType != CpsmlTables.ELITid_NULL;
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, CpsmlTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sensorRequiresReturn_c3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Function::sensorRequiresReturn_c3";
		try {
			/**
			 *
			 * inv sensorRequiresReturn_c3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.oclContainer.oclIsTypeOf(Sensor) implies hasReturn
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.FUNCTION___SENSOR_REQUIRES_RETURN_C3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_oclIsTypeOf;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_Sensor = idResolver
								.getClass(CpsmlTables.CLSSid_Sensor, null);
						final /*@NonInvalid*/ Object oclContainer = this.eContainer();
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, oclContainer, TYP_cpsml_c_c_Sensor).booleanValue();
						CAUGHT_oclIsTypeOf = oclIsTypeOf;
					} catch (Exception e) {
						CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_oclIsTypeOf == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean hasReturn = this.isHasReturn();
						if (hasReturn) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_oclIsTypeOf;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, CpsmlTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			return getParameter();
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			return getReturnDataType();
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			return isHasReturn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			setReturnDataType((DataType) newValue);
			return;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			setHasReturn((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			getParameter().clear();
			return;
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			setReturnDataType(RETURN_DATA_TYPE_EDEFAULT);
			return;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			setHasReturn(HAS_RETURN_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			return returnDataType != RETURN_DATA_TYPE_EDEFAULT;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			return hasReturn != HAS_RETURN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CpsmlPackage.FUNCTION___RETURN_AND_NOT_NULL_C3__DIAGNOSTICCHAIN_MAP:
			return returnAndNotNull_c3((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case CpsmlPackage.FUNCTION___SENSOR_REQUIRES_RETURN_C3__DIAGNOSTICCHAIN_MAP:
			return sensorRequiresReturn_c3((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnDataType: ");
		result.append(returnDataType);
		result.append(", hasReturn: ");
		result.append(hasReturn);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
