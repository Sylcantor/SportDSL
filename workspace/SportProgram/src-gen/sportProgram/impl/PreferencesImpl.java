/**
 */
package sportProgram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sportProgram.EnumAvailability;
import sportProgram.EnumMuscleTarget;
import sportProgram.Preferences;
import sportProgram.SportProgramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.impl.PreferencesImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link sportProgram.impl.PreferencesImpl#isEquipment <em>Equipment</em>}</li>
 *   <li>{@link sportProgram.impl.PreferencesImpl#getDisability <em>Disability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferencesImpl extends MinimalEObjectImpl.Container implements Preferences {
	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAvailability AVAILABILITY_EDEFAULT = EnumAvailability.MORNING;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EnumAvailability availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isEquipment() <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquipment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUIPMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEquipment() <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquipment()
	 * @generated
	 * @ordered
	 */
	protected boolean equipment = EQUIPMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisability() <em>Disability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability()
	 * @generated
	 * @ordered
	 */
	protected static final EnumMuscleTarget DISABILITY_EDEFAULT = EnumMuscleTarget.NONE;

	/**
	 * The cached value of the '{@link #getDisability() <em>Disability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability()
	 * @generated
	 * @ordered
	 */
	protected EnumMuscleTarget disability = DISABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SportProgramPackage.Literals.PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAvailability getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(EnumAvailability newAvailability) {
		EnumAvailability oldAvailability = availability;
		availability = newAvailability == null ? AVAILABILITY_EDEFAULT : newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.PREFERENCES__AVAILABILITY,
					oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(boolean newEquipment) {
		boolean oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.PREFERENCES__EQUIPMENT,
					oldEquipment, equipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMuscleTarget getDisability() {
		return disability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisability(EnumMuscleTarget newDisability) {
		EnumMuscleTarget oldDisability = disability;
		disability = newDisability == null ? DISABILITY_EDEFAULT : newDisability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.PREFERENCES__DISABILITY,
					oldDisability, disability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SportProgramPackage.PREFERENCES__AVAILABILITY:
			return getAvailability();
		case SportProgramPackage.PREFERENCES__EQUIPMENT:
			return isEquipment();
		case SportProgramPackage.PREFERENCES__DISABILITY:
			return getDisability();
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
		case SportProgramPackage.PREFERENCES__AVAILABILITY:
			setAvailability((EnumAvailability) newValue);
			return;
		case SportProgramPackage.PREFERENCES__EQUIPMENT:
			setEquipment((Boolean) newValue);
			return;
		case SportProgramPackage.PREFERENCES__DISABILITY:
			setDisability((EnumMuscleTarget) newValue);
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
		case SportProgramPackage.PREFERENCES__AVAILABILITY:
			setAvailability(AVAILABILITY_EDEFAULT);
			return;
		case SportProgramPackage.PREFERENCES__EQUIPMENT:
			setEquipment(EQUIPMENT_EDEFAULT);
			return;
		case SportProgramPackage.PREFERENCES__DISABILITY:
			setDisability(DISABILITY_EDEFAULT);
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
		case SportProgramPackage.PREFERENCES__AVAILABILITY:
			return availability != AVAILABILITY_EDEFAULT;
		case SportProgramPackage.PREFERENCES__EQUIPMENT:
			return equipment != EQUIPMENT_EDEFAULT;
		case SportProgramPackage.PREFERENCES__DISABILITY:
			return disability != DISABILITY_EDEFAULT;
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
		result.append(" (availability: ");
		result.append(availability);
		result.append(", equipment: ");
		result.append(equipment);
		result.append(", disability: ");
		result.append(disability);
		result.append(')');
		return result.toString();
	}

} //PreferencesImpl
