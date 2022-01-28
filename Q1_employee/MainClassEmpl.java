import java.util.Scanner;

public class MainClassEmpl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EmployeeInfo obj = new EmployeeInfo();

		// Print first name/lastname/hourlyRate

		System.out.println("Enter First name");// first name
		obj.setFirstName(sc.next());
		String firstname = obj.getFirstName();
		System.out.println("first name is:" + firstname);

		System.out.println("Enter Last name");// last name
		obj.setLastname(sc.next());
		String lastname = obj.getLastName();
		System.out.println("Last name is:" + lastname);

		// update first name and last name
		System.out.println("Enter updated name");
		obj.setFirstName(sc.next());
		String firstName = obj.getFirstName();
		System.out.println("Updated name is:" + firstName);

		System.out.println("Enter updated Last name");
		obj.setLastname(sc.next());
		String lastName = obj.getLastName();
		System.out.println("Updated name is:" + lastName);

		// print hourly rate
		System.out.println("Enter hourly rate");
		obj.hourlyRate = sc.nextInt();

		// no of hours as INPUT
		System.out.println("enter no of hours");
		int noOfHours = sc.nextInt();

		int hourlyrate = obj.getHourlyRate();
		System.out.println("Hourly rate is: " + hourlyrate);

		// print weekly Salary,no of hours as Input
		int weekSalary = obj.getWeekSalary(noOfHours);
		System.out.println("Weekly salary is: " + weekSalary);

	}

}
