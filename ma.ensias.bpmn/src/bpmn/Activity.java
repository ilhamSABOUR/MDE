/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Activity#getFrom <em>From</em>}</li>
 *   <li>{@link bpmn.Activity#getFrommessageflow <em>Frommessageflow</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends bpmn.Object {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link bpmn.SequenceFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see bpmn.BpmnPackage#getActivity_From()
	 * @model
	 * @generated
	 */
	EList<SequenceFlow> getFrom();

	/**
	 * Returns the value of the '<em><b>Frommessageflow</b></em>' reference list.
	 * The list contents are of type {@link bpmn.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frommessageflow</em>' reference list.
	 * @see bpmn.BpmnPackage#getActivity_Frommessageflow()
	 * @model
	 * @generated
	 */
	EList<MessageFlow> getFrommessageflow();

} // Activity
