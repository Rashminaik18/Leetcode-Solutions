// Refere to README.md for explanation

import java.util.Scanner;



public class bruteForce
{
    String str;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bruteForce obj=new bruteForce();
        while(true)
        {
        System.out.println("Enter the string");
        obj.str=sc.nextLine();
        System.out.println(obj.LongPalindromeSubstring());
        }
    }

    public String LongPalindromeSubstring()
    {
        int x,y;
        int count,flag=0,len=0;
        String longestSub="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                y=j;
                count=0;
                
                    for(x=i;x<=y;x++)
                    {
                        if(str.charAt(x)==str.charAt(y))
                        {
                            if(x==y)
                                count++;
                            else
                                count+=2;
                            
                            y--;
                        }
                        else
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                {
                    if(count>len)
                    {
                    len=count;
                    longestSub=str.substring(i,j+1);
                    }
                }
                else
                flag=0;

        
            }
        
        
         }
              
      return longestSub;
            }
             
    }

    
   

