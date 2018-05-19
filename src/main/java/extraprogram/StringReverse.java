package extraprogram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int a=s.length();
		StringBuffer sf=new StringBuffer();
	
		for(int i=a-1;i>=0;i--) {
			sf.append(s.charAt(i));
		}
		String s1=sf.toString();
		System.out.println(s1);
	}

}
