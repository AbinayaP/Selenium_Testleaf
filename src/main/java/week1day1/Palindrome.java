package week1day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=121;
		int inputnumber1=inputNumber;
		 int reverse =0;
		while(inputNumber>0) 
			{
			int q=inputNumber/10;
			int r=inputNumber%10;
			reverse=reverse*10+r;
			inputNumber=q;
		}
		  if(reverse==inputnumber1) {
			  System.out.println("is palindrome");}
			  else
			  {
				  System.out.println("is not palindrome");  
			  }
			  
		  
				
			}
	}


