import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 System.out.println(Fact(n));
	}
	public static void PD(int n){
	    if(n==0)
	    return;
	    System.out.println(n);
	    PD(n-1);
	}
	public static int  Fact(int n){
	    if(n==1)
	    return 1;
	    
	    int fac = Fact(n-1);
	     int k = n*fac;
	     return k;
	    
	    
	}
}
