/**
 */
package ma.ensias.bpmn;

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
 *   <li>{@link ma.ensias.bpmn.Process#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ma.ensias.bpmn.Object {
	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link ma.ensias.bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see ma.ensias.bpmn.BpmnPackage#getProcess_Pool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pool> getPool();

} // Process
