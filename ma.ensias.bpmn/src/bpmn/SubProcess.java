/**
 */
package bpmn;

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
 *   <li>{@link bpmn.SubProcess#getRef_SubProcess <em>Ref Sub Process</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends bpmn.Process {
	/**
	 * Returns the value of the '<em><b>Ref Sub Process</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Sub Process</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getSubProcess_Ref_SubProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<bpmn.Process> getRef_SubProcess();

} // SubProcess
