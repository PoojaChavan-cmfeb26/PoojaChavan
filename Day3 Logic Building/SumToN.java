import java.util.Scanner;

public class SumToN {

    /**
     * Calculates the sum of all integers from 1 to N using a for loop.
     *
     * @param n The positive integer limit.
     * @return The sum of numbers from 1 to N.
     */
    public static int calculateS(int n) {
        int sum = 0;
        // Iterate from 1 up to and including N
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the running total
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        // Ensure the input is a positive integer for the program's logic to hold true
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n > 0) {
                int sum = calculateS(n);
                System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
