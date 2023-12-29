package easy.searching.binary_search;

/**
 * Created by amitgade on 27-Feb-2022
 */
public class Solution2 {
    // O(log(n)) time | O(1) space
    // iterative approach
    public static int binarySearch(int[] array, int target) {
        int startIdx = 0;
        int endIdx = array.length - 1;
        while (startIdx <= endIdx) {
            int midIdx = (endIdx + startIdx) / 2;
            int midNum = array[midIdx];
            if (target == midNum) {
                return midIdx;
            } else if (target < midNum) {
                endIdx = midIdx - 1;
            } else if (target > midNum) {
                startIdx = midIdx + 1;
            }
        }
        return -1;
    }
}
