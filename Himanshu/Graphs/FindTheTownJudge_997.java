package Himanshu.ctcci.Graphs;

public class FindTheTownJudge_997 {
    static class Solution {
        public int findJudge(int n, int[][] trust) {
            int[] indegree = new int[n+1];
            int[] outdegree = new int[n+1];

            for (int[] ints : trust) {
                indegree[ints[1]] += 1;
                outdegree[ints[0]] += 1;
            }

            for(int j=1; j<=n; j++) {
                if(indegree[j] == n-1 && outdegree[j] == 0) {
                    return j;
                }
            }
            return -1;
        }
    }
}
