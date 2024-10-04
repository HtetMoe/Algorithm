package org.example.InClassProblems.W1D4;

import java.util.Arrays;

public class CoinChain {
    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        int target = 8;
        System.out.println(STR."result: \{coinChange(coins, target)}");
    }

    public static int coinChange(int[] coins, int weight) {
        int[][] dp = new int[coins.length][weight + 1];

        //put 1 to all col 1, others 0
        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 1; //exactly one way to form amount 0 (by choosing no coins)
        }
        //print2DArray(dp);
        //System.out.println("---");

        for (int i = 0; i < coins.length; i++) {  //row
            for (int j = 1; j <= weight; j++) {   //col

                int includeCoin = (j >= coins[i]) ? dp[i][j - coins[i]] : 0;  //if j >= coins[i], w > value
                int excludeCoin = (i >= 1) ? dp[i - 1][j] : 0;  //take value from the previous row => (exclude) value > w, copy above
                dp[i][j] = includeCoin + excludeCoin;  // total ways to make amount j
            }
        }

        print2DArray(dp);

        //total ways to form the target amount using all coins
        return dp[coins.length - 1][weight];
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { //row
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
