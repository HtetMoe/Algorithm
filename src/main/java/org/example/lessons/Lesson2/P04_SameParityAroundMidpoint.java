package org.example.lessons.Lesson2;

/*
    - "same parity" means that the elements on either side of the midpoint have the same even/odd property
 */
public class P04_SameParityAroundMidpoint {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 6, 4, 2};
        System.out.println(STR."result => \{checkSameParityAroundMidpoint(arr)}");
    }

    public static boolean checkSameParityAroundMidpoint(int[] arr) {
        int n   = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int left = arr[i] % 2;
            int right = arr[n - 1 - i] % 2;

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
