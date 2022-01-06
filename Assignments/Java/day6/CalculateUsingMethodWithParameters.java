package day6;
import java.util.Scanner;

public class CalculateUsingMethodWithParameters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		int thirdNumber = scan.nextInt();
		
		new CalculateUsingMethodWithParameters().add(firstNumber, secondNumber,thirdNumber);

	}
	
	void add(int firstValue, int secondValue,int thirdNumber) {
		int result = firstValue + secondValue + thirdNumber;
		
		System.out.println("Addition is : " + result);
	}

}
