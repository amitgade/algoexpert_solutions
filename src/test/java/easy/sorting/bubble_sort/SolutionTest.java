package easy.sorting.bubble_sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 01-Mar-2022
 */
public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assert.assertTrue(compare(Solution.bubbleSort(input), expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}