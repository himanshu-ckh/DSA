package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//https://www.algoexpert.io/questions/Reverse%20Words%20In%20String
public class ReverseWordInAString {

        public static String reverseWordsInString(String string) {
            // Write your code here.
            String reverseString = "";
            for(int i=0; i<string.length(); i++) {
                reverseString = string.charAt(i) + reverseString;
            }

            StringBuilder res = new StringBuilder();
            StringBuilder small = new StringBuilder();

            for(int j=0; j<reverseString.length(); j++) {
                if(reverseString.charAt(j) == ' ') {
                    res.append(small).append(' ');
                    small = new StringBuilder();
                }
                else {
                    small.insert(0, reverseString.charAt(j));
                    System.out.println(small);
                }

            }

            res.append(small);
            return res.toString();

    }

    public static void main(String[] args) {
            System.out.println(reverseWordsInString("AlgoExpert is the best!"));
    }

}
