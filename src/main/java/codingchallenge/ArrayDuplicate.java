package codingchallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int a[]= {37,68,40,45,68,37,87,90};
		int n=a.length;

		Set<Integer> dupNumbers=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					dupNumbers.add(a[i]);
				}
				
			}
		}
	System.out.println(dupNumbers);
	}
	

}
