package codingchallenge;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
for(int i=1;i<=10;i++) {
	int mul=i*n;
	System.out.println(i+"*"+n+"="+mul);
}
	}

}
