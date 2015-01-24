
import java.util.Scanner;


public class Permutation 
{
    String s;
    boolean b[];
    String s1="";
    Permutation(int capacity)
    {
        b=new boolean[capacity];
        for(int i=0;i<b.length;i++)
        {
            b[i]=false;
        }
    }
    void rec(int m)
    {
        for(int i=0;i<s.length();i++)
        {
            if(b[i]==false)
            {
                s1=s1+s.charAt(i);
                b[i]=true;
                if(m==s.length()-1)
                {
                    System.out.println(s1);
                }
                else
                {
                    rec(m+1);
                }
                s1=s1.substring(0,s1.length()-1);
                b[i]=false;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String entered=sc.next();
        Permutation o1=new Permutation(entered.length());
        o1.s=entered;
        System.out.println("anagrams or different permutations are : ");
        o1.rec(0);
    }
}
