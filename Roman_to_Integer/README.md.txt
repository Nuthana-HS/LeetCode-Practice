# LeetCode #13 — Roman to Integer (Java)

## 📌 What is this problem?

In this problem, we are given a Roman number like:

IV, IX, XL, MCMXCIV

We must convert it into a normal integer number.

For example:
IV  → 4  
IX  → 9  
LVIII → 58  
MCMXCIV → 1994  

---

## 🧠 Roman Symbols and Values

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

---

## ⚠️ Important Rule

Normally we **add** values from left to right.

But if a **smaller value comes before a bigger value**, we **subtract**.

Examples:

IV  
I (1) before V (5) → 5 - 1 = 4  

VI  
V (5) before I (1) → 5 + 1 = 6  

---

## 💡 How this Java solution works

1. We store all Roman symbols and values using `HashMap`
2. We go through the string one by one
3. Compare current letter value with next letter value
4. If current < next → subtract
5. Else → add
6. Return the final total

---

## 📁 Files in this folder

- `Solution.java` → Contains the Java logic required by LeetCode

---

## ▶️ Note for Beginners

LeetCode already has its own `main()` method.

That is why this file contains only:

