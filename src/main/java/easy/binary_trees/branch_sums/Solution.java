package easy.binary_trees.branch_sums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgade on 01-Mar-2022
 */
public class Solution {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // TODO: 01/03/22 Solution starts
    // O(n) time | O(n) space
    // n-> Number of nodes in the Binary tree
    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateSum(sums, root, 0);
        return sums;
    }

    private static void calculateSum(List<Integer> resultList, BinaryTree node, int branchSum) {
        // check if root is null
        if (node == null) {
            return;
        }

        // now, root not null; so add node value to its branchSum
        branchSum += node.value;

        // if node is leaf node add newRunningSum to list
        if (node.left == null && node.right == null) {
            resultList.add(branchSum);
            return;
        }

        // node has child node
        // check for left and right child and add their values
        calculateSum(resultList, node.left, branchSum);
        calculateSum(resultList, node.right, branchSum);
    }
    // TODO: 01/03/22 Solution ends
}
