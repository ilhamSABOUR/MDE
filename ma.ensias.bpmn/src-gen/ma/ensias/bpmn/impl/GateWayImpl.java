/**
 */
package ma.ensias.bpmn.impl;

import ma.ensias.bpmn.BpmnPackage;
import ma.ensias.bpmn.GateWay;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GateWayImpl extends ActivityImpl implements GateWay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateWayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.GATE_WAY;
	}

} //GateWayImpl
