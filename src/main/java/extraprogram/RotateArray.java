package extraprogram;

public class RotateArray {

	static void rotatae(int arr[]) {
		for(int i=0;i<3;i++) {
			leftrotate(arr);}

	}




	static void leftrotate(int[] arr) {
		// TODO Auto-generated method stub
		int i,temp;
		temp=arr[0];
		for( i=0;i<5;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		rotatae(arr);
		for(int i=0;i<=5;i++) {
			System.out.println(arr[i]);}

	}

}
