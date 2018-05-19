package extraprogram;

public class Stringduplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="aabcddeffghhii";
int[] arr=new int[26];
int n=a.length();
for(int i=0;i<n;i++) {
	arr[a.charAt(i)-97]=arr[a.charAt(i)-97]+1;
}
for(int j=0;j<n;j++) {
if(arr[j]>0) {
	int m=j+97;
	char digi= (char) m;
	System.out.println("the character repeted "+digi +"times of" +arr[j]);
	
}
}
	}

}
