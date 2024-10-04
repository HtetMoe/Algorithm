package org.example.lessons.Lesson1;

import java.util.Arrays;

//sorting problem
public class P02_SortList {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
        System.out.println(STR."original : \{Arrays.toString(arr)}");

        Arrays.sort(arr);
        System.out.println(STR."sorted : \{Arrays.toString(arr)}");
    }
}
