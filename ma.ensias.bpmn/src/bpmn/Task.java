/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Task#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Activity {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Artifacts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getTask_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifacts> getArtifacts();

} // Task
