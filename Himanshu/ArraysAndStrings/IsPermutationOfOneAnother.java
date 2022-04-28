package Himanshu.ctcci.ArraysAndString;
import java.util.*;
public class IsPermutationOfOneAnother {

    public static boolean IsPermutationOfOneAnother1(String input1, String input2) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(input1.length() != input2.length()) {
            return false;
        }
        else {
            for(int i=0; i<input1.length(); i++) {
                if(map.containsKey(input1.charAt(i))) {
                    map.put(input1.charAt(i), map.get(input1.charAt(i)) + 1);
                }
                else {

                    map.put(input1.charAt(i), 1);
                }
            }

            for(int j=0; j<input2.length(); j++) {
                if(!map.containsKey(input2.charAt(j))) {
                    return false;
                }
                else {
                    map.put(input1.charAt(j), map.get(input1.charAt(j)) - 1);
                }
            }

            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if(entry.getValue() > 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean IsPermutationOfOneAnother2(String input1, String input2) {
        char[] c1 = input1.toCharArray();
        char[] c2 = input2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return(Arrays.equals(c1, c2));
    }

    public static void main(String[] args) {
        System.out.println(IsPermutationOfOneAnother1("god", "dogg"));
        System.out.println(IsPermutationOfOneAnother2("god", "dogggg"));
    }
}
