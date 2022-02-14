package easy.arrays.non_constructible_change;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 14-Feb-2022
 */
public class SolutionTest {
    @Test
    public void TestCase1() {
        int[] input = new int[]{5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        var actual = new Solution().nonConstructibleChange(input);
        Assert.assertTrue(expected == actual);
    }
}