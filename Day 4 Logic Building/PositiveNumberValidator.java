import java.util.Scanner;

public class PositiveNumberValidator {

    /**
     * Main method to run the program and call the validation method.
     */
    public static void main(String[] args) {
        askForPositiveNumber();
    }

    /**
     * Asks the user to enter a positive number repeatedly using a do-while loop
     * until a valid positive number is entered.
     */
    public static void askForPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // The do-while loop ensures the prompt is displayed at least once
        // and continues to loop as long as the number entered is not positive (<= 0)
        do {
            System.out.print("Enter a positive number: ");
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                // Check if the number is positive (greater than 0)
                if (number > 0) {
                    System.out.println("You entered a positive number: " + number);
                } else {
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                // Consume the invalid input to avoid an infinite loop
                scanner.next(); 
                number = -1; // Set number to -1 to ensure the loop continues
            }
        } while (number <= 0);

        // Close the scanner when done
        scanner.close();
    }
}
