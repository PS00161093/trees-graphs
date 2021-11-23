package trees.src;

import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreOrderByIteration {

    public void preOrder(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode c = stack.pop();
            System.out.println(c.val);
            if (c.right != null) stack.push(c.right);
            if (c.left != null) stack.push(c.left);
        }
    }
}
