import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(Power(x,n));
	}
	public static double Power(double x,double n){

	     double k = Math.pow(x,n);
	     return k;
	}
}
