package AddressBook;

import java.util.Scanner;

public class contactDetails {
	String firstName, lastName, address, city, state, email;
	long zipCode, phoneNumber;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public long getzipCode() {
		return zipCode;
	}

	public void setzipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public long getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	// To overide
	public String toString() {
		return " first name: " + firstName + "last name: " + lastName + "address: " + address + "city: " + city + "state: "
				+ state + "email: " + email + "zipcode: " + zipCode + " phone number: " + phoneNumber;
	}

}
