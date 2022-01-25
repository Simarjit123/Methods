
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter number2");
		int num2 = sc.nextInt();
		//// creating an object
		MethodAddSub obj = new MethodAddSub();

		// using object to call addition method from main class
		System.out.println("addition is:" + obj.addition(num1, num2));
		// using object to call addition method from main class
		System.out.println("Subtraction is :" + obj.subtraction(num1, num2));

	}
}
