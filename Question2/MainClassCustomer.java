import java.util.Scanner;

public class MainClassCustomer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerService obj = new CustomerService();
		// Print first name/Email/address

		obj.setName("john");// print name
		System.out.println("Customer name is: " + obj.getName());
		obj.setEmail("john@gmail.com");// print Email
		System.out.println("Customer name is: " + obj.getEmail());
		obj.setAddress("100 queen street");// print address
		System.out.println("Customer name is: " + obj.getAddress());

		// Update using get and set
		// update First name
		System.out.println("Enter new Name");
		String FirstName = sc.nextLine();
		obj.setName(FirstName);

		FirstName = obj.getName();
		System.out.println("Updated name is:" + FirstName);

		// update Email
		System.out.println("Enter new Email");
		String Email = sc.nextLine();
		obj.setEmail(Email);

		Email = obj.getEmail();
		System.out.println("Updated name is:" + Email);

		// update address
		System.out.println("Enter new Addres");
		String Address = sc.nextLine();
		obj.setEmail(Address);

		Address = obj.getEmail();
		System.out.println("Updated name is:" + Address);
		sc.close();
	}
}
