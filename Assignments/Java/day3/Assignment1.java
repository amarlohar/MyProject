package day3;
import java.util.Scanner;

public class Assignment1 
{

public static void main(String[]args)

{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter the number for subject 1 :");
	int sub1=scan.nextInt();
	System.out.println("enter the number for subject 2 :");
	int sub2=scan.nextInt();
	System.out.println("enter the number for subject 3 :");
	int sub3=scan.nextInt();
	
	double result=sub1+sub2+sub3;
	
	
//	if(sub1>=40 && sub2>=40 && sub3>=40 ) 
//	{
//	System.out.println("Student is passed....!"+result);
//	}
//	else
//	{
//		System.out.println("Student is failed....!"+result);	
//	}
	
	
	if(sub1>=40)
		if(sub2>=40)
			if(sub3>=40)
				if(result>+125)
					System.out.println("Student is passed....!"+result);
				else
					System.out.println("Student is failed....!"+result);
			else
				System.out.println("Student is failed....!"+result);
		else
			System.out.println("Student is failed....!"+result);
	else
		System.out.println("Student is failed....!"+result);
	

}
}


