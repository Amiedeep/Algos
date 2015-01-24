
import java.util.Scanner;

class Fibonacci_1{ 

private static void fib(int F[][],int n){ 
if(n==1) 
return ; 
//n/2 because if we multiply {1,1,1,0} with itself it becomes 2 times and that if we multiply the result by itself 
//it becomes 4 times and if we multiply that by {1,1,1,0} it will becomes 3 times..this is divide and conquer approach which takes log(n) time..binet's formula take constant time.
int M[][]= {{1,1},{1,0}}; 
System.out.println(n);
fib(F,n/2); 
multiply(F,F); 
if(n%2!=0) 
{
multiply(F,M); 
}
} 

private static void multiply(int F[][],int M[][]){ 
int x=F[0][0]*M[0][0]+F[0][1]*M[1][0]; 
int y=F[0][0]*M[0][1]+F[0][1]*M[1][1]; 
int z=F[1][0]*M[0][0]+F[1][1]*M[1][0]; 
int w=F[1][0]*M[0][1]+F[1][1]*M[1][1]; 

F[0][0]=x; 
F[0][1]=y; 
F[1][0]=z; 
F[1][1]=w; 
} 

public static void main(String args[]){ 
int F[][]= {{1,1},{1,0}}; 
Scanner sc=new Scanner(System.in);
    System.out.println("enter nth term to find");
int n=sc.nextInt(); 
fib(F,n-1);	
System.out.println("Fib("+n+") = "+F[0][1]); 
//0,1,1,2,3,5,8,13,21,34 
} 
} 