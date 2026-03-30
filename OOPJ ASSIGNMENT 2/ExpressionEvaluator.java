import java.util.Scanner;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform expressions
        int result1 = (a + b) * c;
        boolean result2 = (a > b && b > c);
        int result3 = a % b;

        // Display results
        System.out.println("\n--- Expression Results ---");
        System.out.println("(a+b)*c = " + result1);
        System.out.println("a>b && b>c = " + result2);
        System.out.println("a % b = " + result3);

        sc.close();
    }
}