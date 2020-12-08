package src;

public class MyTree {

    public MyTreeNode rootNode;

    public void insert(int newValue) {

        MyTreeNode newNode = new MyTreeNode(newValue);

        if (this.rootNode == null) {

            this.rootNode = newNode;

        } else {

            MyTreeNode currentNode = this.rootNode;
            while (true) {
                if (newValue < currentNode.value) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = newNode;
                        break;
                    }
                    currentNode = currentNode.leftChild;
                } else {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = newNode;
                        break;
                    }
                    currentNode = currentNode.rightChild;
                }
            }
        }
    }

    public MyTreeNode traverse(MyTreeNode node) {

        MyTreeNode tree = node;
        tree.leftChild = node.leftChild == null ? null : traverse(node.leftChild);
        tree.rightChild = node.rightChild == null ? null : traverse(node.rightChild);
        return tree;
    }

    static class MyTreeNode {

        int value;

        MyTreeNode leftChild;

        MyTreeNode rightChild;

        MyTreeNode(int value) {

            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

}
