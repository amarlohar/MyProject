package day5;
import java.util.Scanner;
public class ToPrintFibonacciSeries {

	public static void main(String[] args) {
		
		int number1=0;
		int number2=1;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please The Enter a number  :");
		
		int num = sc.nextInt();
		
		System.out.print(number1 + " " + number2 + " ");
		
		for(int start = 2 ; start < num ; start++) {
			
			result = number1 + number2;
			
			System.out.print(result + " ");
			
			number1=number2;
			
			number2=result;
		}
	}
}