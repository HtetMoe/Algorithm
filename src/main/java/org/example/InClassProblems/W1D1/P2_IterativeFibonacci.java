package org.example.InClassProblems.W1D1;

public class P2_IterativeFibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(STR."result \{fibonacciIterative(n)}");
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int b = 1, a = 1, temp;
        for (int i = 2; i < n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}

