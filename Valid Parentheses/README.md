(LeetCode 20 — Valid Parentheses

Platform: LeetCode
Problem Number: 20
Topic: Stack, Strings

🧩 Problem Statement

Given a string s containing only the characters:

( )  { }  [ ]


Determine if the input string is valid.

A string is valid if:

Open brackets are closed by the same type of brackets.

Open brackets are closed in the correct order.

Every closing bracket has a corresponding opening bracket.

✅ Examples
Input	Output
"()"	true
"()[]{}"	true
"(]"	false
"([)]"	false
"{[]}"	true
💡 Intuition

Whenever we see an opening bracket, we must remember it until we find its matching closing bracket.

This “remembering” behavior is perfectly handled by a Stack (LIFO):

Push opening brackets onto the stack

When a closing bracket appears, check the top of the stack

If they match → pop

If not → invalid

🛠️ Approach (Algorithm)

Create an empty stack of characters.

Traverse the string from left to right.

If the character is an opening bracket ( { [, push it to the stack.

If it is a closing bracket ) } ]:

If the stack is empty → return false.

Pop the top element from the stack.

Check if it matches the current closing bracket.

After the loop ends:

If the stack is empty → return true.

Else → return false.

⏱️ Complexity Analysis

Time Complexity: O(n)
We traverse the string once.

Space Complexity: O(n)
In the worst case, all characters are opening brackets stored in the stack.
