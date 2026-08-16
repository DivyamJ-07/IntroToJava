import java.util.Scanner;
public class LeapYear 
{
    boolean leapYear(int year)
    {
        if(year%400==0 && year%100!=0 && year %4==0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void yearmatch()
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year= scan.nextInt();
        System.out.println("Leap Year:"+ leapYear(year));
        scan.close();
    }
}
