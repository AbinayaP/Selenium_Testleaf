package codingchallenge;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[]args) {
	
		 String s, rev = "";
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      s = scan.nextLine();
	 
	      int length = s.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + s.charAt(i);
	 System.out.println(rev);
	      if (s.equalsIgnoreCase(rev))
	         System.out.println(s+" is a palindrome");
	      else
	         System.out.println(s+" is not a palindrome");
	}
}
