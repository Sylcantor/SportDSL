/**
 */
package sportProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Availability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sportProgram.SportProgramPackage#getEnumAvailability()
 * @model
 * @generated
 */
public enum EnumAvailability implements Enumerator {
	/**
	 * The '<em><b>Morning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORNING_VALUE
	 * @generated
	 * @ordered
	 */
	MORNING(0, "Morning", "Morning"),

	/**
	 * The '<em><b>Afternoon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTERNOON_VALUE
	 * @generated
	 * @ordered
	 */
	AFTERNOON(1, "Afternoon", "Afternoon"),

	/**
	 * The '<em><b>Evening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENING_VALUE
	 * @generated
	 * @ordered
	 */
	EVENING(2, "Evening", "Evening"),

	/**
	 * The '<em><b>Flexible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEXIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	FLEXIBLE(3, "Flexible", "Flexible");

	/**
	 * The '<em><b>Morning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORNING
	 * @model name="Morning"
	 * @generated
	 * @ordered
	 */
	public static final int MORNING_VALUE = 0;

	/**
	 * The '<em><b>Afternoon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTERNOON
	 * @model name="Afternoon"
	 * @generated
	 * @ordered
	 */
	public static final int AFTERNOON_VALUE = 1;

	/**
	 * The '<em><b>Evening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENING
	 * @model name="Evening"
	 * @generated
	 * @ordered
	 */
	public static final int EVENING_VALUE = 2;

	/**
	 * The '<em><b>Flexible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEXIBLE
	 * @model name="Flexible"
	 * @generated
	 * @ordered
	 */
	public static final int FLEXIBLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumAvailability[] VALUES_ARRAY = new EnumAvailability[] { MORNING, AFTERNOON, EVENING,
			FLEXIBLE, };

	/**
	 * A public read-only list of all the '<em><b>Enum Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumAvailability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Availability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumAvailability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAvailability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Availability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumAvailability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumAvailability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Availability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumAvailability get(int value) {
		switch (value) {
		case MORNING_VALUE:
			return MORNING;
		case AFTERNOON_VALUE:
			return AFTERNOON;
		case EVENING_VALUE:
			return EVENING;
		case FLEXIBLE_VALUE:
			return FLEXIBLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumAvailability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EnumAvailability
