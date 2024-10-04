package org.example.lessons.Lesson2;
// O(log n)  — The array size is halved at each recursive call.


public class P06_RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(index == -1 ? "Not found" : STR."element found at index : \{index}");
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1; // not found

        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid; // if target is mid

        //recursive case
        if (arr[mid] > target) return binarySearch(arr, target, low, mid - 1); // left half
        return binarySearch(arr, target, mid + 1, high); // right half
    }
}
