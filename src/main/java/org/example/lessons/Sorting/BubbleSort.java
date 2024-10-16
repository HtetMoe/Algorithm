package org.example.lessons.Sorting;

/*
    - worst-case and average-case time complexity = O(n^2)
 */
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arr = {5,4,3,2,1};
        System.out.println(STR."Before Sorting: \{Arrays.toString(arr)}");
        bubbleSort(arr);
        System.out.println(STR."Bubble sort result : \{Arrays.toString(arr)}");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
            System.out.println("---");
        }
    }
}
