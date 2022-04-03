package addressbook;
public class ContactUc1 {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNo;
	String email;

	ContactUc1(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo,
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

	public void displayContact() {
		System.out.println("First name:"+this.firstName+"\nLast name:"+this.lastName+
				"\nAddress:"+this.address+"\nCity:"+this.city+"\nstate:"+this.state
				+"\nZip:"+this.zip+"\nPhone no:"+this.phoneNo+"\nemail:"+this.email);
		

	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		ContactUc1 contact = new ContactUc1("Nrupesh","Mhatre","MH","Maharashtra","MH",3215,123456,"abc@gmail.com");
		contact.displayContact();

	}

}


