package Himanshu.ctcci.ArraysAndString;
//https://www.algoexpert.io/questions/Move%20Element%20To%20End
import java.util.*;

class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        /*
        Check if the elements are to be Moved otherwise we need to move the pointers
         */
        int start = 0;
        int next = start + 1;
        while(next < array.size()) {
            if(array.get(start) == toMove) {
                if(array.get(next) == toMove) {
                    next += 1;
                }
                else {
                    int temp = array.get(start);
                    array.set(start, array.get(next));
                    array.set(next, temp);
                    next += 1;
                    start += 1;
                }
            }
            else {
                start += 1;
                next += 1;
            }
        }
        return array;
    }
}
