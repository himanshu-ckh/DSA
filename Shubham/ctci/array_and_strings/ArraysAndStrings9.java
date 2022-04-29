package ctci.array_and_strings;

public class ArraysAndStrings9 {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return false;
        }

        String s1s2 = s2 + s2;
        return s1s2.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
