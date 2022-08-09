import org.w3c.dom.Node;

import java.util.Stack;

/**
 * <a href="https://www.hackerrank.com/challenges/tree-preorder-traversal/problem">...</a>
 */
class PreOrderByIteration {
    public static void preOrder(Node root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            Node c = stack.pop();
            list.add(list.size(), c.data);
            
            if(c.right != null) {
                stack.push(c.right);
            }
            
            if(c.left != null) {
                stack.push(c.left);
            }
        }
        
        for(int n: list) System.out.print(n + " ");
    }

}
