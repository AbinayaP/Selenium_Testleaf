package extraprogram;

import java.util.Scanner;

public class Reversearray1 {
	static void printarray(int arr[],int n) {
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	static void reversearray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			if(start==end)
				return;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;


		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		System.out.println("enter the numbers");
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=scan.nextInt();		}
		printarray(arr,5);
		reversearray(arr,0,4);
		System.out.println("the reversed array is");
		printarray(arr,5);
	}

}
