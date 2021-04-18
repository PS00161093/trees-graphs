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

        if (root != null) {

            Stack<TreeNode> stack = new Stack<>();
            TreeNode previous = root;
            TreeNode current;
            stack.push(root);

            while (!stack.isEmpty()) {

                current = stack.peek();
                boolean hasChild = current.left != null || current.right != null;
                boolean isPrevLastChild = previous == current.right || previous == current.left && current.right == null;

                if (!hasChild || isPrevLastChild) {
                    current = stack.pop();
                    System.out.println(current.val);
                    previous = current;
                } else {
                    if (current.right != null) stack.push(current.right);
                    if (current.left != null) stack.push(current.left);
                }
            }
        }
    }
}
