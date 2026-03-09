import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number N
        System.out.print("Enter a number: ");

        // Read the number N from the user
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Use a for loop to print numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
