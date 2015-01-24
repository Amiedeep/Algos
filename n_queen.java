
import java.util.Scanner;

//this is a solution to famous n queen problem.
public class n_queen 
{
    int[] x;//to hold value of column assigned to a row.
    
    
    n_queen(int n)
    {
        x=new int[n];
    }
    
    //this will provide all solutions to our problem.
    void n_queenfunction(int n)
    {
        for (int i = 0; i < x.length; i++) 
        {
            if(place(n,i))
            {
                x[n]=i;
                if(n==x.length-1)
                {
                    System.out.println("solution found :");
                    for (int j = 0; j < x.length; j++) 
                    {
                        System.out.println(j+","+x[j]+"  ");
                        
                    }
                    System.out.println();
                }
                n_queenfunction(n+1);
            }
        }
    }
    
    //this function check if queen can be placed in kth row and nth column or not.
    boolean place(int k,int n)
    {
        for (int i = 0; i < k; i++) 
        {
            if(x[i]==n || (Math.abs(x[i]-n)==Math.abs(i-k)))
                return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of queens to be placed");
        int number=sc.nextInt();
        n_queen obj=new n_queen(number);
        obj.n_queenfunction(0);
    }
}
