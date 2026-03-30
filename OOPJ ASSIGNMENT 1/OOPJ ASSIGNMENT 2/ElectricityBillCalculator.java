import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Consumer Number: ");
        String consumerNumber = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        // Slab calculation
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = (100 * 5) + (units - 100) * 7;
        } else {
            billAmount = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        // Apply surcharge if bill exceeds Rs.1500
        if (billAmount > 1500) {
            billAmount += billAmount * 0.05; // 5% surcharge
        }

        // Display bill details
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Consumer Number : " + consumerNumber);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Total Bill (Rs.): " + billAmount);

        sc.close();
    }
}