package org.example.lessons.Lesson5;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,8,5,3,7}; // un sorted array
        mergeSort(arr);
        System.out.println(STR."Sorted result : \{Arrays.toString(arr)}");
    }

    public static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return; // base case : arr is already sorted

        int mid = len / 2;
        int[] left  = new int[mid];
        int[] right = new int[len - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, len - mid);

        //System.out.println(STR."left : \{Arrays.toString(left)}");
        //System.out.println(STR."right: \{Arrays.toString(right)}");

        //recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        //compare and merge
        merge(left, right, arr);
    }

    //merge two sorted halves
    public static void merge(int[] left, int[] right, int[] result) {
        int leftLen  = left.length;
        int rightLen = right.length;

        int i = 0 ; int j = 0; int k = 0;

        while (i < leftLen && j < rightLen){
            if(left[i] <= right[j]){
                result[k] = left[i];
                i++;
            }
           else{
                result[k] = right[j];
                j++;
            }
            k++;
        }

        //remaining left and right
        while (i < leftLen){
            result[k] = left[i];
            i++; k++;
        }
        while (j < rightLen){
            result[k] = right[j];
            j++; k++;
        }
        //System.out.println("result : " + Arrays.toString(result));
    }
}
