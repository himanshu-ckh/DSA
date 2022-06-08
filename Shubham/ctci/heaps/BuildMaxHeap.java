package ctci.heaps;

public class BuildMaxHeap {
    public static void buildMaxHeap(int[] arr) {
        for (int i = arr.length/2; i >= 0; i--) {
            MaxHeapify.maxHeapify(arr, i, arr.length);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 1, 6, 5};
        buildMaxHeap(arr);
        System.out.println(arr);
    }
}
