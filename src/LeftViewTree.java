package src;

public class LeftViewTree {

    int maxLevel = 0;

    public void travelLeftOnly(MyTree.MyTreeNode node, int level) {

        if (node == null) return;
        if (level >= maxLevel) {
            System.out.print(node.value + " ");
            maxLevel++;
        }
        travelLeftOnly(node.leftChild, level + 1);
        travelLeftOnly(node.rightChild, level + 1);
    }
}
