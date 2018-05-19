package extraprogram;

public class MergeSort {
	void merge(int a[],int l,int mid ,int h) {
		
		int left[]=new int[mid];
		int right[]=new int[a.length-mid];
		
		for(int i=0;i<mid-1;i++) {
			left[i]=a[i];
		}
		for( int i=mid;i<a.length;i++) {
			right[i-mid]=a[i];
		
		}
		int i=0,j=0,k=0;
		int nl=left.length;
		int nr=right.length;
		
		while(i<nl&&j<nr) {
			if(left[i]<right[i]) {
				a[k]=left[i];
				i++;k++;
			}
			else {
				a[k]=right[j];
				k++;j++;
			}
			while(i<nl) {
				a[k]=left[i];
				k++;i++;
			}
			while(j<nr) {
				a[k]=right[j];
				k++;j++;
			}
		}
	}

	void sort(int a[],int l ,int h) {
		
		
		int mid=l+(h-1)/2;
		if(a.length <2) return;
		
		sort(a,l,a.length/2);
		sort(a,mid+1,h);
		merge(a,l,mid,h);
		
		
	}
	public static void main(String[] args) {
	int a[]= {8,4,2,5,9,23,1};
	
	MergeSort ob=new MergeSort();
	int asize=a.length;
	ob.sort(a,0,asize-1);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}

	}

}
