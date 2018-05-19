package codingchallenge;

public class Swap {

	public static void main(String[] args) {
		String x="hello";
		String y="world";
		x=x+y;
		System.out.println(x);
		y=x.substring(0, y.length());
		x=x.substring(y.length());
		System.out.println( "the x value "+x);
		System.out.println("the y value "+y);

	}

}
