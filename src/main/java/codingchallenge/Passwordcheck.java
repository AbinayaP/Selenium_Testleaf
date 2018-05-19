package codingchallenge;

public class Passwordcheck {

	public static void main(String[] args) {
		String pw="45AB23ftsy";
		String verifypassword = verifypassword(pw);
		System.out.println(verifypassword);
		}
		public static String verifypassword(String pw) {
			int n=pw.length();
			
			int caplet=0;
			int digits=0;
		
		
		for(int i=0;i<n;i++) {
			char c=pw.charAt(i);
			if(Character.isLetter(c)) {
				
			}
			if((pw.charAt(i)>=47 && pw.charAt(i) <= 57 )||(pw.charAt(i)>=65 && pw.charAt(i)<=90) || (pw.charAt(i)>=97 && pw.charAt(i)<=122)) {
				
			}
			else
				System.out.println("the password contain invalid character");
			
			
			if(pw.charAt(i)>=47 && pw.charAt(i) <= 57) {
				digits++;
			}
			if((pw.charAt(i)>=65 && pw.charAt(i)<=90))
				caplet++;
		}
			if(n<10) {
				System.out.println("the password is too shaort");
			
			}
			if(digits<2) {
				System.out.println("less than two digits");
			}
			if(caplet<2) {
				System.out.println("does not contain capital letter");
			}
			
		
		return "password is valid";
	}

}
