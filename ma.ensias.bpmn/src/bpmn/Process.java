/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Process#getPool <em>Pool</em>}</li>
 *   <li>{@link bpmn.Process#getSubprocess <em>Subprocess</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends bpmn.Object {
	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getProcess_Pool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pool> getPool();

	/**
	 * Returns the value of the '<em><b>Subprocess</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.SousProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocess</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getProcess_Subprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<SousProcess> getSubprocess();

} // Process
