import java.util.*;

class Program {
/*
Array -> creation ->
int[] res = new int[length];

Sort an array -> Arrays.sort(arr)
 */

    //O(nlogn)
    //Becase of the sorting -> Merge, Heap Sort
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] res = new int[array.length];
        for (int i = 0; i< array.length; i++) {
            res[i] = array[i] * array[i];
        }

        Arrays.sort(res);
        return res;
    }

    public int[] sortedSquareArrayBestCase(int[] array) {
        // Write your code here.
        /*
        Use two pointer and check the absolute value for them and insert the value at the end of the array
        Move the pointers accordingly
         */
        int start = 0;
        int[] res = new int[array.length];
        int insertPos = array.length -1;
        int end = insertPos;
        for (int i = 0; i< array.length; i++){
            if(array[start] * array[start] >= array[end] * array[end]){
                res[insertPos] = array[start] * array[start];
                start += 1;
                insertPos -= 1;
            }
            else if(array[end] * array[end] >= array[start] * array[start]) {
                res[insertPos] = array[end] * array[end];
                insertPos -= 1;
                end -= 1;
            }
            //System.out.println(res);

        }
        return res;
    }
}
