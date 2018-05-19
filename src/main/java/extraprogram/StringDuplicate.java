package extraprogram;

import java.util.HashMap;

public class StringDuplicate {

	public static <Char> void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aabbcdee";
		char[] schar=s.toCharArray();
		int n=s.length();
	
		HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
		for( int i=0;i<n;i++)
		{
			if(hm.containsKey(schar[i])) {
				hm.put(schar[i], hm.get(schar[i])+1);
		}
			else
				hm.put(schar[i], 1);
		
		}
System.out.println(hm);
	}

}
