package easy.arrays.two_number_sum;

import java.util.Arrays;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution3 {
    // O(n.log(n)) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else if (currentSum > targetSum) {
                right--;
            }
        }
        return new int[0];
    }

}
