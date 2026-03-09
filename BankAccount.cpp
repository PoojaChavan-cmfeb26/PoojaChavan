#include <iostream>
using namespace std;

class BankAccount {
private:
    int accountNumber;
   long long balance;

public:
    // Setter method
    void setAccount(int accNo, long long bal) {
        accountNumber = accNo;
        if (bal < 0) {
            balance = 0;  // Rule: Initial balance cannot be negative
        } else {
            balance = bal;
        }
    }

    // Deposit method
    void deposit(long long amount) {
        balance += amount;
    }

    // Withdraw method
    void withdraw(long long amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            cout << "Insufficient Balance" << endl;
        }
    }

    // Getter method
    long long getBalance() {
        return balance;
    }
};

int main() {
    int accNo;
  long long initialBalance, depositAmount, withdrawAmount;

    // Input format: accountNumber initialBalance depositAmount withdrawAmount
    cin >> accNo >> initialBalance >> depositAmount >> withdrawAmount;

    BankAccount account;
    account.setAccount(accNo, initialBalance);
    account.deposit(depositAmount);
    account.withdraw(withdrawAmount);

    cout << "Final Balance: " << account.getBalance() << endl;

    return 0;
}