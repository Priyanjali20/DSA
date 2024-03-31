import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
	    tower(3,'a','b','c');

	}
	public static void  tower(int n,char ta,char tb,char tc) {
	    
	    if(n==0)
	    return;
	    
	    tower(n-1,ta,tc,tb);
	    System.out.println("Move disc" + n + " "+ "from" +" "+  ta +" to" +" "+ tb);
	    tower(n-1,tc,tb,ta);
	    
}
}
