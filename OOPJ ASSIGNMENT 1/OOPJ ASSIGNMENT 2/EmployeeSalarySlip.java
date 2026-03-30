import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Salary components
        double hra = 0.20 * basicSalary; // 20% HRA
        double da = 0.10 * basicSalary;  // 10% DA
        double pf = 0.08 * basicSalary;  // 8% PF

        double netSalary = basicSalary + hra + da - pf;

        // Display salary slip
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Basic Salary  : Rs. " + basicSalary);
        System.out.println("HRA (20%)     : Rs. " + hra);
        System.out.println("DA (10%)      : Rs. " + da);
        System.out.println("PF (8%)       : Rs. " + pf);
        System.out.println("Net Salary    : Rs. " + netSalary);

        sc.close();
    }
}