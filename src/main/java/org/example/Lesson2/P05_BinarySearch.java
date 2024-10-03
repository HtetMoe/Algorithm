package org.example.Lesson2;

public class P05_BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        int index = binarySearch(sortedArray, target);

        System.out.println(index > 0 ? STR."Found at index : \{index}" : "not found!");
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {// if >, ignore left
                left = mid + 1;
            } else if (arr[mid] > target) { // if <, ignore right
                right = mid - 1;
            }
        }
        return -1; // not found
    }
}
/*
    Time complexity => Worst Case:  O(log n)
 */