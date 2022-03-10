package easy.recursion.nth_fibonacci;

/**
 * Created by amitgade on 10-Mar-2022
 */
public class Solution1 {
    // Recursive Solution
    // O(2^n) time | O(n) space
    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}

