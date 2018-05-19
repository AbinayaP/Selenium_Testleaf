package codingchallenge;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	int rows=Scan.nextInt();int k=0;
for(int i=1;i<=rows;i++) {
	for(int j=1;j<=i;j++) {
		k++;
		System.out.print(k);
		
		
	}
	System.out.println();
}
	}

}
