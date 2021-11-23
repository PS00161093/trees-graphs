package trees.src;

import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * <p>
 * In-order = Left -> Root -> Right node
 * <p>
 * If BST: Values will be printed ascending order
 */
public class InOrderByIteration {

    public void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.println(curr.val);
            curr = curr.right;
        }
    }

}
