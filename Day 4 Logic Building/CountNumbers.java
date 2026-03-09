import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter 6 integers:");

        // Input 6 integers
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count positive and negative numbers
        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        // Output results
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);

        scanner.close();
    }
}
