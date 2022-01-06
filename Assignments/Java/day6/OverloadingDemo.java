package day6;
import java.util.Scanner;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int result = new CalculateAddition().add(scan.nextInt(), scan.nextInt());
		result = new CalculateAddition().add(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		
		System.out.println("Addition of numbers is : " + result);

	}
	
	
}

class CalculateAddition{
	int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	int add(int firstNumber, int secondNumber, int thirdNumber) {
		return firstNumber + secondNumber + thirdNumber;
	}

	int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		return firstNumber + secondNumber + thirdNumber + fourthNumber;
	}
	
	int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
		return firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
	}
}
