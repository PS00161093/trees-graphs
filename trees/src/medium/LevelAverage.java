package trees.src.medium;

import trees.src.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class LevelAverage {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        double levelSum = 0d;
        while (!queue.isEmpty()) {

            int numberOfNodesAtLevel = queue.size();

            for (int i = 0; i < numberOfNodesAtLevel; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            result.add(levelSum / numberOfNodesAtLevel);
            levelSum = 0;
        }

        return result;
    }
}
