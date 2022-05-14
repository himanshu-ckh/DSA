package Himanshu.ctcci.ArraysAndString;
//https://leetcode.com/problems/ransom-note/
import java.util.*;
public class RansomNote {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> hmap = new HashMap<>();
            for(int i=0; i<magazine.length(); i++) {
                if(hmap.containsKey(magazine.charAt(i))) {
                    hmap.put(magazine.charAt(i), hmap.get(magazine.charAt(i)) + 1);
                }
                else {
                    hmap.put(magazine.charAt(i), 1);
                }
            }

            for(int j=0; j<ransomNote.length(); j++) {
                if( !hmap.containsKey(ransomNote.charAt(j))) {
                    return false;
                }
                else if(hmap.get(ransomNote.charAt(j)) <= 0) {
                    return false;
                }
                else {
                    hmap.put(ransomNote.charAt(j), hmap.get(ransomNote.charAt(j)) -1);
                }
            }
            return true;
        }
    }
}
