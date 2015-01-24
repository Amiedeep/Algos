
import java.util.HashMap;
import java.util.Scanner;


public class HashMapExample 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer ,String > hs=new HashMap();
        hs.put(1,"abc");
        hs.put(2,"pqr");
        hs.put(3,"abc");
        hs.put(2, "mno"); // 2 wouldn't b allowed as it is duplicate so 
                          //it simply update string at key 2 to mno from pqr  
        System.out.println(hs);
        System.out.println("size= :"+hs.size());
        System.out.println("toString= :"+hs.toString());
        System.out.println("Value= :"+hs.values());
//        hs.new HashIterator<E>(); because it is privte there.
        System.out.println("keySet= :"+hs.keySet());
        System.out.println("getClass= :"+hs.getClass());
        System.out.println("clone= :"+hs.clone());
        
    }
}
