package org.example.lessons.Lesson1.P02_Fibonanci;

import java.util.Arrays;

public class Fibonacci_Iterative {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(STR."Fibonacci number at position \{n} is: \{fibonacci(n)}");
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int[] fib = new int[n + 1]; // (n - 1) + 2(0,1) = n + 1
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib));

        return fib[n];
    }
}
