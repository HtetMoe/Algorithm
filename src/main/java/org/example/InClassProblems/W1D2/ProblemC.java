package org.example.InClassProblems.W1D2;

public class ProblemC {
    public static void main(String[] args) {
        int[][] array = {
                {0, 2, 3, 4},
                {0, 0, 7, 8},
                {0, 0, 0, 12},
                {0, 0, 0, 0}
        };

        System.out.println(STR."result => \{calculateAverageUpperTriangular(array)}");
    }

    public static double calculateAverageUpperTriangular(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {  // traverse only upper triangular and diagonal part
                if (array[i][j] != 0) {  // check if element is non-zero
                    sum += array[i][j];
                    count++;
                }
            }
        }
        return (count == 0) ? 0 : (double) sum / count;  // avoid division by zero
    }
}
/*
    Algorithm:

        1. Traverse only through the upper triangular part of the matrix.
        2. Add all non-zero values to the sum.
        3. Count the number of non-zero elements.
        4. Compute the average by dividing the sum by the number of non-zero elements.

   Time Complexity:

       1. The upper triangular part of an n×n matrix has (n * (n+1))/2 elements.
       2.  Time Complexity = O(n^2)
 */
