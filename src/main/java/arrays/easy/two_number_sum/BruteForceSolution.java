package arrays.easy.two_number_sum;

/**
 * Created by amitgade on 22-Mar-2021
 */
public class BruteForceSolution {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
