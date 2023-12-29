package easy.recursion.nth_fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 10-Mar-2022
 */
public class SolutionTest {
    @Test
    public void TestCaseForSolution1() {
        Assert.assertTrue(Solution1.getNthFib(6) == 5);
    }

    @Test
    public void TestCaseForSolution2() {
        Assert.assertTrue(Solution2.getNthFib(6) == 5);
    }
    @Test
    public void TestCaseForSolution3() {
        Assert.assertTrue(Solution3.getNthFib(6) == 5);
    }
}