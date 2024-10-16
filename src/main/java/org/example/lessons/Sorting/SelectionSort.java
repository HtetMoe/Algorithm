package org.example.lessons.Sorting;

import java.util.Arrays;

/*
    - worst-case and average-case time complexity = O(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println(STR."Before Sorting: \{Arrays.toString(arr)}");
        selectionSort(arr);
        System.out.println(STR."Selection sort result \{Arrays.toString(arr)}");

    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
