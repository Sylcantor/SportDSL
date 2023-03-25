/**
 */
package sportProgram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sportProgram.EnumIntensity;
import sportProgram.EnumMuscleTarget;
import sportProgram.SportProgramPackage;
import sportProgram.Training;
import sportProgram.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.impl.TrainingImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link sportProgram.impl.TrainingImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link sportProgram.impl.TrainingImpl#getMulscleTarget <em>Mulscle Target</em>}</li>
 *   <li>{@link sportProgram.impl.TrainingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link sportProgram.impl.TrainingImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingImpl extends MinimalEObjectImpl.Container implements Training {
	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIntensity INTENSITY_EDEFAULT = EnumIntensity.LOW;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected EnumIntensity intensity = INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulscleTarget() <em>Mulscle Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulscleTarget()
	 * @generated
	 * @ordered
	 */
	protected static final EnumMuscleTarget MULSCLE_TARGET_EDEFAULT = EnumMuscleTarget.NONE;

	/**
	 * The cached value of the '{@link #getMulscleTarget() <em>Mulscle Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulscleTarget()
	 * @generated
	 * @ordered
	 */
	protected EnumMuscleTarget mulscleTarget = MULSCLE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SportProgramPackage.Literals.TRAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIntensity getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(EnumIntensity newIntensity) {
		EnumIntensity oldIntensity = intensity;
		intensity = newIntensity == null ? INTENSITY_EDEFAULT : newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.TRAINING__INTENSITY, oldIntensity,
					intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.TRAINING__FREQUENCY, oldFrequency,
					frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMuscleTarget getMulscleTarget() {
		return mulscleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulscleTarget(EnumMuscleTarget newMulscleTarget) {
		EnumMuscleTarget oldMulscleTarget = mulscleTarget;
		mulscleTarget = newMulscleTarget == null ? MULSCLE_TARGET_EDEFAULT : newMulscleTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.TRAINING__MULSCLE_TARGET,
					oldMulscleTarget, mulscleTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.TRAINING__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SportProgramPackage.TRAINING__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.TRAINING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SportProgramPackage.TRAINING__INTENSITY:
			return getIntensity();
		case SportProgramPackage.TRAINING__FREQUENCY:
			return getFrequency();
		case SportProgramPackage.TRAINING__MULSCLE_TARGET:
			return getMulscleTarget();
		case SportProgramPackage.TRAINING__DURATION:
			return getDuration();
		case SportProgramPackage.TRAINING__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SportProgramPackage.TRAINING__INTENSITY:
			setIntensity((EnumIntensity) newValue);
			return;
		case SportProgramPackage.TRAINING__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case SportProgramPackage.TRAINING__MULSCLE_TARGET:
			setMulscleTarget((EnumMuscleTarget) newValue);
			return;
		case SportProgramPackage.TRAINING__DURATION:
			setDuration((Integer) newValue);
			return;
		case SportProgramPackage.TRAINING__TYPE:
			setType((Type) newValue);
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
		case SportProgramPackage.TRAINING__INTENSITY:
			setIntensity(INTENSITY_EDEFAULT);
			return;
		case SportProgramPackage.TRAINING__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case SportProgramPackage.TRAINING__MULSCLE_TARGET:
			setMulscleTarget(MULSCLE_TARGET_EDEFAULT);
			return;
		case SportProgramPackage.TRAINING__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case SportProgramPackage.TRAINING__TYPE:
			setType((Type) null);
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
		case SportProgramPackage.TRAINING__INTENSITY:
			return intensity != INTENSITY_EDEFAULT;
		case SportProgramPackage.TRAINING__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case SportProgramPackage.TRAINING__MULSCLE_TARGET:
			return mulscleTarget != MULSCLE_TARGET_EDEFAULT;
		case SportProgramPackage.TRAINING__DURATION:
			return duration != DURATION_EDEFAULT;
		case SportProgramPackage.TRAINING__TYPE:
			return type != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Intensity: ");
		result.append(intensity);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", mulscleTarget: ");
		result.append(mulscleTarget);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //TrainingImpl
