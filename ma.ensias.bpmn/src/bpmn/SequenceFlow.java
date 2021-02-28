/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.SequenceFlow#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see bpmn.BpmnPackage#getSequenceFlow_To()
	 * @model
	 * @generated
	 */
	EList<Activity> getTo();

} // SequenceFlow
