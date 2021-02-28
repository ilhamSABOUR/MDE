/**
 */
package ma.ensias.bpmn;

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
 *   <li>{@link ma.ensias.bpmn.SequenceFlow#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link ma.ensias.bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see ma.ensias.bpmn.BpmnPackage#getSequenceFlow_From()
	 * @model
	 * @generated
	 */
	EList<Activity> getFrom();

} // SequenceFlow
