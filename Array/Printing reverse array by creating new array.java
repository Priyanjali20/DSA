import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String args[]){
        int[] a = new int[4];
        int i=0;
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        int[] b = new int[4];
        int j = 3;
        while(i<=3){
            b[i] = a[j];
            i++;
            j--;
        }
        for(int k=0;k<=3;k++)
        System.out.println(b[k]);
    }
}
