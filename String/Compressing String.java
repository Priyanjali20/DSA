import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
    StringBuilder s = new StringBuilder("aaabbbccadde");
    StringBuilder sb = new StringBuilder("");
    System.out.println(s);
 
   for(int i=0;i<s.length();i++){
       char ch = s.charAt(i);
       
       if(sb.length()==0){
           sb.append(ch);
       }
       else{
           int j = sb.length()-1;
           char temp = sb.charAt(j);
           
           if(temp!=ch){
               sb.append(ch);
           }
       }
   }
    
    System.out.println(sb);
   
}
}