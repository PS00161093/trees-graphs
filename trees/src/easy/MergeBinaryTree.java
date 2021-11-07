package trees.src.easy;

import trees.src.TreeNode;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeBinaryTree {

    public TreeNode mergeTress(TreeNode tree1, TreeNode tree2) {

        if (tree1 == null) return tree2;
        if (tree2 == null) return tree1;

        tree1.val += tree2.val;
        tree1.left = mergeTress(tree1.left, tree2.left);
        tree1.right = mergeTress(tree1.right, tree2.right);

        return tree1;
    }

}