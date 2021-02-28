/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Artifacts#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends bpmn.Object {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.ArtifactType
	 * @see #setType(ArtifactType)
	 * @see bpmn.BpmnPackage#getArtifacts_Type()
	 * @model
	 * @generated
	 */
	ArtifactType getType();

	/**
	 * Sets the value of the '{@link bpmn.Artifacts#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.ArtifactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArtifactType value);

} // Artifacts
