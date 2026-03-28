import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num); // handle negative numbers

        // Special case: if number is 0
        if (temp == 0) {
            count = 1;
        } else {
            // Count digits
            while (temp > 0) {
                temp = temp / 10;  // remove last digit
                count++;
            }
        }

        // Print result
        System.out.println("Number of digits in " + num + " is: " + count);

        sc.close();
    }
}