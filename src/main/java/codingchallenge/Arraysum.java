package codingchallenge;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1,2, 3,  4,5},
				{6,7, 8,  9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};
		int a=5,b=5;
		int i,j;
		i=a-1;
		j=b;
		int j2;int sum=0;
		for(int j1=0;j1<i;j1++) {
			j--;j2=0;
			while(j2<j) {
				sum =sum+arr[j1][j2];
				j2++;
			}	
		}
		System.out.println(sum);
		j=b;int j4;int sum1=0;int j5=0;
		for(int j3=i;j3>=0;j3--) {
			j5++;
			j4=j5;
			while(j4<j) {
				sum1=sum1+arr[j3][j4];
				j4++;
			}
		}
		System.out.println(sum1);

	}

}
