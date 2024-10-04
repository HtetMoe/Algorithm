package org.example.lessons.lesson3;

public class KnapSack {
    public static void main(String[] args) {
        int value[]  = {15, 12, 9, 16, 17};
        int weight[] = {2, 5, 3, 4, 6};
        int W = 12; // capacity allowed

        int n = value.length;
        System.out.print(STR."Max value => \{knapSack(W, weight, value, n)}");
    }
    static int knapSack(int W, int wt[], int val[], int n) {
        int[] dp = new int[W + 1]; // Making and initializing dp array

        for (int i = 1; i < n + 1; i++) {
            for (int w = W; w >= 0; w--) {
                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]]+ val[i - 1]);  // Finding the maximum value
            }
            for (int k = 1; k < W + 1; k++) {
                System.out.print(STR." \{dp[k]}");
            }
            System.out.println();
        }
        return dp[W];  // Returning the maximum value of knapsack
    }
}
