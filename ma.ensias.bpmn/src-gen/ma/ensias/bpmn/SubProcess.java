/**
 */
package ma.ensias.bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ma.ensias.bpmn.SubProcess#getRef_SubProcess <em>Ref Sub Process</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends ma.ensias.bpmn.Process {
	/**
	 * Returns the value of the '<em><b>Ref Sub Process</b></em>' containment reference list.
	 * The list contents are of type {@link ma.ensias.bpmn.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Sub Process</em>' containment reference list.
	 * @see ma.ensias.bpmn.BpmnPackage#getSubProcess_Ref_SubProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<ma.ensias.bpmn.Process> getRef_SubProcess();

} // SubProcess
