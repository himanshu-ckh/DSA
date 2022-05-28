"""
Question:

Write a function that takes in a Binary Tree and returns a list of its branch
sums ordered from leftmost branch sum to rightmost branch sum.
A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
branch is a path of nodes in a tree that starts at the root node and ends at
any leaf node.
Each BinaryTree node has an integer value, a left child node, and a right child node. 
Children nodes can either be BinaryTree nodes themselves or None / null.
"""

"""
Sample I/O:
Input:

tree =              1
            2               3
        4       5       6       7
      8   9  10  

Output:
[15, 16, 18, 10, 11]

1 + 2 + 4 + 8 = 15
1 + 2 + 4 + 9 = 16
1 + 2 + 5 + 10 = 18
1 + 3 + 6 = 10
1 + 3 + 7 = 11
"""
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def auxTraversal(tree, currentBranchSum, branchSums):
    if tree:
        currentBranchSum += tree.value
        if tree.left is None and tree.right is None:
            branchSums.append(currentBranchSum)
        auxTraversal(tree.left, currentBranchSum, branchSums)
        auxTraversal(tree.right, currentBranchSum, branchSums)
    return branchSums

def branchSums(root):
    # Write your code here.
    return auxTraversal(root, 0, [])

"""
TC: O(n) | SC: O(n)

Explanation:
- We do a DFS for the tree where we traverse each branch and keep adding the same until we reach the leaf node.
- We use PreOrder Traversal and add the value of current node to the branch sum and then we recursively move left and right.
- If the current node is a leaf node, we add the sum of the branch to the output array.
"""