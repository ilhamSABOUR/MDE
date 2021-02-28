/**
 */
package ma.ensias.bpmn;

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
 *   <li>{@link ma.ensias.bpmn.Pool#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends ma.ensias.bpmn.Object {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ma.ensias.bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see ma.ensias.bpmn.BpmnPackage#getPool_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // Pool
