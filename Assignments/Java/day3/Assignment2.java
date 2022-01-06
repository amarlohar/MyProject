package day3;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[]args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number(Between 1 to 12):");
		int month =scan.nextInt();
		switch(month)
		{
		case 1:
		case 2:
		case 12:
			System.out.println("WINTER");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("SPRING");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("SUMMER");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("AUTUMN");
			break;
			default:
			System.out.println("Please enter a valid month");
			
		}
		
		
	}
	
}
