import java.util.Arrays;
import java.util.Scanner;

public class ArraySortProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Define the size of the array
        int size = 5;
        // Create an integer array
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");

        // Loop to get 5 integers from the user
        for (int i = 0; i < size; i++) {
            // Check if the input is an integer before proceeding
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter only integers.");
                // Clear the buffer and exit or handle the error appropriately
                scanner.next(); // Consume the invalid token
                i--; // Decrement i to re-enter the current index
            }
        }
        
        // Close the scanner after input is done
        scanner.close();

        // Sort the array in ascending order using the Arrays.sort() method
        // This method is available in the java.util package
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.print("Sorted array: ");
        // Arrays.toString() is a convenient way to print the array content
        System.out.println(Arrays.toString(numbers)
                               .replace("[", "")
                               .replace("]", "")
                               .replace(",", ""));
    }
}
