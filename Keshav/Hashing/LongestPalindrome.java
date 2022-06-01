/*


409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1



*/


class Solution {
    public int longestPalindrome(String s) {
        //Create a set 
        if(s == null || s.length() == 0) return 0;
        
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //every time a character is repeated remove from set and add 2 to the count
            if(set.contains(c)){
                set.remove(c);
                count +=2;
            }else{
                set.add(c);
            }
        }
        
        // if there are left off element in the set just add 1 to the count and that will be the lenght of longest palindrome possible
        if(!set.isEmpty()){
            count++;
        }
        
        return count;
    }
}