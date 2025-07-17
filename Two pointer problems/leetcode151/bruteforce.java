import java.util.Scanner;
public class bruteforce
{
    public static void main(String[] args)
    {
        bruteforce obj=new bruteforce();
        while (true) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine(); 
        System.out.println(obj.reverseWord(s));
        
            
        }
    }
        public String reverseWord(String s)
        {
            String word="",res="";
            int i=0;
            s=s.trim();
            if(s.isEmpty())
            return "";

            
            while(i<s.length())
            {
                if(s.charAt(i)==' ')
                {
                    if(i==0||i==s.length()-1)
                    i++;
                    else
                    {
                        res=word+" "+res;
                        i++;
                        word="";
                    }
                }
                else
                {
                    while(i<s.length()&&s.charAt(i)!=' ')
                    {
                    word=word+s.charAt(i);
                    i++;

                    }
            }
            
        }
        res=word+" "+res;
        res=res.trim();
       
       return res;
    }
        
    }
