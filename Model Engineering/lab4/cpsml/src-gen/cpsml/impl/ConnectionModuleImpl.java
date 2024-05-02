/**
 */
package cpsml.impl;

import cpsml.ConnectionModule;
import cpsml.CpsmlPackage;
import cpsml.CpsmlTables;
import cpsml.NamedElement;
import cpsml.Protocol;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;
import org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.ConnectionModuleImpl#getSupportedProtocols <em>Supported Protocols</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionModuleImpl extends NamedElementImpl implements ConnectionModule {
	/**
	 * The cached value of the '{@link #getSupportedProtocols() <em>Supported Protocols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> supportedProtocols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.CONNECTION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getSupportedProtocols() {
		if (supportedProtocols == null) {
			supportedProtocols = new EDataTypeUniqueEList<Protocol>(Protocol.class, this,
					CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS);
		}
		return supportedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean namingConvention_cS2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ConnectionModule::namingConvention_cS2";
		try {
			/**
			 *
			 * inv namingConvention_cS2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.name.substring(1,
			 *           self.oclContainer.oclAsType(NamedElement)
			 *           .name.size()) =
			 *         self.oclContainer.oclAsType(NamedElement)
			 *         .name.toUpper()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.CONNECTION_MODULE___NAMING_CONVENTION_CS2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_NamedElement_0 = idResolver
							.getClass(CpsmlTables.CLSSid_NamedElement, null);
					final /*@NonInvalid*/ Object oclContainer_0 = this.eContainer();
					final /*@Thrown*/ NamedElement oclAsType_0 = (NamedElement) OclAnyOclAsTypeOperation.INSTANCE
							.evaluate(executor, oclContainer_0, TYP_cpsml_c_c_NamedElement_0);
					final /*@Thrown*/ String name_1 = oclAsType_0.getName();
					final /*@NonInvalid*/ String name = this.getName();
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(name_1);
					if (size instanceof InvalidValueException) {
						throw (InvalidValueException) size;
					}
					final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(name,
							CpsmlTables.INT_1, size);
					final /*@Thrown*/ String toUpper = StringToUpperCaseOperation.INSTANCE.evaluate(name_1);
					final /*@Thrown*/ boolean result = substring.equals(toUpper);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			return getSupportedProtocols();
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
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			getSupportedProtocols().clear();
			getSupportedProtocols().addAll((Collection<? extends Protocol>) newValue);
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
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			getSupportedProtocols().clear();
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
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			return supportedProtocols != null && !supportedProtocols.isEmpty();
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
		case CpsmlPackage.CONNECTION_MODULE___NAMING_CONVENTION_CS2__DIAGNOSTICCHAIN_MAP:
			return namingConvention_cS2((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (supportedProtocols: ");
		result.append(supportedProtocols);
		result.append(')');
		return result.toString();
	}

} //ConnectionModuleImpl
