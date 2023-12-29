package easy.arrays.two_number_sum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class SolutionTest {
    int[] outputOfSolution1 = Solution1.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
    int[] outputOfSolution2 = Solution2.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
    int[] outputOfSolution3 = Solution3.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);


    @Test
    public void testSolution1() {
        Assert.assertTrue(outputOfSolution1.length == 2);
        Assert.assertTrue(contains(outputOfSolution1, -1));
        Assert.assertTrue(contains(outputOfSolution1, 11));
    }

    @Test
    public void testSolution2() {
        Assert.assertTrue(outputOfSolution2.length == 2);
        Assert.assertTrue(contains(outputOfSolution2, -1));
        Assert.assertTrue(contains(outputOfSolution2, 11));
    }

    @Test
    public void testSolution3() {
        Assert.assertTrue(outputOfSolution3.length == 2);
        Assert.assertTrue(contains(outputOfSolution3, -1));
        Assert.assertTrue(contains(outputOfSolution3, 11));
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}