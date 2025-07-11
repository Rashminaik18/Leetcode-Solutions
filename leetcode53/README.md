<h1>Leetcode 53: Maximum Subarray</h1>
<br>
<h2>Brute force</h2>
    - The elements of the array are input from the user.
    - `maxSubarray()` is called and two parameters are passed to it:
    - the array `arr`
    - length of the array (optional)
    - Two loops are used:
    - First loop marks the beginning of the subarray.
    - Second loop marks the ending point of the subarray and is used to obtain the sum of all subarrays that start at index `i`.
    - Two variables are used:
    - `curSum` is used to track the sum of the current subarray from index `i` to `j`.
    - `maxSum` is used to track the maximum sum of the subarray obtained so far.
    - **Time complexity:** O(n²)  
    - **Space complexity:** O(1)

