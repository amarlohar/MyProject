package day4;
import java.util.Scanner;

public class Addition {

	int firstValue,secondValue,result;
	
	public static void main(String[]args)
	{
		new Addition().takeinput();
	}
	void takeinput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter The Two Numbers For Addition :");
		firstValue=scan.nextInt();
		secondValue=scan.nextInt();
		
		add();
		
	}
	void add()
	{
		result=firstValue+secondValue;
		display();
	}
	void display()
	{
		System.out.println("Addition of Numbers is :"+result);
	}
	}
