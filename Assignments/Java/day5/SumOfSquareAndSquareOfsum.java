package day5;
import java.util.Scanner;
public class SumOfSquareAndSquareOfsum {

	public static void main(String[] args) {
		SumOfSquareAndSquareOfsum ss = new SumOfSquareAndSquareOfsum();
	    ss.diff();
	  }
	    void diff(){
	    int num,i,sum=0,sum1=0,result;
	    Scanner scan = new Scanner(System.in);//taking input from user 
	    System.out.println("Enter The limit: ");
	    num =scan.nextInt();
	    for(i=1;i<=num;i++) {
	      sum = sum + i;
	    }
	    sum = sum * sum;
	    for(i=1;i<=num;i++) {
	      sum1 = (i*i) + sum1; 
	    }
	    result = sum -sum1;
	    System.out.println(result);
	  }
	}