import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        // Read 5 integers from the user
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter only integers.");
                return; // Exit the program if input is invalid
            }
        }
        scanner.close();

        // Use the built-in Arrays.sort() method to sort the array
        Arrays.sort(numbers);

        // The largest element is now the last element in the sorted array
        int largest = numbers[numbers.length - 1];

        System.out.println("The largest element is: " + largest);
    }
}
