/**
 */
package bpmn.impl;

import bpmn.Activity;
import bpmn.BpmnPackage;
import bpmn.MessageFlow;
import bpmn.SequenceFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.ActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getFrom <em>From</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getFrommessageflow <em>Frommessageflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> from;

	/**
	 * The cached value of the '{@link #getFrommessageflow() <em>Frommessageflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrommessageflow()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageFlow> frommessageflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<SequenceFlow>(SequenceFlow.class, this, BpmnPackage.ACTIVITY__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageFlow> getFrommessageflow() {
		if (frommessageflow == null) {
			frommessageflow = new EObjectResolvingEList<MessageFlow>(MessageFlow.class, this, BpmnPackage.ACTIVITY__FROMMESSAGEFLOW);
		}
		return frommessageflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.ACTIVITY__ID:
				return getId();
			case BpmnPackage.ACTIVITY__NAME:
				return getName();
			case BpmnPackage.ACTIVITY__FROM:
				return getFrom();
			case BpmnPackage.ACTIVITY__FROMMESSAGEFLOW:
				return getFrommessageflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnPackage.ACTIVITY__ID:
				setId((Integer)newValue);
				return;
			case BpmnPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case BpmnPackage.ACTIVITY__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case BpmnPackage.ACTIVITY__FROMMESSAGEFLOW:
				getFrommessageflow().clear();
				getFrommessageflow().addAll((Collection<? extends MessageFlow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnPackage.ACTIVITY__ID:
				setId(ID_EDEFAULT);
				return;
			case BpmnPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpmnPackage.ACTIVITY__FROM:
				getFrom().clear();
				return;
			case BpmnPackage.ACTIVITY__FROMMESSAGEFLOW:
				getFrommessageflow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnPackage.ACTIVITY__ID:
				return id != ID_EDEFAULT;
			case BpmnPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpmnPackage.ACTIVITY__FROM:
				return from != null && !from.isEmpty();
			case BpmnPackage.ACTIVITY__FROMMESSAGEFLOW:
				return frommessageflow != null && !frommessageflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
