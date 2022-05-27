"""
Question:

Write a function that takes in a non-empty array of distinct integers and an
integer representing a target sum. The function should find all triplets in
the array that sum up to the target sum and return a two-dimensional array of
all these triplets. The numbers in each triplet should be ordered in ascending
order, and the triplets themselves should be ordered in ascending order with
respect to the numbers they hold.
"""

"""
Sample I/O:
Input: array = [12, 3, 1, 2, -6, 5, -8, 6]
Ouput: array = [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
"""

def twoNumberSum(array, targetSum):
    possiblePairs = []
    first = 0
    last = len(array) - 1
    while first < last:
        firstNum = array[first]
        secondNum = array[last]
        if firstNum + secondNum == targetSum:
            possiblePairs.append([firstNum, secondNum])
            first = first + 1
            last = last - 1
        elif firstNum + secondNum < targetSum:
            first = first + 1
        elif firstNum + secondNum > targetSum:
            last = last - 1
    return possiblePairs

def threeNumberSum(array, targetSum):
    # Write your code here.
    possibleTriplets = list()
    array.sort()
    print(array)
    for i in range(0, len(array)-1):
        remainder = targetSum - array[i]
        possiblePairs = twoSum(array[i+1:], remainder)
        if len(possiblePairs) >= 1:
            for pair in possiblePairs:
                possibleTriplets.append([array[i], pair[0], pair[1]])
    return possibleTriplets

"""
TC: O(n^2), SC: O(n)
Explanation:

1. Sort the array.
2. Iterate through the array. For each iteration, get the first number at ith position.
3. Do a two number sum check for the remaining array (after the ith position)
    - Since the array is already sorted, we can compare the sum of two numbers against the remainder.
    - If the current sum > remainder, we move left from the end, else we move right from the start.
"""
