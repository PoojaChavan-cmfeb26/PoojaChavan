import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;

        // Using for loop to calculate sum
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Print result
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);

        // Alternative: Using formula
        int formulaSum = N * (N + 1) / 2;
        System.out.println("Sum using formula: " + formulaSum);

        sc.close();
    }
}