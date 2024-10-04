package org.example.lessons.Lesson2;

public class P03_IsArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(STR."result => \{isArrayPalindrome(arr)}");
    }

    public static boolean isArrayPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) return false;

            //update
            left++;
            right--;
        }
        return true;
    }
}

/*
Time complexity
   - 1
   - 1
   - O(n/2) (constant 1/2 ignored)
   - 1 (condition)
   - 1
   - 1
   Total => O(n)
 */
