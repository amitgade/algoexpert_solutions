package arrays.easy.palindrome_check;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class SolutionTest {
    @Test
    public void palindromeCheck() {
        Assert.assertTrue(Solution3.palindromeCheck("a"));
        Assert.assertTrue(Solution3.palindromeCheck("abcdcba"));
        Assert.assertTrue(Solution3.palindromeCheck("madam"));
        Assert.assertFalse(Solution3.palindromeCheck("abcb"));
        Assert.assertFalse(Solution3.palindromeCheck("abbcba"));
    }
}