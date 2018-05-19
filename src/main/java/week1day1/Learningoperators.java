package week1day1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Learningoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=2;
int j=i;//assignment operators
int k=3;
if (k>i)//conditional operators
{
	System.out.println("yes");
}
int sum=3;
sum+=k;
System.out.println(sum);

int l=2;
l++;
System.out.println(l);
l--;
System.out.println(l);
++l;
System.out.println(l);
--l;
System.out.println(l);

if(!(i>j) || j>k) 
	System.out.println("yes");
else
	System.out.println("NO");
	


	
	
	}

}
