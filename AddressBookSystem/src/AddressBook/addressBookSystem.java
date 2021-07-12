package AddressBook;

import java.util.Scanner;

public class addressBookSystem {
	public void addContact() {
		Scanner sc = new Scanner(System.in);
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

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		addressBookSystem Book = new addressBookSystem();
		Book.addContact();
	}
}
