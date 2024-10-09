package org.example.InClassProblems.W1D1;
/*
    - it means a word that reads the same backward or forward.
      eg. racecar
      T(n) = O(n)
 */
public class P04_IsStringPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(STR."result : \{isStringPalindrome(str)}");
    }

    public static boolean isStringPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;

            //update
            left++; right--;
        }
        return true;
    }
}
/*
Time complexity
   - 1
   - 1
   - O(n/2) (constant 1/2 ignored)
   - 1 (condition)
   - 1
   - 1
   Total => O(n)
 */
