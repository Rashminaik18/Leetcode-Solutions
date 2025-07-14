import java.util.*;


public class optimised 
{
    public static void main(String[] args)
    {
        int n;
        int []arr;
        Scanner sc=new Scanner(System.in);
        optimised obj=new optimised();
        while(true)
        {
            System.out.println("Enter the length of the array");
            n=sc.nextInt();
            arr=new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(obj.kadanes(arr));
            System.out.println();
        }
    }

    public int kadanes(int[] arr)
    {
        int curSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            curSum+=arr[i];
            maxSum=Math.max(curSum,maxSum);
            if(curSum<0)
            curSum=0;
        }
        return maxSum;
    }

}
