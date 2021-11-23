package trees.src;

import java.util.Stack;

/**
 * URL: https://www.baeldung.com/java-depth-first-search
 * <p>
 * In-order = Right -> Left -> Root node
 * <p>
 * If BST: Values will be printed descending order
 */
public class PostOrderByIteration {

    public void postOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode c = stack.pop();
            System.out.println(c.val);
            if (c.left != null) stack.push(c.left);
            if (c.right != null) stack.push(c.right);
        }
    }
}
