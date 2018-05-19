package week1day2;

import java.util.Scanner;

public class Leraningforeach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int  marks[]= new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("enter the value");

			marks[i]=scan.nextInt();
			
		}
		
		
		for(int a :marks) {
			if (a>35)
				System.out.println("pass");
			else
				System.out.println("fail");
		}
	}

}
