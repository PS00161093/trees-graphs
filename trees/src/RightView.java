package trees.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    public ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
                if (i == n) result.add(temp.data);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }

        return result;
    }

}

class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
