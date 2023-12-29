package easy.arrays.sorted_squared_array;

/**
 * Created by amitgade on 13-Feb-2022
 */
public class Solution2 {
    // O(n) time | O(n) space
    public int[] sortedSquaredArray(int[] array) {
        int leftIdx = 0;
        int rightIdx = array.length - 1;
        int[] squaredArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            int leftValue = Math.abs(array[leftIdx]);
            int rightValue = Math.abs(array[rightIdx]);

            if (leftValue >= rightValue) {
                squaredArray[i] = leftValue * leftValue;
                leftIdx++;
            } else if (rightValue > leftValue) {
                squaredArray[i] = rightValue * rightValue;
                rightIdx--;
            }
        }
        return squaredArray;
    }
}
