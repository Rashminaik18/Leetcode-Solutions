# LEETCODE 704: BINARY SEARCH

## BRUTE FORCE APPROACH

### How this program works?
- Inputs the array and the target element from the user.
- Loops from the bginning of the array to the ending to check if the array element at any point in the loop is equal to the target element
- If yes: index of its position is returned.
- If no: -1 is returned thus indicating that no such element is present in the array of these elements.

TIME COMPLEXITY:<strong>O(n)</strong><br>
SPACE COMPLEXITY:<Strong>O(1)</strong>

--------------------------------------
## OPTIMAL APPROACH
- It is important to note that this particular approach which is binary search approach works only on sorted array.
- first of all we ask the user to input the array
- and then we sort the inputted array
- we also input the target element from the user
- now we initialize 2 elements
  - low=0, which denotes the first index
  - high= the last index of the array
  - we find the mid value of these  indices using the formula (low+high)/2 and assign it to another variable mid
  - now we check if the element at the position mid is equal to the target element
  - if true we simply return the position of element
  - else we check if the target element is less than the target element or greater than the element at mid position.
    - if the target element is less than the element at the mid position
      - then we shift the position of the variable high to mid-1. This is because since the element at mid position is greater than the target element it is no way possible that the element will lie anywhere after the position mid.
    - if the target element is greater than the element at the mid position
      - then we shift the position of the variable low to mid+1. this is because since the element at the mid position is less than the target element it is no way possible that the target  will lie anywhere before the position mid.
  - TIME COMPLEXITY:<strong>O(logn)</strong>
  - SPACE COMPLEXITY:<strong>O(1)</strong>
