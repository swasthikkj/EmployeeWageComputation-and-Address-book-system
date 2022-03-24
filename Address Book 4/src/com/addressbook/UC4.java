package com.addressbook;

import java.util.ArrayList;

import java.util.Scanner;

public class UC4 {
	private ArrayList<contact> person; 
	public void AddressBookMain() {
		person = new ArrayList<contact>();
	}

	public void addContact(contact c) {
		person.add(c);
	}

	public static void menu()
	{
		System.out.println("Press 1 for Adding a new contact to your address book.");
		System.out.println("Press 2 for Editing Existing contact");
		System.out.println("Press 3 for Deleting Existing Contact");
		System.out.println("Press 4 to Quit.");
	}

	int haveContact(String s) {
		for (int i = 0; i < person.size(); i++)
			if (person.get(i).getfName().equals(s))
				return i;

		return -1;
	}
	
	public void editContact(String s) {
		Scanner scan = new Scanner(System.in);
		int place = haveContact(s);
		if (place >= 0) {
			System.out.println("Enter Last name");
			String lname = scan.next();
			System.out.println("Enter Phone Number");
			int phoneNumber = scan.nextInt();
			System.out.println("Enter City");
			String city = scan.next();
			System.out.println("Enter State");
			String state = scan.next();
			System.out.println("Enter Pin Code");
			int pinCode = scan.nextInt();
			contact obj = new contact(s, lname, phoneNumber, city, state, pinCode);
			person.set(place, obj);
		} else if (place == -1) ;
		{
			System.out.println("\nFirst Name Not Match\n");
		}
	}

	public void deleteContact(String s) {
		int place = haveContact(s);
		if (place >= 0)
			person.remove(place);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UC4 obj = new UC4();
		menu();
		int choice = scanner.nextInt();
		while (choice != 3) {
			if (choice == 1) {
				System.out.println("Enter First Name:");
				String fName = scanner.next();
				System.out.println("Enter Last NAme");
				String lName = scanner.next();
				System.out.println("Enter  phone number.");
				int number = scanner.nextInt();
				System.out.println("Enter The City");
				String city = scanner.next();
				System.out.println("Enter The State");
				String state = scanner.next();
				System.out.println("Enter the pin code");
				int pinCode = scanner.nextInt();
				obj.addContact(new contact(fName, lName, number, city, state, pinCode));
			}
			else if (choice == 2) {
				System.out.println("Enter the First Name of the contact you want to edit?");
				String fName = scanner.next();
				obj.editContact(fName);

			}
			else if (choice == 3) {
				System.out.println("What is the First name of the contact you want to delete?");
				String fName = scanner.next();
				obj.deleteContact(fName);
			}
			choice = scanner.nextInt();
		}
	}
}
