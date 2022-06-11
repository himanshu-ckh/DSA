package algoexpert.arrays;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        int firstPositive = findFirstPositiveValueIndex(array);
        System.out.println(firstPositive);
        if (firstPositive == -1) {
            int start = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                result[start] = array[i]*array[i];
                start++;
            }
        } else if (firstPositive == 0) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i]*array[i];
            }
        } else {
            int firstNegative = firstPositive - 1;
            int maxNegative = -1;
            int maxPositive = array.length;
            for (int i = 0; i < array.length; i++) {
                if (firstNegative > maxNegative && firstPositive < maxPositive) {
                    int squarePositive = array[firstPositive]*array[firstPositive];
                    int squareNegative = array[firstNegative]*array[firstNegative];
                    if (squarePositive > squareNegative) {
                        result[i] = squareNegative;
                        firstNegative--;
                    } else {
                        result[i] = squarePositive;
                        firstPositive++;
                    }
                } else {
                    while (firstNegative > maxNegative) {
                        result[i] = array[firstNegative]*array[firstNegative];
                        firstNegative--;
                        i++;
                    }
                    while (firstPositive < maxPositive) {
                        result[i] = array[firstPositive]*array[firstPositive];
                        firstPositive++;
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public static int findFirstPositiveValueIndex(int[] array) {
        int firstPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                return i;
            }
        }
        return firstPositive;
    }

    public static void main(String[] args) {
        sortedSquaredArray(new int[] {-7, -3, 1, 9, 22, 30});
    }
}
