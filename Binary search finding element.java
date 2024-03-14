import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
   Scanner scn = new Scanner(System.in);
   System.out.println("enter element");
   int k = scn.nextInt();
int[] a={1,2,3,4,5,6,7,8,9};
int n = a.length;
int l=0;
int h=n-1;
while(l<=h){
   int mid=(l+h)/2;
   if(a[mid]<k)
       l=mid+1;
   else if(a[mid]>k)
       h=mid-1;
   else {
       System.out.println("element found at index" + mid);
       return;
   }

}
            System.out.println("Element is not found!");  
}
}