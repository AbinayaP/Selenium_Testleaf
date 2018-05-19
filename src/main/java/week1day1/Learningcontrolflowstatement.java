package week1day1;

import java.util.Scanner;

public class Learningcontrolflowstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if 1=2 print yes
		Scanner scan= new Scanner(System.in);
		
		int i=scan.nextInt();
		//int j=scan.nextInt();
		//int k=scan.nextInt();
	//	int l=scan.nextInt();
		//int m=scan.nextInt();
		if(i==2) {
			System.out.println("yes");
		}
		//if j=2 print yes else print no
		int j=2;
		if(j==2) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		//int k=2 print two
		int k=2;
		if (k==1)
		{
			System.out.println("one");

		}
		else if(k==2)
		{
			System.out.println("two");
		}
		else if(k==3)
		{
			System.out.println("three");
		}
		else
		{
			System.out.println("four");
		}
		
int l=3,m=4;
		if (l==3) {
			if(m==4) {
				System.out.println(m);
			}	else
			{
				System.out.println("m not equal");
			}}
		else {
			System.out.println("l is not equal");
		}
	
	int z=3;
	switch(z) {
	case 1:
	{
		System.out.println("one");
		break;
		
	}

	case 2:
	{

		System.out.println("two");
		break;	
	}
	case 3:
	{

		System.out.println("Three");
		break;	
	}
	default:
		System.out.println("not valid");
	}
	
	
	
	}
}


