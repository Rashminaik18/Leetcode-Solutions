# LEETCODE 151: REVERSE WORDS IN A STRING
------------------------------------------------------------

## Solution- Base logic
- We deal differently when the character is a space and any non-space character differntly
- We accumulate non-space character in a variable 'word' using loop and the moment we encounter a space we break out of the loop and concatenate it to another varibale 'res' from the front(as we need reverse of the string input by the user with each word separated by the exactly one space) and then we reset 'word' as empty string
- we use string.trim() method to remove all the leading and trailing spaces at the beginning itself.
  - Incase all the characters are spaces then all the characters will be removed leaving us with empty string therfore we return an empty string
- When there are multiple continuous spaces then value of 'word' remains an empty string and when this repeats multiple times(""+space=space) it will result in a sequence of spaces and we need only one space between each word, that is the reason why we check if(!word.equals("")):
  - if this returns false that means this is the first space encountered after obtaning a word 
  - if this returns true then it means this is a one of space in continuously occuring sequence of spaces. 
- we do: res=word+" "+res; because we need the string in the reverse order.
  
  ###Time complexity:O(n<sup>2</sup>)-> This is in worst case scenerio,since here the word length is small we consider it to be O(n)

  ###Space complexity:O(n)