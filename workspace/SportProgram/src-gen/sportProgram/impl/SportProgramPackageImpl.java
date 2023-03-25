/**
 */
package sportProgram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sportProgram.EnumAvailability;
import sportProgram.EnumIntensity;
import sportProgram.EnumMuscleTarget;
import sportProgram.EnumPrgDurationType;
import sportProgram.LibraryType;
import sportProgram.Preferences;
import sportProgram.ProgramDuration;
import sportProgram.SportProgram;
import sportProgram.SportProgramFactory;
import sportProgram.SportProgramPackage;
import sportProgram.Training;
import sportProgram.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SportProgramPackageImpl extends EPackageImpl implements SportProgramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sportProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIntensityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMuscleTargetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAvailabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPrgDurationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sportProgram.SportProgramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SportProgramPackageImpl() {
		super(eNS_URI, SportProgramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SportProgramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SportProgramPackage init() {
		if (isInited)
			return (SportProgramPackage) EPackage.Registry.INSTANCE.getEPackage(SportProgramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSportProgramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SportProgramPackageImpl theSportProgramPackage = registeredSportProgramPackage instanceof SportProgramPackageImpl
				? (SportProgramPackageImpl) registeredSportProgramPackage
				: new SportProgramPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSportProgramPackage.createPackageContents();

		// Initialize created meta-data
		theSportProgramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSportProgramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SportProgramPackage.eNS_URI, theSportProgramPackage);
		return theSportProgramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraining() {
		return trainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_Intensity() {
		return (EAttribute) trainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_Frequency() {
		return (EAttribute) trainingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_MulscleTarget() {
		return (EAttribute) trainingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraining_Duration() {
		return (EAttribute) trainingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraining_Type() {
		return (EReference) trainingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferences() {
		return preferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferences_Availability() {
		return (EAttribute) preferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferences_Equipment() {
		return (EAttribute) preferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferences_Disability() {
		return (EAttribute) preferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramDuration() {
		return programDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDuration_Type() {
		return (EAttribute) programDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramDuration_Value() {
		return (EAttribute) programDurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSportProgram() {
		return sportProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSportProgram_Programduration() {
		return (EReference) sportProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSportProgram_Preferences() {
		return (EReference) sportProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSportProgram_Training() {
		return (EReference) sportProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSportProgram_Librarytype() {
		return (EReference) sportProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryType() {
		return libraryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryType_Type() {
		return (EReference) libraryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIntensity() {
		return enumIntensityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumMuscleTarget() {
		return enumMuscleTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAvailability() {
		return enumAvailabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumPrgDurationType() {
		return enumPrgDurationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportProgramFactory getSportProgramFactory() {
		return (SportProgramFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		trainingEClass = createEClass(TRAINING);
		createEAttribute(trainingEClass, TRAINING__INTENSITY);
		createEAttribute(trainingEClass, TRAINING__FREQUENCY);
		createEAttribute(trainingEClass, TRAINING__MULSCLE_TARGET);
		createEAttribute(trainingEClass, TRAINING__DURATION);
		createEReference(trainingEClass, TRAINING__TYPE);

		preferencesEClass = createEClass(PREFERENCES);
		createEAttribute(preferencesEClass, PREFERENCES__AVAILABILITY);
		createEAttribute(preferencesEClass, PREFERENCES__EQUIPMENT);
		createEAttribute(preferencesEClass, PREFERENCES__DISABILITY);

		programDurationEClass = createEClass(PROGRAM_DURATION);
		createEAttribute(programDurationEClass, PROGRAM_DURATION__TYPE);
		createEAttribute(programDurationEClass, PROGRAM_DURATION__VALUE);

		sportProgramEClass = createEClass(SPORT_PROGRAM);
		createEReference(sportProgramEClass, SPORT_PROGRAM__PROGRAMDURATION);
		createEReference(sportProgramEClass, SPORT_PROGRAM__PREFERENCES);
		createEReference(sportProgramEClass, SPORT_PROGRAM__TRAINING);
		createEReference(sportProgramEClass, SPORT_PROGRAM__LIBRARYTYPE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		libraryTypeEClass = createEClass(LIBRARY_TYPE);
		createEReference(libraryTypeEClass, LIBRARY_TYPE__TYPE);

		// Create enums
		enumIntensityEEnum = createEEnum(ENUM_INTENSITY);
		enumMuscleTargetEEnum = createEEnum(ENUM_MUSCLE_TARGET);
		enumAvailabilityEEnum = createEEnum(ENUM_AVAILABILITY);
		enumPrgDurationTypeEEnum = createEEnum(ENUM_PRG_DURATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(trainingEClass, Training.class, "Training", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraining_Intensity(), this.getEnumIntensity(), "Intensity", "", 0, 1, Training.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraining_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, Training.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraining_MulscleTarget(), this.getEnumMuscleTarget(), "mulscleTarget", "", 0, 1,
				Training.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraining_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Training.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraining_Type(), this.getType(), null, "type", null, 1, 1, Training.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(preferencesEClass, Preferences.class, "Preferences", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreferences_Availability(), this.getEnumAvailability(), "availability", "", 0, 1,
				Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreferences_Equipment(), ecorePackage.getEBoolean(), "equipment", "false", 0, 1,
				Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreferences_Disability(), this.getEnumMuscleTarget(), "disability", null, 0, 1,
				Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(programDurationEClass, ProgramDuration.class, "ProgramDuration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramDuration_Type(), this.getEnumPrgDurationType(), "type", null, 0, 1,
				ProgramDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramDuration_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ProgramDuration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sportProgramEClass, SportProgram.class, "SportProgram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSportProgram_Programduration(), this.getProgramDuration(), null, "programduration", null, 1,
				1, SportProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSportProgram_Preferences(), this.getPreferences(), null, "preferences", null, 0, 1,
				SportProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSportProgram_Training(), this.getTraining(), null, "training", null, 0, -1,
				SportProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSportProgram_Librarytype(), this.getLibraryType(), null, "librarytype", null, 0, 1,
				SportProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryTypeEClass, LibraryType.class, "LibraryType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryType_Type(), this.getType(), null, "type", null, 0, -1, LibraryType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumIntensityEEnum, EnumIntensity.class, "EnumIntensity");
		addEEnumLiteral(enumIntensityEEnum, EnumIntensity.LOW);
		addEEnumLiteral(enumIntensityEEnum, EnumIntensity.MEDIUM);
		addEEnumLiteral(enumIntensityEEnum, EnumIntensity.HIGH);

		initEEnum(enumMuscleTargetEEnum, EnumMuscleTarget.class, "EnumMuscleTarget");
		addEEnumLiteral(enumMuscleTargetEEnum, EnumMuscleTarget.NONE);
		addEEnumLiteral(enumMuscleTargetEEnum, EnumMuscleTarget.UPPER_BODY);
		addEEnumLiteral(enumMuscleTargetEEnum, EnumMuscleTarget.LOWER_BODY);
		addEEnumLiteral(enumMuscleTargetEEnum, EnumMuscleTarget.MIXED);

		initEEnum(enumAvailabilityEEnum, EnumAvailability.class, "EnumAvailability");
		addEEnumLiteral(enumAvailabilityEEnum, EnumAvailability.MORNING);
		addEEnumLiteral(enumAvailabilityEEnum, EnumAvailability.AFTERNOON);
		addEEnumLiteral(enumAvailabilityEEnum, EnumAvailability.EVENING);
		addEEnumLiteral(enumAvailabilityEEnum, EnumAvailability.FLEXIBLE);

		initEEnum(enumPrgDurationTypeEEnum, EnumPrgDurationType.class, "EnumPrgDurationType");
		addEEnumLiteral(enumPrgDurationTypeEEnum, EnumPrgDurationType.WEEKS);
		addEEnumLiteral(enumPrgDurationTypeEEnum, EnumPrgDurationType.MONTHS);

		// Create resource
		createResource(eNS_URI);
	}

} //SportProgramPackageImpl
