package extraprogram;

public class Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,5,6,1,5,1};int count=0;
	int n=	a.length;
	
		int k=7;
		for(int i=0;i<n;i++) {
			int s=0;
			for(int j=i;j<n;j++) {
			
			if((a[j]+s)<k) {
				s=s+a[j];
				count++;
				
			}
			else
				break;
			}
		}
	System.out.println(count);
}}

	


