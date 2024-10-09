package org.example.lessons.Lesson6.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 1, 4, 2, 7, 6, 8, 10, 11};
        quicksort(arr, 0, arr.length - 1);

        System.out.println(STR."sorted result : \{Arrays.toString(arr)}");
    }

    // Quicksort algorithm
    private static void quicksort(int[] arr, int start, int stop) {

        //base case: single element or empty array
        if (start >= stop) return;

        //choose pivot (using median-of-three)
        int pivotIndex = medianOfThree(arr, start, stop);

        // move pivot to end
        swap(arr, pivotIndex, stop);

        // pivot value
        int pivot = arr[stop];

        //place i to first item and j to last - 1 item
        int i = start, j = stop - 1;

        //partition the array
        while (i <= j) {
            while (i <= j && arr[i] < pivot)
                i++;  //element larger than pivot

            while (i <= j && arr[j] > pivot)
                j--;  //element smaller than pivot

            if (i <= j)
                swap(arr, i++, j--); // swap and do order
        }

        //if i and j crossed each other, move pivot and i pointed value, now pivot is at stop
        swap(arr, i, stop);  // Place pivot in correct position

        //now recursively call left and right subArrays
        quicksort(arr, start, i - 1);  //left part
        quicksort(arr, i + 1, stop);   //right part
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //return the index
    private static int medianOfThree(int[] arr, int start, int stop) {
        int mid = (start + stop) / 2;

        if (arr[start] > arr[mid])
            swap(arr, start, mid);

        if (arr[mid] > arr[stop])
            swap(arr, mid, stop);

        if (arr[start] > arr[stop])
            swap(arr, start, stop);

        return mid;
    }
}
