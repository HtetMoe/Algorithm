package org.example.Labs.Final.W3D2_Lab11;

public class P01_BuildHeapTopDown {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int comparisons = buildHeapTopDown(data);
        System.out.println(STR."Number of comparisons: \{comparisons}");
    }

    public static int buildHeapTopDown(int[] arr) {
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            comparisons += siftUp(arr, i);
        }
        return comparisons;
    }

    private static int siftUp(int[] arr, int index) {
        int comparisons = 0;
        while (index > 0) {
            int parent = (index - 1) / 2;
            comparisons++;
            if (arr[index] > arr[parent]) {
                swap(arr, index, parent);
                index = parent;
            } else {
                break;
            }
        }
        return comparisons;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
