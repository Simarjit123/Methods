import java.util.Scanner;

public class Employee_MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee_info obj = new Employee_info();
		// Print existing First name & updated First
		String name = "";
		System.out.println("existing name is:");
		obj.firstName = sc.next();
		System.out.println("Enter new name");
		obj.setFirstName(sc.next());
		name = obj.getFirstName();
		System.out.println("new name is:" + name);
		// Print existing Last name & updated Lastname
		String name1 = "";
		System.out.println("existing Lastname is:");
		obj.lastName = sc.next();
		System.out.println("Enter new lastname");
		obj.setLastname(sc.next());
		name1 = obj.getLastName();
		System.out.println("new name is:" + name1);
		// Print hourly rate
		System.out.println("Enter hourly rate");
		obj.hourlyRate = sc.nextDouble();
		double hourlyrate = 0;
		hourlyrate = obj.getHourlyRate();
		System.out.println("Hourly rate is: " + hourlyrate);
		// print No of Hours
		System.out.println("Enter no of hours");
		obj.noOfHours = sc.nextDouble();
		double noOfHours = 0;
		noOfHours = obj.getNoOfHours();
		System.out.println("No of hours worked: " + noOfHours);
		// Print Weekly salary
		double weekSalary = 0;
		weekSalary = obj.getWeekSalary();
		System.out.println("Weekly salary is: " + weekSalary);
	}

}
