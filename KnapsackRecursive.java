
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harpr_000
 */
public class KnapsackRecursive 
{
    int capacity;
    int knapsack(int[] weights,int[] values,int index,int weightLeft)
    {
//        if(index==values.length && total>capacity)
//            capacity=total;
//        else if(index==values.length)
//            return;
//        else if(weightLeft>weights[index])
//        {
//            this.knapsack(weights, values, total, index+1, weightLeft);
//            this.knapsack(weights, values, total+values[index], index+1, weightLeft-weights[index]);
//        }
//        else
//           this.knapsack(weights, values, total, index+1, weightLeft); 
        if(index == values.length)
            return 0;
        else if(weightLeft >= weights[index])
            return Math.max(knapsack(weights, values, index+1, weightLeft),values[index]+knapsack(weights, values, index+1, weightLeft-weights[index]));
        else
            return knapsack(weights, values, index+1, weightLeft);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements?");
        int num = sc.nextInt();
        System.out.println("eneter weights..");
        int[] weights = new int[num];
        int[] values = new int[num];
        for (int i = 0; i < num; i++) 
            weights[i]=sc.nextInt();
        System.out.println("enter values");
        for (int i = 0; i < num; i++) 
            values[i] = sc.nextInt();
        System.out.println("enter max weight");
        int max=sc.nextInt();
        KnapsackRecursive obj=new KnapsackRecursive();
//        obj.knapsack(weights, values, 0, 0, max);
        System.out.println(obj.knapsack(weights, values, 0, max));
//        System.out.println("max value knapsack can hold is:"+obj.capacity);
    }
}
