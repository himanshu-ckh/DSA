"""
Question:

Write a function that takes in a non-empty array of integers and returns an
array of the same length, where each element in the output array is equal to
the product of every other number in the input array.

In other words, the value at output[i] is equal to the product of
every number in the input array other than input[i].
"""

"""
Sample I/O:

Input: array = [5, 1, 4, 2]

Output: [8, 40, 10, 20]
"""
# Solution 1
# Adhoc method

def arrayOfProducts(array):
    # Write your code here.
    count =  len(array)
    result = [0] * count
    zeroIndexes = []
    runningSum = 1
    
    for i in range(count):
        if array[i] == 0:
            zeroIndexes.append(i)
        else:
            runningSum *= array[i]
    
    if len(zeroIndexes) == 1:
        result[zeroIndexes[0]] = runningSum
        return result
    elif len(zeroIndexes) < 1:
        for i in range(count):
            result[i] = runningSum/array[i]
    return result

"""
TC: O(n) | SC: O(n)

Explanation:
- The edge case to consider here is the presence of 0s.
- If there is only one 0, then every other element in the array will have a result of 0.
- If there are more than one 0s, then all elements will be 0.
- Else, all the other elements will have a normal value.
- So we just collect the index of 0s in the input array and use the above logic to create
and output array!
"""

# Solution 2
# Running Sum method - Without using division
def arrayOfProducts(array):
    # Write your code here.
    count = len(array)
    result = [0] * count
    leftMultiples = [0] * count
    rightMultiples = [0] * count
    
    runningProduct = 1
    for i in range(count):
        leftMultiples[i] = runningProduct
        runningProduct *= array[i]
    
    runningProduct = 1
    for i in reversed(range(count)):
        rightMultiples[i] = runningProduct
        runningProduct *= array[i]
        
    for i in range(count):
        result[i] = leftMultiples[i] * rightMultiples[i]

    return result

"""
TC: O(n) | SC: O(n)

Explanation:
- We use a running product here - one for all elements on the left and one for the right.
- We first iterate and store the multiples of all elements to the left of an index.
- We then iterate and store the multiples of all elements to the right of an index.
- In the end, the output for each index is the multiple of the left running product and right running product
"""