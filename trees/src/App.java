package trees.src;

class App {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        MyTree.MyTreeNode data = tree.traverse(tree.rootNode);
        LeftViewTree leftViewTree = new LeftViewTree();
        System.out.print("Left View: ");

        System.out.println();
        System.out.println(data.leftChild);
        System.out.println(data.rightChild);
        System.out.println(data.value);

        System.out.println(tree.lookup(17));
        System.out.println(tree.lookup(1));
        System.out.println(tree.remove(1));
        System.out.println(tree.lookup(1));

        System.out.println(tree.lookup(170));
        System.out.println(tree.remove(170));
        System.out.println(tree.lookup(170));

        System.out.println(tree.lookup(9));
        System.out.println(tree.remove(9));
        System.out.println(tree.lookup(9));
    }
}