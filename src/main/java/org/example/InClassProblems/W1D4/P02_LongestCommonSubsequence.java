package org.example.InClassProblems.W1D4;

public class P02_LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(STR."LCS \{longestCommonSubsequence(text1, text2)}");
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1]; // 2D array (m+1) x (n+1)

        //fill the array
        for (int i = 1; i <= m; i++) {     // m =  a b c d e
            for (int j = 1; j <= n; j++) { // n =  a c e
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; //if it's match, increase the LCS length by 1
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); //take the maximum LCS length possible
            }
        }
        CoinChain.print2DArray(dp);
        return dp[m][n];// result = bottom right cell
    }
}
