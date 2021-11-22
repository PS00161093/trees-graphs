package trees.src;

import java.util.Stack;

/**
 * URL: https://www.baeldung.com/java-depth-first-search
 */
public class PreOrderByIteration {

    public void preOrder(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode currentNode = stack.pop();
                System.out.println(currentNode.val);
                if (currentNode.left != null)
                    stack.push(currentNode.left);
                if (currentNode.right != null)
                    stack.push(currentNode.right);
            }
        }
    }
}
