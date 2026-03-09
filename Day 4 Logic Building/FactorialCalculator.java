import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // Read the integer input from the user
        int n = scanner.nextInt();
        
        // Initialize the factorial variable to 1
        long factorial = 1; // Use long to handle larger factorials
        
        // Check if the number is negative
        if (n < 0) {
            System.out.println("Factorial of negative numbers is undefined.");
        } else {
            // Use a for loop to calculate the factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i; // Same as factorial = factorial * i;
            }
            
            // Print the result
            System.out.println("Factorial of " + n + " is " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}
