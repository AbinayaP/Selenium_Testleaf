package extraprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		int i=1;
		for(int it:a) {
			if(hm.containsKey(it)) {
				hm.put(it, hm.get(it)+1);	
			}
			else
				hm.put(it, 1);

		}
		System.out.println(hm);
	}
}