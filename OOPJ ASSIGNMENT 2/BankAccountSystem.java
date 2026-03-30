class BankAccount {
    int accountNumber;
    String name;
    double balance;

    // Default constructor
    BankAccount() {
        accountNumber = 0;
        name = "Unknown";
        balance = 0.0;
    }

    // Parameterized constructor
    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name          : " + name);
        System.out.println("Balance       : Rs. " + balance);
        System.out.println("---------------------------");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();

        // Using parameterized constructor
        BankAccount acc2 = new BankAccount(101, "Ravi", 5000.0);
        BankAccount acc3 = new BankAccount(102, "Meena", 10000.0);

        System.out.println("--- Bank Accounts ---");
        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}