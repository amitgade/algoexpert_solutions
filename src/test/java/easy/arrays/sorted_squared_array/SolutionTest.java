package easy.arrays.sorted_squared_array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 13-Feb-2022
 */
public class SolutionTest {
    int[] input = new int[]{-7, -3, -2, 4, 5, 6, 9};
    int[] expected = new int[]{4, 9, 16, 25, 36, 49, 81};

    @Test
    public void testSolution1() {
        var actual = new Solution1().sortedSquaredArray(input);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void testSolution2() {
        var actual = new Solution1().sortedSquaredArray(input);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertTrue(expected[i] == actual[i]);
        }
    }
}