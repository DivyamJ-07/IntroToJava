import java.util.Scanner;
public class NumberReversal {
    
    int rev(int number) 
{
    int rev_num=0;
    while(number!=0)
    {
        if(rev_num>10)
        {
            rev_num += number%10;
            rev_num  = rev_num *10;
            number=number/10;
        }
        else
        {
            rev_num  += number%10;
            number=number/10;
        }
    }
    return rev_num ;
}

void number(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the orignal number: ");

    int s=scan.nextInt();
    int r = rev(s);

    System.out.println("The reversed number is: " +r );
    scan.close();
 }
}
