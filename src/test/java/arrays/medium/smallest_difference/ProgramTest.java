package arrays.medium.smallest_difference;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by amitgade on 04-May-2021
 */
public class ProgramTest {
    @Test
    public void testCase() {
        int[] expected = {28, 26};
        Assert.assertTrue(
                Arrays.equals(
                        Program.smallestDifference(
                                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
                        expected));
    }

}