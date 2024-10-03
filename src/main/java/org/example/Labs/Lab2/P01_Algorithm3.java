package org.example.Labs.Lab2;

import java.util.TreeSet;

//– Use an ordered dictionary
public class P01_Algorithm3 {
    public static void main(String[] args) {
        int[] arr = {7, 20, 18, 4, 20, 19, 20, 3};
        System.out.println(STR."result => \{orderedSetMax(arr)}");
    }

    public static int orderedSetMax(int[] arr) {
        TreeSet<Integer> topThree = new TreeSet<>();
        for (int num : arr) {
            topThree.add(num);
            if (topThree.size() > 3) {
                topThree.pollFirst(); // remove the smallest element if size exceeds 3
            }
        }

        return topThree.first(); // 3rd largest element will be the smallest in topThree
    }
}
/*
    Time Complexity:

        Insertion and deletion operations in a balanced binary search tree (like a Tree Set) are
        O(log k), where k is 3 in this case.
        Iterating through the array is O(n).
        Time complexity = O(n * log k), which simplifies to O(n) since k = 3.
 */
