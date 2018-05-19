package extraprogram;

public class Prefixsum {
	//prefix sum plus to check k partions subarrray is equal sum
	public static void main(String[]args) {
		int a[]= {2,3,3,2,4,1};
		int prefix[]=new int[6];
		int j=1;
		prefix[0]=a[0];
		for(int i=1;i<=5;i++) {
			prefix[i]=prefix[i-1]+a[i];
			j++;
		}
		System.out.println(prefix[5]);

		int sum=prefix[5]/3;
		if(prefix[5]%3==0) {
			int s=0;int k=0;
			for(int i=0;i<=5;i++) {

				s=s+a[i];
				if(sum==s) {
					k++;
					s=0;
				}
				if(k==3) {
					System.out.println("k partions are equal sum");
				}
			}}
			else	
			
				System.out.println("not not split by 3 equal sum");
			
}}