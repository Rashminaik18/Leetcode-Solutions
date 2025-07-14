<h1>Leetcode 53: Maximum Subarray</h1>
<br>
<h2>Brute force</h2>
<ul>
  <li>The elements of the array are input from the user.</li>
  <li><code>maxSubarray()</code> is called and two parameters are passed to it:</li>
  <ul>
    <li>the array <code>arr</code></li>
    <li>length of the array (optional)</li>
  </ul>
  <li>Two loops are used:</li>
  <ul>
    <li>First loop marks the beginning of the subarray.</li>
    <li>Second loop marks the ending point of the subarray and is used to obtain the sum of all subarrays that start at index <code>i</code>.</li>
  </ul>
  <li>Two variables are used:</li>
  <ul>
    <li><code>curSum</code> is used to track the sum of the current subarray from index <code>i</code> to <code>j</code>.</li>
    <li><code>maxSum</code> is used to track the maximum sum of the subarray obtained so far.</li>
  </ul>
  <li><strong>Time complexity:</strong> O(n²)</li>
  <li><strong>Space complexity:</strong> O(1)</li>
</ul>
<br><br><hr>
<h2>Optimised Approach using Kadane's Algorithm</h2>
<ul>
Kadanes Algorithm works on the following logic:
<li>+ve + +ve=+ve</li>
<li>+ve + -ve=+ve(If the positive number is way larger than the negative number)</li>
<li>-ve + +ve=-ve(If the negative number is way more smaller than positive number)</li>
<li>-ve + -ve=-ve</li>
</ul>
<br>
<h3>Method:</h3>
<ul>
<li>We take two variables:
    <ul>
    <li>curSum=0 : to track the current subarray sum</li>
    <li>maxSum=Integer.MIN_VALUE : to track the maximum subarray sum obtained so far at any given point of time</li>
    </ul>
    </li>

    The moment we encounter a number <0 we reset the curSum because adding a negative number can only make the sum smaller

</ul>