
import java.util.Scanner;


public class PrimeSum 
{
    boolean isPrime(int a)
    {
        boolean flag=true;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag=false;
                break;
            }
        }
        return(flag);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int i=2;
        int num;
        int sum=0;
        PrimeSum obj=new PrimeSum();
        while(true)
        {
            if(obj.isPrime(i))
            {
                num=i;
                while(num>0)
                {
                    sum=sum+(num%10);
                    num=num/10;
                }
                if(obj.isPrime(sum))
                {
                    System.out.println(i);
                    n=n+1;;
                }
            }
            if(n==30)
                break;
            i=i+1;;
            sum=0;
        }
    }
}
