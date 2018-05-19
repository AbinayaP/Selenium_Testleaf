package week1day2;

import java.util.Scanner;

public class MethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = new String("Abi");
		String st1 =new String("Abinaya");
		int st2;
		System.out.println(st.compareTo(st1));
		System.out.println(st.concat(st1));
		System.out.println(st.endsWith("e"));
		System.out.println(st1.indexOf(st));
		System.out.println(st1.isEmpty());
		
		Scanner scan =new Scanner(System.in);
	float f=scan.nextFloat();
	}

}
