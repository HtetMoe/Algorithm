package org.example.InClassProblems.W1D6;

import java.util.Arrays;

/*
    - Linear time for merging the two arrays.
    - T(n) = O(n + m)
 */
public class P02_MergeWithAdditionalDS {
    public static void main(String[] args) {
        int[] A = {5, 8, 10, 15, 0, 0, 0};
        int[] B = {2, 12, 25};

        int n = 4;  // number of non-zero elements in A
        int m = 3;  // number of elements in B
        mergeArrays(A, B, n, m);
    }

    //sort and merge
    public static void mergeArrays(int[] A, int[] B, int n, int m) {
       int[] C = new int[n + m];
       int i = 0, j = 0; int k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            }
            else
                C[k++] = B[j++];
        }
        //copy remaining
        while (i < n)
            C[k++] = A[i++];

        while (j < m)
            C[k++] = B[j++];

        System.out.println(STR."result \{Arrays.toString(C)}");
    }

}
