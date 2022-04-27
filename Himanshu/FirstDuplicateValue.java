package Himanshu.ctcci.ArraysAndString;
import java.util.*;
// https://www.algoexpert.io/questions/First%20Duplicate%20Value
public class FirstDuplicateValue {
    static class Program {

        public int firstDuplicateValue(int[] array) {
            // Write your code here.
            HashMap<Integer, Integer> hMap = new HashMap<>();
            for(int i=0; i<array.length; i++) {
                if(hMap.containsKey(array[i])) {
                    return array[i];
                }
                else {
                    hMap.put(array[i], i);
                }
            }
            return -1;
        }
    }

}
