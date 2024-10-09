package org.example.Labs.W1D4_Lab4;

public class P03_IntegerKnapsack {
    public static void main(String[] args) {
        int[] values = {25, 12, 24, 16, 28};
        int[] weights = {5, 6, 8, 2, 7};
        int Wmax = 20;

        System.out.println(STR."max \{knapsack(values, weights, Wmax)}");
    }
    public static int knapsack(int[] values, int[] weights, int Wmax) {
        int n = values.length;
        int[][] dp = new int[n + 1][Wmax + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= Wmax; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][Wmax];
    }
}
