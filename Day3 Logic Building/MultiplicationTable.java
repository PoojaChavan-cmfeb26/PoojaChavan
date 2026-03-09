import java.util.Scanner;

public class MultiplicationTable {

    /**
     * Prints the multiplication table for a given number from 1 to 10.
     *
     * @param number The number for which to print the multiplication table.
     */
    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        // Use a for loop to iterate from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            // Print the result in the format: number x i = result
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Call the method to print the multiplication table
        printMultiplicationTable(inputNumber);

        // Close the scanner
        scanner.close();
    }
}
