package easy.searching.binary_search;

/**
 * Created by amitgade on 27-Feb-2022
 */
public class Solution1 {
    // O(log(n)) time | O(log(n)) space
    // recursive approach
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        int potentialMatch = array[middle];

        if (target == potentialMatch) {
            return middle;
        } else if (target < potentialMatch) {
            return binarySearch(array, target, left, middle - 1);
        } else {
            return binarySearch(array, target, middle + 1, right);
        }
    }
}
