/**
 */
package cpsml.util;

import cpsml.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cpsml.CpsmlPackage
 * @generated
 */
public class CpsmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CpsmlValidator INSTANCE = new CpsmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cpsml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Based On Components c1' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__STATUS_BASED_ON_COMPONENTS_C1 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Return And Not Null c3' of 'Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTION__RETURN_AND_NOT_NULL_C3 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sensor Requires Return c3' of 'Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTION__SENSOR_REQUIRES_RETURN_C3 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Naming Convention cS2' of 'Connection Module'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTION_MODULE__NAMING_CONVENTION_CS2 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Connection To Self cS 3a' of 'Wireless Module'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIRELESS_MODULE__NO_CONNECTION_TO_SELF_CS_3A = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Range Positive cS4' of 'Wireless Module'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIRELESS_MODULE__RANGE_POSITIVE_CS4 = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Distances Wihtin Range c4' of 'Wireless Module'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIRELESS_MODULE__DISTANCES_WIHTIN_RANGE_C4 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Connection To Self cS 3b' of 'Wired Module'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIRED_MODULE__NO_CONNECTION_TO_SELF_CS_3B = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Messaging Element Connected To MB c2' of 'Messaging Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGING_LINK__MESSAGING_ELEMENT_CONNECTED_TO_MB_C2 = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Common Topics With MB cS 1b' of 'Messaging Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGING_LINK__COMMON_TOPICS_WITH_MB_CS_1B = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Common Topics With Node cS 1a' of 'Messaging Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGING_LINK__COMMON_TOPICS_WITH_NODE_CS_1A = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CpsmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CpsmlPackage.CPS:
			return validateCPS((CPS) value, diagnostics, context);
		case CpsmlPackage.ENVIRONMENT:
			return validateEnvironment((Environment) value, diagnostics, context);
		case CpsmlPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case CpsmlPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case CpsmlPackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case CpsmlPackage.FUNCTION:
			return validateFunction((Function) value, diagnostics, context);
		case CpsmlPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case CpsmlPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case CpsmlPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case CpsmlPackage.CONNECTION_MODULE:
			return validateConnectionModule((ConnectionModule) value, diagnostics, context);
		case CpsmlPackage.WIRELESS_MODULE:
			return validateWirelessModule((WirelessModule) value, diagnostics, context);
		case CpsmlPackage.WIRED_MODULE:
			return validateWiredModule((WiredModule) value, diagnostics, context);
		case CpsmlPackage.MESSAGE_BROKER:
			return validateMessageBroker((MessageBroker) value, diagnostics, context);
		case CpsmlPackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case CpsmlPackage.CONTROLLER:
			return validateController((Controller) value, diagnostics, context);
		case CpsmlPackage.STATEFUL_ELEMENT:
			return validateStatefulElement((StatefulElement) value, diagnostics, context);
		case CpsmlPackage.MESSAGING_ELEMENT:
			return validateMessagingElement((MessagingElement) value, diagnostics, context);
		case CpsmlPackage.MESSAGING_LINK:
			return validateMessagingLink((MessagingLink) value, diagnostics, context);
		case CpsmlPackage.CONNECTABLE_ELEMENT:
			return validateConnectableElement((ConnectableElement) value, diagnostics, context);
		case CpsmlPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case CpsmlPackage.STATUS:
			return validateStatus((Status) value, diagnostics, context);
		case CpsmlPackage.PROTOCOL:
			return validateProtocol((Protocol) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPS(CPS cps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_statusBasedOnComponents_c1(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the statusBasedOnComponents_c1 constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_statusBasedOnComponents_c1(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return node.statusBasedOnComponents_c1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFunction_sensorRequiresReturn_c3(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFunction_returnAndNotNull_c3(function, diagnostics, context);
		return result;
	}

	/**
	 * Validates the returnAndNotNull_c3 constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_returnAndNotNull_c3(Function function, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return function.returnAndNotNull_c3(diagnostics, context);
	}

	/**
	 * Validates the sensorRequiresReturn_c3 constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_sensorRequiresReturn_c3(Function function, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return function.sensorRequiresReturn_c3(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionModule(ConnectionModule connectionModule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionModule, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connectionModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectionModule_namingConvention_cS2(connectionModule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the namingConvention_cS2 constraint of '<em>Connection Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionModule_namingConvention_cS2(ConnectionModule connectionModule,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectionModule.namingConvention_cS2(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessModule(WirelessModule wirelessModule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wirelessModule, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectionModule_namingConvention_cS2(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWirelessModule_distancesWihtinRange_c4(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWirelessModule_noConnectionToSelf_cS3a(wirelessModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWirelessModule_rangePositive_cS4(wirelessModule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rangePositive_cS4 constraint of '<em>Wireless Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessModule_rangePositive_cS4(WirelessModule wirelessModule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return wirelessModule.rangePositive_cS4(diagnostics, context);
	}

	/**
	 * Validates the distancesWihtinRange_c4 constraint of '<em>Wireless Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessModule_distancesWihtinRange_c4(WirelessModule wirelessModule,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wirelessModule.distancesWihtinRange_c4(diagnostics, context);
	}

	/**
	 * Validates the noConnectionToSelf_cS3a constraint of '<em>Wireless Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessModule_noConnectionToSelf_cS3a(WirelessModule wirelessModule,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wirelessModule.noConnectionToSelf_cS3a(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWiredModule(WiredModule wiredModule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wiredModule, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectionModule_namingConvention_cS2(wiredModule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWiredModule_noConnectionToSelf_cS3b(wiredModule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noConnectionToSelf_cS3b constraint of '<em>Wired Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWiredModule_noConnectionToSelf_cS3b(WiredModule wiredModule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return wiredModule.noConnectionToSelf_cS3b(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBroker(MessageBroker messageBroker, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageBroker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatefulElement(StatefulElement statefulElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statefulElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagingElement(MessagingElement messagingElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messagingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagingLink(MessagingLink messagingLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messagingLink, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMessagingLink_commonTopicsWithNode_cS1a(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMessagingLink_messagingElementConnectedToMB_c2(messagingLink, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMessagingLink_commonTopicsWithMB_cS1b(messagingLink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the messagingElementConnectedToMB_c2 constraint of '<em>Messaging Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagingLink_messagingElementConnectedToMB_c2(MessagingLink messagingLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messagingLink.messagingElementConnectedToMB_c2(diagnostics, context);
	}

	/**
	 * Validates the commonTopicsWithNode_cS1a constraint of '<em>Messaging Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagingLink_commonTopicsWithNode_cS1a(MessagingLink messagingLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messagingLink.commonTopicsWithNode_cS1a(diagnostics, context);
	}

	/**
	 * Validates the commonTopicsWithMB_cS1b constraint of '<em>Messaging Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagingLink_commonTopicsWithMB_cS1b(MessagingLink messagingLink,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messagingLink.commonTopicsWithMB_cS1b(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElement(ConnectableElement connectableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CpsmlValidator
