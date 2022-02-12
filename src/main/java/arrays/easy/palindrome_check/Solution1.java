package arrays.easy.palindrome_check;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution1 {
    // O(n^2) time | O(n) space
    public static boolean palindromeCheck(String str) {
        String reversedString = ""; // O(n^2) time
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return str.equals(reversedString);
    }
}
