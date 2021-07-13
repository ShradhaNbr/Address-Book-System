package AddressBook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class addressBookSystem {
	static Scanner sc = new Scanner(System.in);
	String name;
	static ArrayList<contactDetails> arrayPerson = new ArrayList<>();
	static Dictionary<String, ArrayList<contactDetails>> dictionary = new Hashtable<>();
	
	public void newAddressBook() {
		System.out.println("Enter the name of the address book");
		name = sc.next();
		ArrayList<contactDetails> tempContact = new ArrayList<>();
		arrayPerson = tempContact;
		dictionary.put(name, arrayPerson);
		System.out.println("Enter the name of address book in which you want to enter");
		name = sc.next();
		ArrayList<contactDetails> tempContact1 = new ArrayList<>();
		arrayPerson = tempContact1;
		arrayPerson = dictionary.get(name);
	}

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
		System.out.println(arrayPerson);
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
			} else
				System.out.println("Invalid name");

		}
	}

	public void deletePerson() {
		System.out.println("Enter the first name to delete details");
		String Name = sc.next();
		for (int i = 0; i < arrayPerson.size(); i++) {
			if (arrayPerson.get(i).getfirstName().equals(Name)) {
				arrayPerson.remove(i);
			} else
				System.out.println("Invalid name");
			System.out.println("Array list" + arrayPerson);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		addressBookSystem Book = new addressBookSystem();
		while (true) {
			System.out.println("Enter what function you want to perform");
			System.out.println("1. Create new address book 2.add details 3. edit detalis 4. delete the person");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Book.newAddressBook();
				break;
			case 2:
				Book.addContact();
				break;
			case 3:
				Book.editDetails();
				break;
			case 4:
				Book.deletePerson();
				break;
			default:
				System.out.println("Invalid option");
			}

		}
	}

}
