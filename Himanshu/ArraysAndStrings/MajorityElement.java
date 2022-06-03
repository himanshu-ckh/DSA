package Himanshu.ctcci.ArraysAndString;
import java.util.*;
public class MajorityElement {
    static class Solution {
        public int majorityElement(int[] nums) {
            int majority = nums.length / 2;
            HashMap<Integer, Integer> check = new HashMap<>();
            for(int num: nums) {
                if(check.containsKey(num)) {
                    check.put(num, check.get(num) + 1);
                }
                else {
                    check.put(num, 1);
                }
            }

            for(Map.Entry<Integer, Integer> entry: check.entrySet()) {
                if(entry.getValue() > majority) {
                    return entry.getKey();
                }
            }
            return -1;
        }
    }
}
