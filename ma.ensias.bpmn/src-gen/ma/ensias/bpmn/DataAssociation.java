/**
 */
package ma.ensias.bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ma.ensias.bpmn.DataAssociation#getFrom <em>From</em>}</li>
 *   <li>{@link ma.ensias.bpmn.DataAssociation#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getDataAssociation()
 * @model
 * @generated
 */
public interface DataAssociation extends FlowObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Task)
	 * @see ma.ensias.bpmn.BpmnPackage#getDataAssociation_From()
	 * @model required="true"
	 * @generated
	 */
	Task getFrom();

	/**
	 * Sets the value of the '{@link ma.ensias.bpmn.DataAssociation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Task value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Artifacts)
	 * @see ma.ensias.bpmn.BpmnPackage#getDataAssociation_To()
	 * @model required="true"
	 * @generated
	 */
	Artifacts getTo();

	/**
	 * Sets the value of the '{@link ma.ensias.bpmn.DataAssociation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Artifacts value);

} // DataAssociation
