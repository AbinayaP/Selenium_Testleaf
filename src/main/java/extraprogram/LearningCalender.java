package extraprogram;

import java.util.Scanner;

public class LearningCalender {
	public static int getDay(String day, String month, String year) {
		//dayoffset
		int dayint=Integer.parseInt(day);
		int dayofset=dayint%7;
		//yearoffset
		int yearint=Integer.parseInt(year);
		int lasttwo=yearint%100;
		int yearoffset=(lasttwo+(lasttwo/4))%7;
	//centuryoffset
		int Firsttow= yearint/100;
		int firsttwo1=Firsttow;
		if(firsttwo1%4 ==0 ) {
			firsttwo1+=4;
			
		}
		while(firsttwo1%4 !=0 ) {
		
			firsttwo1++;
		}
		firsttwo1=firsttwo1-1;
		firsttwo1=firsttwo1-Firsttow;
		int centuryoffset=firsttwo1*2;
		//
		int monthoff[]= {0,3,3,6,1,4};
		
		return yearoffset;
		}
        
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
	}

}
