import java.util.*;

class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        int dec = 0;
        int inc = 0;
        int start = 0;
        int next = start + 1;
        if(array.length == 0 || array.length == 1){
            return true;
        }
        else {
            while(next < array.length) {
                if(array[start] < array[next]) {
                    inc += 1;
                    start += 1;
                    next += 1;
                }

                else if(array[start] > array[next]) {
                    dec += 1;
                    start += 1;
                    next += 1;
                }

                else if(array[start] == array[next]) {
                    dec += 1;
                    start += 1;
                    next += 1;
                    inc += 1;

                }
            }
        }

        if(inc == array.length -1 || dec == array.length -1) {
            return true;
        }
        return false;
    }
}
