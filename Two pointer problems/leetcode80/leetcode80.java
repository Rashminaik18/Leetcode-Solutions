/*
  we take 2 variable i and k:
 *  i is used to iterate through every element 
 *  k is used to check if the current element is the third occuring element or not
 *      nums[i](current elemnt)==nums[k-2]
 *          if yes-> then i++ only because k acts as the marker to signify where the next Different element must be placed
 *          if no-> then k++,because the element in the current and k-2th position are different,signifying that its not the third        duplicate of the nums[k]
 * It is important to note that i==k as along as the first element with 3 duplicates are encountered. Once this condition is encountered where there are 3 duplicates of a paricular element then k!=i as k starts acting as the pointer to point to the position where the next different element must be placed
 * Time Complexity: O(n)-> a single loop iterates through all the elements
 * Space Comeplexity:O(1)-> No extra space used
 */

import java.util.Scanner;
public class leetcode80
{
    int[] nums;
    int n;
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        leetcode80 obj=new leetcode80();
        System.out.println("Enter the length of the array");
        obj.n=sc.nextInt();
        obj.nums=new int[obj.n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<obj.n;i++)
        {
            obj.nums[i]=sc.nextInt();
         }
         int x=obj.removeDuplicates();

         for(int i=0;i<x;i++)
         {
            System.out.print(obj.nums[i]+" ");
         }

    }

    public int removeDuplicates()
    {
        int k=2;
        for(int i=2;i<n;i++)
        {
            if(nums[i]!=nums[k-2])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }
}