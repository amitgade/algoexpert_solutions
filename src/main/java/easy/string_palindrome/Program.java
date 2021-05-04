package easy.string_palindrome;

/**
 * Created by amitgade on 04-May-2021
 */
public class Program {

    //    O(n^2) time | O(n) space
//    public static boolean isPalindrome(String str) {
//        String reverseString = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverseString += str.charAt(i); // String concatenation step has O(n^2)
//        }
//        return str.equals(reverseString);
//    }


    //    O(n) time | O(n) space
//    public static boolean isPalindrome(String str) {
//        StringBuilder reverseStr = new StringBuilder();
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reverseStr.append(str.charAt(i));
//        }
//        return str.equals(reverseStr.toString());
//    }

    //    O(n) time | O(n space) | Recursive
//    public static boolean isPalindrome(String str) {
//        return isPalindrome(str, 0);
//    }
//
//    private static boolean isPalindrome(String str, int i) {
//        int j = str.length() - 1 - i;
//        return i >= j ? true : str.charAt(i) == str.charAt(j) && isPalindrome(str, i + 1);
//    }


    //    O(n) time | O(n) space
//    public static boolean isPalindrome(String str) {
//        boolean palindrome = true;
//        char[] array = str.toCharArray();
//        int start = 0;
//        int end = array.length - 1;
//        while (start < array.length && end > 0) {
//            if (array[start] == array[end]) {
//                palindrome = true;
//                start++;
//                end--;
//            } else {
//                return false;
//            }
//        }
//        return palindrome;
//    }

    //    O(n) time | O(1) space
    public static boolean isPalindrome(String str) {
        boolean palindrome = true;
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return palindrome;
    }
}
