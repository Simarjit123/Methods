import java.util.Scanner;
public class Employee_info {
Scanner sc = new Scanner(System.in);

	String firstName = "";
	String lastName = "";
	double hourlyRate = 0;
	double noOfHours = 0;
	double weekSalary = 0;

	// Get and Set First Name
	String getFirstName() {
		return firstName;
	}

	void setFirstName(String name) {
		firstName = name;
	}

	// Get and Set Last Name
	String getLastName() {
		return lastName;
	}

	void setLastname(String Lname) {
		lastName = Lname;
	}

	double getHourlyRate() {
		return hourlyRate;
	}

	double getNoOfHours() {
		return noOfHours;
	}

	double getWeekSalary() {
		return weekSalary = (noOfHours * hourlyRate);
	}
}


