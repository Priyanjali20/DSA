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
		PDI(n);

	}
	public static void  PDI(int n){
	    if(n==0)
	    return;
	    System.out.println(n);
	    PDI(n-1);
	    System.out.println(n);
	    
	}
}
