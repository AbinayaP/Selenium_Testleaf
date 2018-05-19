package week1day2;

public class LearningStaticMethods {
	static int a,b;	
	static void add() {

		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(2);
		String s=	i.toString();
		System.out.println(s);
		LearningStaticMethods.a=2;
		LearningStaticMethods.b=3;
		LearningStaticMethods.add();


	}

}
