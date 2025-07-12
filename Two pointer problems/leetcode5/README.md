<h1>LEETCODE 5: LONGEST PALINDROMIC SUBSTRING</h1>

<h2>Brute Force Approach</h2>

  - We input string from the user
  - we call the LongPalindromeSubstring(): This function is used to find out the longest panlindromic substring and return it
  - LongestPalindromicSubstring():
    - we take 3 loops:
      - loop for i -> marks the beginning of the substring
      - loop for j -> marks the ending of the substring
      - the third loop is used to check if the substring which is starting at index i and ending at index j is a palindorme or not
    - we initialise x with i and y with j so that we loop through each character in the obtained substring by changing x and y values without changing the actual i and j which marks the beginning and ending of the current substring
    - we use 4 variable:
      - count : It is used to calculate the length of the current palindromic substring
          - if character at(x==y)  and x=y then count is incremented by 1 because they both point to same index and therefore only 1 character and obviously it must be same.
            - eg: string="a" 
                - i=0
                - j=0
                - therefore substring="a"
                - x=0
                - y=0
                - therefore character at(x==y) and the length is 1
          - if character at(x==y) and x!=y then there are 2 characters and they point to different indices and therefore their length must be 2.
              - eg: string="aa"
                    - i=0
                    - j=1
                    - therefore substring="aa"
                    - x=0
                    - y=1
                    - character at(x==y) and length is 2 because there exist 2 characters
      - len: it is used to track the longest palindromic substring length obtained so far at any given point of time.
      - longestSub: It is used store the actual palindromic substring obtained so far
      - flag : It is used to check if the current substring which starts at i and ends at j is actually palindrome or not. The moment charAt(x)!=charAt(y) that means it isnt a palindrome. We change the value of flag from 0 to 1 and break out of the loop without going further because even 1 invalid pair dosent result in a palindrome.
        - when we exit out of the loop if flag==1 then that means the substring not a palindrome and therefore 
          - no need to check for updation of variable len
          - reinitialise flag=0, for reuse in the next obtained substring.
  - <b>Time Complexity:O(n<sup>2<sup>)</b>
  - <b>Space Complexity:O(1)
  
---

## Expand Around Approach

- In this approach, we pick a middle index `i` and expand around it, treating `i` as the center. This works because palindromes have the same characters on both sides of the center.

###  Example:

- `"aba"`: if `i = 1` → `s[i-1] == s[i+1]`
- `"abba"`: center is between index 1 and 2 → `s[i] == s[i+1]`

---

###  Odd and Even Length Handling

- **Odd-length palindromes**: expand with `i, i` as the center
- **Even-length palindromes**: expand with `i, i+1` as the center

---

###  Steps:

- The string `s` is input from the user.
- `LongestPalindromicSubstring(s)` is called:
  - Loop over each index `i` from 0 to `s.length() - 1`
  - Use two string variables:
    - `str1`: stores palindrome expanded from center `(i, i)` — odd-length
    - `str2`: stores palindrome expanded from center `(i, i+1)` — even-length
  - Use `expandAround(s, left, right)`:
    - Checks if characters on both sides of center are equal
    - If yes → expand and update the substring
    - If no → break and return the substring built so far
- After each center:
  - Compare `str1` and `str2`, store the longer one in `str`
  - Update `longSub` if `str` is longer than it
- Finally, return `longSub`

---

###  Time and Space Complexity

- **Time Complexity**: `O(n²)`  
- **Space Complexity**: `O(1)`
