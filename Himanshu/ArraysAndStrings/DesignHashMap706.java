package Himanshu.ctcci.ArraysAndString;

import java.util.ArrayList;
//https://leetcode.com/problems/design-hashmap/
public class DesignHashMap706 {
    static class MyHashMap {
        ArrayList<int[]> hMap = new ArrayList<int[]>();

        public MyHashMap() {
        }

        public void put(int key, int value) {
            int check = -1;
            for(int i=0; i<hMap.size(); i++) {
                if(hMap.get(i)[0] == key) {
                    remove(key);
                }
            }
            int[] res = new int[2];
            res[0] = key;
            res[1] = value;
            hMap.add(res);

        }

        public int get(int key) {
            for(int i=0; i<hMap.size(); i++) {
                if(hMap.get(i)[0] == key) {
                    return hMap.get(i)[1];
                }
            }
            return -1;
        }

        public void remove(int key) {
            ArrayList<int[]> newHMap = new ArrayList<int[]>();

            for(int i=0; i<hMap.size(); i++) {
                if(hMap.get(i)[0] == key) {
                    continue;
                }
                else {
                    int[] res = new int[2];
                    res[0] = hMap.get(i)[0];
                    res[1] = hMap.get(i)[1];
                    newHMap.add(res);
                }

            }
            hMap = newHMap;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
