package org.example.InClassProblems.W1D2;

public class ProblemA {
    public static void main(String[] args) {
        int[][] array = { // 2D non-zero array
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(STR."result : \{calculateAverage(array)}");
    }

    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];  // Add element to sum
                count++;  // Increment count of elements
            }
        }

        return (double) sum / count;
    }
}
/*
    Algorithm:

        1. Traverse through every element
        2. Calculate the sum
        3. Count the total number
        4. Compute the average by dividing the sum by the total number of elements.

    Time Complexity
        - Since all values are non-zero, we need to traverse every element in the array exactly once.
        - for  n * n matrix, the result in n^2 operations
        - TC = O(n^2)
 */
