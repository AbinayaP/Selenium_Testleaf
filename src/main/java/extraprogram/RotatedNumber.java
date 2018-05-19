package extraprogram;

public class RotatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,6,1,2,3};
		int temp=a[0];
		int i; int  minindex=-1;
		for(i=1;i<a.length;i++) {
			if(temp>a[i]) {
				temp=a[i];
				minindex=i;
				
			}
		}
		System.out.append("The array is rotated " +minindex +" times");
		
		

	}

}
