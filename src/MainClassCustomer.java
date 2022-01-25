import java.util.Scanner;

public class MainClassCustomer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerService obj = new CustomerService();
		// Print existing name & updated name
		String name = "john";
		System.out.println("existing name is:" + name);
		System.out.println("Enter new name");
		obj.setName(sc.next());
		name = obj.getName();
		System.out.println("new name is:" + name);

		// Print existing email& updated email
		String email = "john@gmail.com";
		System.out.println("existing name is:" + email);
		System.out.println("Enter new email");
		obj.setEmail(sc.next());
		email = obj.getEmail();
		System.out.println("new name is:" + email);
		
		// Print existing Address& updated Address
		String address = "100 queen street";
		System.out.println("existing name is:" + address);
		System.out.println("Enter new address");
		obj.setAddress(sc.next());
		address = obj.getAddress();
		System.out.println("new name is:" + address);
	}

}
