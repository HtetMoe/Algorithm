package org.example.Lesson1.P02_Fibonanci;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(STR."Fibonacci number at position \{n} is: \{fibonacci(n)}");
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0; // base case for n = 0
        if (n == 1) return 1; // base case for n = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
    }
}
