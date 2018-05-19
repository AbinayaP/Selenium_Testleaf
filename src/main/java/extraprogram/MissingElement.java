package extraprogram;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5,3,7,8};int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int b:a) {
		System.out.println(b);
	}
		int k=0;
		while(k<a.length) {
		if(a[k+1]==a[k]+1) {
			k++;
		}
		else {
			System.out.println("the missing number is"+(a[k]+1));
		break;
		}
}}}
