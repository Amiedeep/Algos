
import java.util.Scanner;

public class Anagram 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string");
        String s1=sc.next();
        System.out.println("enter 2nd string");
        String s2=sc.next();
        boolean flag=false;
        if(s1.length()==s2.length())
        {
            for (int i = 0; i < s1.length(); i++) 
            {
                if(s2.indexOf(s1.charAt(i))!=-1)
                {
                    s2=s2.substring(0,s2.indexOf(s1.charAt(i)))+s2.substring(s2.indexOf(s1.charAt(i))+1);
                }
                else
                {
                    System.out.println("both are not anagram of each other");
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println("both are anagram of each other");
            }
        }
        else
            System.out.println("both are not anagram of each other");
    }
}
