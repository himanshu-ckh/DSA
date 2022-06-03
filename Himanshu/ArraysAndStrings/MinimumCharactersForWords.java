package Himanshu.ctcci.ArraysAndString;
import java.util.*;

//https://www.algoexpert.io/questions/minimum-characters-for-words
public class MinimumCharactersForWords {
    static class Program {

        public char[] minimumCharactersForWords(String[] words) {
            // Write your code here.
            HashMap<Character, Integer> hMap = new HashMap<>();
            for (String word : words) {
                char[] ch = word.toCharArray();
                HashMap<Character, Integer> small = new HashMap<>();
                for (char c : ch) {
                    if (small.containsKey(c)) {
                        int count = small.get(c);
                        count += 1;
                        small.put(c, count);
                        if (hMap.containsKey(c)) {
                            int bigCount = hMap.get(c);
                            if (bigCount < count) {
                                hMap.put(c, count);
                            }
                        } else {
                            hMap.put(c, count);
                        }
                    } else {
                        small.put(c, 1);
                        if (!hMap.containsKey(c)) {
                            hMap.put(c, 1);
                        }
                    }
                }
            }

            List<Character> res = new ArrayList<>();
            System.out.println(List.of(hMap));

            for(Map.Entry<Character, Integer> entry: hMap.entrySet()) {
                for(int j=0; j<entry.getValue(); j++) {
                    res.add(entry.getKey());
                }
            }
            char[] arr = new char[res.size()];
            for (int i = 0; i < res.size(); i++)
                arr[i] = res.get(i);
            return arr;
        }
    }

}
