package Himanshu.ctcci.ArraysAndString;
import java.util.*;
public class MinimumWaitingTime {
    class Program {

        public int minimumWaitingTime(int[] queries) {
            // Write your code here.
            int res = 0;
            Arrays.sort(queries);
            System.out.println(queries[0]);
            int[] sum = new int[queries.length];
            for(int i=0; i<queries.length; i++) {
                res = res + queries[i];
                sum[i] = res;
            }
            res = 0;
            for(int j=0; j<sum.length-1; j++) {
                res = res + sum[j];
            }
            return res;
        }
    }

}
