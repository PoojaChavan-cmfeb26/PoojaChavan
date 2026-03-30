import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int choice;

        do {
            // Display menu
            System.out.println("\n--- Food Menu ---");
            System.out.println("1. Pizza - Rs. 250");
            System.out.println("2. Burger - Rs. 150");
            System.out.println("3. Pasta - Rs. 200");
            System.out.println("4. Exit and Generate Bill");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    total += 250;
                    System.out.println("Pizza added!");
                    break;
                case 2:
                    total += 150;
                    System.out.println("Burger added!");
                    break;
                case 3:
                    total += 200;
                    System.out.println("Pasta added!");
                    break;
                case 4:
                    System.out.println("Generating bill...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        // Add GST
        double gst = total * 0.05;
        double finalAmount = total + gst;

        // Display final bill
        System.out.println("\n--- Final Bill ---");
        System.out.println("Total Amount : Rs. " + total);
        System.out.println("GST (5%)     : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + finalAmount);

        sc.close();
    }
}