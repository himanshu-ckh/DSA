package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//Green Book
public class IsUniqueString {
    public static boolean isUniqueString(String input) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<input.length(); i++) {
            if(set.contains(input.charAt(i))) {
                return false;
            }
            else {
                set.add(input.charAt(i));
            }
        }
        return true;
    }

    public static boolean isUniqueWithoutSet(String input) {

        boolean[] set = new boolean[128];
        for(int i=0 ; i<input.length(); i++) {
            int val = input.charAt(i);
            if(set[val]) {
                return false;
            }
            set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(isUniqueString("abcde"));
        System.out.println(isUniqueWithoutSet("abcdee"));

    }
}
