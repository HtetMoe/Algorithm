package org.example.lessons.lesson3;
/*
    -  KnapSack = a bag with a capacity of max 12
    -  what is the maximum value we can obtain by selecting a subset of these objects
    -  Constraint => sum of w doesn't exceed max capacity
    -  each row consider should (or) should not include the current item
    -  if don't include the current item, look at 1 row above
 */
public class KnapSack {

    public static void main(String[] args) {
        int values[]  = {};//{15, 12, 9, 16, 17};
        int weights[] = {};//{2, 5, 3, 4, 6};

        int W = 12; // capacity allowed
        int n = values.length; // length

        System.out.print(STR."Max value => \{knapSack(weights, values, W, n)}");
    }

    static int knapSack(int wt[], int val[],int target, int n) {
        int[] dp = new int[target + 1]; // Making and initializing dp array

        for (int i = 1; i <= n ; i++) {
            for (int w = target; w >= 0; w--) {
                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]]+ val[i - 1]);  // finding the maximum value
            }

            for (int k = 1; k < target + 1; k++) {
                System.out.print(STR." \{dp[k]}");
            }
            System.out.println();
        }
        return dp[target];  // Returning the maximum value of knapsack
    }
}
