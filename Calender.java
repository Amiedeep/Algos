
import java.util.Scanner;


public class Calender
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date,month and year");
        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yyyy=sc.nextInt();
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String s[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int year=yyyy;
        year=year%400;
        int odd;
        odd=5*(year/100);
        year=year%100-1;
        odd=odd+(2*(year/4))+(year-year/4);
        int i=0;
        while(i<mm-1)
        {
            odd=odd+days[i];
            i++;
        }
        if((year+1)%4==0 && mm>2)
        {
            odd=odd+1;
        }
        odd=odd+dd;
        odd=odd%7;
        System.out.println("Day on "+dd+"-"+mm+"-"+yyyy+" was :"+s[odd]);
    }
}
