package ctci.array_and_strings;

public class ArraysAndStrings6 {
    public static String generateCompressedString(String input) {
        if (input.length() < 3) {
            return input;
        }

        StringBuilder compressedString = new StringBuilder();
        int currentCount = 1;
        char lastChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (lastChar != currentChar) {
                compressedString.append(lastChar);
                compressedString.append(currentCount);
                lastChar = currentChar;
                currentCount = 1;
            } else {
                currentCount++;
            }
        }
        compressedString.append(lastChar);
        compressedString.append(currentCount);

        return compressedString.toString().length() < input.length() ? compressedString.toString() : input;
    }

    public static void main(String[] args) {
        System.out.println(generateCompressedString("aabccddeeee"));
        System.out.println(generateCompressedString("aabbcc"));
        System.out.println(generateCompressedString("abcdefg"));
    }
}
