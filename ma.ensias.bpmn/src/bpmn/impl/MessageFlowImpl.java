/**
 */
package bpmn.impl;

import bpmn.Activity;
import bpmn.BpmnPackage;
import bpmn.MessageFlow;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.MessageFlowImpl#getToactivity <em>Toactivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageFlowImpl extends FlowObjectImpl implements MessageFlow {
	/**
	 * The cached value of the '{@link #getToactivity() <em>Toactivity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToactivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> toactivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.MESSAGE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getToactivity() {
		if (toactivity == null) {
			toactivity = new EObjectResolvingEList<Activity>(Activity.class, this, BpmnPackage.MESSAGE_FLOW__TOACTIVITY);
		}
		return toactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.MESSAGE_FLOW__TOACTIVITY:
				return getToactivity();
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
			case BpmnPackage.MESSAGE_FLOW__TOACTIVITY:
				getToactivity().clear();
				getToactivity().addAll((Collection<? extends Activity>)newValue);
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
			case BpmnPackage.MESSAGE_FLOW__TOACTIVITY:
				getToactivity().clear();
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
			case BpmnPackage.MESSAGE_FLOW__TOACTIVITY:
				return toactivity != null && !toactivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageFlowImpl
