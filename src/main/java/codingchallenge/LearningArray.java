package codingchallenge;

import java.util.Scanner;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intarr= {1,2,3,4,5};
		for(int a :intarr) {
			System.out.println(a);
		}
		System.out.println("Enter a First limit");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter a Second limit");
		int b=scan.nextInt();

		int [][] intarr1 =new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("enter a numbers");
				intarr1[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(intarr1[i][j] + " ");
			}
			System.out.println();
		}


	}

}
