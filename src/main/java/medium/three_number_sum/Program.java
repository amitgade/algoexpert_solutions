package medium.three_number_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amitgade on 03-May-2021
 */
public class Program {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Sort the array
        Arrays.sort(array);
        // create empty arrayList of Integer Array elements
        List<Integer[]> arrayList = new ArrayList<>();

        // Iterate
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    arrayList.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return arrayList;
    }
}
