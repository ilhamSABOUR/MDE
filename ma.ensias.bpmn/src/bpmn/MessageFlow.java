/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.MessageFlow#getToactivity <em>Toactivity</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getMessageFlow()
 * @model
 * @generated
 */
public interface MessageFlow extends FlowObject {
	/**
	 * Returns the value of the '<em><b>Toactivity</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toactivity</em>' reference list.
	 * @see bpmn.BpmnPackage#getMessageFlow_Toactivity()
	 * @model
	 * @generated
	 */
	EList<Activity> getToactivity();

} // MessageFlow
