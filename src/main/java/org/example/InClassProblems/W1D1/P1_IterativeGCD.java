package org.example.InClassProblems.W1D1;

public class P1_IterativeGCD {
    public static void main(String[] args) {
        int a = 65, b = 5;
        System.out.println(STR."result \{findGcd(a, b)}");
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
