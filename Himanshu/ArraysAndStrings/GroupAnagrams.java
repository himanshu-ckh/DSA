package Himanshu.ctcci.ArraysAndString;
import java.util.*;

//https://www.algoexpert.io/questions/Group%20Anagrams
public class GroupAnagrams {

    static class Program {
        public static List<List<String>> groupAnagrams(List<String> words) {
            // Write your code here.\
            HashMap<String, List<String>> res = new HashMap<>();

            for(String word: words) {
                char[] ch = word.toCharArray();
                Arrays.sort(ch);
                String joinedString = new String(ch);

                if(res.containsKey(joinedString)) {
                    List<String> list = res.get(joinedString);
                    list.add(word);
                    res.put(joinedString, list);
                }
                else {
                    List<String> ele = new ArrayList<>();
                    ele.add(word);
                    res.put(joinedString, ele);
                }
            }
            return new ArrayList<>(res.values());
        }
    }

}
