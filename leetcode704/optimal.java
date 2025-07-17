import java.util.*;
import java.util.Scanner;
public class optimal
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        optimal obj=new optimal();
        while (true)
        {
            System.out.println("Enter the length of the array");
            if(!sc.hasNextInt())
            break;

            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println("Enter the target element");
            int target=sc.nextInt();
            int x=obj.binarySearch(arr,target);
            if(x==-1)
            System.out.println("Not found");
            else
            System.out.println("Found at "+x+" position");

                                                                                                                                                                       

        } 
        
    }


    public int binarySearch(int[] arr,int target)
    {
        int high=arr.length-1,low=0,mid;
        while(low<=high)
        {
            mid=(high+low)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]<target)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
}