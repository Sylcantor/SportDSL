/**
 */
package sportProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sport Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.SportProgram#getProgramduration <em>Programduration</em>}</li>
 *   <li>{@link sportProgram.SportProgram#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link sportProgram.SportProgram#getTraining <em>Training</em>}</li>
 *   <li>{@link sportProgram.SportProgram#getLibrarytype <em>Librarytype</em>}</li>
 * </ul>
 *
 * @see sportProgram.SportProgramPackage#getSportProgram()
 * @model
 * @generated
 */
public interface SportProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Programduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programduration</em>' containment reference.
	 * @see #setProgramduration(ProgramDuration)
	 * @see sportProgram.SportProgramPackage#getSportProgram_Programduration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProgramDuration getProgramduration();

	/**
	 * Sets the value of the '{@link sportProgram.SportProgram#getProgramduration <em>Programduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programduration</em>' containment reference.
	 * @see #getProgramduration()
	 * @generated
	 */
	void setProgramduration(ProgramDuration value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference.
	 * @see #setPreferences(Preferences)
	 * @see sportProgram.SportProgramPackage#getSportProgram_Preferences()
	 * @model containment="true"
	 * @generated
	 */
	Preferences getPreferences();

	/**
	 * Sets the value of the '{@link sportProgram.SportProgram#getPreferences <em>Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferences</em>' containment reference.
	 * @see #getPreferences()
	 * @generated
	 */
	void setPreferences(Preferences value);

	/**
	 * Returns the value of the '<em><b>Training</b></em>' containment reference list.
	 * The list contents are of type {@link sportProgram.Training}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training</em>' containment reference list.
	 * @see sportProgram.SportProgramPackage#getSportProgram_Training()
	 * @model containment="true"
	 * @generated
	 */
	EList<Training> getTraining();

	/**
	 * Returns the value of the '<em><b>Librarytype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librarytype</em>' containment reference.
	 * @see #setLibrarytype(LibraryType)
	 * @see sportProgram.SportProgramPackage#getSportProgram_Librarytype()
	 * @model containment="true"
	 * @generated
	 */
	LibraryType getLibrarytype();

	/**
	 * Sets the value of the '{@link sportProgram.SportProgram#getLibrarytype <em>Librarytype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Librarytype</em>' containment reference.
	 * @see #getLibrarytype()
	 * @generated
	 */
	void setLibrarytype(LibraryType value);

} // SportProgram
