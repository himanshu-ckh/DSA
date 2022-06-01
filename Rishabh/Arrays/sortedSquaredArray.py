"""
Question:

Write a function that takes in a non-empty array of integers that are sorted
in ascending order and returns a new array of the same length with the squares
of the original integers also sorted in ascending order.
"""

"""
Sample I/O:

Input: [1, 2, 3, 5, 6, 8, 9]

Output: [1, 4, 9, 25, 36, 64, 81]
"""

def sortedSquaredArray(array):
    # Write your code here.
    first = 0
    last = len(array) - 1
    result = []
    while first <= last:
        firstNum = array[first]
        lastNum = array[last]
        if abs(firstNum) >= abs(lastNum):
            result.append(firstNum ** 2)
            first += 1
        else:
            result.append(lastNum ** 2)
            last -= 1
    return result[::-1]

"""
TC: O(n) | SC: O(n)

Explanation:
The thing that we have to deal with here is negative numbers as their squares will be positive
and can end up anywhere in the output array.
The easiest way to do this is to sort an array and then square each element.
However, that will be O(nlogn) time complexity.
We can use a two-pointer approach and do this in a single pass.

1. Create an empty array.
2. Initialize two pointers, one at 0th index and one at the last index of the input array.
3. Loop through the array.
4. Compare the elements at the first and the last pointer positions.
5. Check for the larger element at the two positions, square it and append it to the output array.
6. Accordingly, increment first or decrement last.
7. Once you have an output array of all elements from their highest order, we just reverse the array.
"""