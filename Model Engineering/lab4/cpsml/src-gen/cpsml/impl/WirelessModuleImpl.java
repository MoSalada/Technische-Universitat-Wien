/**
 */
package cpsml.impl;

import cpsml.ConnectableElement;
import cpsml.CpsmlPackage;
import cpsml.CpsmlTables;
import cpsml.Position;
import cpsml.WirelessModule;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wireless Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getConnectOpposite <em>Connect Opposite</em>}</li>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WirelessModuleImpl extends ConnectionModuleImpl implements WirelessModule {
	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<WirelessModule> connect;

	/**
	 * The cached value of the '{@link #getConnectOpposite() <em>Connect Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<WirelessModule> connectOpposite;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final float RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected float range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WirelessModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.WIRELESS_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WirelessModule> getConnect() {
		if (connect == null) {
			connect = new EObjectWithInverseResolvingEList.ManyInverse<WirelessModule>(WirelessModule.class, this,
					CpsmlPackage.WIRELESS_MODULE__CONNECT, CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WirelessModule> getConnectOpposite() {
		if (connectOpposite == null) {
			connectOpposite = new EObjectWithInverseResolvingEList.ManyInverse<WirelessModule>(WirelessModule.class,
					this, CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE, CpsmlPackage.WIRELESS_MODULE__CONNECT);
		}
		return connectOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(float newRange) {
		float oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.WIRELESS_MODULE__RANGE, oldRange,
					range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noConnectionToSelf_cS3a(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WirelessModule::noConnectionToSelf_cS3a";
		try {
			/**
			 *
			 * inv noConnectionToSelf_cS3a:
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
					CpsmlPackage.Literals.WIRELESS_MODULE___NO_CONNECTION_TO_SELF_CS_3A__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<WirelessModule> connect = this.getConnect();
				final /*@NonInvalid*/ OrderedSetValue BOXED_connect = idResolver
						.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_WirelessModule, connect);
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
	public boolean rangePositive_cS4(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WirelessModule::rangePositive_cS4";
		try {
			/**
			 *
			 * inv rangePositive_cS4:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.range >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.WIRELESS_MODULE___RANGE_POSITIVE_CS4__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ float range = this.getRange();
				final /*@NonInvalid*/ RealValue BOXED_range = ValueUtil.realValueOf(range);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_range, CpsmlTables.INT_0).booleanValue();
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
	public boolean distancesWihtinRange_c4(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WirelessModule::distancesWihtinRange_c4";
		try {
			/**
			 *
			 * inv distancesWihtinRange_c4:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.connect->forAll(p |
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).x -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).x
			 *           ) *
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).x -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).x
			 *           ) +
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).y -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).y
			 *           ) *
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).y -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).y
			 *           ) +
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).z -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).z
			 *           ) *
			 *           (
			 *             self.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).z -
			 *             p.oclContainer.oclAsType(ConnectableElement)
			 *             .position.oclAsType(Position).z
			 *           ) <= (self.range *
			 *           self.range).min(p.range * p.range))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.WIRELESS_MODULE___DISTANCES_WIHTIN_RANGE_C4__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<WirelessModule> connect = this.getConnect();
					final /*@NonInvalid*/ OrderedSetValue BOXED_connect = idResolver
							.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_WirelessModule, connect);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_connect.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ WirelessModule p = (WirelessModule) ITERATOR_p.next();
						/**
						 *
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).x -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).x
						 * ) *
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).x -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).x
						 * ) +
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).y -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).y
						 * ) *
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).y -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).y
						 * ) +
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).z -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).z
						 * ) *
						 * (
						 *   self.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).z -
						 *   p.oclContainer.oclAsType(ConnectableElement)
						 *   .position.oclAsType(Position).z
						 * ) <= (self.range *
						 * self.range).min(p.range * p.range)
						 */
						/*@Caught*/ Object CAUGHT_le_0;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_ConnectableElement_10 = idResolver
									.getClass(CpsmlTables.CLSSid_ConnectableElement, null);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_Position_10 = idResolver
									.getClass(CpsmlTables.CLSSid_Position, null);
							final /*@NonInvalid*/ Object oclContainer_8 = p.eContainer();
							final /*@NonInvalid*/ Object oclContainer_7 = this.eContainer();
							final /*@NonInvalid*/ float range_2 = p.getRange();
							final /*@NonInvalid*/ float range_0 = this.getRange();
							final /*@NonInvalid*/ RealValue BOXED_range_2 = ValueUtil.realValueOf(range_2);
							final /*@NonInvalid*/ RealValue BOXED_range_0 = ValueUtil.realValueOf(range_0);
							final /*@Thrown*/ ConnectableElement oclAsType_17 = (ConnectableElement) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, oclContainer_8, TYP_cpsml_c_c_ConnectableElement_10);
							final /*@Thrown*/ ConnectableElement oclAsType_15 = (ConnectableElement) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, oclContainer_7, TYP_cpsml_c_c_ConnectableElement_10);
							final /*@Thrown*/ Position position_8 = oclAsType_17.getPosition();
							final /*@Thrown*/ Position position_7 = oclAsType_15.getPosition();
							final /*@Thrown*/ Position oclAsType_18 = (Position) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, position_8, TYP_cpsml_c_c_Position_10);
							final /*@Thrown*/ Position oclAsType_16 = (Position) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, position_7, TYP_cpsml_c_c_Position_10);
							final /*@Thrown*/ float x_2 = oclAsType_18.getX();
							final /*@Thrown*/ float x_1 = oclAsType_16.getX();
							final /*@Thrown*/ float y_2 = oclAsType_18.getY();
							final /*@Thrown*/ float y_1 = oclAsType_16.getY();
							final /*@Thrown*/ float z_2 = oclAsType_18.getZ();
							final /*@Thrown*/ float z_1 = oclAsType_16.getZ();
							final /*@Thrown*/ RealValue BOXED_x_2 = ValueUtil.realValueOf(x_2);
							final /*@Thrown*/ RealValue BOXED_y_2 = ValueUtil.realValueOf(y_2);
							final /*@Thrown*/ RealValue BOXED_z_2 = ValueUtil.realValueOf(z_2);
							final /*@Thrown*/ RealValue BOXED_x_1 = ValueUtil.realValueOf(x_1);
							final /*@Thrown*/ RealValue BOXED_y_1 = ValueUtil.realValueOf(y_1);
							final /*@Thrown*/ RealValue BOXED_z_1 = ValueUtil.realValueOf(z_1);
							if (BOXED_x_2 instanceof InvalidValueException) {
								throw (InvalidValueException) BOXED_x_2;
							}
							final /*@Thrown*/ RealValue diff_0 = NumericMinusOperation.INSTANCE.evaluate(BOXED_x_1,
									BOXED_x_2);
							if (BOXED_y_2 instanceof InvalidValueException) {
								throw (InvalidValueException) BOXED_y_2;
							}
							final /*@Thrown*/ RealValue diff_2 = NumericMinusOperation.INSTANCE.evaluate(BOXED_y_1,
									BOXED_y_2);
							if (BOXED_z_2 instanceof InvalidValueException) {
								throw (InvalidValueException) BOXED_z_2;
							}
							final /*@Thrown*/ RealValue diff_4 = NumericMinusOperation.INSTANCE.evaluate(BOXED_z_1,
									BOXED_z_2);
							if (diff_0 instanceof InvalidValueException) {
								throw (InvalidValueException) diff_0;
							}
							final /*@Thrown*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(diff_0, diff_0);
							if (diff_2 instanceof InvalidValueException) {
								throw (InvalidValueException) diff_2;
							}
							final /*@Thrown*/ RealValue prod_0 = NumericTimesOperation.INSTANCE.evaluate(diff_2,
									diff_2);
							if (prod_0 instanceof InvalidValueException) {
								throw (InvalidValueException) prod_0;
							}
							final /*@Thrown*/ RealValue sum = NumericPlusOperation.INSTANCE.evaluate(prod, prod_0);
							if (diff_4 instanceof InvalidValueException) {
								throw (InvalidValueException) diff_4;
							}
							final /*@Thrown*/ RealValue prod_1 = NumericTimesOperation.INSTANCE.evaluate(diff_4,
									diff_4);
							if (prod_1 instanceof InvalidValueException) {
								throw (InvalidValueException) prod_1;
							}
							final /*@Thrown*/ RealValue sum_0 = NumericPlusOperation.INSTANCE.evaluate(sum, prod_1);
							final /*@NonInvalid*/ RealValue prod_2 = NumericTimesOperation.INSTANCE
									.evaluate(BOXED_range_0, BOXED_range_0);
							final /*@NonInvalid*/ RealValue prod_3 = NumericTimesOperation.INSTANCE
									.evaluate(BOXED_range_2, BOXED_range_2);
							final /*@NonInvalid*/ RealValue min = NumericMinOperation.INSTANCE.evaluate(prod_2, prod_3);
							final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, sum_0, min).booleanValue();
							CAUGHT_le_0 = le_0;
						} catch (Exception e) {
							CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_le_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_le_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_le_0; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnect()).basicAdd(otherEnd, msgs);
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return ((InternalEList<?>) getConnect()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return getConnect();
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return getConnectOpposite();
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			return getRange();
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			getConnect().clear();
			getConnect().addAll((Collection<? extends WirelessModule>) newValue);
			return;
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			getConnectOpposite().addAll((Collection<? extends WirelessModule>) newValue);
			return;
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			setRange((Float) newValue);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			getConnect().clear();
			return;
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			return;
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			setRange(RANGE_EDEFAULT);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return connect != null && !connect.isEmpty();
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return connectOpposite != null && !connectOpposite.isEmpty();
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			return range != RANGE_EDEFAULT;
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
		case CpsmlPackage.WIRELESS_MODULE___NO_CONNECTION_TO_SELF_CS_3A__DIAGNOSTICCHAIN_MAP:
			return noConnectionToSelf_cS3a((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case CpsmlPackage.WIRELESS_MODULE___RANGE_POSITIVE_CS4__DIAGNOSTICCHAIN_MAP:
			return rangePositive_cS4((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case CpsmlPackage.WIRELESS_MODULE___DISTANCES_WIHTIN_RANGE_C4__DIAGNOSTICCHAIN_MAP:
			return distancesWihtinRange_c4((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //WirelessModuleImpl
