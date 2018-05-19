package extraprogram;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
	int a=arr.length;int j=0;
	int arr1[]=new int[a];
		for(int i=a-1;i>=0;i--) {
			arr1[j]=arr[i];
			j++;
		}
		
for(int j1=0;j1<a;j1++) {
System.out.println(arr1[j1]);	
}
	}

}
