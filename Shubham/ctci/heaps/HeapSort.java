package ctci.heaps;

public class HeapSort {
    public static void heapSort(int[] arr) {
        BuildMaxHeap.buildMaxHeap(arr);
        int heapSize = arr.length-1;

        while (heapSize >= 0) {
            int max = arr[0];
            arr[0] = arr[heapSize];
            arr[heapSize] = max;
            MaxHeapify.maxHeapify(arr, 0, --heapSize);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 3, 5, 8, 6, 4, 2};
        heapSort(arr);
        System.out.println(arr);
    }
}
