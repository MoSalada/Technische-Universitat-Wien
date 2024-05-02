/**
 */
package cpsml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Node#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='statusBasedOnComponents_c1'"
 * @generated
 */
public interface Node extends NamedElement, StatefulElement, MessagingElement, ConnectableElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getNode_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.status = Status::GOOD implies self.component-&gt;forAll(c| c.status = Status::GOOD)'"
	 * @generated
	 */
	boolean statusBasedOnComponents_c1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Node
