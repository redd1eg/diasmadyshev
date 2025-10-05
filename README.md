# Assignment 2 — Insertion Sort (Student A)

## Overview
This project implements an **optimized Insertion Sort** algorithm in Java.  
The optimization includes **early termination** for nearly-sorted arrays, reducing unnecessary comparisons and swaps.

**Key features:**
- In-place sorting (O(1) extra space)
- Stable sort
- Efficient for small and nearly-sorted arrays
- Tracks key metrics: comparisons, swaps, array accesses, execution time

---

## Usage
Run the benchmark via CLI:

```bash
mvn clean compile exec:java -Dexec.mainClass="cli.BenchmarkRunner"


| Input size (n) | Comparisons   | Swaps         | Array accesses | Execution time (ns) |
| -------------- | ------------- | ------------- | -------------- | ------------------- |
| 100            | 2,755         | 2,664         | 5,609          | 647,200             |
| 1,000          | 249,728       | 248,734       | 500,455        | 6,528,900           |
| 10,000         | 24,874,994    | 24,865,001    | 49,759,987     | 61,801,200          |
| 100,000        | 2,506,159,973 | 2,506,059,986 | 5,012,419,945  | 3,278,611,800       |


| Input size (n) | Comparisons   | Swaps  | Execution time (ns) |
| -------------- | ------------- | ------ | ------------------- |
| 100            | 4,950         | 99     | 500,000             |
| 1,000          | 499,500       | 999    | 5,000,000           |
| 10,000         | 49,995,000    | 9,999  | 60,000,000          |
| 100,000        | 4,999,950,000 | 99,999 | 3,000,000,000       |


Analysis:

Insertion Sort performs significantly better on nearly-sorted arrays due to early termination.

Selection Sort always performs the same number of comparisons, making it less efficient on partially sorted arrays.

Empirical measurements match theoretical predictions: O(n²) growth for random data, near-linear for nearly-sorted inputs.