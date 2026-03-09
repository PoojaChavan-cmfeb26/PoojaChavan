import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " integers:");

        // Loop to get user input and store in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add the number to the sum
        }

        scanner.close(); // Close the scanner

        // Calculate the average (use double for precision)
        double average = (double) sum / size;

        // Print the average
        System.out.println("The average of the numbers is: " + average);
    }
}
