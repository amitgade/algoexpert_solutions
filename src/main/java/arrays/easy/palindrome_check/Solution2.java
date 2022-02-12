package arrays.easy.palindrome_check;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution2 {
    // O(n) time | O(n) space
    public static boolean palindromeCheck(String str) {
        StringBuilder reversedString = new StringBuilder(); // O(n) time
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return str.equals(reversedString.toString());
    }
}
