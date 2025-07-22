# LEETCODE 75: SORT COLORS
--------------------------------------------------------

## BRUTE FORCE:

### INTUITION:
- outer loop for index i=current element
- inner loop for index j=i+1
  - checks for smallest element available from index i+1 to complete length of the array
  - stores this smallest element in variable 'small'
- swaps the smallest element from position i+1 to length with i