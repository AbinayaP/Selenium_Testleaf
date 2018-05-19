package codingchallenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int copyn=n;int reverse=0;int a;
		while(n>0){
			a=n%10;
			reverse=reverse*10+a;
			n=n/10;

		}

		if(reverse==copyn)
			System.out.println("the givn number is palindrome");
		else
			System.out.println("the given number is not a palindrome");
	}

}
