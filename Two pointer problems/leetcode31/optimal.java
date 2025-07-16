import java.util.*;
public class optimal 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        optimal obj=new optimal();

        while(true)
        {
            System.out.println("Enter the size of the array");
            if(!sc.hasNextInt())
            {
                System.out.println("Non numeric character");
                break;
            }
            int n=sc.nextInt();
            System.out.println("Enter the elements of the array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            System.out.println(Arrays.toString(obj.nextPermutation(arr)));

        }
    }

        public int[] nextPermutation(int[] arr)
        {
            int pivot=-1;
            for(int i=arr.length-2;i>=0;i--)
            {
                if(arr[i]<arr[i+1])
                {
                    pivot=i;
                    break;
                }
                
            }

            if(pivot==-1)
            {
                int i=0,j=arr.length-1;
                while(i<=j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
            else
            {
                for(int i=arr.length-1;i>pivot;i--)
                {
                    if(arr[i]>arr[pivot])
                    {
                        int temp=arr[i];
                        arr[i]=arr[pivot];
                        arr[pivot]=temp;
                        break;
                    }
                }

                int i=pivot+1,j=arr.length-1;
                while(i<=j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }

            }

        return arr;
    }
    


}
