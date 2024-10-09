package org.example.lessons.lesson3;

import java.util.Arrays;

public class P01_DynamicFibonanci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(STR."result : \{fibonacci(n)}");
    }

    public static int fibonacci(int n) {
        if(n <= 1) return n;

        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(STR."fib = \{Arrays.toString(fib)}");
        return fib[n];
    }
}
