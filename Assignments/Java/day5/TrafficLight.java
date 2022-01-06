package day5;

import java.util.Scanner;

class TrafficLight {

	public static void main(String[]args)

	{
		String color;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter The Color :");
		color =scan.nextLine();
		switch(color)
		{
		case "r":
		case "R":
		case "Red":
		case "red":
		case "RED":
			System.out.println("STOP");
			break;
		case "y":
		case "Y":
		case "yellow":
		case "Yellow":
		case "YELLOW":
			System.out.println("READY");
			break;
		case "g":
		case "G":
		case "Green":
		case "green":
		case "GREEN":
			System.out.println("GO");
			break;
			default:
			System.out.println("Please Enter A Valid Color");
			
		}
		
		
	}
	
}
