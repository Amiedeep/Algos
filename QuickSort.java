
import java.util.Scanner;


public class QuickSort 
{
    void quickSort(int[] input,int start,int end)
    {
        int p=quick(input,start,end);
        if(p>start+1)
            quickSort(input, start, p-1);
        if(p<end-1)
            quickSort(input, p+1, end);
            
    }
    int quick(int[] input,int start,int end)
    {
        int left=start;
        int right=end;
        int item=input[left];
        while(left<right)
        {
            while(input[left]<=item && left<right)
                left=left+1;
            while(input[right]>=item && left<right)
                right=right-1;
            if(left<right)
                interchange(input,left,right);
        }
        if(input[left]<item)
        {
            interchange(input,start,left);
            return left;
        }    
        interchange(input,start,left-1);
        return left-1;
    }
    void interchange(int[] input,int left,int right)
    {
        int temp=input[left];
        input[left]=input[right];
        input[right]=temp;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements?");
        int num=sc.nextInt();
        System.out.println("enter elements");
        int input[]=new int[num];
        for (int i = 0; i < num; i++) 
            input[i]=sc.nextInt();
        QuickSort obj=new QuickSort();
        obj.quickSort(input,0, num-1);
        System.out.println("array after sorting is");
        for (int i = 0; i < num; i++) 
        {
            System.out.print(input[i]+"\t");
        }
        Permutation object=new Permutation(num);
        for (int i = 0; i < num; i++) 
        {
            object.s=object.s+input[i];
        }
    }
}
