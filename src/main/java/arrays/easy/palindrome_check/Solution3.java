package arrays.easy.palindrome_check;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution3 {
    // O(n) time | O(n) space | recursive approach
    public static boolean palindromeCheck(String str) {
        return isPalindrome(str, 0);
    }

    private static boolean isPalindrome(String str, int i) {
        int j = str.length() - 1 - i;
        if (i > j) {
            return true;
        }
        return ((str.charAt(i) == str.charAt(j)) && isPalindrome(str, i + 1));
    }
}
