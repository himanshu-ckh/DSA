package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//https://www.algoexpert.io/questions/Task%20Assignment
public class TaskAssignment {
    static class Program {

        public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
            // Write your code here.
            HashMap<Integer, List<Integer>> hMap = new HashMap<>();
            for(int i=0; i<tasks.size(); i++) {
                if(hMap.containsKey(tasks.get(i))) {
                    List<Integer> res = hMap.get(tasks.get(i));
                    res.add(i);
                    hMap.put(tasks.get(i), res);
                }
                else {
                    List<Integer> small = new ArrayList<Integer>();
                    small.add(i);
                    hMap.put(tasks.get(i), small);
                }
            }

            Collections.sort(tasks);
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            int start = 0;
            int end = tasks.size() - 1;

            while(end > start) {
                ArrayList<Integer> small = new ArrayList<Integer>();
                small.add(hMap.get(tasks.get(start)).get(0));
                small.add(hMap.get(tasks.get(end)).get(0));
                List<Integer> check1 = hMap.get(tasks.get(start));
                check1.remove(0);
                List<Integer> check2 = hMap.get(tasks.get(end));
                check2.remove(0);
                res.add(small);
                end--;
                start++;
            }
            return res;

        }
    }

}
