package easy.searching.binary_search;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 27-Feb-2022
 */
public class SolutionTest {
    @Test
    public void TestCaseForSolution1() {
        Assert.assertTrue(
                Solution1.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
    }

    @Test
    public void TestCaseForSolution2() {
        Assert.assertTrue(
                Solution2.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
    }

}