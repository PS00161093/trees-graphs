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

    public boolean lookup(int value) {

        if (this.rootNode == null) {
            return false;
        }

        MyTreeNode currentNode = this.rootNode;

        while (currentNode != null) {

            if (value < currentNode.value) {
                currentNode = currentNode.leftChild;
            } else if (value > currentNode.value) {
                currentNode = currentNode.rightChild;
            } else if (value == currentNode.value)
                return true;
        }

        return false;
    }

    public MyTreeNode traverse(MyTreeNode node) {

        node.leftChild = node.leftChild == null ? null : traverse(node.leftChild);

        node.rightChild = node.rightChild == null ? null : traverse(node.rightChild);

        return node;
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
