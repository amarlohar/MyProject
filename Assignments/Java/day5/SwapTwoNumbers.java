package day5;
import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);//taking inputs from user
	
	System.out.println("Enter 1st Number :");
	int number1 = sc.nextInt();
	System.out.println("Enter 2nd Number :");
	int number2 = sc.nextInt();
	
	System.out.println("Before swapping numbers are " + number1 + " and " + number2 );
	number1 = number1 + number2;
	number2 = number1 - number2;//swaping using + & - operaters
	number1 = number1 - number2;
	System.out.println("After swapping numbers are " + number1 + " and " + number2 );
}
}
