import java.util.Scanner;

public class SumCalculator {

    // Method to calculate the sum of two numbers
    public static int sumOfTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        // Call the method and store the result
        int totalSum = sumOfTwoNumbers(firstNumber, secondNumber);

        // Print the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + totalSum + ".");

        scanner.close();
    }
}
