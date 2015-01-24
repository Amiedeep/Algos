
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Scanner;


public class HashSetExample 
{
    public static void main(String[] args) 
    {
//        HashSet<String> hs=new HashSet<>(); //return in no order
        LinkedHashSet<String> hs=new LinkedHashSet<>(); //same as above but return in order in which elements were added
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements??");
        int n=sc.nextInt();
        System.out.println("enter elemnets");
        String s;
        for (int i = 0; i < n; i++) 
        {
            s=sc.next();
            System.out.println("hashset contains element?? : "+hs.contains(s));
            System.out.println("can be added??: "+hs.add(s));
        }
        System.out.println("size of set is : "+hs.size());
        System.out.println(hs);
        Iterator<String> li=hs.iterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println(li.toString());
        System.out.println(li.hashCode());
        System.out.println(li.getClass());
//        li.remove();
        
//        while(li.hasNext())//won't be called now as hasnext method is pointing to null 
//        {
//            System.out.println(li.next());
//        }
    }
}
