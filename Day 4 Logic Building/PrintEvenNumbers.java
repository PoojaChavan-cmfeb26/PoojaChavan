import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        System.out.println("Even numbers from 1 to " + N + ":");

        // Iterate from 1 up to N
        for (int i = 1; i <= N; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
