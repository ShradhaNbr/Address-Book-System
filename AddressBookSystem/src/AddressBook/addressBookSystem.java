package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class addressBookSystem {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<contactDetails> arrayPerson = new ArrayList<>();

	public void addContact() {

		contactDetails contact = new contactDetails();
		System.out.println("Enter first name");
		contact.setfirstName(sc.next());
		System.out.println("Enter last name");
		contact.setlastName(sc.next());
		System.out.println("Enter address");
		contact.setaddress(sc.next());
		System.out.println("Enter city");
		contact.setcity(sc.next());
		System.out.println("Enter state");
		contact.setstate(sc.next());
		System.out.println("Enter email");
		contact.setemail(sc.next());
		System.out.println("Enter zip code");
		contact.setzipCode(sc.nextLong());
		System.out.println("Enter phone Number");
		contact.setphoneNumber(sc.nextLong());
		arrayPerson.add(contact);

	}

	public void editDetails() {
		System.out.println("Confirm the first name to edit details");
		String name = sc.next();
		for (int i = 0; i < arrayPerson.size(); i++) {
			if (arrayPerson.get(i).getfirstName().equals(name)) {
				System.out.println(
						"Select what you want to edit 1.first name 2.last name 3. address 4. city 5.state 6.email 7.zip code 8.phone number");
				int select = sc.nextInt();
				switch (select) {
				case 1:
					System.out.println("Enter new first name");
					arrayPerson.get(i).setfirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					arrayPerson.get(i).setlastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new address");
					arrayPerson.get(i).setaddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new city");
					arrayPerson.get(i).setcity(sc.next());
					break;
				case 5:
					System.out.println("Enter new state");
					arrayPerson.get(i).setstate(sc.next());
					break;
				case 6:
					System.out.println("Enter new email");
					arrayPerson.get(i).setemail(sc.next());
					break;
				case 7:
					System.out.println("Enter new zip code");
					arrayPerson.get(i).setzipCode(sc.nextLong());
					break;
				case 8:
					System.out.println("Enter new phone number");
					arrayPerson.get(i).setphoneNumber(sc.nextLong());
					break;
				}
				System.out.println("Edited values are" + arrayPerson);
			}
			else 
				System.out.println("Invalid name");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		addressBookSystem Book = new addressBookSystem();
		Book.addContact();
		Book.editDetails();

	}

}