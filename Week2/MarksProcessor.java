import java.util.Scanner;

public class MarksProcessor {

    // checks the valid range
    static boolean isValidMark(int val) {
        return val >= 0 && val <= 100;
    }

    static double getAverage(int total, int n) {
        if (n == 0) {
            return 0.0;
        }
        return (double) total / n;
    }

    static void showStats(int totalCount, int totalSum, double avg, int topMark, int passed, int failed) {
        System.out.println("\nNumber of valid marks: " + totalCount);
        System.out.println("Sum of marks: " + totalSum);
        System.out.println("Average mark: " + avg);
        System.out.println("Highest mark: " + topMark);
        System.out.println("Number of passes: " + passed);
        System.out.println("Number of failures: " + failed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalValid = 0;
        int sumMarks = 0;
        int maxMark = 0; 
        int passCount = 0;
        int failCount = 0;

        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            int inputMark = sc.nextInt();

            // break out if sentinel is there
            if (inputMark == -1) 
            {
                break;
            }

            // validate range
            if (!isValidMark(inputMark)) 
            {
                System.out.println("Invalid mark. Try again.");
                continue;
            }

            // keep update of the  stats
            totalValid++;
            sumMarks += inputMark;

            if (inputMark > maxMark) {
                maxMark = inputMark;
            }

            if (inputMark >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double avgMark = getAverage(sumMarks, totalValid);
        showStats(totalValid, sumMarks, avgMark, maxMark, passCount, failCount);
        //atleast closing the sacnner
        sc.close();
    }
}