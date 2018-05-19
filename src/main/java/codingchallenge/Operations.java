package codingchallenge;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		String op=scan.next();
		switch(op) {
		case "add" :
			System.out.println(n1+n2);
			break;
		case "sub" :
			System.out.println(n1-n2);
			break;
		case "mul" :
			System.out.println(n1*n2);
			break;
		case "div" :
			System.out.println(n1/n2);
			break;
			
		}

	}

}
