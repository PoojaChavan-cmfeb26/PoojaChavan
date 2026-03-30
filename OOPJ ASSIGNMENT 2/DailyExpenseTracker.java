import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        int highestDay = 0;

        // Input expenses
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for Day " + (i + 1) + ": ");
            expenses[i] = sc.nextDouble();
            total += expenses[i];

            if (expenses[i] > highest) {
                highest = expenses[i];
                highestDay = i + 1;
            }
            if (expenses[i] < lowest) {
                lowest = expenses[i];
            }
        }

        double average = total / 7;

        // Display results
        System.out.println("\n--- Weekly Expense Report ---");
        System.out.println("Total Expense   : Rs. " + total);
        System.out.println("Average Expense : Rs. " + average);
        System.out.println("Highest Expense : Rs. " + highest + " (Day " + highestDay + ")");
        System.out.println("Lowest Expense  : Rs. " + lowest);

        sc.close();
    }
}