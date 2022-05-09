package Himanshu.ctcci.ArraysAndString;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/pascals-triangle-ii/
public class PascalTriangle2 {
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            if(numRows == 1) {
                List<List<Integer>> arr = new ArrayList<List<Integer>>();
                List<Integer> listAtI = new ArrayList();
                listAtI.add(1);
                arr.add(listAtI);
                return(arr);
            }
            else if(numRows == 2) {
                List<List<Integer>> arr = new ArrayList<List<Integer>>();
                List<List<Integer>> res1 = generate(1);
                List<Integer> listAtI = new ArrayList ();
                listAtI.add(1);
                listAtI.add(1);
                arr.add(res1.get(0));
                arr.add(listAtI);
                return(arr);
            }
            else {
                List<Integer> res = new ArrayList<Integer>();
                List<List<Integer>> prev = generate(numRows - 1);
                List<Integer> last = prev.get(prev.size() -1 );
                for(int j = 0; j<=last.size(); j++) {
                    if(j==0) {
                        res.add(last.get(j));
                    }
                    else if(j == last.size()) {
                        res.add(last.get(j-1));
                    }
                    else {
                        res.add(last.get(j-1) + last.get(j));
                    }
                }
                prev.add(res);
                return prev;

            }
        }

        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> res = generate(rowIndex +1);
            return res.get(rowIndex);
        }

    }
}
