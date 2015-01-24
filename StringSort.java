
import java.util.*;


public class StringSort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many strings?");
        int n=sc.nextInt();
        String [] a=new String[n];
        System.out.println("enter strings");
//        Arrays al=new Arrays(); not possible because Arrays() (constructor) is private.
        for (int i = 0; i < n; i++) 
        {
            a[i]=sc.next();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) 
        {
            System.out.println(a[i]);
        }
    }
}
