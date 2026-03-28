import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        // Loop through numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i; // add even numbers
            } else {
                sumOdd += i;  // add odd numbers
            }
        }

        // Output
        System.out.println("Sum of even numbers from 1 to " + N + " = " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + N + " = " + sumOdd);

        sc.close();
    }
}