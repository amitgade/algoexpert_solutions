package easy.searching.threee_largest_numbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 27-Feb-2022
 */
public class SolutionTest {
    @Test
    public void testCaseForSolution1() {
        int[] expected = {18, 141, 541};
        Assert.assertTrue(
                compare(
                        Solution1.findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}),
                        expected));
    }
@Test
    public void testCaseForSolution2() {
        int[] expected = {18, 141, 541};
        Assert.assertTrue(
                compare(
                        Solution2.findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}),
                        expected));
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