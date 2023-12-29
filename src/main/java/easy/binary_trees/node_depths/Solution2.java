package easy.binary_trees.node_depths;

/**
 * Created by amitgade on 01-Mar-2022
 */
public class Solution2 {
     static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // TODO: 01/03/22 Solution starts
    // 0(n) time | O(h) space
    // n -> number of nodes
    // h -> depth of binary tree
    public static int nodeDepths(BinaryTree root) {
        // Recursive Approach
        // if node is null f(node,depth) = 0
        // else
        // f(node, depth) = depth + f(node.left, depth+1) + f(node.right, depth+1)
        return childNodeDepth(root, 0);
    }

    private static int childNodeDepth(BinaryTree node, int depth) {
        if (node == null) {
            return 0;
        }
        return depth + childNodeDepth(node.left, depth + 1) + childNodeDepth(node.right, depth + 1);
    }
    // TODO: 01/03/22 Solution ends
}
