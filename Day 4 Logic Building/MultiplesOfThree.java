import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print a message indicating the output
        // System.out.println("Multiples of 3 between 1 and " + n + ":"); // Optional

        // Use a for loop to iterate from 1 to N
        for (int i = 1; i <= n; i++) {
            // Check if the current number is a multiple of 3
            if (i % 3 == 0) {
                // If it is, print the number followed by a space
                System.out.print(i + " ");
            }
        }
        
        // Print a new line character at the end for better formatting
        System.out.println();
    }
}
