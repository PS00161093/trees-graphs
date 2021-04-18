package trees.src;

/**
 * Problem URL: https://www.geeksforgeeks.org/get-level-of-a-node-in-a-binary-tree/
 */
public class NodeLevelRecursive {

    public int getLevel(TreeNode root, int nodeVal) {

        return getLevel(root, nodeVal, 1);
    }

    private int getLevel(TreeNode node, int nodeVal, int level) {

        if (node == null) return 0;
        if (node.val == nodeVal) return level;

        int downLevel = getLevel(node.left, nodeVal, level + 1);
        if (downLevel != 0) return downLevel;
        downLevel = getLevel(node.right, nodeVal, level + 1);

        return downLevel;
    }
}
