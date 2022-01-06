package day4;
import java.util.Scanner;

public class CalculateUsingMethodsWithParametersAndReturnType {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers to add");
		
		int firstValue = scan.nextInt();
		
		int secondValue = scan.nextInt();
		
		int result = new CalculateUsingMethodsWithParametersAndReturnType().add(firstValue, secondValue);
		
		System.out.println("Addition of numbers is : " + result);

	}
	
	int add(int firstValue, int secondValue) {
		
		return firstValue + secondValue;
		
	}

}
