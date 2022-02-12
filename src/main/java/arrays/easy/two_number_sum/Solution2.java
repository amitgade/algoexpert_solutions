package arrays.easy.two_number_sum;

import java.util.HashSet;

/**
 * Created by amitgade on 22-Mar-2021
 */
public class Solution2 {
    // O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i : array) {
            if (hashSet.contains(targetSum - i)) {
                return new int[]{targetSum - i, i};
            } else {
                hashSet.add(i);
            }
        }
        return new int[0];
    }
}
