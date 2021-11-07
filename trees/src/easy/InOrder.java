package trees.src.easy;

import trees.src.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class InOrder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root != null) transverse(path, root);

        return path;
    }

    private void transverse(List<Integer> list, TreeNode node) {
        if (node != null) {
            transverse(list, node.left);
            list.add(node.val);
            transverse(list, node.right);
        }
    }
}
