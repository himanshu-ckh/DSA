package ctci.array_and_strings;

public class ArraysAndStrings5 {
    /**
     * This function assumes small string is just one character smaller than big string
     */
    private static boolean oneInsertAway(String small, String big) {
        boolean alreadyFoundDiff = false;
        int index1 = 0;
        int index2 = 0;
        while (index1 < small.length() && index2 < big.length()) {
            if (small.charAt(index1) != big.charAt(index2)) {
                if (alreadyFoundDiff) {
                    return false;
                }
                alreadyFoundDiff = true;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }

    /**
     * This function assumes that length of first and second string will be equal
     */
    private static boolean oneReplaceAway(String first, String second) {
        boolean alreadyFoundDiff = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (alreadyFoundDiff) {
                    return false;
                }
                alreadyFoundDiff = true;
            }
        }
        return true;
    }

    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneReplaceAway(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneInsertAway(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneInsertAway(second, first);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("ple", "pale"));
        System.out.println(oneEditAway("blks", "blksf"));

        System.out.println(oneEditAway("abcdefg", "abcdefw"));
        System.out.println(oneEditAway("abcdefg", "aabbcde"));
    }
}
