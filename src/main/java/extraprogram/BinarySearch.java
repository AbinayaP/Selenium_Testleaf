package extraprogram;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,5,7,9,10};
		int n=a.length;int k=2;
		int start=0,end=n,mid=(start+end)/2;
		while(start<end) {
		if(k==a[mid]) {
			System.out.println("the k found at position" +mid);
			break;
		}
		else if(k<a[mid]) {
			end=mid-1;
		}
		else if(k>a[mid]){
			start=mid+1;
		}
		mid=(start+end)/2;
		}
		if(start>end)
			System.out.println("element not present");
	}

}
