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
10. Calculate number of nodes at a given level n: 2^n. Example: 2^0 = 1 (Root node), 2^1 = 2