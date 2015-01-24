
import java.util.Scanner;

//to find diffent combinations of Parenthesis given number of pairs of brackets..
public class Parenthesis 
{
    int pairs;
    void rec(String str,int left,int right)
    {
        if(left==pairs && right==pairs)
            System.out.println(str);
        else
        {
            if(left<pairs)
                rec(str+"(",left+1,right);
            if(right<pairs && right<left)
                rec(str+")",left,right+1);
        }
            
 
                    
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many pairs of ()");
        int num=sc.nextInt();
        Parenthesis obj=new Parenthesis();
        obj.pairs=num;
        obj.rec("",0,0);
    }
}
