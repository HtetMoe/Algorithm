package org.example.InClassProblems.W1D1;

/*
    - T(n) = O(n)
    - "same parity" means equality, (of a number) the fact of being even or odd.
 */
public class P06_SameParityAroundMidpoint {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 6, 4, 2};
        System.out.println(STR."result => \{checkSameParityAroundMidpoint(arr)}");
    }

    public static boolean checkSameParityAroundMidpoint(int[] arr) {
        int len   = arr.length;
        int mid = len / 2;
        // 8/2, arr[4] = 10

        for (int i = 0; i < mid; i++) {
            int left = arr[i] % 2;
            int right = arr[len - 1 - i] % 2;

            if ( left != right) return false;
        }
        return true;
    }
}

/*
    - 1
    - 1
    - O(n/2)
    - 1
    - 1
    - 1
    Total => O(n)
 */
