package codingchallenge;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		char digit=scan.next().charAt(0);
				String a1 ;
				int j;int flag=0;
				for(int i=a-1;i>=0;i--) {
					j=0;flag=0;
					a1= Integer.toString(i);
					int n=a1.length();
					while(n>0) {
						
						if((a1.charAt(j))==digit){
							flag++;	
						}
						else
							j++;
						n--;
					}
				if(flag==0) {
					System.out.println("the largest number is "+i);
					break;
				}
				}
				
		

	}

}
