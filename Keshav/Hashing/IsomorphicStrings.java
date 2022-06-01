

/*
205

https://leetcode.com/problems/isomorphic-strings/

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character,
but a character may map to itself.

 
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false

*/
public class Solution {
public boolean isIsomorphic(String s, String t) {
    if(s == null || t == null) {
        return false;
    } else if(s.length() != t.length()) {
        return false;
    }

    final Map<Character, Character> chars = new HashMap<Character, Character>();
    final Map<Character, Character> reverse = new HashMap<Character, Character>();

    for(int ind = 0; ind < s.length(); ind++) {

        final char src = s.charAt(ind);
        final char des = t.charAt(ind);

        if(!chars.containsKey(src) && !reverse.containsKey(des)) {
            chars.put(src, des);
            reverse.put(des, src);
        } else {
            if((chars.containsKey(src) && chars.get(src) != des)
                    || (reverse.containsKey(des) && reverse.get(des) != src)) {
                return false;
            }
        }
    }
    return true;
}
}