/**
 */
package ma.ensias.bpmn.util;

import ma.ensias.bpmn.Activity;
import ma.ensias.bpmn.Artifacts;
import ma.ensias.bpmn.BpmnPackage;
import ma.ensias.bpmn.DataAssociation;
import ma.ensias.bpmn.DataObject;
import ma.ensias.bpmn.DataStore;
import ma.ensias.bpmn.Event;
import ma.ensias.bpmn.FlowObject;
import ma.ensias.bpmn.GateWay;
import ma.ensias.bpmn.Join;
import ma.ensias.bpmn.MessageFlow;
import ma.ensias.bpmn.OR;
import ma.ensias.bpmn.Parallel;
import ma.ensias.bpmn.Pool;
import ma.ensias.bpmn.SequenceFlow;
import ma.ensias.bpmn.Split;
import ma.ensias.bpmn.SubProcess;
import ma.ensias.bpmn.Task;
import ma.ensias.bpmn.TextAnnotation;
import ma.ensias.bpmn.XOR;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ma.ensias.bpmn.BpmnPackage
 * @generated
 */
public class BpmnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnSwitch() {
		if (modelPackage == null) {
			modelPackage = BpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BpmnPackage.PROCESS: {
			ma.ensias.bpmn.Process process = (ma.ensias.bpmn.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseObject(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.GATE_WAY: {
			GateWay gateWay = (GateWay) theEObject;
			T result = caseGateWay(gateWay);
			if (result == null)
				result = caseActivity(gateWay);
			if (result == null)
				result = caseObject(gateWay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.SUB_PROCESS: {
			SubProcess subProcess = (SubProcess) theEObject;
			T result = caseSubProcess(subProcess);
			if (result == null)
				result = caseProcess(subProcess);
			if (result == null)
				result = caseObject(subProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseObject(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.ARTIFACTS: {
			Artifacts artifacts = (Artifacts) theEObject;
			T result = caseArtifacts(artifacts);
			if (result == null)
				result = caseObject(artifacts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.POOL: {
			Pool pool = (Pool) theEObject;
			T result = casePool(pool);
			if (result == null)
				result = caseObject(pool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.FLOW_OBJECT: {
			FlowObject flowObject = (FlowObject) theEObject;
			T result = caseFlowObject(flowObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.OBJECT: {
			ma.ensias.bpmn.Object object = (ma.ensias.bpmn.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseActivity(event);
			if (result == null)
				result = caseObject(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.PARALLEL: {
			Parallel parallel = (Parallel) theEObject;
			T result = caseParallel(parallel);
			if (result == null)
				result = caseSplit(parallel);
			if (result == null)
				result = caseGateWay(parallel);
			if (result == null)
				result = caseActivity(parallel);
			if (result == null)
				result = caseObject(parallel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.OR: {
			OR or = (OR) theEObject;
			T result = caseOR(or);
			if (result == null)
				result = caseSplit(or);
			if (result == null)
				result = caseGateWay(or);
			if (result == null)
				result = caseActivity(or);
			if (result == null)
				result = caseObject(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.XOR: {
			XOR xor = (XOR) theEObject;
			T result = caseXOR(xor);
			if (result == null)
				result = caseSplit(xor);
			if (result == null)
				result = caseGateWay(xor);
			if (result == null)
				result = caseActivity(xor);
			if (result == null)
				result = caseObject(xor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.DATA_STORE: {
			DataStore dataStore = (DataStore) theEObject;
			T result = caseDataStore(dataStore);
			if (result == null)
				result = caseArtifacts(dataStore);
			if (result == null)
				result = caseObject(dataStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.DATA_OBJECT: {
			DataObject dataObject = (DataObject) theEObject;
			T result = caseDataObject(dataObject);
			if (result == null)
				result = caseArtifacts(dataObject);
			if (result == null)
				result = caseObject(dataObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.TEXT_ANNOTATION: {
			TextAnnotation textAnnotation = (TextAnnotation) theEObject;
			T result = caseTextAnnotation(textAnnotation);
			if (result == null)
				result = caseArtifacts(textAnnotation);
			if (result == null)
				result = caseObject(textAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.JOIN: {
			Join join = (Join) theEObject;
			T result = caseJoin(join);
			if (result == null)
				result = caseGateWay(join);
			if (result == null)
				result = caseActivity(join);
			if (result == null)
				result = caseObject(join);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.SPLIT: {
			Split split = (Split) theEObject;
			T result = caseSplit(split);
			if (result == null)
				result = caseGateWay(split);
			if (result == null)
				result = caseActivity(split);
			if (result == null)
				result = caseObject(split);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.SEQUENCE_FLOW: {
			SequenceFlow sequenceFlow = (SequenceFlow) theEObject;
			T result = caseSequenceFlow(sequenceFlow);
			if (result == null)
				result = caseFlowObject(sequenceFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.MESSAGE_FLOW: {
			MessageFlow messageFlow = (MessageFlow) theEObject;
			T result = caseMessageFlow(messageFlow);
			if (result == null)
				result = caseFlowObject(messageFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.DATA_ASSOCIATION: {
			DataAssociation dataAssociation = (DataAssociation) theEObject;
			T result = caseDataAssociation(dataAssociation);
			if (result == null)
				result = caseFlowObject(dataAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseActivity(task);
			if (result == null)
				result = caseObject(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(ma.ensias.bpmn.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate Way</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate Way</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateWay(GateWay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubProcess(SubProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifacts(Artifacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowObject(FlowObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(ma.ensias.bpmn.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOR(OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXOR(XOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStore(DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAnnotation(TextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFlow(MessageFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAssociation(DataAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BpmnSwitch
