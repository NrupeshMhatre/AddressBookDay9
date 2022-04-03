package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddContactUC2 {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNo;
	String email;

	AddContactUC2(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		int phoneNo;
		String email;
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		List<AddContactUC2> list = new ArrayList();

		System.out.println("Enter first name");
		firstName = sc.nextLine();

		System.out.println("Enter second name");
		lastName = sc.nextLine();

		System.out.println("Enter address");
		address = sc.nextLine();

		System.out.println("Enter city");
		city = sc.nextLine();

		System.out.println("Enter state");
		state = sc.nextLine();

		System.out.println("Enter zip");
		zip = scanner.nextInt();

		System.out.println("Enter phone no");
		phoneNo = scanner.nextInt();

		System.out.println("Enter email");
		email = sc.nextLine();

		AddContactUC2 contact = new AddContactUC2(firstName,lastName,address,city,state,zip,phoneNo,email);
		list.add(contact);
		System.out.println(contact);

	}

}