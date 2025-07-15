import java.util.*;

public class bruteForce
{
    public static void main(String[] args)
    {
        int n;
        int[] arr;
       
        Scanner sc=new Scanner(System.in);
        bruteForce obj=new bruteForce();
        while(true)
        {
            System.out.println();
            System.out.println("Enter the length of the array:");
            n=sc.nextInt();
            arr=new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();   
            }
        
            List<List<Integer>> perms=obj.GeneratePermutations(arr);
           for(int i=0;i<perms.size()-1;i++)
           {
            for(int j=i+1;j<perms.size();j++)
            {
                if(obj.compareList(perms.get(i),perms.get(j))>0)
                {
                    List<Integer> temp=perms.get(i);
                    perms.set(i,perms.get(j));
                    perms.set(j,temp);  
                
                }

            }
           }

           List<Integer> tofind=new ArrayList<>();
           
           for(int i=0;i<n;i++)
           {
             tofind.add(arr[i]);
           }

            if(tofind.equals(perms.get(perms.size()-1)))
                 System.out.println(perms.get(0));
            else
            {
           for( int i=0;i<perms.size();i++)
           {
        
            if(perms.get(i).equals(tofind))
            System.out.println(perms.get(i+1));
           }
        }



            
        }
    }




    public int compareList(List<Integer> a,List<Integer> b)
    {
        int x=0;
        for( int i=0;i<a.size();i++)
        {
             x=a.get(i)-b.get(i);
             if(x!=0)
             return x;

        }
        return 0;
    }


        public List<List<Integer>> GeneratePermutations(int[] arr)
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(arr,0,result);
        return result;
    }


    public void backtrack(int[] arr,int index,List<List<Integer>> result)
    {
    if(index==arr.length)
    {
        List<Integer> perm=new ArrayList<>(arr.length);
        for(int num:arr)
        perm.add(num);
        result.add(perm);
        return;

    }
    for(int i=index;i<arr.length;i++)
    {
        swap(arr,index,i);
        backtrack(arr,index+1,result);
        swap(arr,index,i);
    }

}

public void swap(int[] arr,int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}