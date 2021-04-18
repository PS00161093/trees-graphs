package trees.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem URL: https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreeAllPaths {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        dfs(root, paths, new ArrayList<Integer>(), new StringBuilder());
        return paths;
    }

    private void dfs(TreeNode node, List<String> paths, ArrayList<Integer> temp, StringBuilder sb) {

        if (node.left == null && node.right == null) {
            for (int n : temp) sb.append(n).append("->");
            sb.append(node.val);
            paths.add(sb.toString());
            sb.setLength(0);
            return;
        }

        temp.add(node.val);
        if (node.left != null) dfs(node.left, paths, temp, sb);
        if (node.right != null) dfs(node.right, paths, temp, sb);
        temp.remove(temp.size() - 1);
    }

}
