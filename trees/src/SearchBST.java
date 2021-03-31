package trees.src;

/**
 * @author Prashant Sharma
 */
public class SearchBST {

    /**
     * @param root: BST
     * @param searchValue: int value searching for
     * @return tree node with the search value
     */
    public TreeNode search(TreeNode root, int searchValue) {

        if (root == null) return null;

        while (root != null && root.val != searchValue) {
            root = searchValue > root.val ? root.right : root.left;
        }

        return root;
    }
}