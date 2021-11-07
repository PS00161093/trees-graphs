package trees.src.easy;

import trees.src.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */

public class IncreasingBST {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root != null) transverse(path, root);

        return createBST(path);
    }

    private void transverse(List<Integer> list, TreeNode node) {
        if (node != null) {
            transverse(list, node.left);
            list.add(node.val);
            transverse(list, node.right);
        }
    }

    public TreeNode createBST(List<Integer> path) {
        TreeNode res = new TreeNode(path.get(0));
        for (int n = 1; n < path.size(); n++) {
            TreeNode c = res;
            while (c.right != null) {
                c = c.right;
            }
            c.right = new TreeNode(path.get(n));
        }

        return res;
    }

}
