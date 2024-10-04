package org.example.lessons.Lesson2;

import java.util.Arrays;

public class P01_SumKConsecutive1 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 8, 9, 10, 4, 6, 11, 1};
        int k = 3;
        System.out.println(STR."Result => \{Arrays.toString(sumKConsecutive(arr, k))}");
    }

    public static int[] sumKConsecutive(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return new int[0]; //if len < k
        }

        int resultLen = n - k + 1;
        int[] result = new int[resultLen];

        //sum of the first 'k' numbers
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        result[0] = sum;

        //the rest, Sliding Window Logic:
        for (int i = 1; i < resultLen; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            result[i] = sum;
        }

        return result;
    }
}
/*
    Sliding Window Logic:
	•	For each new window, subtract the element that is sliding out of the window (arr[i - 1]) and
	    add the element that is sliding into the window (arr[i + k - 1]).
	•	This method is more efficient because only one subtraction and one addition are performed at each step.

	For arr = {7, 2, 8, 9, 10, 4, 6, 11, 1} and k = 3:
	1.	The sum of the first three elements is 7 + 2 + 8 = 17.
	2.	As the window slides, subtract 7 and add 9: 17 - 7 + 9 = 19.
	3.	Slide again: subtract 2 and add 10: 19 - 2 + 10 = 27, and so on.

 Time complexity
    - first loop => O(k)
    - second loop => O(n-k+1)
    Total = O(k) + O(n) = O(n)

 */
