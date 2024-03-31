import java.util.*;

class Codechef {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "naman";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String k = s.substring(i, j);
                if (isPalindrome(k)) {
                    System.out.println(k);
                }
            }
        }
    }
}
