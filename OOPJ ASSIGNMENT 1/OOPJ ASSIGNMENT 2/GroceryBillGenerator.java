import java.util.Scanner;

public class GroceryBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        String[] itemNames = new String[n];
        int[] quantities = new int[n];
        double[] prices = new double[n];
        double[] totals = new double[n];

        double grandTotal = 0;

        // Input items
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline
            System.out.print("Enter item name: ");
            itemNames[i] = sc.nextLine();

            System.out.print("Enter quantity: ");
            quantities[i] = sc.nextInt();

            System.out.print("Enter price per unit: ");
            prices[i] = sc.nextDouble();

            totals[i] = quantities[i] * prices[i];
            grandTotal += totals[i];
        }

        // Apply discount
        if (grandTotal > 3000) {
            grandTotal -= grandTotal * 0.10; // 10% discount
        }

        // Display bill
        System.out.println("\n--- Grocery Bill ---");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemNames[i], quantities[i], prices[i], totals[i]);
        }
        System.out.println("Final Amount (Rs.): " + grandTotal);

        sc.close();
    }
}