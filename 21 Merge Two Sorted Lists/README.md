LeetCode 21 — Merge Two Sorted Lists
🧠 What is the problem asking?

You are given two linked lists.
Both are already sorted in ascending order.

Your task is to combine them into one single sorted linked list.

You are not creating a new list from scratch.
You are rearranging the existing nodes.

📌 Example
List 1: 1 → 2 → 4
List 2: 1 → 3 → 4


After merging:

1 → 1 → 2 → 3 → 4 → 4

❓ Why is this problem important?

This problem checks whether you understand:

How Linked Lists work

How to move pointers correctly

How to compare two data sources at the same time

How to maintain sorted order while merging

This is a very common interview pattern.

💡 Core Idea in Simple Words

Since both lists are already sorted:

Always pick the smaller value from the two lists.

Then move forward in that list.

Keep doing this until one list becomes empty.

Finally, attach the remaining part of the other list.

🪜 Step-by-Step Thinking

Create a dummy node (just to help start the list).

Keep a pointer called current to build the merged list.

Compare first nodes of both lists:

Smaller one goes next in merged list.

Move the pointer in the list from which you picked the node.

Move current forward.

Repeat until one list ends.

Attach the remaining nodes of the other list.

🔍 Dry Run
list1	list2	Picked	Result So Far
1	1	1	1
2	1	1	1 → 1
2	3	2	1 → 1 → 2
4	3	3	1 → 1 → 2 → 3
4	4	4	1 → 1 → 2 → 3 → 4
null	4	4	1 → 1 → 2 → 3 → 4 → 4
🧩 Trick Used (Very Important)

We use a dummy node so we don’t have to worry about the head of the list while building it.

At the end, we return dummy.next.

⏱️ Complexity

Time: O(n + m)

Space: O(1)

✅ What I learned from this problem

How to merge data while keeping order

How to use pointers carefully in Linked Lists

Why dummy nodes make Linked List problems easier