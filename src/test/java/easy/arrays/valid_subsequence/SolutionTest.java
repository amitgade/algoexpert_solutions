package easy.arrays.valid_subsequence;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class SolutionTest {
    List<Integer> array = Arrays.asList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10});

    @Test
    public void testSolution1() {
        Assert.assertTrue(Solution1.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, -1, 10})));

        Assert.assertTrue(Solution1.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6})));

        Assert.assertFalse(Solution1.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, 8, 5})));

        Assert.assertFalse(Solution1.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, 18, 5})));

        Assert.assertTrue(Solution1.isValidSubsequence
                (array, array));
    }

    @Test
    public void testSolution2() {
        Assert.assertTrue(Solution2.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, -1, 10})));

        Assert.assertTrue(Solution2.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6})));

        Assert.assertFalse(Solution2.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, 8, 5})));

        Assert.assertFalse(Solution2.isValidSubsequence
                (array, Arrays.asList(new Integer[]{1, 6, 18, 5})));

        Assert.assertTrue(Solution2.isValidSubsequence
                (array, array));
    }
}