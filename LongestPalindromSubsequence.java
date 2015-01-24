
import java.util.Scanner;

//this class finds the longest palindrome subsequence of a string in O(n^2) time and O(n^2) space
//recursive algorithm do it in O(n^3) time ad constant space.
public class LongestPalindromSubsequence 
{
    
    //this function finds the longest palindrome subsequence of a string.
    String LongestPalindromSubsequence(String input)//this function can also be called from other classes.
    {
        String result="";
        int n=input.length();
        boolean[][] output=new boolean[n][n];
        
        for (int i = 0; i < n; i++) //bcoz a single character itself is always palindrome.
            output[i][i]=true;
        
        for (int i = 0; i < n-1; i++)//to check substring of length 2.
        {
            if(input.charAt(i)==input.charAt(i+1))
            {
                output[i][i+1]=true;
                result=input.substring(i,i+2);
            }
                    
        }
        
        
        for (int i = 3; i <= n; i++)//to check substrings of length 3 or more till n.
        {
            for (int startIndex = 0; startIndex <=n-i; startIndex++) 
            {
                int endIndex=startIndex+i-1;
                if(output[startIndex+1][endIndex-1] && input.charAt(startIndex)==input.charAt(endIndex))
                {
                    output[startIndex][endIndex]=true;
                    result=input.substring(startIndex,endIndex+1);
                }
                    
            }
        }
        
        
        if(result=="")
            System.out.println("There s no palindrome subsequence except the characters itself");
        
        return result;
        
        
//        for (int i = 0; i < n; i++) 
//        {
//            for (int j = 0; j < n; j++) 
//            {
//                System.out.print(output[i][j]+"  ");
//            }
//            System.out.println("");
//        }
        
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        LongestPalindromSubsequence obj=new LongestPalindromSubsequence();
        System.out.println(obj.LongestPalindromSubsequence(str));;
    }
 
}
