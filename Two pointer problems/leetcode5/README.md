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
  
<hr>Expand Around Approach</h2>
  - In this approach we pick a middle index i  and expand around it keeping this index as the center as the palindrome will have similar characters on both the sides of the middle index. 
    - Example:
      - "aba" : if i=1 then character at i-1 is equal to character at i+1
      - "abba": if index 1 and 2 are treated as center then character to the left and right of the center elements are equal
  - It is important to note that the palindromic substring can be of odd or even length:
    - Incase of odd length: only 1 character is taken as the middle element
    - Incase of even length: 2 characters are taken as the middle element
  -The string 's' is input from the user
  -LongestPalindromicSubstring(s) is called with the string 's' as the parameter:
    -a loop for i is run from index 0 to length of the string
    -we use two string variables:
      -str1= stores the odd length palindromic substring obtained with index i as the center
      -str2= stores the even length palindromic substring obtained with index i and i+1 as the middle elements
      -expandAround(s) method is called with String 's' passed as the argument
          -this method is used to check if the character on both the sides of the middle elements/ element including the middle elements(incase of even length)  are equal or not.
              -if true: the substring is obtained and the length of the substring is stored in count variable
              -if false: we break out of the loop and return the  palindromic substring 'sub' that is obtained so far
  -We return to the LongestPalindromicSubstring() with the 'sub'
  -we know that:
      -str1= stores the odd length palindromic substring obtained with index i as the center
      -str2= stores the even length palindromic substring obtained with index i and i+1 as the middle elements
  -we check for the longest palindromic substring among str1 and str2 by comparing str1 and str2 and store the resultant in str 
  -we check for the longest palindromic substring obtained so far by comparing str and longSub
  -longSub is returned which holds the longest palindromic substring of the string s
  -<b>Time Complexity:O(n<sup>2<sup>)</b>
  -<b>Space Complexity:O(1)</b>

