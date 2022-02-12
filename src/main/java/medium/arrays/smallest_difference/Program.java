package medium.arrays.smallest_difference;

import java.util.Arrays;

/**
 * Created by amitgade on 03-May-2021
 * <p>
 * O(nlog(n)) + O(mlog(m)) time / O(1) space
 */
public class Program {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne); // Assuming we are doing in-place sorting
        Arrays.sort(arrayTwo); // Assuming we are doing in-place sorting

        int idxOne = 0, idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = null;

        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];

            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idxOne++;
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[]{firstNum, secondNum};
            }
            if (current < smallest) {
                smallest = current;
                smallestPair = new int[]{firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
