package Himanshu.ctcci.ArraysAndString;
import java.util.*;

public class FirstUniqueCharacterInAString {
    //https://leetcode.com/problems/first-unique-character-in-a-string/

    static class Solution {
        public int firstUniqChar(String s) {
            int max = Integer.MAX_VALUE;
            HashMap<Character, Integer> hmap = new HashMap<>();
            for(int i=0; i<s.length(); i++) {
                if(hmap.containsKey(s.charAt(i))) {
                    hmap.put(s.charAt(i), max);
                }
                else {
                    hmap.put(s.charAt(i), i);
                }
            }
            int minimum = Collections.min(hmap.values());
            if(minimum == max) {
                return -1;
            }
            return minimum;
        }
    }
}
