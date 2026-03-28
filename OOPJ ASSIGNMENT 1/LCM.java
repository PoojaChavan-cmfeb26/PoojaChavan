import java.util.Scanner;

public class LCM {
    // Method to compute GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate LCM
        int lcm = findLCM(num1, num2);

        // Output
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        sc.close();
    }
}