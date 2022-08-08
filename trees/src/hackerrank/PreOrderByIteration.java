import org.w3c.dom.Node;

import java.util.Stack;

/**
 * <a href="https://www.hackerrank.com/challenges/tree-preorder-traversal/problem">...</a>
 */
class PreOrderByIteration {
    public static void preOrder(Node root) {

        //PreOrder = Root -> Left -> right
        Stack<Node> stack = new Stack<>();
        Node c = root;

        while (!stack.isEmpty() || c != null) {
            while (c != null) {
                System.out.print(c.data + " ");
                stack.push(c);
                c = c.left;
            }
            c = stack.pop();
            c = c.right;
        }
    }

}
