"""
Question:

Given two non-empty arrays of integers, write a function that determines
whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array 
but that are in the same order as they appear in the array. 
Forinstance, the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4], 
and so do the numbers [2,4].
Note that a single number in an array and the array itself are both valid 
subsequences of the array.
"""

"""
Sample I/O:

Input: array = [5, 1, 22, 25, 6, -1, 8, 10]; sequence = [1, 6, -1, 10]

Output: True
"""

def isValidSubsequence(array, sequence):
    # Write your code here.
    firstPointer = 0
    secondPointer = 0
    while firstPointer < len(array) and secondPointer < len(sequence):
        if array[firstPointer] == sequence[secondPointer]:
            firstPointer += 1
            secondPointer += 1
        else:
            firstPointer += 1
    if secondPointer == len(sequence): 
        return True
    else:
        return False

"""
TC: O(n) | SC: O(1)

Explanation:
We use a simple two pointer approach. The first pointer iterates over the array while
the second pointer iterates over the subsequence.

1. We start at index 0 for both
2. We check if the element in both the arrays are same
3. If they are the same, we move both pointers forward by 1
4. If they aren't the same, we only move the first pointer (on the array) forward.
5. If we reach the end of sequence, it is valid.
6. If we reach the end of the array and not the sequence, it is invalid.
"""