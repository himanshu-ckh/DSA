package algoexpert.arrays;

public class ValidateSubsequence {
    public static boolean validateSubsequence(int[] arr, int[] sequence) {
        int arIndex = 0;
        int sqIndex = 0;

        while (arIndex < arr.length && sqIndex < sequence.length) {
            if (arr[arIndex] == sequence[sqIndex]) {
                sqIndex++;
            }
            arIndex++;
        }
        return sqIndex == sequence.length;
    }

    public static void main(String[] args) {
        System.out.println(validateSubsequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{1, 6, -1, 10}));
        System.out.println(validateSubsequence(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{4}));
    }
}
