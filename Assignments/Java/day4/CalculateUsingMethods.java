package day4;
import java.util.Scanner;

public class CalculateUsingMethods {

	public static void main(String[] args) {
		new CalculateUsingMethods().add();

	}
	
	void add() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt(); 
		
		int result = firstNumber + secondNumber;
		
		System.out.println("Addition of numbers is : " + result);
	}

}
