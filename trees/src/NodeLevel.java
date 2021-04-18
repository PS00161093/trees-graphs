package trees.src;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem URL: https://www.geeksforgeeks.org/get-level-node-binary-tree-iterative-approach/
 */
public class NodeLevel {

    public int getLevel(TreeNode root, int nodeVal) {

        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                if (queue.peek() != null) {
                    queue.add(null);
                }
                level = level + 1;
            } else {
                if (current.val == nodeVal) return level;
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return 0;
    }
}
