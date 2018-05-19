package day1;

public class Firstprogram {
	
static	int max=26;

 
static int factorial(int n) {
	int fact1=1;
	for(int i=2; i<=n;i++) {
	fact1=fact1*i;
	
	}
	return fact1;
}
	static int permcount(String str) {
		int length= str.length();
		int freq[]=new int[max];
		for(int i=0;i<length;i++) {
			if(str.charAt(i) >= 'a') {
				freq[str.charAt(i) - 'a']++;
			}}
			int fact=1;
			 for(int i1=0;i1< max;i1++) 
				 fact=fact*factorial(freq[i1]);
				 
			 
			 return factorial(length)/fact;
			
	}
		
	
	 
		 

	
	// Driver code
	public static void main(String args[])
	{
		String str = "fvvfhvgv";
		System.out.println(permcount(str));
		
	}


}
