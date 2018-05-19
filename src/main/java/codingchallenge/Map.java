package codingchallenge;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		String s="i will win this interview";
		int n=s.length();
		HashMap<Character,Integer> sm=new HashMap<Character,Integer>();
		for(int i=0;i<n;i++) {
			if(sm.containsKey(s.charAt(i))) {
				sm.put(s.charAt(i), 1+sm.get(s.charAt(i)));}
				else
					sm.put(s.charAt(i), 1);
			}
		
		System.out.println(sm);
		}
		

	}


