package easy.arrays.sorted_squared_array;

import java.util.Arrays;

/**
 * Created by amitgade on 13-Feb-2022
 */
public class Solution1 {
    // O(n.log(n)) time | O(n) space
    public int[] sortedSquaredArray(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}

