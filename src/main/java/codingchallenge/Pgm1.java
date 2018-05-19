package codingchallenge;

public class Pgm1 {

	public static void main(String[] args) {
		String txt="a1b2c3";
		int n = txt.length();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			int a=(int) txt.charAt(i);
			int b=a+1;
			char c=(char)b;
			System.out.print(c);}
			else
			{int a=(int) txt.charAt(i);
			int b=a-1;
			char c=(char)b;
			System.out.print(c);}
				
		}

	}

}
