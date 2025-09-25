# HackerRank-Solution

A collection of solved problems from HackerRank (and similar coding platforms) implemented in Java. This folder contains solution files organized by problem name and difficulty, with clear filenames and short descriptions.

---

## ✅ What this folder contains

* `die hard 3.java` — Solution for the "Die Hard 3" problem.
* `Find the Median (easy)` — Solution for the "Find the Median" problem (easy).
* `Nimble game.java` — Solution for the Nimble Game problem.
* `Non-Divisible Subset(medium)` — Solution for the Non-Divisible Subset problem (medium).
* `Sherlock and The Beast(easy)` — Solution for the Sherlock and The Beast problem (easy).
* `README.md` — (this file) Documentation and instructions.

> Filenames follow the original problem names. Consider renaming files to remove spaces and add `.java` extension consistently (e.g., `FindTheMedian.java`).

---

## 🔧 How to run

Each Java file is a standalone solution. To compile and run a file locally:

```bash
# Compile
javac FileName.java

# Run
java FileName
```

If the file is inside a package, either remove the package declaration for local testing or run with the package structure.

> If a problem expects input from STDIN (console), provide input via a file or paste into terminal when running. Example:

```bash
java FileName < sample_input.txt
```

---

## 🧾 Suggested folder/files structure (recommended)

```
HackerRank-Solution/
├─ FindTheMedian.java
├─ DieHard3.java
├─ NimbleGame.java
├─ NonDivisibleSubset.java
├─ SherlockAndTheBeast.java
└─ README.md
```

Renaming to `CamelCase.java` and removing special characters/spaces will make compilation easier.

---

## 📝 Notes on solutions

* Each solution includes comments explaining the approach and time/space complexity where relevant.
* Prefer using `Scanner` or `BufferedReader` depending on input size. For large inputs, `BufferedReader` + `StringTokenizer` or `FastScanner` is recommended.
* Include sample input and expected output as comments at the top of each file for clarity.

---

## 📈 Contribution guidelines

If you (or others) want to add more solutions:

1. Add the `.java` file with a descriptive filename (no spaces, use CamelCase).
2. Add comments: problem link (if available), brief approach, complexity analysis, and sample input/output.
3. Open a pull request or push to the repository following your preferred workflow.

---






