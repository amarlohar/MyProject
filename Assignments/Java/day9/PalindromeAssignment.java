package day9;
import java.util.Scanner;

public class PalindromeAssignment 
{
	   public static void main(String[] args) 
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter string to check palindrome: ");
	      String strInput = sc.nextLine();
	      
	      
	      char[] chString = strInput.toCharArray(); // To converting string to new char array
	      
	     
	      String strReverse = ""; // To storing reverse string
	      
	     
	      for(int a = chString.length - 1; a >= 0; a--) // To reading char by char
	      {
	         strReverse = strReverse + chString[a];
	      } 
	      
	      System.out.println("Given string: " + strInput); //To printing given string and reversed string
	      System.out.println("Reverse String: " + strReverse); 
	      
	      
	      if(strInput.equals(strReverse)) //To check if given string is palindrome
	      {
	         System.out.println("string is palindrome.");
	      }
	      else
	      {
	         System.out.println("string is not palindrome.");
	      }
	      sc.close();
	   }
	}