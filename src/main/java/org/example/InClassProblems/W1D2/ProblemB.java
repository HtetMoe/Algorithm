package org.example.InClassProblems.W1D2;

public class ProblemB {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 0, 0},
                {5, 6, 0, 0},
                {9, 10, 11, 0},
                {13, 14, 15, 16}
        };
        System.out.println(STR."result : \{calculateAverageLowerTriangular(array)}");
    }
    public static double calculateAverageLowerTriangular(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {  // Traverse only lower triangular and diagonal
                if (array[i][j] != 0) {  // Check if element is non-zero
                    sum += array[i][j];
                    count++;
                }
            }
        }

        return (double) sum / count;
    }
}
/*
    Algorithm:

        1. Traverse only through the lower triangular and diagonal elements.
        2. Calculate the sum
        3. Count the total number of non-zero elements.
        4. Compute the average by dividing the sum by the number of non-zero elements.

        Time Complexity:

        - We traverse through half of the matrix plus the diagonal elements.
        - Number of elements to consider is (n * (n+1))/2
        - Time Complexity = O(n^2)
 */
