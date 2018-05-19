package extraprogram;

public class LargestelementArray {

	public static void main(String[] args) {
		int a[]= {4,6,8,9,3,2};
		int largeelemnt=a[0];
		
		for(int b:a) {
			if(largeelemnt<b) {
				largeelemnt=b;
			}
			
		}
		System.out.println(largeelemnt);
	}

}
