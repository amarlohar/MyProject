package day5;
import java.util.Scanner;
public class SumOfFirstHundredNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of numbers: ");
		int limit = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum+=i;
		}
	System.out.println("The sum of first "  + limit + " numbers are " + sum);
	}
}
