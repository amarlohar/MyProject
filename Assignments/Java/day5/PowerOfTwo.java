package day5;
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num != 0 && (Math.ceil((Math.log(num) / Math.log(2)))) == (Math.floor((Math.log(num) / Math.log(2))))) {
			System.out.println("The given number is a power of 2");
		}
		else {
			System.out.println("the given number is not a power of 2");
		}
	}
}

