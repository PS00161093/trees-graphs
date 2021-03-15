package trees.src;

/**
 * Check if Tree is Symmetric or not
 *
 * @author Prashant Sharma
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root, root);
    }

    /**
     * @param t1
     * @param t2
     * @return true if symmetric else, false.
     */
    public boolean isSymmetric(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        return t1.val == t2.val
                && isSymmetric(t1.left, t2.right)
                && isSymmetric(t1.right, t2.left);
    }
}