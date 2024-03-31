import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb);
    for (int i=0;i<sb.length();i++){
    char ch = sb.charAt(i);
    System.out.println(ch);
    }
    sb.setCharAt(0,'b');
    System.out.println(sb);
    sb.setCharAt(4,'y');
    System.out.println(sb);
    sb.insert(0,'a');
    System.out.println(sb);
    sb.deleteCharAt(0);
    sb.setCharAt(0,'h');
    sb.setCharAt(4,'o');
    System.out.println(sb);
    
    StringBuilder s1 = new StringBuilder("");
    s1.append("H");
    s1.append("E");
    s1.append("L");
    s1.append("L");
    s1.append("O");
    System.out.println(s1);

}
}
