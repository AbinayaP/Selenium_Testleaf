package week1day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int inputNumber=1234;
int inputNumber1=inputNumber;
int sumOfdigits=0;
while(inputNumber>0) {
	int q=inputNumber/10;
	int r=inputNumber%10;
	sumOfdigits=sumOfdigits+r;
	inputNumber=q;
}
  System.out.println("sum of digits in " +inputNumber1 + " is " +sumOfdigits);
  
		
	}

}
