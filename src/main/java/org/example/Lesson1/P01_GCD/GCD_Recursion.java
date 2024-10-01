package org.example.Lesson1.P01_GCD;
/*
    •	gcd(600, 136) → gcd(136, 600 % 136) → gcd(136, 56)
	•	gcd(136, 56) → gcd(56, 136 % 56) → gcd(56, 24)
	•	gcd(56, 24) → gcd(24, 56 % 24) → gcd(24, 8)
	•	gcd(24, 8) → gcd(8, 24 % 8) → gcd(8, 0) → return 8

	 - greatest common divisor
            600 = 4 * 135 + 56
			136 = 2 * 56 + 24
			56  = 2 * 24 + 8. <- GCF!
			24  = 3 * 8 + 0 = done
 */
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
