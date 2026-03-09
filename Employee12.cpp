#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Employee {
private:
    int empID;
    string empName;
    double empSalary;
    double grossSalary;

public:
    // Constructor
    Employee(int id, string name, double salary) {
        empID = id;
        empName = name;
        empSalary = salary;
        grossSalary = 0.0;
    }

    // Getters
    int getEmpID() { return empID; }
    string getEmpName() { return empName; }
    double getEmpSalary() { return empSalary; }
    double getGrossSalary() { return grossSalary; }

    // Setters
    void setEmpName(string name) { empName = name; }
    void setEmpSalary(double salary) { empSalary = salary; }

    // Calculate Gross Salary
    void calculateGrossSalary() {
        if (empSalary <= 5000)
            grossSalary = empSalary + (empSalary * 0.10);
        else if (empSalary <= 10000)
            grossSalary = empSalary + (empSalary * 0.15);
        else
            grossSalary = empSalary + (empSalary * 0.20);
    }

    // Display Employee Details
    void displayEmployeeDetails() {
        cout << "\n--- Employee Details ---\n";
        cout << "Employee ID: " << empID << endl;
        cout << "Employee Name: " << empName << endl;
        cout << "Basic Salary: " << empSalary << endl;
        cout << "Gross Salary: " << grossSalary << endl;
    }
};

int main() {
    vector<Employee> employees;
    int choice;

    do {
        cout << "\nMenu:\n";
        cout << "1. Add New Employee\n";
        cout << "2. Calculate Gross Salary\n";
        cout << "3. Display Employee Details\n";
        cout << "4. Update Employee Information\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1: {
            int id;
            string name;
            double salary;
            cout << "Enter Employee ID: ";
            cin >> id;
            cin.ignore();
            cout << "Enter Employee Name: ";
            getline(cin, name);
            cout << "Enter Employee Salary: ";
            cin >> salary;

            // Ensure unique ID
            bool exists = false;
            for (auto &emp : employees) {
                if (emp.getEmpID() == id) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                cout << "Employee ID already exists. Try again.\n";
            } else {
                employees.push_back(Employee(id, name, salary));
                cout << "Employee added successfully.\n";
            }
            break;
        }
        case 2: {
            int id;
            cout << "Enter Employee ID to calculate gross salary: ";
            cin >> id;
            bool found = false;
            for (auto &emp : employees) {
                if (emp.getEmpID() == id) {
                    emp.calculateGrossSalary();
                    cout << "Gross salary calculated successfully.\n";
                    found = true;
                    break;
                }
            }
            if (!found) cout << "Employee not found.\n";
            break;
        }
        case 3: {
            int id;
            cout << "Enter Employee ID to display details: ";
            cin >> id;
            bool found = false;
            for (auto &emp : employees) {
                if (emp.getEmpID() == id) {
                    emp.displayEmployeeDetails();
                    found = true;
                    break;
                }
            }
            if (!found) cout << "Employee not found.\n";
            break;
        }
        case 4: {
            int id;
            cout << "Enter Employee ID to update: ";
            cin >> id;
            bool found = false;
            for (auto &emp : employees) {
                if (emp.getEmpID() == id) {
                    string newName;
                    double newSalary;
                    cin.ignore();
                    cout << "Enter new name: ";
                    getline(cin, newName);
                    cout << "Enter new salary: ";
                    cin >> newSalary;
                    emp.setEmpName(newName);
                    emp.setEmpSalary(newSalary);
                    cout << "Employee information updated successfully.\n";
                    found = true;
                    break;
                }
            }
            if (!found) cout << "Employee not found.\n";
            break;
        }
        case 5:
            cout << "Exiting program...\n";
            break;
        default:
            cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 5);

    return 0;
}