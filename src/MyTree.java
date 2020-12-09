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
            } else return true;
        }

        return false;
    }

    public boolean remove(int value) {

        if (this.rootNode == null) {
            return false;
        }

        MyTreeNode parentNode = null;
        MyTreeNode currentNode = this.rootNode;

        while (currentNode != null) {

            if (value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.leftChild;

            } else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.rightChild;

            } else if (value == currentNode.value) {

                if (currentNode.rightChild == null) {
                    if (parentNode == null) {
                        this.rootNode = currentNode.leftChild;
                    } else {
                        if (currentNode.value < parentNode.value) {
                            parentNode.leftChild = currentNode.leftChild;
                        } else if (currentNode.value > parentNode.value) {
                            parentNode.rightChild = currentNode.leftChild;
                        }
                    }

                } else if (currentNode.rightChild.leftChild == null) {
                    currentNode.rightChild.leftChild = currentNode.leftChild;
                    if (parentNode == null) {
                        this.rootNode = currentNode.rightChild;
                    } else {
                        if (currentNode.value > parentNode.value) {
                            parentNode.rightChild = currentNode.rightChild;
                        }
                    }

                } else {
                    MyTreeNode leftMostChild = currentNode.rightChild.leftChild;
                    MyTreeNode leftMostParent = currentNode.rightChild;

                    leftMostParent.leftChild = leftMostChild.rightChild;
                    leftMostChild.leftChild = currentNode.leftChild;
                    leftMostChild.rightChild = currentNode.rightChild;

                    if (parentNode == null) {
                        this.rootNode = leftMostChild;
                    } else {
                        if (currentNode.value < parentNode.value) {
                            parentNode.rightChild = leftMostChild;
                        } else if (currentNode.value > parentNode.value) {
                            parentNode.rightChild = leftMostChild;
                        }
                    }

                }
                return true;
            }
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
