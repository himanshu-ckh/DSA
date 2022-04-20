package ctci.array_and_strings;

public class ArrayAndStrings1 {
    public static boolean hasAllUnique(String input) {
        int[] letters = new int[128];
        for (int i = 0; i < input.length(); i++) {
            int letter = input.charAt(i);
            if (letters[letter] == 1) {
                return false;
            }
            letters[letter] = 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAllUnique("abcda"));
        System.out.println(hasAllUnique("abcmd"));
    }
}
