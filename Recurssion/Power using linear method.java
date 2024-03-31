import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1; 
        } 
        
        int pow = power(x,n-1);
        int k = pow*x;
        return k;
   }
}

