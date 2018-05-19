package extraprogram;

public class pattern4 {
	
	static void print(int n) {
		

		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}

			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		pattern4.print(n);
		
		int m=n;
		for(int i=1;i<=n-1;i++) {
			for(int k=1;k<=i*2-i;k++) {
				System.out.print(" ");
			}

			for(int j=(m-1)*2;j>1;j--) {
				System.out.print("*");
			}
			System.out.println();
			m--;

		}

	}

}
