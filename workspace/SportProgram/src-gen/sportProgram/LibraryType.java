/**
 */
package sportProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sportProgram.LibraryType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sportProgram.SportProgramPackage#getLibraryType()
 * @model
 * @generated
 */
public interface LibraryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link sportProgram.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see sportProgram.SportProgramPackage#getLibraryType_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getType();

} // LibraryType
