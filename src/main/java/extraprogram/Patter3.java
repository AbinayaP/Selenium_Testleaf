package extraprogram;

public class Patter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int l=5;

		for(int i=6;i>=1;i--) {
			
			for(int k=1;k<=6-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			//l--;
		}


	}

}
