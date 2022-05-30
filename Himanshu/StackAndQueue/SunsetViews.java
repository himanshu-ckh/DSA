package Himanshu.ctcci.StacksAndQueue;
import java.util.*;
//https://www.algoexpert.io/questions/Sunset%20Views
public class SunsetViews {
    class Program {
        public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
            // Write your code here.
            int max = Integer.MIN_VALUE;
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> res = new ArrayList<>();
            if(direction.equals("EAST")) {
                for(int i=buildings.length-1; i>=0 ; i--) {
                    if(buildings[i] > max) {
                        System.out.println(buildings[i]);
                        max = buildings[i];
                        st.push(i);
                    }
                }
            } else {
                for(int i=0; i<buildings.length ; i++) {

                    if(buildings[i] > max) {
                        max = buildings[i];
                        res.add(i);
                    }
                }
            }

            while(!st.isEmpty()) {
                res.add(st.pop());
            }
            return res;
        }
    }

}
