import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b1 = sc.nextInt();
                    System.out.println("Result = " + (a1 + b1));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b2 = sc.nextInt();
                    System.out.println("Result = " + (a2 - b2));
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}