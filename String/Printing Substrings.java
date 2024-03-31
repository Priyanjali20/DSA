import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
    Scanner scn = new Scanner(System.in);
	System.out.println(" Enter the string:");
	String s = scn.next();
	System.out.println(s);
	System.out.println(s.length());
	for(int i=0;i<s.length();i++)
	for(int j=i+1;j<=s.length();j++)
	{
	String k = s.substring(i,j);
	System.out.print(k);
	}
      
}
}
