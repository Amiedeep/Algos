
import java.util.Scanner;


public class Fibonacci 
{
    int x,y,n;
    void fib(int a,int b)
    {
        if(n>2)
        {
            n=n-1;
            System.out.println(a+b);
            fib(b,a+b);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number upto which you want to generate series");
        Fibonacci obj =new Fibonacci();
        obj.n=sc.nextInt();
        if(obj.n==1)
            System.out.println("0");
        else if(obj.n==2)
        {
            System.out.println("0");
            System.out.println("1");
        }
        if(obj.n>2)
        {
            System.out.println("0");
            System.out.println("1");
            obj.fib(0,1);
        }
            
    }
}
