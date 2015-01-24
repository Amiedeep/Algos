
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Paxcel_1 
{
    //this function finds frequency of each character in the string in o(n) time.
    void frequencyOfChar(String input)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < input.length(); i++) 
        {
            if(hm.containsKey(input.charAt(i)))
            {
                int temp=hm.get(input.charAt(i));
                hm.put(input.charAt(i), temp+1);
            }
            else
                hm.put(input.charAt(i), 1);
        }
//        System.out.println(hm);
        Set<Character> set=hm.keySet();
        Iterator<Character> it=set.iterator();
        while(it.hasNext())
        {
            char ch=it.next();
            if(ch>51)
                System.out.println(ch+"-"+hm.get(ch));
                
        }
    }
    
    public static void main(String[] args) 
    {
        Paxcel_1 obj=new Paxcel_1();
        obj.frequencyOfChar("12344386257478612613");
    }
}
