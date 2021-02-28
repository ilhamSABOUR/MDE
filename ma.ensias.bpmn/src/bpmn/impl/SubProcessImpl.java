/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.SubProcess;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.SubProcessImpl#getRef_SubProcess <em>Ref Sub Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends ProcessImpl implements SubProcess {
	/**
	 * The cached value of the '{@link #getRef_SubProcess() <em>Ref Sub Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef_SubProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<bpmn.Process> ref_SubProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<bpmn.Process> getRef_SubProcess() {
		if (ref_SubProcess == null) {
			ref_SubProcess = new EObjectContainmentEList<bpmn.Process>(bpmn.Process.class, this, BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS);
		}
		return ref_SubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS:
				return ((InternalEList<?>)getRef_SubProcess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS:
				return getRef_SubProcess();
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
			case BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS:
				getRef_SubProcess().clear();
				getRef_SubProcess().addAll((Collection<? extends bpmn.Process>)newValue);
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
			case BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS:
				getRef_SubProcess().clear();
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
			case BpmnPackage.SUB_PROCESS__REF_SUB_PROCESS:
				return ref_SubProcess != null && !ref_SubProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubProcessImpl
