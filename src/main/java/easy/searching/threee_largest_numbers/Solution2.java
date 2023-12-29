package easy.searching.threee_largest_numbers;

/**
 * Created by amitgade on 28-Feb-2022
 */
public class Solution2 {
    // O(n) time | O(1) space
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int number : array) {
            updateLargest(result, number);
        }
        return result;
    }

    private static void updateLargest(int[] result, int number) {
        if (number >= result[2]) {
            findAndUpdate(result, number, 2);
        } else if (number >= result[1]) {
            findAndUpdate(result, number, 1);
        } else if (number >= result[0]) {
            findAndUpdate(result, number, 0);
        }
    }

    private static void findAndUpdate(int[] result, int number, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                result[i] = number;
            } else {
                result[i] = result[i + 1];
            }
        }
    }
}
