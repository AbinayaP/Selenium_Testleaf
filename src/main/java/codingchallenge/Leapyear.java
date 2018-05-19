package codingchallenge;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("enter the year");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	if(n%4==0 ) {			
	 if(n%100==0) {
		if(n%400==0) {
			System.out.println("the given year  is leap year");
		}
		else
			System.out.println("the given year is not leap year");
	}
	 else
		 System.out.println("the given year is leap year");
	
	}
	else
		System.out.println("the given year is not leap year");
	

}}
