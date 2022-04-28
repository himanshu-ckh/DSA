import java.util.*;

class Program {
    public static int getNthFib(int n) {
        // Write your code here.
        /*
        If n==2 return 1 as second element is 1
        If n>2 that means we need to apply the recursive function
        elase return 0 for n==1
         */
        if(n > 2) {
            return getNthFib(n-1) + getNthFib(n-2);
        }
        else if(n == 2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
