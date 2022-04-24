import java.util.*;

class ArrayOfProducts {
    public int[] arrayOfProducts(int[] array) {
        int[] res = new int[array.length];
        int[] productRight = new int[array.length];
        int[] productLeft = new int[array.length];
        int left = 1;
        int right = 1;
        for(int i=0; i<array.length; i++) {
            productLeft[i] = left;
            left *= array[i];
        }
        for(int j=array.length-1; j>=0 ; j--) {
            productRight[j] = right;
            right *= array[j];
        }

        for(int k=0; k<array.length; k++) {
            res[k] = productLeft[k] * productRight[k];
        }
        return res;
    }
}
