package Himanshu.ctcci.ArraysAndString;
//https://www.algoexpert.io/questions/Non-Constructible%20Change
import java.util.*;

class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);

        /*
        Sort the array first -> Now once we are done with it -
        Create a variable change and see if the coin value is greater that change+1, if that is the case then we can create that change
        return change+1
        else add that in the change variable
         */
        if(coins.length == 0) {
            return 1;
        }
        int change = 0;
        for (int coin: coins) {
            if(coin > change + 1) {
                return change+1;
            }
            change += coin;
        }
        return change+1;
    }
}
