public class EvenNumberPrinter {

    /**
     * Prints all even numbers between 1 and 50 using a while loop.
     */
    public static void printEvenNumbers() {
        int number = 1; // Start from 1

        System.out.println("Even numbers between 1 and 50:");
        while (number <= 50) {
            // Check if the current number is even
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++; // Increment the number for the next iteration
        }
    }

    public static void main(String[] args) {
        // Call the method to print the even numbers
        printEvenNumbers();
    }
}
