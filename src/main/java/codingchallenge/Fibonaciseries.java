package codingchallenge;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int c=0;int temp;
		System.out.println(n1);
		System.out.println(n2);
		while(c<100) {
			System.out.println(c);
			c=n1+n2;
			n1=n2;
			n2=c;
		} 

	}


}
