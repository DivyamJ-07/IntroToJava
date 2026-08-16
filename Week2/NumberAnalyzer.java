import java.util.Scanner;

public class NumberAnalyzer {

    // user input 
    static int readNumber(Scanner sc) {
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }

    static boolean isEven(int val) {
        return val % 2 == 0;
    }

    static boolean isPositive(int val) {
        return val > 0;
    }

    // Custom abs logic instead of built-in Math.abs
    static int absoluteValue(int num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }

    // Optional extension method required by prompt
    static int analyzeMagnitude(int num) {
        int absVal = absoluteValue(num);
        return countDigits(absVal);
    }

    static int countDigits(int num) {
        // Edge case: zero has 1 digit
        if (num == 0) return 1;

        int digits = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        return digits;
    }

    static int sumDigits(int num) {
        int total = 0;
        int temp = num;

        while (temp > 0) {
            total += (temp % 10);
            temp /= 10; // drop last digit
        }

        return total;
    }

    static void printReport(int originalNum, boolean even, boolean positive, int dCount, int dSum) {
        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number: " + originalNum);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
        System.out.println("Absolute value: " + absoluteValue(originalNum));
        System.out.println("Number of digits: " + dCount);
        System.out.println("Sum of digits: " + dSum);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1 & 2. Read number
        int userNum = readNumber(scanner);

        // 3. Even test
        boolean evenFlag = isEven(userNum);

        // 4. Positive test
        boolean posFlag = isPositive(userNum);

        // 5. Make absolute before processing digits
        int positiveNum = absoluteValue(userNum);

        // 6 & 7. Process digits
        int numDigits = countDigits(positiveNum);
        int sumOfDigits = sumDigits(positiveNum);

        // 8. Output report
        printReport(userNum, evenFlag, posFlag, numDigits, sumOfDigits);

        // 9. Clean up
        scanner.close();
    }
}