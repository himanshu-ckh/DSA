package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//https://www.algoexpert.io/questions/Longest%20Palindromic%20Substring
public class LongestPalindromeSubString {
    static class Program {
        public static String longestPalindromicSubstring(String str) {
            // Write your code here.
            String longest = "";
            for(int i=0; i<str.length(); i++) {
                for(int j=i; j<str.length(); j++) {
                    String sub = str.substring(i, j+1);
                    if(sub.length() > longest.length() && checkPalindrome(sub)) {
                        longest = sub;
                    }
                }
            }
            return longest;
        }

        public static boolean checkPalindrome(String sub) {
            int start=0;
            int end=sub.length()-1;
            while(start<end) {
                if(sub.charAt(start) != sub.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

}
