
import java.util.Scanner;

//1st term of fibbonacci is 0th term here in this formula...
public class BinetFormula 
{
    int binetFunction(int num)
    {
         double sqrt5=Math.sqrt(5);
         double a=(Math.pow((1+sqrt5)/2,num));
         double b=(Math.pow((1-sqrt5)/2,num));
         double result=(1/sqrt5)*(a-b);
         System.out.println(result);
         return (int)result;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nth term to find");
        int n=sc.nextInt()-1;
        BinetFormula obj=new BinetFormula();
        System.out.println(obj.binetFunction(n));
    }
}
