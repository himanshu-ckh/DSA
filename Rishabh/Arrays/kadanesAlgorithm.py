"""
Question:

Write a function that takes in a non-empty array of integers and returns the
maximum sum that can be obtained by summing up all of the integers in a
non-empty subarray of the input array. A subarray must only contain adjacent
numbers (numbers next to each other in the input array).
"""

"""
Sample I/O:

Input: [3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4]

Output: 19
"""

def kadanesAlgorithm(array):
    # Write your code here.
    start = 0
    end = 0
    runningSum = 0
    maxRunningSum = 0
    arrayLength = len(array)
    for i in range(arrayLength):
        if array[i] + runningSum < 0:
            runningSum = 0
        else:
            runningSum = runningSum + array[i]
        if runningSum > maxRunningSum:
                maxRunningSum = runningSum
    if maxRunningSum > 0:
        return maxRunningSum
    else:
        return max(array)   

"""
TC: O(n) | SC: O(1)

Explanation:
The key consideration points are the negative numbers. We need to understand if
they should be included in the subarray or not.

Essentially, the max sum at each index is either the element itself or the sum of the subarray
which ends at that index.

For example, [3, 5] : At index 0, the maxSum is 3 (the element itself), while at index 1,
maxSum is 8.
Hence, we can calculate the maxSum for each index using one pass.

If the negative number sends the current running sum less than 0, I treat it as a break point.
I check if the running sum till that point against a maxRunningSum and replace it if needed.

Then I start from a running sum of 0 from the next index of the negative number.

Edge case: 
In case the running sum is returned as 0, there is a chance that all elements are negative.
This is because we start with a sum of 0 and everytime a number sends the total sum to < 0;
we again set the running sum to 0.
Hence, if the running sum is 0, we just return the max element in the array. Since all elements
are negative, the least negative in itself will be the subarray with the highest sum.
[-10, -5, -3] -> Output will be -3 aka the max element in that array.
"""