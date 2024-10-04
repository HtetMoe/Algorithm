package org.example.lessons.Lesson2;

// O(n)  — The function is always called on every element of the array, so the complexity is linear.

public class P07_RecursiveFindMax {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 5, 11, 18, 3, 15};
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println(STR."result => \{max}");
    }

    public static int findMax(int[] arr, int lower, int upper) {
        if (lower == upper) return arr[lower];
        int mid = (lower + upper) / 2;

        //recursively find the max in both halves
        int leftMax = findMax(arr, lower, mid);
        int rightMax = findMax(arr, mid + 1, upper);

        return Math.max(leftMax, rightMax);
    }
}
