/*
290

https://leetcode.com/problems/word-pattern/

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false

*/



class Solution {
    public boolean wordPattern(String pattern, String s) {
         if (pattern == null || s == null) // Check for the empty string
            return false;
        
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        
        
        HashMap<String, Character> sMap = new HashMap<>(); // Hashmap for string s
        HashMap<Character, String> pMap = new HashMap<>(); // Hashmap for pattern

        for (int i = 0; i < pattern.length(); i++) { // Iterate over pattern length
            char pChar = pattern.charAt(i); // check the character at ith position in pattern
            String sStr = arr[i];

            if (!sMap.containsKey(sStr)) { // check if the smap cotains the substring of string s
                sMap.put(sStr, pChar); // if not, add it to smap
            } else {
                if (!sMap.get(sStr).equals(pChar)) // if found, check if value with that key equals to character of p
                    return false;
            }

            if (!pMap.containsKey(pChar)) { // check if the pmap cotains the character of p
                pMap.put(pChar, sStr);
            } else {
                if (!pMap.get(pChar).equals(sStr)) // if found, check if value with that key equals to substring of s
                    return false;
            }
        }
        return true; // Return true at the end
    }
} 