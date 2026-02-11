🧩 LeetCode 21 — Merge Two Sorted Lists

Platform: LeetCode
Topic: Linked List, Two Pointers

🔷 Problem Statement

You are given the heads of two sorted linked lists:

list1

list2

Both lists are sorted in ascending order.

Your task is to merge these two lists into one single sorted linked list and return the head of the merged list.

🔷 Example
List1: 1 → 2 → 4
List2: 1 → 3 → 4

Merged Output:
1 → 1 → 2 → 3 → 4 → 4

🔷 Why This Problem Is Important

This problem helps you understand:

How Linked Lists work

How to compare nodes using pointers

How to merge sorted data

How to manipulate node connections without creating extra lists

This is a very common interview question.

🔷 Core Idea (Intuition)

Since both lists are already sorted:

Compare the first nodes of both lists

Choose the smaller node

Move that list forward

Repeat until one list becomes empty

Attach the remaining nodes of the other list

We are not creating new nodes.
We are just changing the links.

🔷 Step-by-Step Approach

Create a dummy node to start the merged list.

Use a pointer current to build the merged list.

Compare values of list1 and list2.

Attach the smaller node to current.next.

Move the pointer of that list forward.

Continue this until one list ends.

Attach the remaining part of the other list.

Return dummy.next.

🔷 Dry Run Explanation
list1	list2	Selected	Merged List
1	1	1	1
2	1	1	1 → 1
2	3	2	1 → 1 → 2
4	3	3	1 → 1 → 2 → 3
4	4	4	1 → 1 → 2 → 3 → 4
null	4	4	1 → 1 → 2 → 3 → 4 → 4
🔷 Concepts Used

Linked List traversal

Two pointer technique

Dummy node method

Pointer manipulation

🔷 Time and Space Complexity

Time Complexity: O(n + m)

Space Complexity: O(1)

🔷 Learning Outcome

After solving this problem, you will clearly understand:

How to merge two sorted linked lists

How pointers work in linked lists

How to avoid creating extra memory

How to handle linked list problems in interviews