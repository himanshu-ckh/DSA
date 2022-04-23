package ctci.array_and_strings;


import java.util.HashMap;
import java.util.Map;

/**
 * Check if a given string is a permutation of a palindrome
 * tact cao -- tactcao -- tacocat
 */
public class ArraysAndStrings4 {
    public static boolean isPermutationOfPalindrome(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != ' ') {
                charCounts.put(current, charCounts.getOrDefault(current, 0) + 1);
            }
        }

        int numOfOdds = 0;
        for (Map.Entry<Character, Integer> entry: charCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                numOfOdds++;
            }
        }

        return numOfOdds <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Cao"));
        System.out.println(isPermutationOfPalindrome("Tact Cob"));
    }
}
