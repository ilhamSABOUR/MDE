/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Event#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Activity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"start"</code>.
	 * The literals are from the enumeration {@link bpmn.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.EventType
	 * @see #setType(EventType)
	 * @see bpmn.BpmnPackage#getEvent_Type()
	 * @model default="start"
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link bpmn.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

} // Event
