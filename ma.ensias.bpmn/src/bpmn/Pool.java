/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Pool#getActivity <em>Activity</em>}</li>
 *   <li>{@link bpmn.Pool#getFlowobject <em>Flowobject</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends bpmn.Object {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getPool_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Flowobject</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowobject</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getPool_Flowobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowObject> getFlowobject();

} // Pool
