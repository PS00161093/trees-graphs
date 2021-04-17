package trees.src;

/**
 * Problem URL: https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class BinaryTreeDiameter {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        dfs(root);

        return diameter;
    }

    private int dfs(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        if (leftHeight + rightHeight > diameter) diameter = leftHeight + rightHeight;

        return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
    }

}
