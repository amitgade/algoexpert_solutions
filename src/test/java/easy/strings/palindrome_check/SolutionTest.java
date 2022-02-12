package easy.strings.palindrome_check;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class SolutionTest {
    @Test
    public void testSolution1() {
        Assert.assertTrue(Solution1.palindromeCheck("a"));
        Assert.assertTrue(Solution1.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution1.palindromeCheck("madam"));
        Assert.assertFalse(Solution1.palindromeCheck("abcb"));
        Assert.assertFalse(Solution1.palindromeCheck("abbcba"));
    }

    @Test
    public void testSolution2() {
        Assert.assertTrue(Solution2.palindromeCheck("a"));
        Assert.assertTrue(Solution2.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution2.palindromeCheck("madam"));
        Assert.assertFalse(Solution2.palindromeCheck("abcb"));
        Assert.assertFalse(Solution2.palindromeCheck("abbcba"));
    }

    @Test
    public void testSolution3() {
        Assert.assertTrue(Solution3.palindromeCheck("a"));
        Assert.assertTrue(Solution3.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution3.palindromeCheck("madam"));
        Assert.assertFalse(Solution3.palindromeCheck("abcb"));
        Assert.assertFalse(Solution3.palindromeCheck("abbcba"));
    }

    @Test
    public void testSolution4() {
        Assert.assertTrue(Solution4.palindromeCheck("a"));
        Assert.assertTrue(Solution4.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution4.palindromeCheck("madam"));
        Assert.assertFalse(Solution4.palindromeCheck("abcb"));
        Assert.assertFalse(Solution4.palindromeCheck("abbcba"));
    }

    @Test
    public void testSolution5() {
        Assert.assertTrue(Solution5.palindromeCheck("a"));
        Assert.assertTrue(Solution5.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution5.palindromeCheck("madam"));
        Assert.assertFalse(Solution5.palindromeCheck("abcb"));
        Assert.assertFalse(Solution5.palindromeCheck("abbcba"));
    }
}