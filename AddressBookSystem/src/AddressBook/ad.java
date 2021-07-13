package AddressBook;

import java.io.*;
import java.util.*;
   class Project{
	   static Scanner sc = new Scanner(System.in);


	   public static void main(String[] args){
		   int answer;
		   answer = 0;

		   //Call constructor and set those variables as null
		   address addressObject = new address();
		   addressObject.first = "null";
		   addressObject.last = "null";
		   addressObject.homeadd = "null";
		   addressObject.homeph = "null";
		   addressObject.cellnum = "null";





		   //Menu print
		   System.out.println("1. Add contacts to the address book.");
		   System.out.println("2. See if a person is in the address book.");
		   System.out.println("3. Print the address book.");
		   System.out.println("4. Save the address book to disk.");
		   System.out.println("5. Load the address book from disk.");
		   System.out.println("6. Terminate the program.");


		   //Get data member to navigate menu
			answer = sc.nextInt();
		   //Switch to navigate menu
		   switch (answer){
			   case 1: addressObject.getaddress();
			   addressObject.printMenu();
			   break;
			   case 2: //make method to search then print yes/no
			   break;
			   case 3: addressObject.getbook(); //make a method to print
			   break;
			   case 4: addressObject.getaddress(); //getaddress is unfinished
			   break;
			   case 5: addressObject.getbook();
			   break;
			   case 6: System.exit(0);
			   break;
			   default: System.out.println("Enter a number between 1 and 6.");
		   }
	   }
   }