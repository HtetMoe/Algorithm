package org.example.lessons.Sorting;

import java.util.Arrays;

/*
    - worst-case and average-case time complexity = O(n^2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println(STR."Unsorted array:\{Arrays.toString(arr)}");
        insertionSort(arr);
        System.out.println(STR."Insertion Sort : \{Arrays.toString(arr)}");
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
