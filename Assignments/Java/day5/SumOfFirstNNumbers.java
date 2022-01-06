package day5;
import java.util.Scanner;
class SumOfFirstNNumbers {

	public static void main(String[] args) {
		SumOfFirstNNumbers sn=new SumOfFirstNNumbers();
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		System.out.println(sn.calculation(input));
	}
	int sum=0;
	public int calculation(int nNumber)
	{
		for(int i=0;i<=nNumber;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
