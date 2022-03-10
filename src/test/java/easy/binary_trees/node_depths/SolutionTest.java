package easy.binary_trees.node_depths;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amitgade on 01-Mar-2022
 */
public class SolutionTest {
    @Test
    public void TestCaseForSolution1() {
        var root = new Solution1.BinaryTree(1);
        root.left = new Solution1.BinaryTree(2);
        root.left.left = new Solution1.BinaryTree(4);
        root.left.left.left = new Solution1.BinaryTree(8);
        root.left.left.right = new Solution1.BinaryTree(9);
        root.left.right = new Solution1.BinaryTree(5);
        root.right = new Solution1.BinaryTree(3);
        root.right.left = new Solution1.BinaryTree(6);
        root.right.right = new Solution1.BinaryTree(7);
        int actual = Solution1.nodeDepths(root);
        Assert.assertEquals(16, actual);
    }

    @Test
    public void TestCaseForSolution2() {
        var root = new Solution2.BinaryTree(1);
        root.left = new Solution2.BinaryTree(2);
        root.left.left = new Solution2.BinaryTree(4);
        root.left.left.left = new Solution2.BinaryTree(8);
        root.left.left.right = new Solution2.BinaryTree(9);
        root.left.right = new Solution2.BinaryTree(5);
        root.right = new Solution2.BinaryTree(3);
        root.right.left = new Solution2.BinaryTree(6);
        root.right.right = new Solution2.BinaryTree(7);
        int actual = Solution2.nodeDepths(root);
        Assert.assertEquals(16, actual);
    }

}