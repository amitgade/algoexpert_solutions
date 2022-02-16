package easy.strings.run_length_encoding;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 15-Feb-2022
 */
public class SolutionTest {
    @Test
    public void TestCase1() {
        var input = "AAAAAAAAAAAAABBCCCCDD";
        var expected = "9A4A2B4C2D";
        var actual = new Solution().runLengthEncoding(input);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase2() {
        var input = "ABCAD";
        var expected = "1A1B1C1A1D";
        var actual = new Solution().runLengthEncoding(input);
        Assert.assertTrue(expected.equals(actual));
    }

}