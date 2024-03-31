import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scn = new Scanner(System.in);
	  System.out.println(" Enter the size of array:");
	  int n = scn.nextInt();
	  System.out.println(n);
	  int[] arr = new int[n];
	  
	  for(int i=0;i<n;i++)
	  {
	       int k = scn.nextInt();
	       arr[i] = k;
	  }
	  for(int i=0;i<n;i++)
	  System.out.println(arr[i]+" ");

	}
}
