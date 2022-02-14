package easy.strings.caesar_cipher_encryptor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 14-Feb-2022
 */
public class SolutionTest {
    @Test
    public void TestCaseForSolution1() {
        Assert.assertTrue(Solution1.caesarCypherEncryptor("xyz", 2).equals("zab"));
    }

    @Test
    public void TestCaseForSolution2() {
        Assert.assertTrue(Solution2.caesarCypherEncryptor("xyz", 2).equals("zab"));
    }

}