import java.util.Scanner;

public class FinalValueOperations{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int X = 0;

        System.out.print("Enter the number of operations: ");
        int n = scan.nextInt();

        scan.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter operation: ");
            String operation = scan.nextLine();

            if (operation.contains("+")) {
                X++;
            } 
            else {
                X--;
            }
        }

        System.out.println("Final value of X is: " + X);
        scan.close();
    }
}