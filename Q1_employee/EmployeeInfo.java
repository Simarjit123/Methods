import java.util.Scanner;

public class EmployeeInfo {

	Scanner sc = new Scanner(System.in);

	String firstName = "";
	String lastName = "";
	int hourlyRate = 0;
	int weekSalary = 0;

	int noOfHours = 0;

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

	void setLastname(String lName) {
		lastName = lName;
	}

	// hourly rate
	int getHourlyRate() {
		return hourlyRate;
	}

	// no of hours as Input

	int getWeekSalary(int noOfHours) {
		weekSalary = (noOfHours * hourlyRate);
		return weekSalary;
	}
}
