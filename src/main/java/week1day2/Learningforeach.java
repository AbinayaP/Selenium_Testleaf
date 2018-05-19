package week1day2;

import java.util.Scanner;

public class Learningforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String  name[]= new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("enter the value");

			name[i]=scan.nextLine();
		}


		for(String n :name) {

			switch(n) {
			case "Ram" :
				System.out.println("male");
				break;

			case "leela" :
				System.out.println("Female");
				break;

			case "raj" :
				System.out.println("Male");
				break;

			default:
				System.out.println("invlalid");
			}
		}

	}


}
