package org.example.lessons.Lesson1.P01_GCD;
public class GCD_Recursion {

    public static void main(String[] args) { //gcd(37, 14); //1
        int gcd  = gcd(600, 136); // 8
        System.out.println(STR."result \{gcd}");
    }

    static int gcd(int a, int b) {
        if (b == 0) { //base case
            return a;
        }
        return gcd(b, a % b); // recursive case
    }
}
