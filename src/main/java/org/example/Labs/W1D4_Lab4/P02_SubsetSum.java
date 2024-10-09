package org.example.Labs.W1D4_Lab4;

import java.util.ArrayList;
import java.util.List;

public class P02_SubsetSum {
    public static void main(String[] args) {
        int[] arr  =  {3, 4, 7, 8};
        int target = 15;

        // (a) check if subset exists
        System.out.println(STR."subset exists : \{subsetExists(arr, target)}");

        // (b) find one subset that adds up to the given sum
        System.out.println(STR."one subset that adds up to the given sum \{findOneSubset(arr, target)}");

        // (c) find all subsets that add up to the given sum
        List<List<Integer>> allSubsets = new ArrayList<>();
        findAllSubsets(arr, 0, target, new ArrayList<>(), allSubsets);
        System.out.println(STR."all subsets \{allSubsets}");
    }

    //a) a method check if there is a subset with the given sum
    public static boolean subsetExists(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length + 1][target + 1];

        // dynamic programming array
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true; // There's always a subset with sum 0 (empty subset)
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arr.length][target];
    }

    //b) find one subset that adds up to the given sum
    public static List<Integer> findOneSubset(int[] arr, int target) {
        List<Integer> subset = new ArrayList<>();
        boolean[][] dp = new boolean[arr.length + 1][target + 1];

        //dp array
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (!dp[arr.length][target]) {
            return subset; // No subset found
        }

        int i = arr.length, j = target;
        while (i > 0 && j > 0) {
            if (dp[i][j] && !dp[i - 1][j]) {
                subset.add(0, arr[i - 1]);
                j -= arr[i - 1];
            }
            i--;
        }
        return subset;
    }

    //c) find all subsets that add up to the given sum
    public static void findAllSubsets(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> allSubsets) {
        if (target == 0) {
            allSubsets.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == nums.length) {
            return;
        }

        // Include the current element
        current.add(nums[index]);
        findAllSubsets(nums, index + 1, target - nums[index], current, allSubsets);

        // Exclude the current element
        current.remove(current.size() - 1);
        findAllSubsets(nums, index + 1, target, current, allSubsets);
    }
}
