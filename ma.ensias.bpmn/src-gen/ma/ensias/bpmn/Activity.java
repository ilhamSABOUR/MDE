/**
 */
package ma.ensias.bpmn;

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
 *   <li>{@link ma.ensias.bpmn.Activity#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends ma.ensias.bpmn.Object {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link ma.ensias.bpmn.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see ma.ensias.bpmn.BpmnPackage#getActivity_To()
	 * @model
	 * @generated
	 */
	EList<MessageFlow> getTo();

} // Activity
