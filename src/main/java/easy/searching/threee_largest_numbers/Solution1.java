package easy.searching.threee_largest_numbers;

/**
 * Created by amitgade on 27-Feb-2022
 */
public class Solution1 {
    // O(n) time | O(1) space
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int number : array) {
            if (number >= result[2]) {
                result[0] = result[1];
                result[1] = result[2];
                result[2] = number;
            } else if (number >= result[1]) {
                result[0] = result[1];
                result[1] = number;
            } else if (number >= result[0]) {
                result[0] = number;
            }
        }
        return result;
    }
}
