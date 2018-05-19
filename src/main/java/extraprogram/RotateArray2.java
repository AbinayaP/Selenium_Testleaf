package extraprogram;

public class RotateArray2 {

	static void rotatae(int arr[]) {
		int j,temp;
		for(int i=0;i<2;i++) {
			
			temp=arr[5];
			for( j=5;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
			}

	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		rotatae(arr);
		for(int i=0;i<=5;i++) {
			System.out.print(arr[i]+ " ");}

	}

}
