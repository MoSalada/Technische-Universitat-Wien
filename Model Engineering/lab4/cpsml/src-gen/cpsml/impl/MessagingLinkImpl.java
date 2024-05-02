/**
 */
package cpsml.impl;

import cpsml.Component;
import cpsml.ConnectionModule;
import cpsml.Controller;
import cpsml.CpsmlPackage;
import cpsml.CpsmlTables;
import cpsml.MessageBroker;
import cpsml.MessagingLink;

import cpsml.Node;
import cpsml.WiredModule;
import cpsml.WirelessModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messaging Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.MessagingLinkImpl#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link cpsml.impl.MessagingLinkImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagingLinkImpl extends MinimalEObjectImpl.Container implements MessagingLink {
	/**
	 * The cached value of the '{@link #getMessageBroker() <em>Message Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBroker()
	 * @generated
	 * @ordered
	 */
	protected MessageBroker messageBroker;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> topics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagingLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.MESSAGING_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker getMessageBroker() {
		if (messageBroker != null && messageBroker.eIsProxy()) {
			InternalEObject oldMessageBroker = (InternalEObject) messageBroker;
			messageBroker = (MessageBroker) eResolveProxy(oldMessageBroker);
			if (messageBroker != oldMessageBroker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER, oldMessageBroker, messageBroker));
			}
		}
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker basicGetMessageBroker() {
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageBroker(MessageBroker newMessageBroker) {
		MessageBroker oldMessageBroker = messageBroker;
		messageBroker = newMessageBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER,
					oldMessageBroker, messageBroker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTopics() {
		if (topics == null) {
			topics = new EDataTypeUniqueEList<String>(String.class, this, CpsmlPackage.MESSAGING_LINK__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean messagingElementConnectedToMB_c2(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "MessagingLink::messagingElementConnectedToMB_c2";
		try {
			/**
			 *
			 * inv messagingElementConnectedToMB_c2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.oclContainer.oclIsTypeOf(Node)
			 *         then
			 *           self.oclContainer.oclAsType(Node)
			 *           .connectionModule->exists(cM |
			 *             (
			 *               cM.oclIsTypeOf(WiredModule) implies
			 *               cM.oclAsType(WiredModule)
			 *               .connect->exists(c | c.oclContainer = self.messageBroker) or
			 *               cM.oclAsType(WiredModule)
			 *               .connectOpposite->exists(c | c.oclContainer = self.messageBroker)
			 *             ) and
			 *             (
			 *               cM.oclIsTypeOf(WirelessModule) implies
			 *               cM.oclAsType(WirelessModule)
			 *               .connect->exists(c | c.oclContainer = self.messageBroker) or
			 *               cM.oclAsType(WirelessModule)
			 *               .connectOpposite->exists(c | c.oclContainer = self.messageBroker)
			 *             ))
			 *         else true
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.MESSAGING_LINK___MESSAGING_ELEMENT_CONNECTED_TO_MB_C2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_Node = idResolver
							.getClass(CpsmlTables.CLSSid_Node, null);
					final /*@NonInvalid*/ Object oclContainer = this.eContainer();
					final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, oclContainer, TYP_cpsml_c_c_Node).booleanValue();
					/*@Thrown*/ Boolean result;
					if (oclIsTypeOf) {
						final /*@Thrown*/ Node oclAsType = (Node) OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor,
								oclContainer, TYP_cpsml_c_c_Node);
						final /*@Thrown*/ List<ConnectionModule> connectionModule = oclAsType.getConnectionModule();
						final /*@Thrown*/ OrderedSetValue BOXED_connectionModule = idResolver
								.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_ConnectionModule, connectionModule);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_cM = BOXED_connectionModule.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_cM.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ ConnectionModule cM = (ConnectionModule) ITERATOR_cM.next();
							/**
							 *
							 * (
							 *   cM.oclIsTypeOf(WiredModule) implies
							 *   cM.oclAsType(WiredModule)
							 *   .connect->exists(c | c.oclContainer = self.messageBroker) or
							 *   cM.oclAsType(WiredModule)
							 *   .connectOpposite->exists(c | c.oclContainer = self.messageBroker)
							 * ) and
							 * (
							 *   cM.oclIsTypeOf(WirelessModule) implies
							 *   cM.oclAsType(WirelessModule)
							 *   .connect->exists(c | c.oclContainer = self.messageBroker) or
							 *   cM.oclAsType(WirelessModule)
							 *   .connectOpposite->exists(c | c.oclContainer = self.messageBroker)
							 * )
							 */
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_implies;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_WiredModule = idResolver
											.getClass(CpsmlTables.CLSSid_WiredModule, null);
									final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
											.evaluate(executor, cM, TYP_cpsml_c_c_WiredModule).booleanValue();
									final /*@Thrown*/ Boolean implies;
									if (!oclIsTypeOf_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_or;
										try {
											/*@Caught*/ Object CAUGHT_exists_0;
											try {
												final /*@Thrown*/ WiredModule oclAsType_0 = (WiredModule) OclAnyOclAsTypeOperation.INSTANCE
														.evaluate(executor, cM, TYP_cpsml_c_c_WiredModule);
												final /*@Thrown*/ List<WiredModule> connect = oclAsType_0.getConnect();
												final /*@Thrown*/ OrderedSetValue BOXED_connect = idResolver
														.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_WiredModule,
																connect);
												/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
												Iterator<Object> ITERATOR_c = BOXED_connect.iterator();
												/*@Thrown*/ Boolean exists_0;
												while (true) {
													if (!ITERATOR_c.hasNext()) {
														if (accumulator_0 == ValueUtil.FALSE_VALUE) {
															exists_0 = ValueUtil.FALSE_VALUE;
														} else {
															throw (InvalidValueException) accumulator_0;
														}
														break;
													}
													/*@NonInvalid*/ WiredModule c = (WiredModule) ITERATOR_c.next();
													/**
													 * c.oclContainer = self.messageBroker
													 */
													final /*@NonInvalid*/ Object oclContainer_1 = c.eContainer();
													final /*@NonInvalid*/ MessageBroker messageBroker = this
															.getMessageBroker();
													final /*@NonInvalid*/ boolean eq = messageBroker
															.equals(oclContainer_1);
													//
													if (eq) { // Normal successful body evaluation result
														exists_0 = ValueUtil.TRUE_VALUE;
														break; // Stop immediately
													} else if (!eq) { // Normal unsuccessful body evaluation result
														; // Carry on
													} else { // Impossible badly typed result
														accumulator_0 = new InvalidValueException(
																PivotMessages.NonBooleanBody, "exists");
													}
												}
												CAUGHT_exists_0 = exists_0;
											} catch (Exception e) {
												CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean or;
											if (CAUGHT_exists_0 == ValueUtil.TRUE_VALUE) {
												or = ValueUtil.TRUE_VALUE;
											} else {
												/*@Caught*/ Object CAUGHT_exists_1;
												try {
													final /*@Thrown*/ WiredModule oclAsType_1 = (WiredModule) OclAnyOclAsTypeOperation.INSTANCE
															.evaluate(executor, cM, TYP_cpsml_c_c_WiredModule);
													final /*@Thrown*/ List<WiredModule> connectOpposite = oclAsType_1
															.getConnectOpposite();
													final /*@Thrown*/ OrderedSetValue BOXED_connectOpposite = idResolver
															.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_WiredModule,
																	connectOpposite);
													/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
													Iterator<Object> ITERATOR_c_0 = BOXED_connectOpposite.iterator();
													/*@Thrown*/ Boolean exists_1;
													while (true) {
														if (!ITERATOR_c_0.hasNext()) {
															if (accumulator_1 == ValueUtil.FALSE_VALUE) {
																exists_1 = ValueUtil.FALSE_VALUE;
															} else {
																throw (InvalidValueException) accumulator_1;
															}
															break;
														}
														/*@NonInvalid*/ WiredModule c_0 = (WiredModule) ITERATOR_c_0
																.next();
														/**
														 * c.oclContainer = self.messageBroker
														 */
														final /*@NonInvalid*/ Object oclContainer_2 = c_0.eContainer();
														final /*@NonInvalid*/ MessageBroker messageBroker_0 = this
																.getMessageBroker();
														final /*@NonInvalid*/ boolean eq_0 = messageBroker_0
																.equals(oclContainer_2);
														//
														if (eq_0) { // Normal successful body evaluation result
															exists_1 = ValueUtil.TRUE_VALUE;
															break; // Stop immediately
														} else if (!eq_0) { // Normal unsuccessful body evaluation result
															; // Carry on
														} else { // Impossible badly typed result
															accumulator_1 = new InvalidValueException(
																	PivotMessages.NonBooleanBody, "exists");
														}
													}
													CAUGHT_exists_1 = exists_1;
												} catch (Exception e) {
													CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_exists_1 == ValueUtil.TRUE_VALUE) {
													or = ValueUtil.TRUE_VALUE;
												} else {
													if (CAUGHT_exists_0 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_exists_0;
													}
													if (CAUGHT_exists_1 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_exists_1;
													}
													if ((CAUGHT_exists_0 == null) || (CAUGHT_exists_1 == null)) {
														or = null;
													} else {
														or = ValueUtil.FALSE_VALUE;
													}
												}
											}
											CAUGHT_or = or;
										} catch (Exception e) {
											CAUGHT_or = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_or instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_or;
											}
											if (CAUGHT_or == null) {
												implies = null;
											} else {
												implies = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_implies = implies;
								} catch (Exception e) {
									CAUGHT_implies = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_implies_0;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_WirelessModule = idResolver
												.getClass(CpsmlTables.CLSSid_WirelessModule, null);
										final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE
												.evaluate(executor, cM, TYP_cpsml_c_c_WirelessModule).booleanValue();
										final /*@Thrown*/ Boolean implies_0;
										if (!oclIsTypeOf_1) {
											implies_0 = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_or_0;
											try {
												/*@Caught*/ Object CAUGHT_exists_2;
												try {
													final /*@Thrown*/ WirelessModule oclAsType_2 = (WirelessModule) OclAnyOclAsTypeOperation.INSTANCE
															.evaluate(executor, cM, TYP_cpsml_c_c_WirelessModule);
													final /*@Thrown*/ List<WirelessModule> connect_0 = oclAsType_2
															.getConnect();
													final /*@Thrown*/ OrderedSetValue BOXED_connect_0 = idResolver
															.createOrderedSetOfAll(
																	CpsmlTables.ORD_CLSSid_WirelessModule, connect_0);
													/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
													Iterator<Object> ITERATOR_c_1 = BOXED_connect_0.iterator();
													/*@Thrown*/ Boolean exists_2;
													while (true) {
														if (!ITERATOR_c_1.hasNext()) {
															if (accumulator_2 == ValueUtil.FALSE_VALUE) {
																exists_2 = ValueUtil.FALSE_VALUE;
															} else {
																throw (InvalidValueException) accumulator_2;
															}
															break;
														}
														/*@NonInvalid*/ WirelessModule c_1 = (WirelessModule) ITERATOR_c_1
																.next();
														/**
														 * c.oclContainer = self.messageBroker
														 */
														final /*@NonInvalid*/ Object oclContainer_3 = c_1.eContainer();
														final /*@NonInvalid*/ MessageBroker messageBroker_1 = this
																.getMessageBroker();
														final /*@NonInvalid*/ boolean eq_1 = messageBroker_1
																.equals(oclContainer_3);
														//
														if (eq_1) { // Normal successful body evaluation result
															exists_2 = ValueUtil.TRUE_VALUE;
															break; // Stop immediately
														} else if (!eq_1) { // Normal unsuccessful body evaluation result
															; // Carry on
														} else { // Impossible badly typed result
															accumulator_2 = new InvalidValueException(
																	PivotMessages.NonBooleanBody, "exists");
														}
													}
													CAUGHT_exists_2 = exists_2;
												} catch (Exception e) {
													CAUGHT_exists_2 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean or_0;
												if (CAUGHT_exists_2 == ValueUtil.TRUE_VALUE) {
													or_0 = ValueUtil.TRUE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_exists_3;
													try {
														final /*@Thrown*/ WirelessModule oclAsType_3 = (WirelessModule) OclAnyOclAsTypeOperation.INSTANCE
																.evaluate(executor, cM, TYP_cpsml_c_c_WirelessModule);
														final /*@Thrown*/ List<WirelessModule> connectOpposite_0 = oclAsType_3
																.getConnectOpposite();
														final /*@Thrown*/ OrderedSetValue BOXED_connectOpposite_0 = idResolver
																.createOrderedSetOfAll(
																		CpsmlTables.ORD_CLSSid_WirelessModule,
																		connectOpposite_0);
														/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
														Iterator<Object> ITERATOR_c_2 = BOXED_connectOpposite_0
																.iterator();
														/*@Thrown*/ Boolean exists_3;
														while (true) {
															if (!ITERATOR_c_2.hasNext()) {
																if (accumulator_3 == ValueUtil.FALSE_VALUE) {
																	exists_3 = ValueUtil.FALSE_VALUE;
																} else {
																	throw (InvalidValueException) accumulator_3;
																}
																break;
															}
															/*@NonInvalid*/ WirelessModule c_2 = (WirelessModule) ITERATOR_c_2
																	.next();
															/**
															 * c.oclContainer = self.messageBroker
															 */
															final /*@NonInvalid*/ Object oclContainer_4 = c_2
																	.eContainer();
															final /*@NonInvalid*/ MessageBroker messageBroker_2 = this
																	.getMessageBroker();
															final /*@NonInvalid*/ boolean eq_2 = messageBroker_2
																	.equals(oclContainer_4);
															//
															if (eq_2) { // Normal successful body evaluation result
																exists_3 = ValueUtil.TRUE_VALUE;
																break; // Stop immediately
															} else if (!eq_2) { // Normal unsuccessful body evaluation result
																; // Carry on
															} else { // Impossible badly typed result
																accumulator_3 = new InvalidValueException(
																		PivotMessages.NonBooleanBody, "exists");
															}
														}
														CAUGHT_exists_3 = exists_3;
													} catch (Exception e) {
														CAUGHT_exists_3 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_exists_3 == ValueUtil.TRUE_VALUE) {
														or_0 = ValueUtil.TRUE_VALUE;
													} else {
														if (CAUGHT_exists_2 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_exists_2;
														}
														if (CAUGHT_exists_3 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_exists_3;
														}
														if ((CAUGHT_exists_2 == null) || (CAUGHT_exists_3 == null)) {
															or_0 = null;
														} else {
															or_0 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_or_0 = or_0;
											} catch (Exception e) {
												CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
												implies_0 = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_or_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_or_0;
												}
												if (CAUGHT_or_0 == null) {
													implies_0 = null;
												} else {
													implies_0 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_implies_0 = implies_0;
									} catch (Exception e) {
										CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_implies instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_implies;
										}
										if (CAUGHT_implies_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_implies_0;
										}
										if ((CAUGHT_implies == null) || (CAUGHT_implies_0 == null)) {
											and = null;
										} else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_and; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						result = exists;
					} else {
						result = ValueUtil.TRUE_VALUE;
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
	public boolean commonTopicsWithMB_cS1b(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "MessagingLink::commonTopicsWithMB_cS1b";
		try {
			/**
			 *
			 * inv commonTopicsWithMB_cS1b:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.oclContainer.oclIsTypeOf(Node)
			 *         then
			 *           self.topics->forAll(t1 |
			 *             self.oclContainer.oclAsType(Node)
			 *             .component.topic->exists(t2 | t1 = t2))
			 *         else
			 *           self.topics->forAll(t1 |
			 *             self.oclContainer.oclAsType(Controller)
			 *             .topics->exists(t2 | t1 = t2))
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.MESSAGING_LINK___COMMON_TOPICS_WITH_MB_CS_1B__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_Node_0 = idResolver
							.getClass(CpsmlTables.CLSSid_Node, null);
					final /*@NonInvalid*/ Object oclContainer = this.eContainer();
					final /*@NonInvalid*/ List<String> topics_0 = this.getTopics();
					final /*@NonInvalid*/ OrderedSetValue BOXED_topics_0 = idResolver
							.createOrderedSetOfAll(CpsmlTables.ORD_PRIMid_String, topics_0);
					final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, oclContainer, TYP_cpsml_c_c_Node_0).booleanValue();
					/*@Thrown*/ Boolean result;
					if (oclIsTypeOf) {
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_t1 = BOXED_topics_0.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_t1.hasNext()) {
								if (accumulator == null) {
									forAll = null;
								} else if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ String t1 = (String) ITERATOR_t1.next();
							/**
							 * self.oclContainer.oclAsType(Node).component.topic->exists(t2 | t1 = t2)
							 */
							/*@Caught*/ Object CAUGHT_exists;
							try {
								final /*@Thrown*/ Node oclAsType = (Node) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, oclContainer, TYP_cpsml_c_c_Node_0);
								final /*@Thrown*/ List<Component> component = oclAsType.getComponent();
								final /*@Thrown*/ OrderedSetValue BOXED_component = idResolver
										.createOrderedSetOfAll(CpsmlTables.ORD_CLSSid_Component, component);
								/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
										.createSequenceAccumulatorValue(CpsmlTables.SEQ_PRIMid_String);
								Iterator<Object> ITERATOR__1 = BOXED_component.iterator();
								/*@Thrown*/ SequenceValue collect;
								while (true) {
									if (!ITERATOR__1.hasNext()) {
										collect = accumulator_0;
										break;
									}
									/*@NonInvalid*/ Component _1 = (Component) ITERATOR__1.next();
									/**
									 * topic
									 */
									final /*@NonInvalid*/ String topic = _1.getTopic();
									//
									accumulator_0.add(topic);
								}
								/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_t2 = collect.iterator();
								/*@Thrown*/ Boolean exists;
								while (true) {
									if (!ITERATOR_t2.hasNext()) {
										if (accumulator_1 == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_1;
										}
										break;
									}
									/*@NonInvalid*/ String t2 = (String) ITERATOR_t2.next();
									/**
									 * t1 = t2
									 */
									final /*@NonInvalid*/ boolean eq = t1.equals(t2);
									//
									if (eq) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!eq) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								CAUGHT_exists = exists;
							} catch (Exception e) {
								CAUGHT_exists = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_exists == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.TRUE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_exists instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_exists; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						result = forAll;
					} else {
						/*@Thrown*/ Object accumulator_2 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_t1_0 = BOXED_topics_0.iterator();
						/*@Thrown*/ Boolean forAll_0;
						while (true) {
							if (!ITERATOR_t1_0.hasNext()) {
								if (accumulator_2 == null) {
									forAll_0 = null;
								} else if (accumulator_2 == ValueUtil.TRUE_VALUE) {
									forAll_0 = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_2;
								}
								break;
							}
							/*@NonInvalid*/ String t1_0 = (String) ITERATOR_t1_0.next();
							/**
							 * self.oclContainer.oclAsType(Controller).topics->exists(t2 | t1 = t2)
							 */
							/*@Caught*/ Object CAUGHT_exists_0;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cpsml_c_c_Controller = idResolver
										.getClass(CpsmlTables.CLSSid_Controller, null);
								final /*@Thrown*/ Controller oclAsType_0 = (Controller) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, oclContainer, TYP_cpsml_c_c_Controller);
								final /*@Thrown*/ List<String> topics_1 = oclAsType_0.getTopics();
								final /*@Thrown*/ OrderedSetValue BOXED_topics_1 = idResolver
										.createOrderedSetOfAll(CpsmlTables.ORD_PRIMid_String, topics_1);
								/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_t2_0 = BOXED_topics_1.iterator();
								/*@Thrown*/ Boolean exists_0;
								while (true) {
									if (!ITERATOR_t2_0.hasNext()) {
										if (accumulator_3 == ValueUtil.FALSE_VALUE) {
											exists_0 = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_3;
										}
										break;
									}
									/*@NonInvalid*/ String t2_0 = (String) ITERATOR_t2_0.next();
									/**
									 * t1 = t2
									 */
									final /*@NonInvalid*/ boolean eq_0 = t1_0.equals(t2_0);
									//
									if (eq_0) { // Normal successful body evaluation result
										exists_0 = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!eq_0) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								CAUGHT_exists_0 = exists_0;
							} catch (Exception e) {
								CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_exists_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll_0 = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_exists_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_exists_0 == null) { // Abnormal null body evaluation result
								if (accumulator_2 == ValueUtil.TRUE_VALUE) {
									accumulator_2 = null; // Cache a null failure
								}
							} else if (CAUGHT_exists_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_2 = CAUGHT_exists_0; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						result = forAll_0;
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
	public boolean commonTopicsWithNode_cS1a(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "MessagingLink::commonTopicsWithNode_cS1a";
		try {
			/**
			 *
			 * inv commonTopicsWithNode_cS1a:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.topics->forAll(t1 |
			 *           self.messageBroker.topics->exists(t2 | t1 = t2))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CpsmlPackage.Literals.MESSAGING_LINK___COMMON_TOPICS_WITH_NODE_CS_1A__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CpsmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<String> topics = this.getTopics();
					final /*@NonInvalid*/ OrderedSetValue BOXED_topics = idResolver
							.createOrderedSetOfAll(CpsmlTables.ORD_PRIMid_String, topics);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_t1 = BOXED_topics.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_t1.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ String t1 = (String) ITERATOR_t1.next();
						/**
						 * self.messageBroker.topics->exists(t2 | t1 = t2)
						 */
						final /*@NonInvalid*/ MessageBroker messageBroker = this.getMessageBroker();
						final /*@NonInvalid*/ List<String> topics_0 = messageBroker.getTopics();
						final /*@NonInvalid*/ OrderedSetValue BOXED_topics_0 = idResolver
								.createOrderedSetOfAll(CpsmlTables.ORD_PRIMid_String, topics_0);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_t2 = BOXED_topics_0.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_t2.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ String t2 = (String) ITERATOR_t2.next();
							/**
							 * t1 = t2
							 */
							final /*@NonInvalid*/ boolean eq = t1.equals(t2);
							//
							if (eq) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						//
						if (exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (exists == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			if (resolve)
				return getMessageBroker();
			return basicGetMessageBroker();
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
			return getTopics();
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			setMessageBroker((MessageBroker) newValue);
			return;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
			getTopics().clear();
			getTopics().addAll((Collection<? extends String>) newValue);
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			setMessageBroker((MessageBroker) null);
			return;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
			getTopics().clear();
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			return messageBroker != null;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
			return topics != null && !topics.isEmpty();
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
		case CpsmlPackage.MESSAGING_LINK___MESSAGING_ELEMENT_CONNECTED_TO_MB_C2__DIAGNOSTICCHAIN_MAP:
			return messagingElementConnectedToMB_c2((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case CpsmlPackage.MESSAGING_LINK___COMMON_TOPICS_WITH_MB_CS_1B__DIAGNOSTICCHAIN_MAP:
			return commonTopicsWithMB_cS1b((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case CpsmlPackage.MESSAGING_LINK___COMMON_TOPICS_WITH_NODE_CS_1A__DIAGNOSTICCHAIN_MAP:
			return commonTopicsWithNode_cS1a((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (topics: ");
		result.append(topics);
		result.append(')');
		return result.toString();
	}

} //MessagingLinkImpl
