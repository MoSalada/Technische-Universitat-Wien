/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.CpsmlTables;
import cpsml.WiredModule;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wired Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.WiredModuleImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.impl.WiredModuleImpl#getConnectOpposite <em>Connect Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WiredModuleImpl extends ConnectionModuleImpl implements WiredModule {
	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<WiredModule> connect;

	/**
	 * The cached value of the '{@link #getConnectOpposite() <em>Connect Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<WiredModule> connectOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiredModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.WIRED_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WiredModule> getConnect() {
		if (connect == null) {
			connect = new EObjectWithInverseResolvingEList.ManyInverse<WiredModule>(WiredModule.class, this,
					CpsmlPackage.WIRED_MODULE__CONNECT, CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WiredModule> getConnectOpposite() {
		if (connectOpposite == null) {
			connectOpposite = new EObjectWithInverseResolvingEList.ManyInverse<WiredModule>(WiredModule.class, this,
					CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE, CpsmlPackage.WIRED_MODULE__CONNECT);
		}
		return connectOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noConnectionToSelf_cS3b(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WiredModule::noConnectionToSelf_cS3b";
		try {
			/**
			 *
			 * inv noConnectionToSelf_cS3b:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.connect->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.WIRED_MODULE___NO_CONNECTION_TO_SELF_CS_3B__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<WiredModule> connect = this.getConnect();
				final /*@NonInvalid*/ OrderedSetValue BOXED_connect = idResolver
						.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_WiredModule, connect);
				final /*@NonInvalid*/ boolean result = CollectionExcludesOperation.INSTANCE
						.evaluate(BOXED_connect, this).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnect()).basicAdd(otherEnd, msgs);
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectOpposite()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return ((InternalEList<?>) getConnect()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return ((InternalEList<?>) getConnectOpposite()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return getConnect();
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return getConnectOpposite();
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			getConnect().clear();
			getConnect().addAll((Collection<? extends WiredModule>) newValue);
			return;
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			getConnectOpposite().addAll((Collection<? extends WiredModule>) newValue);
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			getConnect().clear();
			return;
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return connect != null && !connect.isEmpty();
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return connectOpposite != null && !connectOpposite.isEmpty();
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
		case CpsmlPackage.WIRED_MODULE___NO_CONNECTION_TO_SELF_CS_3B__DIAGNOSTICCHAIN_MAP:
			return noConnectionToSelf_cS3b((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WiredModuleImpl
