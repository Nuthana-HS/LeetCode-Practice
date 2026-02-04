# Palindrome Number (LeetCode Problem 9)

## Problem Statement
Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome number reads the same backward as forward.

Example:
Input: x = 121
Output: true

Input: x = -121
Output: false

## Approach
1. Negative numbers are not palindrome.
2. Store the original number.
3. Reverse the number using modulus and division.
4. Compare reversed number with original.

## Time Complexity
O(log10 n)

## Space Complexity
O(1)

## Java Code
See PalindromeNumber.java in this folder.
