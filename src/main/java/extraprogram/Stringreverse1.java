package extraprogram;

public class Stringreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abinaya";
		int count=0;
		int n=s.length()-1;int i=0;int j=n;
		while(i!=j) {
		if(s.charAt(i)==s.charAt(j)) {
			i++;j--;
		}
		else
			count++;
		i++;j--;
		}
		if(count==0) {
			System.out.println("the given is string is palindrome");
		}
		else
			System.out.println("the given is string is not palindrome");
	

	}

}
