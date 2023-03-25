/**
 */
package sportProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sportProgram.SportProgramFactory
 * @model kind="package"
 * @generated
 */
public interface SportProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sportProgram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sportProgram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sportProgram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SportProgramPackage eINSTANCE = sportProgram.impl.SportProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link sportProgram.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.TrainingImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 0;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__INTENSITY = 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__FREQUENCY = 1;

	/**
	 * The feature id for the '<em><b>Mulscle Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__MULSCLE_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.impl.PreferencesImpl <em>Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.PreferencesImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getPreferences()
	 * @generated
	 */
	int PREFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__AVAILABILITY = 0;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__EQUIPMENT = 1;

	/**
	 * The feature id for the '<em><b>Disability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__DISABILITY = 2;

	/**
	 * The number of structural features of the '<em>Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.impl.ProgramDurationImpl <em>Program Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.ProgramDurationImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getProgramDuration()
	 * @generated
	 */
	int PROGRAM_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DURATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DURATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Program Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.impl.SportProgramImpl <em>Sport Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.SportProgramImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getSportProgram()
	 * @generated
	 */
	int SPORT_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Programduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM__PROGRAMDURATION = 0;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM__PREFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Training</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM__TRAINING = 2;

	/**
	 * The feature id for the '<em><b>Librarytype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM__LIBRARYTYPE = 3;

	/**
	 * The number of structural features of the '<em>Sport Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sport Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.TypeImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.impl.LibraryTypeImpl <em>Library Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.impl.LibraryTypeImpl
	 * @see sportProgram.impl.SportProgramPackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Library Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sportProgram.EnumIntensity <em>Enum Intensity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.EnumIntensity
	 * @see sportProgram.impl.SportProgramPackageImpl#getEnumIntensity()
	 * @generated
	 */
	int ENUM_INTENSITY = 6;

	/**
	 * The meta object id for the '{@link sportProgram.EnumMuscleTarget <em>Enum Muscle Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.EnumMuscleTarget
	 * @see sportProgram.impl.SportProgramPackageImpl#getEnumMuscleTarget()
	 * @generated
	 */
	int ENUM_MUSCLE_TARGET = 7;

	/**
	 * The meta object id for the '{@link sportProgram.EnumAvailability <em>Enum Availability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.EnumAvailability
	 * @see sportProgram.impl.SportProgramPackageImpl#getEnumAvailability()
	 * @generated
	 */
	int ENUM_AVAILABILITY = 8;

	/**
	 * The meta object id for the '{@link sportProgram.EnumPrgDurationType <em>Enum Prg Duration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sportProgram.EnumPrgDurationType
	 * @see sportProgram.impl.SportProgramPackageImpl#getEnumPrgDurationType()
	 * @generated
	 */
	int ENUM_PRG_DURATION_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link sportProgram.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see sportProgram.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Training#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see sportProgram.Training#getIntensity()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Training#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see sportProgram.Training#getFrequency()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Training#getMulscleTarget <em>Mulscle Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mulscle Target</em>'.
	 * @see sportProgram.Training#getMulscleTarget()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_MulscleTarget();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Training#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see sportProgram.Training#getDuration()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Duration();

	/**
	 * Returns the meta object for the reference '{@link sportProgram.Training#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sportProgram.Training#getType()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_Type();

	/**
	 * Returns the meta object for class '{@link sportProgram.Preferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preferences</em>'.
	 * @see sportProgram.Preferences
	 * @generated
	 */
	EClass getPreferences();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Preferences#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see sportProgram.Preferences#getAvailability()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Availability();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Preferences#isEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipment</em>'.
	 * @see sportProgram.Preferences#isEquipment()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Equipment();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Preferences#getDisability <em>Disability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability</em>'.
	 * @see sportProgram.Preferences#getDisability()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Disability();

	/**
	 * Returns the meta object for class '{@link sportProgram.ProgramDuration <em>Program Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Duration</em>'.
	 * @see sportProgram.ProgramDuration
	 * @generated
	 */
	EClass getProgramDuration();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.ProgramDuration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sportProgram.ProgramDuration#getType()
	 * @see #getProgramDuration()
	 * @generated
	 */
	EAttribute getProgramDuration_Type();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.ProgramDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sportProgram.ProgramDuration#getValue()
	 * @see #getProgramDuration()
	 * @generated
	 */
	EAttribute getProgramDuration_Value();

	/**
	 * Returns the meta object for class '{@link sportProgram.SportProgram <em>Sport Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sport Program</em>'.
	 * @see sportProgram.SportProgram
	 * @generated
	 */
	EClass getSportProgram();

	/**
	 * Returns the meta object for the containment reference '{@link sportProgram.SportProgram#getProgramduration <em>Programduration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programduration</em>'.
	 * @see sportProgram.SportProgram#getProgramduration()
	 * @see #getSportProgram()
	 * @generated
	 */
	EReference getSportProgram_Programduration();

	/**
	 * Returns the meta object for the containment reference '{@link sportProgram.SportProgram#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferences</em>'.
	 * @see sportProgram.SportProgram#getPreferences()
	 * @see #getSportProgram()
	 * @generated
	 */
	EReference getSportProgram_Preferences();

	/**
	 * Returns the meta object for the containment reference list '{@link sportProgram.SportProgram#getTraining <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training</em>'.
	 * @see sportProgram.SportProgram#getTraining()
	 * @see #getSportProgram()
	 * @generated
	 */
	EReference getSportProgram_Training();

	/**
	 * Returns the meta object for the containment reference '{@link sportProgram.SportProgram#getLibrarytype <em>Librarytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Librarytype</em>'.
	 * @see sportProgram.SportProgram#getLibrarytype()
	 * @see #getSportProgram()
	 * @generated
	 */
	EReference getSportProgram_Librarytype();

	/**
	 * Returns the meta object for class '{@link sportProgram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see sportProgram.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link sportProgram.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sportProgram.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link sportProgram.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Type</em>'.
	 * @see sportProgram.LibraryType
	 * @generated
	 */
	EClass getLibraryType();

	/**
	 * Returns the meta object for the containment reference list '{@link sportProgram.LibraryType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see sportProgram.LibraryType#getType()
	 * @see #getLibraryType()
	 * @generated
	 */
	EReference getLibraryType_Type();

	/**
	 * Returns the meta object for enum '{@link sportProgram.EnumIntensity <em>Enum Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Intensity</em>'.
	 * @see sportProgram.EnumIntensity
	 * @generated
	 */
	EEnum getEnumIntensity();

	/**
	 * Returns the meta object for enum '{@link sportProgram.EnumMuscleTarget <em>Enum Muscle Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Muscle Target</em>'.
	 * @see sportProgram.EnumMuscleTarget
	 * @generated
	 */
	EEnum getEnumMuscleTarget();

	/**
	 * Returns the meta object for enum '{@link sportProgram.EnumAvailability <em>Enum Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Availability</em>'.
	 * @see sportProgram.EnumAvailability
	 * @generated
	 */
	EEnum getEnumAvailability();

	/**
	 * Returns the meta object for enum '{@link sportProgram.EnumPrgDurationType <em>Enum Prg Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Prg Duration Type</em>'.
	 * @see sportProgram.EnumPrgDurationType
	 * @generated
	 */
	EEnum getEnumPrgDurationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SportProgramFactory getSportProgramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sportProgram.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.TrainingImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__INTENSITY = eINSTANCE.getTraining_Intensity();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__FREQUENCY = eINSTANCE.getTraining_Frequency();

		/**
		 * The meta object literal for the '<em><b>Mulscle Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__MULSCLE_TARGET = eINSTANCE.getTraining_MulscleTarget();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__DURATION = eINSTANCE.getTraining_Duration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__TYPE = eINSTANCE.getTraining_Type();

		/**
		 * The meta object literal for the '{@link sportProgram.impl.PreferencesImpl <em>Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.PreferencesImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getPreferences()
		 * @generated
		 */
		EClass PREFERENCES = eINSTANCE.getPreferences();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__AVAILABILITY = eINSTANCE.getPreferences_Availability();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__EQUIPMENT = eINSTANCE.getPreferences_Equipment();

		/**
		 * The meta object literal for the '<em><b>Disability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__DISABILITY = eINSTANCE.getPreferences_Disability();

		/**
		 * The meta object literal for the '{@link sportProgram.impl.ProgramDurationImpl <em>Program Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.ProgramDurationImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getProgramDuration()
		 * @generated
		 */
		EClass PROGRAM_DURATION = eINSTANCE.getProgramDuration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_DURATION__TYPE = eINSTANCE.getProgramDuration_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_DURATION__VALUE = eINSTANCE.getProgramDuration_Value();

		/**
		 * The meta object literal for the '{@link sportProgram.impl.SportProgramImpl <em>Sport Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.SportProgramImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getSportProgram()
		 * @generated
		 */
		EClass SPORT_PROGRAM = eINSTANCE.getSportProgram();

		/**
		 * The meta object literal for the '<em><b>Programduration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORT_PROGRAM__PROGRAMDURATION = eINSTANCE.getSportProgram_Programduration();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORT_PROGRAM__PREFERENCES = eINSTANCE.getSportProgram_Preferences();

		/**
		 * The meta object literal for the '<em><b>Training</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORT_PROGRAM__TRAINING = eINSTANCE.getSportProgram_Training();

		/**
		 * The meta object literal for the '<em><b>Librarytype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORT_PROGRAM__LIBRARYTYPE = eINSTANCE.getSportProgram_Librarytype();

		/**
		 * The meta object literal for the '{@link sportProgram.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.TypeImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link sportProgram.impl.LibraryTypeImpl <em>Library Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.impl.LibraryTypeImpl
		 * @see sportProgram.impl.SportProgramPackageImpl#getLibraryType()
		 * @generated
		 */
		EClass LIBRARY_TYPE = eINSTANCE.getLibraryType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_TYPE__TYPE = eINSTANCE.getLibraryType_Type();

		/**
		 * The meta object literal for the '{@link sportProgram.EnumIntensity <em>Enum Intensity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.EnumIntensity
		 * @see sportProgram.impl.SportProgramPackageImpl#getEnumIntensity()
		 * @generated
		 */
		EEnum ENUM_INTENSITY = eINSTANCE.getEnumIntensity();

		/**
		 * The meta object literal for the '{@link sportProgram.EnumMuscleTarget <em>Enum Muscle Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.EnumMuscleTarget
		 * @see sportProgram.impl.SportProgramPackageImpl#getEnumMuscleTarget()
		 * @generated
		 */
		EEnum ENUM_MUSCLE_TARGET = eINSTANCE.getEnumMuscleTarget();

		/**
		 * The meta object literal for the '{@link sportProgram.EnumAvailability <em>Enum Availability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.EnumAvailability
		 * @see sportProgram.impl.SportProgramPackageImpl#getEnumAvailability()
		 * @generated
		 */
		EEnum ENUM_AVAILABILITY = eINSTANCE.getEnumAvailability();

		/**
		 * The meta object literal for the '{@link sportProgram.EnumPrgDurationType <em>Enum Prg Duration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sportProgram.EnumPrgDurationType
		 * @see sportProgram.impl.SportProgramPackageImpl#getEnumPrgDurationType()
		 * @generated
		 */
		EEnum ENUM_PRG_DURATION_TYPE = eINSTANCE.getEnumPrgDurationType();

	}

} //SportProgramPackage
