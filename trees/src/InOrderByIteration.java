package trees.src;

import java.util.Stack;

/**
 * URL: https://www.baeldung.com/java-depth-first-search
 * <p>
 * In-order = Left -> Root -> Right node
 * <p>
 * If BST: Values will be printed ascending order
 */
public class InOrderByIteration {

    public void inOrder(TreeNode root) {

        if (root != null) {

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {

                TreeNode currentNode = stack.pop();
                while (currentNode.left != null) {
                    currentNode = currentNode.left;
                    stack.push(currentNode);
                }

                currentNode = stack.pop();
                System.out.println(currentNode.val);

                while (currentNode.right != null) {
                    stack.push(currentNode.right);
                    currentNode = currentNode.right;
                }
            }
        }
    }

}
