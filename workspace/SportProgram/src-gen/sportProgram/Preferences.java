/**
 */
package sportProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.Preferences#getAvailability <em>Availability</em>}</li>
 *   <li>{@link sportProgram.Preferences#isEquipment <em>Equipment</em>}</li>
 *   <li>{@link sportProgram.Preferences#getDisability <em>Disability</em>}</li>
 * </ul>
 *
 * @see sportProgram.SportProgramPackage#getPreferences()
 * @model
 * @generated
 */
public interface Preferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link sportProgram.EnumAvailability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see sportProgram.EnumAvailability
	 * @see #setAvailability(EnumAvailability)
	 * @see sportProgram.SportProgramPackage#getPreferences_Availability()
	 * @model default=""
	 * @generated
	 */
	EnumAvailability getAvailability();

	/**
	 * Sets the value of the '{@link sportProgram.Preferences#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see sportProgram.EnumAvailability
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(EnumAvailability value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' attribute.
	 * @see #setEquipment(boolean)
	 * @see sportProgram.SportProgramPackage#getPreferences_Equipment()
	 * @model default="false"
	 * @generated
	 */
	boolean isEquipment();

	/**
	 * Sets the value of the '{@link sportProgram.Preferences#isEquipment <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' attribute.
	 * @see #isEquipment()
	 * @generated
	 */
	void setEquipment(boolean value);

	/**
	 * Returns the value of the '<em><b>Disability</b></em>' attribute.
	 * The literals are from the enumeration {@link sportProgram.EnumMuscleTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability</em>' attribute.
	 * @see sportProgram.EnumMuscleTarget
	 * @see #setDisability(EnumMuscleTarget)
	 * @see sportProgram.SportProgramPackage#getPreferences_Disability()
	 * @model
	 * @generated
	 */
	EnumMuscleTarget getDisability();

	/**
	 * Sets the value of the '{@link sportProgram.Preferences#getDisability <em>Disability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability</em>' attribute.
	 * @see sportProgram.EnumMuscleTarget
	 * @see #getDisability()
	 * @generated
	 */
	void setDisability(EnumMuscleTarget value);

} // Preferences
