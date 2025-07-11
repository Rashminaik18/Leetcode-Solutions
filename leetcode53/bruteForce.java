
import java.util.Scanner;

public class bruteForce 
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bruteForce obj=new bruteForce();
        while(true)
        {
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();
        int []arr=new int[len];
        System.out.println("Enter the elements: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The maximum sum is "+obj.maxSubarray(arr,len));
        
    }
   
}

public int maxSubarray(int[] arr, int len)
{
    int curSum=0,maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        curSum=0;
        for(int j=i;j<arr.length;j++)
        {
            curSum+=arr[j];
            maxSum=Math.max(curSum,maxSum);

        }
     
    }
    return maxSum;
}
    
}
