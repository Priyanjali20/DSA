import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	 sub(3," ");
	}
	
	public static void sub(int n,String out){
        if(n==0)
            System.out.println(out);
        else{
            sub(n-1,out+"a");
            sub(n-1,out+"b");
            sub(n-1,out+"c");
            sub(n-1,out+"_");
            
        }
}
}
