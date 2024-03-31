import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
       int [] array = {10,20,30,20,40,50,40,60,80,80};
       int data = 20;
      int i = firstoccurance(array,0,data);
       if (i != -1) {
            System.out.println("The first occurrence of " + data + " is at index: " + i);
        } else {
            System.out.println("Element " + data + " not found in the array.");
        }
    }

public static int firstoccurance(int[] array, int idx,int data) {
        if (idx== array.length)
            return -1;
            int fo = firstoccurance(array,idx+1,data);
            if (array[idx] == data)
            return idx;
            else
            return fo;
    }
}