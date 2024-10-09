package org.example.lessons.lesson3;

public class P02_Binomial {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(STR."Binomial Coefficient (\{n}, \{k}) = \{binomialCoefficient(n, k)}");
    }

    public static long binomialCoefficient(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n - k + i;
            result /= i;
        }
        return result;
    }
}
