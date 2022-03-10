package easy.binary_trees.node_depths;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgade on 10-Mar-2022
 */
public class Solution1 {
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

    // TODO: 10/03/22  Solution starts
    // 0(n) time | O(h) space
    // n -> number of nodes
    // h -> depth of binary tree
    public static int nodeDepths(BinaryTree root) {
        int sumOfDepth = 0;
        List<Level> stack = new ArrayList<>();
        stack.add(new Level(root, 0));
        while (!stack.isEmpty()) {

            Level top = stack.remove(stack.size() - 1);
            BinaryTree node = top.root;
            int depth = top.depth;

            if (node == null) {
                continue;
            }

            sumOfDepth += depth;
            stack.add(new Level(node.left, depth + 1));
            stack.add(new Level(node.right, depth + 1));
        }
        return sumOfDepth;
    }

    static class Level {
        public BinaryTree root;
        int depth;

        public Level(BinaryTree root, int depth) {
            this.root = root;
            this.depth = depth;
        }
    }

    // TODO: 10/03/22 Solution ends
}
