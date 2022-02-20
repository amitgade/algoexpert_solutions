package easy.strings.first_non_repeating_char;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 20-Feb-2022
 */
public class SolutionTest {
    @Test
    public void TestCaseForSolution1() {
        String input = "faadabcbbebdf";
        int expected = 6;
        var actual = new Solution1().firstNonRepeatingCharacter(input);
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void TestCaseForSolution2() {
        String input = "abcdcaf";
        int expected = 1;
        var actual = new Solution2().firstNonRepeatingCharacter(input);
        Assert.assertTrue(expected == actual);
    }
}