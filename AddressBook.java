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

import java.util.*;

/**
 * The Class AddressBook witch is inheritaged from Person. contain arrayList of
 * Person objects and adding,deleting,searching,showing, changing methods
 */
public class AddressBook extends Person {

	/**
	 * The tempIndex for storing specific array index
	 *  
	 */
	int tempIndex = 0;

	/**
	 * Instantiates a new address book.
	 */
	public AddressBook() {
		
		super();
		
	}

	/**
	 * Instantiates a new address book.
	 * 
	 * @param firstName
	 *            the first name is inputed by the user
	 * @param lastName
	 *            the last name is inputed by the user
	 * @param address
	 *            the address is inputed by the user
	 * @param phone
	 *            the phone is inputed by the user
	 */
	public AddressBook(String firstName, String lastName, String address,
			String phone) {

		super(firstName, lastName, address, phone);
		
	}

	/** Construct Scanner . */
	Scanner in = new Scanner(System.in);

	/** The ps is reference variable of person in arrayList. */
	ArrayList<Person> ps = new ArrayList<Person>();

	/**
	 * Adds the person.
	 * 
	 * adding person information to array
	 */
	public void addPerson() {

		System.out.print("Enter persons first and last name :");
		String firstName = in.next();
		String lastName = in.nextLine();

		System.out.print("Enter address :");
		String address = in.nextLine();
		
		System.out.print("Enter phone :");
		String phone = in.nextLine();

		ps.add(new AddressBook(firstName, lastName, address, phone));
		
		System.out.println("Person added!");

	}

	/**
	 * Delete person information from arrayList.
	 */
	public void deletePerson() {

		System.out.print("Enter persons first and last name :");
		String firstName = in.next();
		String lastName = in.next();

		boolean result = checkArray(firstName, lastName);
		
		if (result == true) {
			
			ps.remove(this.tempIndex);
			
			System.out.println("Person deleted");
			
		} else {
			
			System.out.println("person not found");
			
		}
	}

	/**
	 * Search person on arrayList.
	 */
	public void searchPerson() {

		System.out.print("Enter persons first and last name :");
		String firstName = in.next();
		String lastName = in.next();
		
		boolean result = checkArray(firstName, lastName);
		
		if (result == true) {
			
			System.out.println(ps.get(this.tempIndex));
			
		} else {
			
			System.out.println("person not found");
			
		}

	}

	/**
	 * Change person information to new.
	 */
	public void changePerson() {

		System.out.print("Enter persons first and last name :");
		String firstName = in.next();
		String lastName = in.nextLine();

		boolean result = checkArray(firstName, lastName);

		if (result == false) {
			
			System.out.println("person not found");

		}
		System.out.print("============================" + "\n"
				+ "| 1. Change Person address |" + "\n"
				+ "| 2. Change Person phone   |" + "\n"
				+ "============================" + "\n" + "Select Option :");

		int ans = Integer.parseInt(in.nextLine());

		if (ans == 1) {
			System.out.print("Enter address :");
			
			String newAddress = in.nextLine();
			
			ps.get(tempIndex).setAddress(newAddress);

			System.out.println("Address changed");
			
		} else {
			System.out.print("Enter phone :");
			
			String newPhone = in.nextLine();
			
			ps.get(tempIndex).setPhone(newPhone);
			
			System.out.println("Phone changed");
		}
	}

	/**
	 * Check person information on array. and also set array index to tempIndex
	 * to change or delete person information
	 *
	 * @param firstName
	 *            the first name is inputed by the user
	 * @param lastName
	 *            the last name is inputed by the user
	 * @return true, if name is existed in arrayLsit, return true. if not,
	 *         return false
	 */
	public boolean checkArray(String firstName, String lastName) {

		for (int i = 0; i < ps.size(); i++) {

			if (ps.get(i).getFirstName().equals(firstName)
					|| ps.get(i).getFirstName().equals(lastName)) {
				
				this.tempIndex = i;
				
				return true;
			}
		}

		return false;
	}

	/**
	 * Show information for Person.
	 * 
	 * if arrayList is not empty, print all array data.
	 * 
	 */
	public void showInfo() {

		if (ps.isEmpty()) {

			System.out.println("Empty");

		} else {

			for (int i = 0; i < ps.size(); i++) {

				System.out.println(ps.get(i));
			}
		}
	}

}
