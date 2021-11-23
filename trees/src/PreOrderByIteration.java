package trees.src;

import java.util.Stack;

/**
 * URL: https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreOrderByIteration {

    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
    }
}
