/**
 */
package ma.ensias.bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ma.ensias.bpmn.Event#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ma.ensias.bpmn.BpmnPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Activity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ma.ensias.bpmn.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ma.ensias.bpmn.EventType
	 * @see #setType(EventType)
	 * @see ma.ensias.bpmn.BpmnPackage#getEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link ma.ensias.bpmn.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ma.ensias.bpmn.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

} // Event
