import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scn = new Scanner(System.in);
	  int m = scn.nextInt();
	  int n = scn.nextInt();
	  int[][] arr = new int[m][n];
	  int p = scn.nextInt();
	  
	  for(int i=0;i<m;i++)
	     for(int j=0;j<n;j++)
	   {
	       arr[i][j] = scn.nextInt();
	   }
	  for( int i=0;i<m;i++)
	 {
	     for( int j=0;j<n;j++)
	  {
	  System.out.print(arr[i][j]+" ");
      }
      System.out.println();
	 }
	 for(int i=0;i<m;i++)
	 for(int j=0;j<n;j++)
      if(p== arr[i][j])
      {
      System.out.println("Value is present in array");
      return;
      }
     	System.out.println("Value is not present in array "); 
}
}
