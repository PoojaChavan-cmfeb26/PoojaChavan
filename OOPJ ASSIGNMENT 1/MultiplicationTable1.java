Take a number and print its taimport java.util.Scanner;

public class MultiplicationTable1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Input number
            System.out.print("Enter a number to print its table: ");
            int num = sc.nextInt();

            // Print table
            System.out.println("Multiplication Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            // Ask user if they want to continue
            System.out.print("Do you want to print another table? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended.");
        sc.close();
    }
}ble until user stops (use loop).