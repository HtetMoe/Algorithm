package org.example.InClassProblems.W1D4;
/*
    - n steps
    - each time you can either climb 1 or 2 steps
 */
public class ClimbingStair {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(STR."result : \{climbStairs(n)}");
    }
    public static int climbStairs(int n) {
        if(n <= 2) return n;
        else
            return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
