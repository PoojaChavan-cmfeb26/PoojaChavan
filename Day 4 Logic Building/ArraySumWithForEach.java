import java.util.Scanner;

public class ArraySumWithForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");

        // Use a standard for loop to get user input and store in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the next input is a valid integer
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter only integers.");
                scanner.close(); // Close the scanner to prevent resource leaks
                return; // Exit the program if input is invalid
            }
        }

        // Use a for-each loop to calculate the sum of the elements
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all numbers is: " + sum);

        scanner.close(); // Close the scanner when done
    }
}
