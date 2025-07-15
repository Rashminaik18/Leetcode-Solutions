import java.util.Scanner;



public class bruteForce
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            bruteForce obj=new bruteForce();
            while (true)
            {
                System.out.println("Enter the length of array");
                if(!sc.hasNextInt())
                {
                System.out.println("Non numeric input");
                break;
                }
                int n=sc.nextInt(); 
                int arr[]=new int[n];
                System.out.println("Enter the elements of the array");
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("Enter the target");
                int target=sc.nextInt();
                int res=obj.find(arr,target);
                if(res==-1)
                System.out.println(target+" is not present in the array");
                else
                System.out.println(target+" is found at index "+res);

                
            }

        }

        public int find(int []arr,int target)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                return i;
            }
            return -1;
        }
}
