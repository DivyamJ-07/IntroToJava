import java.util.Scanner;
public class MenuCalculator 
{
    void Calculator()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter no. 1: ");
        int no1= scan.nextInt();
        System.out.println("Enter no. 2: ");
        int no2= scan.nextInt();
        System.out.println("Enter your choice:\n\t1.Add\n\t2.Subtract\n\t3.Multiply\n\t4.Divide\n\t5.Exit");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                System.out.println("Sum of numbers: "+(no1+no2));
                break;
            case 2:
                System.out.println("Subtraction of numbers: "+(no1-no2));
                break;
            case 3:
                System.out.println("Prouct of numbers: "+(no1*no2));
                break;
            case 4:
                if(no2==0){
                    System.out.println("Denominator cannot be zero");
                    break;
                }
                else{
                    System.out.println("Divison is : "+(no1/no2));
                    break;
                }
            case 5:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        scan.close();
    }
}