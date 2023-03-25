/**
 */
package sportProgram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sportProgram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SportProgramFactoryImpl extends EFactoryImpl implements SportProgramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SportProgramFactory init() {
		try {
			SportProgramFactory theSportProgramFactory = (SportProgramFactory) EPackage.Registry.INSTANCE
					.getEFactory(SportProgramPackage.eNS_URI);
			if (theSportProgramFactory != null) {
				return theSportProgramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SportProgramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportProgramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SportProgramPackage.TRAINING:
			return createTraining();
		case SportProgramPackage.PREFERENCES:
			return createPreferences();
		case SportProgramPackage.PROGRAM_DURATION:
			return createProgramDuration();
		case SportProgramPackage.SPORT_PROGRAM:
			return createSportProgram();
		case SportProgramPackage.TYPE:
			return createType();
		case SportProgramPackage.LIBRARY_TYPE:
			return createLibraryType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SportProgramPackage.ENUM_INTENSITY:
			return createEnumIntensityFromString(eDataType, initialValue);
		case SportProgramPackage.ENUM_MUSCLE_TARGET:
			return createEnumMuscleTargetFromString(eDataType, initialValue);
		case SportProgramPackage.ENUM_AVAILABILITY:
			return createEnumAvailabilityFromString(eDataType, initialValue);
		case SportProgramPackage.ENUM_PRG_DURATION_TYPE:
			return createEnumPrgDurationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SportProgramPackage.ENUM_INTENSITY:
			return convertEnumIntensityToString(eDataType, instanceValue);
		case SportProgramPackage.ENUM_MUSCLE_TARGET:
			return convertEnumMuscleTargetToString(eDataType, instanceValue);
		case SportProgramPackage.ENUM_AVAILABILITY:
			return convertEnumAvailabilityToString(eDataType, instanceValue);
		case SportProgramPackage.ENUM_PRG_DURATION_TYPE:
			return convertEnumPrgDurationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Training createTraining() {
		TrainingImpl training = new TrainingImpl();
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preferences createPreferences() {
		PreferencesImpl preferences = new PreferencesImpl();
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDuration createProgramDuration() {
		ProgramDurationImpl programDuration = new ProgramDurationImpl();
		return programDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportProgram createSportProgram() {
		SportProgramImpl sportProgram = new SportProgramImpl();
		return sportProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryType createLibraryType() {
		LibraryTypeImpl libraryType = new LibraryTypeImpl();
		return libraryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIntensity createEnumIntensityFromString(EDataType eDataType, String initialValue) {
		EnumIntensity result = EnumIntensity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIntensityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMuscleTarget createEnumMuscleTargetFromString(EDataType eDataType, String initialValue) {
		EnumMuscleTarget result = EnumMuscleTarget.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumMuscleTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAvailability createEnumAvailabilityFromString(EDataType eDataType, String initialValue) {
		EnumAvailability result = EnumAvailability.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPrgDurationType createEnumPrgDurationTypeFromString(EDataType eDataType, String initialValue) {
		EnumPrgDurationType result = EnumPrgDurationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumPrgDurationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportProgramPackage getSportProgramPackage() {
		return (SportProgramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SportProgramPackage getPackage() {
		return SportProgramPackage.eINSTANCE;
	}

} //SportProgramFactoryImpl
