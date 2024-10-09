package org.example.lessons.Lesson6.QuickSelect;
/*
    Time complexity, apply master theorem
    - partition takes linear time = O(n)
    - only one recursive call on either left or right

    So, T(n) = T(n/2) + O(n)
    Formula => T(n) = aT(n/b) + O(n^d)
     a = 1,  (only one subproblem is solved at each step).
     b = 2,  (the problem size is halved in each recursive step).
     d = 1   (the cost of partitioning the array is O(n)).

     - f(n) = O(n)
     - compute log a based b = log 1 base 2 = 0
     - n ^ log a based b = n ^ 0 = 1

     Time complexity => T(n) = O(n)
     In worst case : T(n) = O(n^2)



 */
public class QuickSelect {

    public static void main(String[] args) {
        int[] A = {9, 3, 5, 1, 4, 2, 7, 6, 8, 10, 11};
        int k = 8;
        int result = quickSelect(A, k);
        System.out.println(STR."The \{k}-th smallest element is: \{result}");
    }

    public static int quickSelect(int[] A, int k) {
        return quickSelectHelper(A, 0, A.length - 1, k);
    }

    private static int quickSelectHelper(int[] A, int low, int high, int k) {
        if (low == high) {
            return A[low];
        }

        //pick pivot using "median of three"
        int pivotIndex = medianOfThree(A, low, high);
        pivotIndex = partition(A, low, high, pivotIndex);

        int leftSize = pivotIndex - low + 1;  // number of elements in the left part

        // determine if k-th smallest is in the left, pivot, or right partition
        if (k == leftSize) {
            return A[pivotIndex];
        }
        else if (k < leftSize) {
            return quickSelectHelper(A, low, pivotIndex - 1, k);
        }
        else {
            return quickSelectHelper(A, pivotIndex + 1, high, k - leftSize);
        }
    }

    private static int medianOfThree(int[] A, int low, int high) {
        int mid = (low + high) / 2;
        int first = A[low], middle = A[mid], last = A[high];

        // Find the median of the first, middle, and last elements
        if ((first > middle) != (first > last)) {
            return low; // first is median
        } else if ((middle > first) != (middle > last)) {
            return mid; // middle is median
        } else {
            return high; // last is median
        }
    }

    private static int partition(int[] A, int low, int high, int pivotIndex) {
        int pivotValue = A[pivotIndex];

        // Move pivot to the end
        swap(A, pivotIndex, high);

        int i = low;

        // Partition the array
        for (int j = low; j < high; j++) {
            if (A[j] < pivotValue) {
                swap(A, i, j);
                i++;
            }
        }

        // Move pivot to its final place
        swap(A, i, high);

        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
