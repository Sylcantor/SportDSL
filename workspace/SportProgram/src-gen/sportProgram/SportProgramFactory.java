/**
 */
package sportProgram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sportProgram.SportProgramPackage
 * @generated
 */
public interface SportProgramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SportProgramFactory eINSTANCE = sportProgram.impl.SportProgramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Training</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training</em>'.
	 * @generated
	 */
	Training createTraining();

	/**
	 * Returns a new object of class '<em>Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preferences</em>'.
	 * @generated
	 */
	Preferences createPreferences();

	/**
	 * Returns a new object of class '<em>Program Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Duration</em>'.
	 * @generated
	 */
	ProgramDuration createProgramDuration();

	/**
	 * Returns a new object of class '<em>Sport Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sport Program</em>'.
	 * @generated
	 */
	SportProgram createSportProgram();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Library Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Type</em>'.
	 * @generated
	 */
	LibraryType createLibraryType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SportProgramPackage getSportProgramPackage();

} //SportProgramFactory
