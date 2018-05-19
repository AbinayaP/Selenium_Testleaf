package week1day1;

public class Learningexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Exception
		int a=2;
		int div=a/0;
		//array outofindex
		int b[]= {1,2,3};
		System.out.print(b[4]);

		//Stringindexoutofindex
		String s= "rturtury";
		char c=s.charAt(20);

		System.out.print(c);

		//Nullpointerexception

		String s1=null;
		s1.charAt(2);
	}
	
}


