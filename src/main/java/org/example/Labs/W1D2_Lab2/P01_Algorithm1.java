package org.example.Labs.W1D2_Lab2;

// – Use three loops one after another.
public class P01_Algorithm1 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 3, 1, 8, 7};
        System.out.println(STR."result => \{thirdLargest(arr)}");
    }

    public static int thirdLargest(int[] arr) {
        int len = arr.length;
        if(len < 3) throw new IllegalArgumentException("Array is too small!");

        //find first
        int max = arr[0];
        for(int i = 1; i < len; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        //second
        int preMax = 0;
        for (int i = 0; i < len ; i++){
            if (arr[i] > preMax && arr[i] < max)
                preMax = arr[i];
        }

        //third
        int prePreMax = 0;
        for (int i = 0; i < len ; i++){
            if (arr[i] > prePreMax && arr[i] < preMax)
                prePreMax = arr[i];
        }

        return prePreMax;
    }
}
/*
    Time Complexity:
        Each loop traverses the entire array.
        Time complexity = O(n) + O(n) + O(n) = O(3n) = O(n).

 */
