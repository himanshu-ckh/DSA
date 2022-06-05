"""
Question:

Write a function that takes in a string of words separated by one or more whitespaces 
and returns a string that has these words in reverse order. 
For example, given the string "tim is great", your function should return "great is time".

For this problem, a word can contain special characters, punctuation, and
numbers. The words in the string will be separated by one or more whitespaces, 
and the reversed string must contain the same whitespaces as the original string. 
For example, given the string "whitespaces    4", you would be expected to return
"4    whitespaces".

Note that you're  allowed to to use any built-in split or reverse methods/functions. 
However, you allowed to use a built-in join method/function.
Also note that the input string isn't guaranteed to always contain words.
"""

"""
Sample I/O:

Input:
string = "AlgoExpert is the best!"

Output:
"best! the is AlgoExpert"
"""


def reverseWordsInString(string):
    # Write your code here.
    stringlength = len(string)
    if stringlength < 1:
        return ""
    tokens = []
    currentWord = ""
    for i in string:
        if i != " ":
            currentWord += i
        else:
            tokens.append(currentWord)
            tokens.append(" ")
            currentWord = ""
    tokens.append(currentWord)
    first = 0
    last = len(tokens) - 1
    while first < last:
        if tokens[first] == " ":
            first += 1
        if tokens[last] == " ":
            last -= 1
        if tokens[last] != " " and tokens[first] != " ":
            tokens[last], tokens[first] = tokens[first], tokens[last]
            first += 1
            last -= 1
    return ''.join(tokens)


"""
TC: O(n) | SC: O(n)

Explanation:
- The question doesn't allow the use of split and reverse
- So first, we manually split the array to create a bag of words.
    - While doing this, we conserve the whitespaces as they are necessary.
- Then we use a two pointer approach to go through the bag of words and swap the words.
"""
