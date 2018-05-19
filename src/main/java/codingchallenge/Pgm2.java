package codingchallenge;

public class Pgm2 {

	public static void main(String[] args) {
		int count=0;
		String a="testleaf";
		char b='t';
		int n=a.length();
		for(int i=0;i<n;i++) {
			if(a.charAt(i)==b)
				count++;
		}
		
		
		
		
		System.out.println( "The occurance of given character "+b +":" +count);
	}

}
