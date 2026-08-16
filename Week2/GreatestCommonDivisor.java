import java.util.Scanner;
public class GreatestCommonDivisor
{
    int gcd(int first, int second)
    {   
        if(second!=0)
        {
            gcd(second, first%second);
        }
        else
        {
            return second;
        }
        return 0;
    }
     void greatest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int first = scan.nextInt();

        System.out.println("Enter the second number: ");
        int second = scan.nextInt();
        
        gcd(first,second);
        scan.close();
    }
}
