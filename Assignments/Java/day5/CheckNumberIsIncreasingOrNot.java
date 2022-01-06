package day5;
import java.util.Scanner;
public class CheckNumberIsIncreasingOrNot {
	 public static boolean checkNumber(int num)
     {
		// checkNumber c=new checkNumber();
            boolean flag=false;
            String str = String.valueOf(num);
            int l = str.length();
            for(int i=0;i<l-1;i++)
            {
                   if(str.charAt(i)<=str.charAt(i+1) )
                         flag=true;
                   else
                         flag=false;
            }
            return flag;
     }
     public static void main(String[] ar)
     {
          
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = s.nextInt();
            System.out.println("increasing number: "+CheckNumberIsIncreasingOrNot.checkNumber(num));
     }
}

