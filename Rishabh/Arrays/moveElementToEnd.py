"""
Question:

You're given an array of integers and an integer. Write a function that moves
all instances of that integer in the array to the end of the array and returns
the array.

The function should perform this in place (i.e., it should mutate the input
array) and doesn't need to maintain the order of the other integers.

"""

"""
Sample I/O:

Input:
array = [2, 1, 2, 2, 2, 3, 4, 2]
toMove = 2

Output:
[1, 3, 4, 2, 2, 2, 2, 2] 
"""

def moveElementToEnd(array, toMove):
    # Write your code here.
    first = 0
    last = len(array) - 1
    print(array)
    while first < last:
        print(array[first], array[last], first, last)
        if array[last] == toMove:
            last -= 1
            continue
        if array[first] == toMove:
            array[first], array[last] = array[last], array[first]
        first += 1
    return array
"""
TC: O(n) | SC: O(1)

Explanation:
Simple two-pointer approach that allows us to check elements at the far ends.
We swap when we encounter a "toMove" element towards the left side of the array.
"""
