package codingchallenge;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;int amssum;int n1;
		int b[]=new int[1001-99];int i=0;
		for(int n=100;n<=1000;n++) {
			amssum=0;
			b[i]=n1=n;
			while(n1>0) {
			
			a=n1%10;
			amssum=amssum+(a*a*a);
			n1=n1/10;
			}
			if(amssum==b[i]) {
				System.out.println(b[i]);
			}
			i++;
		}

	}

}
