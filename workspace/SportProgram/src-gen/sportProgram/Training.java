/**
 */
package sportProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.Training#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link sportProgram.Training#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link sportProgram.Training#getMulscleTarget <em>Mulscle Target</em>}</li>
 *   <li>{@link sportProgram.Training#getDuration <em>Duration</em>}</li>
 *   <li>{@link sportProgram.Training#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sportProgram.SportProgramPackage#getTraining()
 * @model
 * @generated
 */
public interface Training extends EObject {
	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link sportProgram.EnumIntensity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see sportProgram.EnumIntensity
	 * @see #setIntensity(EnumIntensity)
	 * @see sportProgram.SportProgramPackage#getTraining_Intensity()
	 * @model default=""
	 * @generated
	 */
	EnumIntensity getIntensity();

	/**
	 * Sets the value of the '{@link sportProgram.Training#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see sportProgram.EnumIntensity
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(EnumIntensity value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see sportProgram.SportProgramPackage#getTraining_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link sportProgram.Training#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Mulscle Target</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link sportProgram.EnumMuscleTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mulscle Target</em>' attribute.
	 * @see sportProgram.EnumMuscleTarget
	 * @see #setMulscleTarget(EnumMuscleTarget)
	 * @see sportProgram.SportProgramPackage#getTraining_MulscleTarget()
	 * @model default=""
	 * @generated
	 */
	EnumMuscleTarget getMulscleTarget();

	/**
	 * Sets the value of the '{@link sportProgram.Training#getMulscleTarget <em>Mulscle Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mulscle Target</em>' attribute.
	 * @see sportProgram.EnumMuscleTarget
	 * @see #getMulscleTarget()
	 * @generated
	 */
	void setMulscleTarget(EnumMuscleTarget value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see sportProgram.SportProgramPackage#getTraining_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link sportProgram.Training#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see sportProgram.SportProgramPackage#getTraining_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sportProgram.Training#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Training
