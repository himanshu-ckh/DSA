package Himanshu.ctcci.Recurssion;
import java.util.*;

//https://www.algoexpert.io/questions/product-sum
public class ProductSum {

    static class Program {
        // Tip: You can use `element instanceof ArrayList` to check whether an item
        // is an array or an integer.
        public static int productSum(List<Object> array) {
            // Write your code here.
            int res = productSumHelper(array, 1);
            return res;
        }

        public static int productSumHelper(List<Object> array, int mul) {

            int sum = 0;
            for(Object el: array) {
                if(el instanceof ArrayList) {
                    @SuppressWarnings("unchecked")
                    ArrayList<Object> small = (ArrayList<Object>) el;
                    sum = sum + productSumHelper(small, mul + 1);
                } else {
                    sum = sum + (int) el;
                }
            }
            return sum * mul;
        }
    }

}
