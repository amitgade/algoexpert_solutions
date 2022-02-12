package arrays.easy.palindrome_check;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution4 {
    // O(n) time | O(n) space
    public static boolean palindromeCheck(String str) {
        char[] strArray = str.toCharArray(); // O(n) space
        int leftIndex = 0;
        int rightIndex = strArray.length - 1;
        while (leftIndex < rightIndex) {
            if (strArray[leftIndex] != strArray[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
