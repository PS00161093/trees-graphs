package trees.src.medium;

import trees.src.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class SumRootToLeaf {

    int rootToLeaf = 0;

    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }

    public void preorder(TreeNode node, int currNumber) {
        if (node != null) {
            currNumber = (currNumber << 1) | node.val;
            if (node.left == null && node.right == null) {
                rootToLeaf += currNumber;
            }

            preorder(node.left, currNumber);
            preorder(node.right, currNumber);
        }
    }

    public int sumRootToLeaf1(TreeNode root) {
        return traverse(root, "", 0);
    }

    public static int traverse(TreeNode root, String number, int sum) {
        if (root == null) return sum;

        number += Integer.toString(root.val);

        if (root.left != null) sum = traverse(root.left, number, sum);
        if (root.right != null) sum = traverse(root.right, number, sum);

        if (root.left == null && root.right == null) sum += Integer.parseInt(number, 2);

        return sum;
    }
}
