package extraprogram;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,8,9,10,2};
		int largeelemnt=a[0];
		int seclargest=a[1];int temp,temp1;
		for(int i=0;i<a.length;i++) {
			if(largeelemnt<seclargest) {
				temp=largeelemnt;
				largeelemnt=seclargest;
				seclargest=temp;
			}
			if(a[i]>largeelemnt) {
				temp1=largeelemnt;
				largeelemnt=a[i];
				seclargest=temp1;
			}
		}
		System.out.println(seclargest);

	}

}
