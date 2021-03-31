package trees.src;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Prashant Sharma
 */
public class UniValuedBinaryTree {

    /**
     * @param root: root node
     * @return true if given tree is uni-value tree, else false
     */
    public boolean isUniValueTree(TreeNode root) {

        if (root != null) {
            Queue<TreeNode> nodesQueue = new LinkedList<>();
            nodesQueue.add(root);
            return breadthFirstSearch(nodesQueue, root.val);
        }

        return false;
    }

    /**
     * @param nodesQueue: queue of nodes for BFS traversal
     * @param val:   value of root node, rest nodes should have the same value
     * @return true if all nodes have same value as root node value
     */
    private boolean breadthFirstSearch(Queue<TreeNode> nodesQueue, int val) {

        while (!nodesQueue.isEmpty()) {

            TreeNode currentNode = nodesQueue.remove();
            if (currentNode.val != val) return false;
            if (currentNode.left != null) nodesQueue.add(currentNode.left);
            if (currentNode.right != null) nodesQueue.add(currentNode.right);
        }

        return true;
    }

}