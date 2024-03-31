import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int [] a = {10, 20, 80, 20, 80, 50, 40, 60, 80, 80};
        int data = 80;
        int fsf =0;
        int[] arr = Allindex(a, 0, data, fsf);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
        
        
    }

    public static int[] Allindex(int[] a ,int idx, int data, int fsf) {
        
        if (idx == a.length){
        int[] arr = new int[fsf];
            return arr;
        }
            
        if (a[idx] == data){
            int[] temp = Allindex(a, idx+1, data, fsf+1);
            temp[fsf] = idx;
            return temp ;
        }
            
        else{ 
        int[] temp = Allindex(a, idx+1, data, fsf);
            return temp;
        }
        
    }
}
