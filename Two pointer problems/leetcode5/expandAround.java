import java.util.Scanner;
public class expandAround
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        expandAround obj=new expandAround();
        while(true)
        {
            System.out.println("Enter the String:");
            s=sc.next();
            System.out.println(obj.LongestPalindromicSubstring(s));
        }
    }

    public String LongestPalindromicSubstring(String s)
    {
        String str1="",str2="",str="",longSub="";
        for(int i=0;i<s.length();i++)
        {
            str1=expandAround(s,i,i);
            str2=expandAround(s,i,i+1);
            str=str1.length()>str2.length()?str1:str2;
            longSub=str.length()>longSub.length()?str:longSub;
        }

        return longSub;
    }

    public String expandAround(String s,int left,int right)
    {
        int count=0;
        String sub="";
        while(left>=0 && right<s.length())
        {
            if(s.charAt(right)==s.charAt(left))
            {
                if(left==right)
                count++;
                else
                count+=2;
                sub=s.substring(left,right+1);
                left--;
                right++;
                


            }
            else
            break;
        }
        return sub;
    }



}