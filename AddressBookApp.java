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
 * The Class AddressBookApp.
 */

public class AddressBookApp {

	/**
	 * The main method.
	 * 
	 * Displaying menu items and allowing the user to select
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		AddressBookApp app = new AddressBookApp();

		AddressBook ab = new AddressBook();

		ArrayList<Person> ps = new ArrayList<Person>();

		while (true) {
			
			System.out.print(app.toString());

			int ans = in.nextInt();

			if (ans == 6) {
				System.out.println("Thanks!");
				break;
			}
			switch (ans) {

			case 1:
				ab.addPerson();
				break;

			case 2:
				ab.deletePerson();
				break;

			case 3:
				ab.searchPerson();
				break;

			case 4:
				ab.changePerson();
				break;

			case 5:
				ab.showInfo();
				break;

			}

		}

	}

	/*
	 * to show menu to user
	 * 
	 * @see menu for the user
	 */
	@Override
	public String toString() {

		return "===================================\n"
				+ "| 1. Add Person		          |\n"
				+ "| 2. Delete a Person	    	  |\n"
				+ "| 3. Search for a Person   	  |\n"
				+ "| 4. Change Person Data		  |\n"
				+ "| 5. Show address book info	  |\n" + "| 6. Exit			  |\n"
				+ "===================================" + "\n"
				+ "Select Option :";

	}

}
