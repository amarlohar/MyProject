package day4;
import java.util.Scanner;

public class CalculateUsingDifferentMethods {

	public static void main(String[] args) {
		new CalculateUsingDifferentMethods().takeInput();
	}
	
	void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int firstValue = scan.nextInt();
		int secondValue = scan.nextInt();
		
		add(firstValue, secondValue);
	}
	
	void add(int firstValue, int secondValue) {
		int result = firstValue + secondValue;
		
		display(result);
	}
	
	void display(int result) {
		System.out.println("Addition : " + result);
	}

}
