package extraprogram;

import java.util.HashMap;
import java.util.Scanner;

public class Arrayduplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		int temparr[]=new int[10];

		for(int i=0;i<5;i++) {
			//for(int j=0;j<10;j++) {
				//if(a[i]==j)
					temparr[a[i]]=temparr[a[i]]+1;	
	//		}


		}
		for(int i1=0;i1<10;i1++) {

			if(temparr[i1]>0) {
				System.out.println("The elemeent "+ i1 +" occured " + temparr[i1]+ " times ");
			}
		}
	}

}
