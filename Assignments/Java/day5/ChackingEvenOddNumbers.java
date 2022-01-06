package day5;

import java.util.Scanner;

class ChackingEvenOddNumbers {


		public static void main(String[] args) {//main method
			
			Scanner sc=new Scanner(System.in);//taking input from user
			
			System.out.println("Please enter the number :");
			
			int num=sc.nextInt();
			
			if(num%2==0)
				
				System.out.println("Entered Number is Even Number :");
			
			else
				
				System.out.println("Entered Number is Odd Number.");
			
		}	

	}


