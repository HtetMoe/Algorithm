package org.example.InClassProblems.W1D4;

import java.util.Arrays;

public class P03_CoinChain {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int weight = 11;
        System.out.println(STR."result: \{coinChange(coins, weight)}");
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;  // base case: 0 amount requires 0 coins

        for (int i = 1; i <= amount; i++) { //target amount, i = 1 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
            System.out.println(STR."before: \{Arrays.toString(dp)}");

            for (int coin : coins) { // coins = {1, 2, 5}
                if (i - coin >= 0) { //we can use this coin to form amount i by adding 1 coin
                    System.out.println(STR."i:\{i}, c:\{coin}, min(\{dp[i]},\{dp[i - coin] + 1})");
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1); // update min coins needed
                }
            }
            System.out.println(STR."after: \{Arrays.toString(dp)}");
            System.out.println("---");
        }
        //System.out.println(Arrays.toString(dp));
        // If dp[amount] is still greater than amount, return -1 (no solution found)
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
