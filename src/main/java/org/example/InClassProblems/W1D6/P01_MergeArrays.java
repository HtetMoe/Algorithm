package org.example.InClassProblems.W1D6;

import java.util.Arrays;
/*
    - We traverse both arrays once (linear time)
    - T(n) = O(n) + O(m) = O(n + m)
 */

//1. merge in place
public class P01_MergeArrays {
    public static void main(String[] args) {
        int[] A = {5, 8, 10, 15, 0, 0, 0};
        int[] B = {2, 12, 25};

        int n = 4;  // number of non-zero elements in A
        int m = 3;  // number of elements in B
        mergeArrays(A, B, n, m);
    }

    //sort and merge
    public static void mergeArrays(int[] A, int[] B, int n, int m) {
        //last indexes
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) { //place at last, so > value
                A[k] = A[i];
                i--;
            }
            else {
                A[k] = B[j];
                j--;
            }
            k--;
        }

        //remaining of A and B
        while (i >= 0) {
            A[k] = A[i];
            k--; i--;
        }
        while (j >= 0) {
            A[k] = B[j];
            k--; j--;
        }
        System.out.println(STR."result \{Arrays.toString(A)}");
    }
}
