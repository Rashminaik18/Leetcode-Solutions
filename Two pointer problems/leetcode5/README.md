<h1>LEETCODE 5: lONGEST PALINDROMIC SUBSTRING</h1>

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