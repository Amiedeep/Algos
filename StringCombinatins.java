
import java.util.Scanner;

//total number of combinations of a string are always 1 more than total number of combinations 
//of a string which is one character less than the given string for example total number of 
//combinations of ab are 3,abc are 7,abcd are 15,abcde are 31 n so on.


public class StringCombinatins //this program calculate all the combinations of a given string
                               //for abc this program returns a,b,c,ab,ac,bc,abc
{
    String input;
    
    void combinations(int startingIndex,String temp)//this function find combinations starting from given index
                                                    // like starting from b it find b,bc
    {
        System.out.println(temp);
        for (int i = startingIndex+1; i < input.length(); i++) 
        {
            combinations(i,temp+input.charAt(i));
        }
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String to find combinations of it");
        String str=sc.next();
        StringCombinatins obj=new StringCombinatins();
        obj.input=str;
        for (int i = 0; i < str.length(); i++) 
        {
            obj.combinations(i,""+str.charAt(i));
        }
    }
}
