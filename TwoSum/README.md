# 🔢 Two Sum — LeetCode #1

## 📘 Problem Summary
You are given an integer array `nums` and an integer `target`.

Your task is to return the **indices** of the two numbers such that:

nums[i] + nums[j] = target

You may assume:
- Each input has exactly one solution
- You cannot use the same element twice

---

## 🧪 Example

| Input | Output |
|------|--------|
| nums = [2,7,11,15], target = 9 | [0,1] |
| nums = [3,2,4], target = 6 | [1,2] |

---

## 🧠 Logic Used

Instead of checking every pair (which takes more time), we use a **HashMap**.

### Steps:
1. Traverse the array once.
2. For each number, calculate `remaining = target - number`.
3. Check if `remaining` already exists in the HashMap.
4. If yes → solution found.
5. If no → store the number with its index in the map.

This avoids nested loops and makes the solution faster.

## ⚙️ Algorithm
