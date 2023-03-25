/**
 */
package sportProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.ProgramDuration#getType <em>Type</em>}</li>
 *   <li>{@link sportProgram.ProgramDuration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sportProgram.SportProgramPackage#getProgramDuration()
 * @model
 * @generated
 */
public interface ProgramDuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sportProgram.EnumPrgDurationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sportProgram.EnumPrgDurationType
	 * @see #setType(EnumPrgDurationType)
	 * @see sportProgram.SportProgramPackage#getProgramDuration_Type()
	 * @model
	 * @generated
	 */
	EnumPrgDurationType getType();

	/**
	 * Sets the value of the '{@link sportProgram.ProgramDuration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sportProgram.EnumPrgDurationType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumPrgDurationType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see sportProgram.SportProgramPackage#getProgramDuration_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link sportProgram.ProgramDuration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ProgramDuration
