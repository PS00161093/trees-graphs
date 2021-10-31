package trees.src;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftTreeHeight = height(node.left);
        if (leftTreeHeight == -1) return -1;

        int rightTreeHeight = height(node.right);
        if (rightTreeHeight == -1) return -1;

        if (Math.abs(leftTreeHeight - rightTreeHeight) >= 2) return -1;

        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }
}
