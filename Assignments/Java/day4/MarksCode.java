package day4;
import java.util.Scanner;

public class MarksCode {

	public static void main(String[] args) {
		
		int flag = 0;
		
		Scanner theScan = new Scanner(System.in);
		
		System.out.println("Enter marks for 3 subjects");
		
		int first = theScan.nextInt();
		int second = theScan.nextInt();
		int third = theScan.nextInt();
		
		int sum = first + second + third;
		
		if(first >= 40)
			flag++;
		if(second >= 40)
			flag++;
		if(third >= 40)
			flag++;
		if(sum >= 125)
			flag++;
		if(flag == 4)
			System.out.println("PASSING");
		else
			System.out.println("FAILING");
		
	}

}
