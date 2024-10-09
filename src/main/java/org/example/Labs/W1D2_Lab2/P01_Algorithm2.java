package org.example.Labs.W1D2_Lab2;

// – Use one loop
public class P01_Algorithm2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 3, 1, 8, 7};
        System.out.println(STR."result => \{thirdLargest(arr)}");
    }

//    public static int thirdLargest(int[] arr) {
//        int len = arr.length;
//        if (len < 3) throw new IllegalArgumentException("Array is too small!");
//
//        Arrays.sort(arr);
//        return arr[len - 3]; // 3rd largest
//    } // O(n log n)

    public static int thirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }

        int max = 0, preMax = 0, prePreMax = 0;

        for (int element : arr) {
            if (element > max) {
                prePreMax  = preMax;
                preMax = max;
                max  = element;
            }
            else if (element > preMax && element != max) {
                prePreMax = preMax;
                preMax = element;
            }
            else if (element > prePreMax && element != preMax && element != max) {
                prePreMax = element;
            }
        }
        return prePreMax;
    }
}
/*
    Time Complexity:
        Single loop through the array.
        Time complexity = O(n).
 */
