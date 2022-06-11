package ctci.heaps;

public class MaxHeapify {
    public static void maxHeapify(int[] arr, int i, int heapSize) {
        int left = (2*i)+1;
        int right = (2*i)+2;

        int largest = i;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] >= arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, largest, heapSize);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 1, 6, 5};
        maxHeapify(arr, 0, arr.length);
        System.out.println(arr);
    }

}
