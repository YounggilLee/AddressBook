/** 
 * Assignment:  Assignment3
 * Program: Computer Programmer
 * 
 * Making Address Program
 *
 * 
 * @author Younggil Lee
 *
 */

/**
 * The Class Person.
 * 
 * constructors and methods for adding and retrieving information that is
 * created
 * 
 */
public class Person {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The address. */
	private String address;

	/** The phone. */
	private String phone;

	/**
	 * Instantiates a new person.
	 */
	public Person() {

	}

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @param address
	 *            the address
	 * @param phone
	 *            the phone
	 */
	public Person(String firstName, String lastName, String address,
			String phone) {

		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPhone(phone);

	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone
	 *            the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*
	 * display data
	 * 
	 * @see person information
	 */
	@Override
	public String toString() {
		return firstName + "" + lastName + ", address: " + address
				+ ", phone: " + phone;
	}

}
