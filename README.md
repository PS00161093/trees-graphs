<h1>Trees</h1>

1. Root
2. Parent
3. Child
4. Leaf
5. Sibling
6. Binary Trees:
     - Each node can either have 0, 1 or max 2 nodes.
     - Each child can have only one parent.
 7. Perfect Binary tree: 
     - Each Node has either 0 or 2 children nodes 
     - at the bottom all nodes are at same level. 
     - the number of nodes at each level doubles as we move down the tree.
     - the number of nodes on the last level is equal to the sum of the number of nodes on all te level + 1.
     - which means half of the node is at the last level.
8. Full Binary tree: tree that simply follows the rules of being a Binary tree.
9. Big (O) Notations:
    - lookup: O(log N)
    - insert: O(log N)
    - delete: O(log N)
10. Calculate number of nodes at a given level n: 2^n. Example: 2^0 = 1 (Root node), 2^1 = 2.
11. Calculate number of nodes in a tree with level n: 2^n - 1. Example: 2^1 - 1 = 1 (Root node).
12. Number of nodes with height(h) = 2^h -1 => log nodes = height (h).
13. O(log N) is better than O(N) because we don't have to check each element in the data structure.
14. Binary Search Tree:
    - great for searching & comparing.
    - All child nodes in the tree to the right of the root node must be greater than the current node.
    - All child nodes in the tree to the left of the root node must be smaller than the current node.
    - A node can only have upto 2 children.
    - Ordered & Flexible size.
    - No O(1) operations as traversal is needed for each operation.
15. Balanced & Unbalanced Binary Search Tree
    - An unbalanced tree is bad because the either side if the tree gets really long & at the end it will become linear
    & the performance reduces from O(log N) to O(N).
    - We can make balances trees using AVL or Red Black Trees. In Red Black Trees, Node is black & child are Red.
    - [Demo AVL Tree](https://www.cs.usfca.edu/~galles/visualization/AVLtree.html)
    - [Working of AVL Trees](https://medium.com/basecs/the-little-avl-tree-that-could-86a3cae410c7)
    - [Demo Red Black Tree](https://www.cs.usfca.edu/~galles/visualization/RedBlack.html)
    - [Working of Red Black Tree](https://medium.com/basecs/painting-nodes-black-with-red-black-trees-60eacb2be9a5)
    - [Differences between AVL & Red Black Tree](https://stackoverflow.com/questions/13852870/red-black-tree-over-avl-tree)
     