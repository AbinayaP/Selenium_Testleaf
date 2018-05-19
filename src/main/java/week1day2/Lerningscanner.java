package week1day2;

import java.util.Scanner;

public class Lerningscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter floa value");
		Scanner scan=new Scanner(System.in);
		float f1=scan.nextFloat();
		System.out.println(f1);
		System.out.println("enter string value");
		String f2=scan.nextLine();
		scan.nextLine();
		System.out.println(f2);
		System.out.println("enter double value");
		double f3=scan.nextDouble();
		System.out.println(f3);
		System.out.println("enter char value");
		char f4= scan.next().charAt(0);
		System.out.println(f4);




	}

}
