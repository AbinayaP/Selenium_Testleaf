package extraprogram;

public class SortedRotatedArray {
	
	//find pivot 
	static int findpivot(int a[] , int low,int high) {
		if(high<low) {
			return -1;

		}
		if(high==low) {
			return low;
		}
		int	mid=(high+low)/2;
		if(mid<high && a[mid]>a[mid+1])
		{
			return mid;
		}
		if(mid>low && a[mid]<a[mid-1])
		{
			return mid-1;
		}
		if(a[low]>=a[mid]) {
			return findpivot(a,low,mid-1);
		}
		return findpivot(a,mid+1,high);


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4};
		int n=a.length; int k=2;
		int start=0;int end=n-1;
		int pivot=findpivot(a,0,n-1);
		System.out.println(pivot);
//checking pivot with key
		if(pivot==-1)
		{
			binarysearch(a,start,end,k);
			
		}
		if(a[pivot]==k) {
			System.out.println("the element found at position" +pivot);

		}
		if(a[0]>=k) {
			binarysearch(a,start,pivot-1,k);
		}
		else 
			binarysearch(a,pivot+1,end,k);

	}


	static void binarysearch(int[] a, int start, int end,int k) {
		// TODO Auto-generated method stub
		while(start<=end) {
			int mid=(start+end)/2;
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
		if(start>end) {
			System.out.println("the element not found");
		}
	}





}
