package org.example.InClassProblems.W1D3;

public class CoinWeighing {
    public static void main(String[] args) {
        int[] coins = new int[81];

        // all coins have weight 1 except one lighter coin (e.g., at index 5)
        for (int i = 0; i < 81; i++) {
            coins[i] = 1;
        }
        coins[5] = 0;  //lighter coin at index 5 (arbitrary)

        //find the index of the lighter coin
        int lighterCoinIndex = findLighterCoin(coins, 0, coins.length - 1, 0);
        System.out.println(STR."The lighter coin is at index: \{lighterCoinIndex}");
    }

    /**
     * @param depth Current depth of recursion (number of weightings used).
     * @return Index of the lighter coin.
     */
    public static int findLighterCoin(int[] coins, int start, int end, int depth) {

        if (start == end) return start;// base case: only one coin left, it must be the lighter one.

        //size of each group
        int range = end - start + 1;
        int groupSize = range / 3;

        //indices for the three groups
        int leftStart = start;
        int leftEnd   = leftStart + groupSize - 1;

        int middleStart = leftEnd + 1;
        int middleEnd = middleStart + groupSize - 1;

        int rightStart = middleEnd + 1;
        int rightEnd = end;

        // weigh the left group against the middle group
        int result = weigh(coins, leftStart, leftEnd, middleStart, middleEnd);

        if (result == -1) {
            return findLighterCoin(coins, leftStart, leftEnd, depth + 1); // Left group is lighter
        }
        else if (result == 1) {
            return findLighterCoin(coins, middleStart, middleEnd, depth + 1);  // Middle group is lighter
        } else {
            return findLighterCoin(coins, rightStart, rightEnd, depth + 1); // Right group is lighter
        }
    }

    /**
     * Function to simulate weighing of two groups of coins.
     * @return -1 if the left group is lighter, 1 if the middle group is lighter, 0 if both are equal.
     */
    public static int weigh(int[] coins, int leftStart, int leftEnd, int middleStart, int middleEnd) {
        int leftWeight = 0, middleWeight = 0;

        for (int i = leftStart; i <= leftEnd; i++) {
            leftWeight += coins[i]; //total weight of the left group
        }

        for (int i = middleStart; i <= middleEnd; i++) {
            middleWeight += coins[i]; //total weight of the middle group
        }

        // Compare the weights
        if (leftWeight < middleWeight)
            return -1;  // Left group is lighter
        else if (leftWeight > middleWeight)
            return 1;  // Middle group is lighter
        else
            return 0;  // Both groups are equal, lighter coin is in the right group
    }
}
