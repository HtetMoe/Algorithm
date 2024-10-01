package org.example.Lesson1;

import static java.lang.StringTemplate.STR;

public class P02_SubsetSum {
    public static void main(String[] args) {
        int[] S = {3, 2, 7, 1};
        int k = 6;
        int n = S.length;

        if (isSubsetSum(S, n, k)) {
            System.out.println(STR."True, there exists a subset that adds up to \{k}");
        }
        else {
            System.out.println(STR."False, no subset adds up to \{k}");
        }

    }

    public static boolean isSubsetSum(int[] S, int n, int k) {
        if (k == 0) { // base case
            return true; // Subset found
        }
        if (n == 0 && k != 0) {
            return false; // No subset found
        }

        //if last element is greater than the sum we are trying to achieve (k), ignore
        if (S[n - 1] > k) {
            return isSubsetSum(S, n - 1, k);
        }
        // Otherwise, check two possibilities:
        // (1) Exclude the last element
        // (2) Include the last element and check if the reduced problem gives the desired sum
        return isSubsetSum(S, n - 1, k) || isSubsetSum(S, n - 1, k - S[n - 1]);
    }
}
