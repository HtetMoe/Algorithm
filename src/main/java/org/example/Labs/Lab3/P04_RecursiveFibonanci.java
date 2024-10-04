package org.example.Labs.Lab3;

public class P04_RecursiveFibonanci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(STR."result : \{fib(n)}");
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;  // base case: fib(0) = 0, fib(1) = 1
        }
        return fib(n - 1) + fib(n - 2);  // recursive calls
    }
}
/*
    Time Complexity Analysis:
        - The recurrence for the naive Fibonacci function is 𝑇(𝑛) = 𝑇(𝑛−1) + 𝑇(𝑛−2) + O(1).
        - It doesn’t fit the Master Theorem since the subProblems aren’t equally divided.
          (i.e., T(n) is not a function of T(n/b)).
        - The number of recursive calls doubles at each level, resulting in an exponential time
          complexity: 𝑇(𝑛) = O(2ⁿ).
 */
