import java.util.*;

class PalindromCheck {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        /*
        Access an element of a string -> use str.charAt(num)
        Length of a string -> str.length()
         */
        int len = str.length();
        int p1 = 0;
        int p2 = len-1;

        while(p1<p2) {
            if(str.charAt(p1) != str.charAt(p2)) {
                return false;
            }
            p1 += 1;
            p2 -= 1;
        }
        return true;
    }
    public static void main(String[] args) {
        bollean("abcddcba");
    }
}