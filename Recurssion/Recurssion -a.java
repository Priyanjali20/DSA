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
		int i =scn.nextInt();
		PD(n,i);

	}
	public static void  PD(int n,int i){
	    if(n==i)
	    return;
	    
	    System.out.println(n);
	    PD(n+1,i);
	}
}
