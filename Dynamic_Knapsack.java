
import java.util.Scanner;

//this class find the max value knapsack can hold with given weight.this uses DYNAMIC PROGRAMMING approach
public class Dynamic_Knapsack 
{
    
    int knapsack(int[] wt,int[] val,int max)//this could be called from other classes.
    {
        int[][] knapsack=new int[wt.length][max+1];
        
        for(int i=0;i<=max;i++)//to initialize the first row.
        {
            if(wt[0] <= i)
                knapsack[0][i]=val[0];
            else
                knapsack[0][i]=0;
        }
        
        
        for(int i = 0;i < wt.length;i++)//bcoz with max weight zero value is always zero.provided neg weights are not there
            knapsack[i][0]=0;
        
        
        //the general idea is knapsack[i][j] is equal to the max between when item i is excluded and finding max
        //among remaining items or when item is included and finding max value among remaining items with value
        //of the item added to the result and weight of it is decreased.
        //i.e MAX=max{(n items,m weight),value[n]+(n-1 items,weight-wt[n])}.
        
        for (int i = 1; i < wt.length; i++) 
        {
            for (int j = 1; j <= max; j++) 
            {
                if(wt[i]<=j)
                    knapsack[i][j]=Math.max(knapsack[i-1][j],val[i]+knapsack[i-1][j-wt[i]]);
                else
                    knapsack[i][j]=knapsack[i-1][j];
            }
        }
        
        return knapsack[wt.length-1][max];//returns max value knapsack can hold.
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements?");
        int n=sc.nextInt();
        System.out.println("Enter weight of elements");
        int weight[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
                weight[i]=sc.nextInt();
        }
        System.out.println("Enter value of elements");
        int value[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
                value[i]=sc.nextInt();
        }
        System.out.println("Enter maximum capacity of knapsack");
        int capacity=sc.nextInt();
        Dynamic_Knapsack obj=new Dynamic_Knapsack();
        System.out.println(obj.knapsack(weight, value, capacity));
    }
}
