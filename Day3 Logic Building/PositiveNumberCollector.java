import java.util.Scanner;

public class PositiveNumberCollector {

    public static void main(String[] args) {
        // Call the method to start the input process
        int positiveNum = askForPositiveNumber();
        // Display the result once a positive number is returned
        System.out.println("You entered a positive number: " + positiveNum);
    }

    /**
     * Prompts the user to enter a positive number repeatedly using a do-while loop
     * until valid input (a positive integer > 0) is received.
     * 
     * @return The first positive integer entered by the user.
     */
    public static int askForPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // The do-while loop ensures the prompt appears at least once, 
        // and repeats as long as the number entered is not positive (<= 0).
        do {
            System.out.print("Enter a positive number: ");
            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
                number = 0; // Set number to 0 to keep the loop running
            }
        } while (number <= 0);

        // Close the scanner (optional but good practice, though sometimes handled at a higher level)
        // scanner.close(); // Closing here might close System.in for the main method if any other input is expected later.
        
        return number;
    }
}
