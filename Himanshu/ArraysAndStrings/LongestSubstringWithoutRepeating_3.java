package Himanshu.ctcci.ArraysAndString;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.*;

public class LongestSubstringWithoutRepeating_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> hMap = new HashMap<>();
            int ans = 0;
            int i=0;

            for(int j=0; j<s.length(); j++) {
                if(hMap.containsKey(s.charAt(j))) {
                    i = Math.max(hMap.get(s.charAt(j)), i);
                }

                ans = Math.max(ans, j- i + 1);
                hMap.put(s.charAt(j), j + 1);
            }

            return ans;
        }
    }
}
