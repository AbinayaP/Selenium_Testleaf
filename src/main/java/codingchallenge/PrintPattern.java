package codingchallenge;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%3==0 && i%5 ==0) {
				System.out.println("FIZZBUZZ");
				
			}
			else if(i%3==0){
				System.out.println("FIZZ");
				
			}
			else if(i%5==0) {
			
				System.out.println("BUZZ");
				
			}
			else
			{
				System.out.println(i);
		}
	
		}

	}

}
