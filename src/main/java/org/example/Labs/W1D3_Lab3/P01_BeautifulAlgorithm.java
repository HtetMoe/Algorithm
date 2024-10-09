package org.example.Labs.W1D3_Lab3;
/*
    - an algorithm which the best-case running time is equal to the worst-case running time
 */
public class P01_BeautifulAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        beautiful(arr, arr.length);
    }

    // a fun that runs in O(n) time always (best-case = worst-case)
    public static void beautiful(int[] A, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        System.out.println(STR."sum = \{sum}");
    }
}
/*
    Explanation
    - The algorithm always iterates through all array elements, giving a time complexity of 𝑂(𝑛)
      regardless of input.
    - There are no conditionals or early exits, making best-case and worst-case times equal.
 */