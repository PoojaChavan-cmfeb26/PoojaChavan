import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 0;

        // Extract digits one by one
        while (num > 0) {
            int digit = num % 10;   // get last digit
            if (digit > largest) {
                largest = digit;    // update largest if needed
            }
            num = num / 10;         // remove last digit
        }

        // Output
        System.out.println("Largest digit is: " + largest);

        sc.close();
    }
}