import java.util.Scanner;

public class SalaryConversionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter Salary (double): ");
        double salary = sc.nextDouble();

        // Explicit casting to int
        int salaryInt = (int) salary;

        // Implicit casting to float
        float salaryFloat = (float) salary;

        // Display results
        System.out.println("\n--- Salary Conversion ---");
        System.out.println("Original Salary (double): " + salary);
        System.out.println("Converted to int         : " + salaryInt + " (precision lost)");
        System.out.println("Converted to float       : " + salaryFloat);

        sc.close();
    }
}