package easy.strings.generate_document;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 17-Feb-2022
 */
public class SolutionTest {
    String characters = "Bste!hetsi ogEAxpelrt x ";
    String document = "AlgoExpert is the Best!";

    @Test
    public void TestCaseForSolution1() {
        boolean expected = true;
        var actual = new Solution1().generateDocument(characters, document);
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void TestCaseForSolution2() {
        String characters = "A";
        String document = "a";
        boolean expected = false;
        var actual = new Solution2().generateDocument(characters, document);
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void TestCaseForSolution3() {
        boolean expected = true;
        var actual = new Solution3().generateDocument(characters, document);
        Assert.assertTrue(expected == actual);
    }


}