package trees.src;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/clone-a-binary-tree/1#
 */
public class CloneBinaryTree {

    public static Tree cloneTree(Tree tree) {

        if (tree == null) return null;

        Map<Tree, Tree> map = new HashMap<>();
        Queue<Tree> queue = new LinkedList<>();

        queue.offer(tree);
        while (!queue.isEmpty()) {
            Tree t = queue.poll();
            if (t != null) {
                Tree clone = new Tree(t.data);
                map.put(t, clone);
                queue.offer(t.left);
                queue.offer(t.right);
            }
        }

        queue.offer(tree);
        while (!queue.isEmpty()) {
            Tree t = queue.poll();
            if (t != null) {
                queue.offer(t.left);
                queue.offer(t.right);
                Tree c = map.get(t);
                if (t.left != null) c.left = map.get(t.left);
                if (t.right != null) c.right = map.get(t.right);
                if (t.random != null) c.random = map.get(t.random);
            }
        }

        return map.get(tree);
    }

}


class Tree {

    int data;
    Tree left, right, random;

    Tree(int d) {
        data = d;
        left = null;
        right = null;
        random = null;
    }
}
