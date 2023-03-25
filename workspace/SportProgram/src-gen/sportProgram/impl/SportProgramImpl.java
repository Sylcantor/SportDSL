/**
 */
package sportProgram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sportProgram.LibraryType;
import sportProgram.Preferences;
import sportProgram.ProgramDuration;
import sportProgram.SportProgram;
import sportProgram.SportProgramPackage;
import sportProgram.Training;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sport Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.impl.SportProgramImpl#getProgramduration <em>Programduration</em>}</li>
 *   <li>{@link sportProgram.impl.SportProgramImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link sportProgram.impl.SportProgramImpl#getTraining <em>Training</em>}</li>
 *   <li>{@link sportProgram.impl.SportProgramImpl#getLibrarytype <em>Librarytype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SportProgramImpl extends MinimalEObjectImpl.Container implements SportProgram {
	/**
	 * The cached value of the '{@link #getProgramduration() <em>Programduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramduration()
	 * @generated
	 * @ordered
	 */
	protected ProgramDuration programduration;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected Preferences preferences;

	/**
	 * The cached value of the '{@link #getTraining() <em>Training</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraining()
	 * @generated
	 * @ordered
	 */
	protected EList<Training> training;

	/**
	 * The cached value of the '{@link #getLibrarytype() <em>Librarytype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrarytype()
	 * @generated
	 * @ordered
	 */
	protected LibraryType librarytype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SportProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SportProgramPackage.Literals.SPORT_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDuration getProgramduration() {
		return programduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramduration(ProgramDuration newProgramduration, NotificationChain msgs) {
		ProgramDuration oldProgramduration = programduration;
		programduration = newProgramduration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION, oldProgramduration, newProgramduration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramduration(ProgramDuration newProgramduration) {
		if (newProgramduration != programduration) {
			NotificationChain msgs = null;
			if (programduration != null)
				msgs = ((InternalEObject) programduration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION, null, msgs);
			if (newProgramduration != null)
				msgs = ((InternalEObject) newProgramduration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION, null, msgs);
			msgs = basicSetProgramduration(newProgramduration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION,
					newProgramduration, newProgramduration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preferences getPreferences() {
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferences(Preferences newPreferences, NotificationChain msgs) {
		Preferences oldPreferences = preferences;
		preferences = newPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SportProgramPackage.SPORT_PROGRAM__PREFERENCES, oldPreferences, newPreferences);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferences(Preferences newPreferences) {
		if (newPreferences != preferences) {
			NotificationChain msgs = null;
			if (preferences != null)
				msgs = ((InternalEObject) preferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__PREFERENCES, null, msgs);
			if (newPreferences != null)
				msgs = ((InternalEObject) newPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__PREFERENCES, null, msgs);
			msgs = basicSetPreferences(newPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.SPORT_PROGRAM__PREFERENCES,
					newPreferences, newPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Training> getTraining() {
		if (training == null) {
			training = new EObjectContainmentEList<Training>(Training.class, this,
					SportProgramPackage.SPORT_PROGRAM__TRAINING);
		}
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryType getLibrarytype() {
		return librarytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrarytype(LibraryType newLibrarytype, NotificationChain msgs) {
		LibraryType oldLibrarytype = librarytype;
		librarytype = newLibrarytype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE, oldLibrarytype, newLibrarytype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrarytype(LibraryType newLibrarytype) {
		if (newLibrarytype != librarytype) {
			NotificationChain msgs = null;
			if (librarytype != null)
				msgs = ((InternalEObject) librarytype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE, null, msgs);
			if (newLibrarytype != null)
				msgs = ((InternalEObject) newLibrarytype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE, null, msgs);
			msgs = basicSetLibrarytype(newLibrarytype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE,
					newLibrarytype, newLibrarytype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION:
			return basicSetProgramduration(null, msgs);
		case SportProgramPackage.SPORT_PROGRAM__PREFERENCES:
			return basicSetPreferences(null, msgs);
		case SportProgramPackage.SPORT_PROGRAM__TRAINING:
			return ((InternalEList<?>) getTraining()).basicRemove(otherEnd, msgs);
		case SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE:
			return basicSetLibrarytype(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION:
			return getProgramduration();
		case SportProgramPackage.SPORT_PROGRAM__PREFERENCES:
			return getPreferences();
		case SportProgramPackage.SPORT_PROGRAM__TRAINING:
			return getTraining();
		case SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE:
			return getLibrarytype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION:
			setProgramduration((ProgramDuration) newValue);
			return;
		case SportProgramPackage.SPORT_PROGRAM__PREFERENCES:
			setPreferences((Preferences) newValue);
			return;
		case SportProgramPackage.SPORT_PROGRAM__TRAINING:
			getTraining().clear();
			getTraining().addAll((Collection<? extends Training>) newValue);
			return;
		case SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE:
			setLibrarytype((LibraryType) newValue);
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
		case SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION:
			setProgramduration((ProgramDuration) null);
			return;
		case SportProgramPackage.SPORT_PROGRAM__PREFERENCES:
			setPreferences((Preferences) null);
			return;
		case SportProgramPackage.SPORT_PROGRAM__TRAINING:
			getTraining().clear();
			return;
		case SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE:
			setLibrarytype((LibraryType) null);
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
		case SportProgramPackage.SPORT_PROGRAM__PROGRAMDURATION:
			return programduration != null;
		case SportProgramPackage.SPORT_PROGRAM__PREFERENCES:
			return preferences != null;
		case SportProgramPackage.SPORT_PROGRAM__TRAINING:
			return training != null && !training.isEmpty();
		case SportProgramPackage.SPORT_PROGRAM__LIBRARYTYPE:
			return librarytype != null;
		}
		return super.eIsSet(featureID);
	}

} //SportProgramImpl
