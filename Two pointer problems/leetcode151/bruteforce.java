import java.util.Scanner;
public class bruteForce
{
    public static void main(String[] args)
    {
        bruteForce obj=new bruteForce();
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
                  
                    if(!word.equals(""))
                    {
                        
                        res=word+" "+res;
                        
                        i++;
                        word="";
                    }
                    else
                    i++;
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
