import java.util.Scanner;

public class bruteForce
{
    static int[] arr;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bruteForce obj=new bruteForce();
        while(true)
        {
        System.out.println("Enter the size of the array");
        if(!sc.hasNextInt())
        break;
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.sort();
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();


        }

    }

    public void sort()
    {
        int small=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            small=i;
            for(int j=i+1;j<arr.length;j++)
            {
                small=arr[j]<arr[small]?j:small;
            }
            if(small!=i)
            {
                int temp=arr[i];
                arr[i]=arr[small];
                arr[small]=temp;
            }
            
        }

    }
}