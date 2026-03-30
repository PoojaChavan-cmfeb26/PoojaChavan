import java.util.Scanner;

public class MobileRechargeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mobile number and recharge amount
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        String planDetails;

        // Switch-case for recharge plans
        switch (amount) {
            case 199:
                planDetails = "Validity: 28 days";
                break;
            case 399:
                planDetails = "Validity: 56 days";
                break;
            case 599:
                planDetails = "Validity: 84 days";
                break;
            default:
                planDetails = "Invalid recharge amount!";
        }

        // Display confirmation
        System.out.println("\n--- Recharge Confirmation ---");
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Recharge Amount: Rs. " + amount);
        System.out.println("Plan Details   : " + planDetails);

        sc.close();
    }
}