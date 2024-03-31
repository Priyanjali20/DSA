import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = fibo(n); 
        System.out.print("The"+ n +"fibonacci number is:"+result);
        
        

	}
	public static int fibo( int n) {
	    if(n==0 || n==1 )
	    return n;
	    
	    else
	    return fibo(n-1)+fibo(n-2);
	    
}
}
