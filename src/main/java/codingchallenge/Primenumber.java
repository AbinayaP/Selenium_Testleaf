package codingchallenge;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		for(int i=1;i<10;i++) {


			System.out.println("enter a number");
			Scanner scan =new Scanner(System.in);
			int n[]=new int[10];
			n[i]=scan.nextInt();
			if(n[i]==2 || n[i]==3 || n[i]==5 || n[i]==7) {
				System.out.println("The entered number is "+n[i]);
				System.out.println("A given number is prime" + "total count is "+i);
				break;
				
			}
			
			if(n[i]%2==0 || n[i]%3 ==0 || n[i]%5 ==0 || n[i]%7 ==0) {
				
				System.out.println("The entered number is "+n[i]);
			}
			else
			{
				System.out.println("The entered number is "+n[i]);
				System.out.println("A given number is prime" + "total count is "+i);
				break;
			}


		/*	int m=n[i]/2;
			if(n[i]==0 || n[i]==1)
				break;	
			else {	
				for(int j=2;j<=m;j++) {
					if(n[i]%j==0) {
						f++;	
						continue;
					}}}
			if(f==0) {
				System.out.println("A prime Number");
				System.out.println(i);
				break;

			}
*/




		}


	}}


