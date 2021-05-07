package trees.src;

/**
 * Problem URL: https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

    public TreeNode invert(TreeNode root) {

        if (root != null) {

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invert(root.left);
            invert(root.right);
        }

        return root;
    }

}