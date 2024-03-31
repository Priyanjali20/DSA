import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPalindrome(String s){
        	int i=0;
            int j=s.length()-1;
             while(i <= j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a == b)
            {
            i++;
            j--;
            }
            else{
                return false;
            }
        }
            return true;
            
    }
public static void main (String[] args) throws java.lang.Exception
{
    
	String s = "naman";	
	boolean ispal = isPalindrome(s);
	System.out.println(ispal);
}
}
