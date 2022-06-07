"""
Question:

You're given a Node class that has a name and an array of optional children nodes. When put together, nodes form an acyclic tree-like structure.

Implement the breadthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Breadth-first Search approach (specifically navigating the tree from left to right), stores all of the nodes' names in the input array, and returns it.
"""

"""
Sample I/O:

Input:
graph =       A
        B     C     D
       E F         G E
        I J        K

Output: ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"]
"""
from collections import deque

class Node:
    def __init__(self, name):
        self.children = []
        self.name = name

    def addChild(self, name):
        self.children.append(Node(name))
        return self

    def breadthFirstSearch(self, array):
        queue = deque()
        queue.append(self)
        while queue:
            poppedNode = queue.popleft()
            for child in poppedNode.children:
                queue.append(child)
            array.append(poppedNode.name)
        return array
        

"""
TC: O(v + e) | SC: O(v + e) - where v is the number of vertices of the input graph and e is the number of edges of the input graph

Explanation:
- We need to go level-by-level and then iterate through the children in the same order.
- Hence, we use a Queue like structure to map all the nodes at each level.
- We start by adding the root node to the queue.
- We then iterate through the queue till the point the queue is empty.
    - Everytime we pop an element, we add its children to the queue.
    - We add the value of the element to the output array.
"""