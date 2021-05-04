package strings.easy.palindrome_check;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 04-May-2021
 */
public class ProgramTest {
    @Test
    public void testCase() {
        Assert.assertTrue(Program.isPalindrome("abcdcba"));
        Assert.assertTrue(Program.isPalindrome("abccba"));
        Assert.assertTrue(Program.isPalindrome("a"));
        Assert.assertFalse(Program.isPalindrome("abcabc"));
    }

}