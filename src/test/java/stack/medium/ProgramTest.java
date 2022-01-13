package stack.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 13-Jan-2022
 */
public class ProgramTest {
    @Test
    public void TestCase1() {
        String input = "([])(){}(())()()";
        Assert.assertTrue(Program.balancedBrackets(input));
    }

    @Test
    public void TestCase2() {
        String input = "(((()))";
        Assert.assertFalse(Program.balancedBrackets(input));
    }

    @Test
    public void TestCase3() {
        String input = "}()()()";
        Assert.assertFalse(Program.balancedBrackets(input));
    }

    @Test
    public void TestCase4() {
        String input = "([])()}{(())()()";
        Assert.assertFalse(Program.balancedBrackets(input));
    }
}