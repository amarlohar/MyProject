package day5;
import java.util.Scanner;
class CheckPrimeByUserInput {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);//taking input from user
		System.out.println("Please Enter The Number :");
		int num=scan.nextInt();

		 boolean flag=false;
		 for(int i=2;i<=num/2;++i) 
		 {
			 if(num%i==0)
			 {
				 flag=true;
				 break;
			 }
		 }
		
		 if(!flag)
			System.out.println(num +"This number is Prime Number");
		
		else 
			System.out.println(num +": This Number is not a Prime Number");
		
	
	}

}
