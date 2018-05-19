package codingchallenge;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;int j=1;int k=1;
		while(((j*3)<100)){

			sum1=sum1+((j*3));
			j++;
		}
		while(((k*5)<100)){

			sum1=sum1+((k*5));
			k++;
		}
		System.out.println(((j-1)*3)+ " " +((k-1)*5));
		System.out.println("the sum is"+sum1);
	}

}
