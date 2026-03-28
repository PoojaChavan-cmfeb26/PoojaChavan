import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;          // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            num = num / 10;                // Remove last digit
        }

        // Print result
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}