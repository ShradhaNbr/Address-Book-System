package AddressBook;

import java.io.*;
import java.util.*;
  public class address{
public static void main(String[] args) {
	
}
      //Declare variables
      String first;
	  String last;
	  String homeadd;
	  String homeph;
	  String cellnum;

		Scanner sc =  new Scanner(System.in);

	  public address(String firstName, String lastName, String homeAddress, String homePhone, String cellNumber){
	  	first=firstName;
	  	last=lastName;
	  	homeadd=homeAddress;
	  	homeph=homePhone;
	  	cellnum=cellNumber;
	  }

	  public void printMenu(){
		System.out.println("1. Add a person to the address book.");
		System.out.println("2. See if a person is in the address book.");
		System.out.println("3. Print the address book.");
		System.out.println("4. Save the address book to disk.");
		System.out.println("5. Load the address book from disk.");
		System.out.println("6. Terminate the program.");

		int answer = sc.nextInt();

	//Switch to navigate menu
	switch (answer){
		case 1: getaddress();
		printMenu();
		break;
		case 2: //make method to search then print yes/no
		break;
		case 3: printMenu(); //make a method to print
		printMenu();
		break;
		case 4: getaddress(); //getaddress is unfinished
		break;
		case 5: getbook();
		break;
		case 6: System.exit(0);
		break;
		default: System.out.println("Enter a number between 1 and 6.");
		printMenu();
	}
}

      address(){
      }

		double contacts[];
      //Get address
      public void getaddress(){
		  System.out.println("How many contacts do you want to add?");
		  int number= sc.nextInt();
		  contacts = new double [number];
		  for( int i = 1; i<=number; i++){
		  System.out.println();
		  System.out.println("Enter contact "+i+ " first name:");
		  first = sc.next();
		  //outFile.print(first);
		  System.out.println("Enter contact "+i+ " last name:");
		  last = sc.next();
		  //outFile.print(last);
		  System.out.println("Enter contact " +i+ " home address.");
		  homeadd = sc.next();
		  //outFile.print(homeadd);
		  System.out.println("Enter contact " +i+ " home phone");
		  homeph = sc.next();
		  //outFile.print(homeph);
		  System.out.println("Enter contact "+i+ " cellphone");
		  cellnum = sc.next();
		  //outFile.print(cellnum);
	  }}

	  



	  public void getbook(){
		  //Declare variables
		  String infile;
		  String outfile;

		  //Get file locations
		  System.out.println("Enter location of the address book");
		  System.out.println("An example of this is C:hello.txt");
		  infile = sc.next();
		  System.out.println("Enter location of the output file.");
		  outfile = sc.next();
		  }
	  }