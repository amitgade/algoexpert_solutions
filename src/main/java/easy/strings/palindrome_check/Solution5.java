package easy.strings.palindrome_check;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution5 {
    // O(n) time | O(1) space
    public static boolean palindromeCheck(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
