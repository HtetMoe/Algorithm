package org.example.InClassProblems.W1D2;

public class ProblemD {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {0, 0, 0, 0, 9, 10, 11, 12},
                {0, 0, 0, 0, 0, 0, 13, 14},
                {0, 0, 0, 0, 0, 0, 0, 15},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        System.out.println(STR."result : \{calculateAverageRandom(array)}");
    }
    public static double calculateAverageRandom(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {  // traverse entire matrix
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

        1. Traverse through the entire matrix.
        2. Only add non-zero values to the sum and count the number of non-zero elements.
        3. Compute the average by dividing the sum by the number of non-zero elements.

    Time Complexity:

        This scenario requires traversal through all elements of the matrix to find non-zero values.
        Time Complexity = O(n^2)

 */
