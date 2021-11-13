package trees.src.medium;

import trees.src.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class FindMode {

    int nodeVal = Integer.MIN_VALUE;
    int count = Integer.MIN_VALUE;
    int maxCount = Integer.MIN_VALUE;
    List<Integer> list = new ArrayList<>();


    public int[] findMode(TreeNode root) {
        helper(root);
        return list.stream().mapToInt(num -> num).toArray();
    }

    private void helper(TreeNode node) {
        if (node == null) return;

        helper(node.left);

        if (nodeVal == node.val)
            count++;
        else
            count = 1;

        if (maxCount < count) {
            maxCount = count;
            list.clear();
            list.add(node.val);
        } else if (maxCount == count)
            list.add(node.val);

        nodeVal = node.val;

        helper(node.right);
    }

}
