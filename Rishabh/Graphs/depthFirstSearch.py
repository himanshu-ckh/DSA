"""
Question:

You're given a Node class that has a name and an array of optional children nodes. When put together, nodes form an acyclic tree-like structure.

Implement the depthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Depth-first Search approach (specifically navigating the tree from left to right), stores all of the nodes' names in the input array, and returns it.
"""

"""
Sample I/O:

Input:
graph =       A
        B     C     D
       E F         G E
        I J        K

Output: ["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]
"""
class Node:
    def __init__(self, name):
        self.children = []
        self.name = name

    def addChild(self, name):
        self.children.append(Node(name))
        return self

    def depthFirstSearch(self, array):
        # Write your code here.
        array.append(self.name)
        for child in self.children:
            child.depthFirstSearch(array)
        return array
"""
TC: O(v + e) | SC: O(v + e) - where v is the number of vertices of the input graph and e is the number of edges of the input graph

Explanation:
- We use recursion to traverse through all the children of a node and add that to the output array.
"""