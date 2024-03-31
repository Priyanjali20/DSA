import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {1,2,3,4,5};
        printarray(a, 0); 
    }

    public static void printarray(int[] a, int idx) {
        if (idx == a.length){
            return;
        }
        printarray(a, idx + 1);
        System.out.print(a[idx]+ " "); 
        
    }
}
