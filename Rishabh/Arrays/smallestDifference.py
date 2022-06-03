"""
Question:

Write a function that takes in two non-empty arrays of integers, finds the
pair of numbers (one from each array) whose absolute difference is closest to
zero, and returns an array containing these two numbers, with the number from
the first array in the first position.

Note that the absolute difference of two integers is the distance between
them on the real number line. For example, the absolute difference of -5 and 5
is 10, and the absolute difference of -5 and -4 is 1.

You can assume that there will only be one pair of numbers with the smallest
difference.
"""

"""
Sample I/O:

Input:

arrayOne = [-1, 5, 10, 20, 28, 3]
arrayTwo = [26, 134, 135, 15, 17]

Output:
[28, 26]
"""

def smallestDifference(arrayOne, arrayTwo):
    arrayOne.sort()
    arrayTwo.sort()
    first = 0
    last = 0
    lenArrayOne = len(arrayOne)
    lenArrayTwo = len(arrayTwo)
    minDifference = None
    result = []
    while first < lenArrayOne and last < lenArrayTwo:
        currentDifference = arrayOne[first] - arrayTwo[last]
        if minDifference is None or abs(currentDifference) < abs(minDifference):
            minDifference = currentDifference
            result = [arrayOne[first], arrayTwo[last]]
        if first != lenArrayOne - 1:
            caseOneDifference = arrayOne[first + 1] - arrayTwo[last]
        if last != lenArrayTwo - 1:
            caseTwoDifference = arrayOne[first] - arrayTwo[last + 1]
        if abs(caseOneDifference) < abs(caseTwoDifference):
            first = first + 1
        else:
            last = last + 1
    return result
            
"""
TC: O(nlogn + mlogm) | SC: O(1)

Explanation:
- We use a two-pointer approach to iterate through the two arrays.
- We compare the absolute difference between two numbers, one from each array. If the difference,
is less than the current min difference, we change the result and add the two numbers to the output array.
- At each pass, we check the absolute difference for the numbers ahead of the two pointers.
    - We check for arrayOne[first + 1] - arrayTwo[last] and then arrayOne[first] - arrayTwo[last + 1]
- We then move the pointer for the pair whose absolute difference is lower than the current running difference.
"""