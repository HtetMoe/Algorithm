package org.example.Lesson2;

import java.util.Arrays;
/*
    problem :  {7, 2, 8, 9, 10, 4, 6, 11 ,1}
    k = 3, sum of k consecutive numbers
    output => 17, 19, 27, 23, 20, 21, 18

 */
public class P01_SumKConsecutive {
    public static void main(String[] args) {
        int[] arr = {7, 2, 8, 9, 10, 4, 6, 11, 1};
        int k = 3;
        System.out.println(STR."result => \{Arrays.toString(sumKConsecutive(arr, k))}");
    }

    public static int[] sumKConsecutive(int[] arr, int k) {
        int length = arr.length;
        if (length < k) return new int[0]; // if len < k

        int resultLen = length - k + 1;
        int[] result = new int[resultLen];

        for (int i = 0; i < resultLen; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            result[i] = sum;
        }

        return result;
    }
}
/*
    - outer loop runs n - k + 1 times
    - inner loop runs k times
    - time complexity =  O(n * k)
 */
