import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        // Declare an array to hold 5 integers
        int[] numbers = new int[5];

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");

        // Use a standard for loop to get user input and store in the array
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Use a for-each loop to print all elements of the array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

