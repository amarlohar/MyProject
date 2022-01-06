package day5;
import java.util.Scanner;

class FactorialNumber {//class

	public static void main(String[] args) {//main method
		
		Scanner sc=new Scanner(System.in);//taking input from user
		
		System.out.println("Please enter the number :");
		
		int num=sc.nextInt();
		
		int i=1,factorialNumber=1;
		
		while(i<=num)
		{
			factorialNumber=factorialNumber*i;
			i++;
		}
		
		System.out.println("The factorial of the number is :"+factorialNumber);
	}

}
