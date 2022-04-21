package ctci.array_and_strings;

/*
    Given two strings, determine if they are permutation of each other
 */
public class ArraysAndStrings2 {
    public static boolean isPermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int[] charCounts = new int[128];
        for (int i = 0; i < first.length(); i++) {
            charCounts[first.charAt(i)]++;
        }

        for (int i = 0; i < second.length(); i++) {
            charCounts[second.charAt(i)]--;
            if (charCounts[second.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("abcd", "bcda"));
        System.out.println(isPermutation("abbc", "addc"));
    }
}

