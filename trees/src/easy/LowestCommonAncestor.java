package trees.src.easy;

import trees.src.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        int nodeVal = root.val;
        if (nodeVal > p.val && nodeVal > q.val)
            return lowestCommonAncestorRecursive(root.left, p, q);
        else if (nodeVal < p.val && nodeVal < q.val)
            return lowestCommonAncestorRecursive(root.right, p, q);
        else return root;
    }

    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            int nodeVal = root.val;
            if (nodeVal > p.val && nodeVal > q.val)
                root = root.left;
            else if (nodeVal < p.val && nodeVal < q.val)
                root = root.right;
            else return root;
        }
    }

}
