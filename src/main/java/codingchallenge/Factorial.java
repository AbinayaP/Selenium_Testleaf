package codingchallenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;int m=n;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("The factorial of given number "+ m  +" is " +fact);
	}

}
