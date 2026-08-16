import java.util.Scanner;
public class GradingSystem 
{
    public static String classifyMark(int mark)
    {
        if (mark < 0 || mark > 100) 
            {
                return "Invalid mark";
            } 
        else if (mark >= 80) 
            {
                return "Distinction";
            } 
        else if (mark >= 70)
            {
                return "Merit";
            } 
        else if (mark >= 50) 
            {
                return "Pass";
            } 
        else 
            {
                return "Fail";
            }
    }
    public static void main(String[] arg)
    {
        int[] testMarks= {-1, 0, 49, 50, 69, 70, 79, 80, 100, 101};
        for(int mark: testMarks)
            {
                System.out.println(classifyMark(mark));
            }
        Scanner scanner= new Scanner(System.in);
        if(scanner.hasNextInt())
            {
                int inputMark = scanner.nextInt();
                System.out.println(classifyMark(inputMark));
            }
        scanner.close();
    }

}
