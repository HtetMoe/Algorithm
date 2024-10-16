package org.example.Labs.Final.W3D2_Lab11;

public class P03_HeapsortPhase2 {
    public static void main(String[] args) {
        int[] data = {4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15};
        int comparisons = heapsort(data);
        System.out.println(STR."Number of comparisons during heapsort: \{comparisons}");
    }

    public static int heapsort(int[] arr) {
        int comparisons = buildHeapBottomUp(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            comparisons += siftDown(arr, 0, i);
        }
        return comparisons;
    }

    private static int siftDown(int[] arr, int index, int size) {
        int comparisons = 0;
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size) {
            comparisons++;
            if (arr[left] > arr[largest]) {
                largest = left;
            }
        }

        if (right < size) {
            comparisons++;
            if (arr[right] > arr[largest]) {
                largest = right;
            }
        }

        if (largest != index) {
            swap(arr, index, largest);
            comparisons += siftDown(arr, largest, size);
        }

        return comparisons;
    }

    // Swap helper method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to build heap bottom-up (from Question 2)
    private static int buildHeapBottomUp(int[] arr) {
        int comparisons = 0;
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            comparisons += siftDown(arr, i, arr.length);
        }
        return comparisons;
    }

}
