package org.example.Lesson1.P01_GCD;

public class GCD_Iterative {
    public static void main(String[] args) {
        int a = 136, b = 600;
        System.out.println(STR."GCD of \{a} and \{b} is: \{gcd(a, b)}");
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}