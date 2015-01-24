
import java.util.Date;


public class DateClass 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Date d1=new Date();
        System.out.println(d1.getMinutes());
        System.out.println(d1.getTime());
        System.out.println(d1.getTimezoneOffset());
        System.out.println(d1.getSeconds());
        long initial=d1.getTime();
        Thread.sleep(10000);
//        System.out.println(d1.);
        System.out.println(new Date().getTime()-initial);
        System.out.println(new Date().getTime());
    }
}
