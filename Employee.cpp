#include <iostream>
using namespace std;

class Employee {
private:
    const int employeeId;   // constant member
    string name;
    float salary;

public:
    // Q6.1 — Constructor using initializer list
    Employee(int id, string n, float s)
        : employeeId(id), name(n), salary(s) {
        // initializer list ensures const member is initialized
    }

    // Q6.2 — Function to display details
    void displayDetails() const {
        cout << "Employee ID: " << employeeId << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
        cout << "-------------------" << endl;
    }
};

int main() {
    // Creating Employee objects
    Employee e1(201, "Pooja", 50000.0);
    Employee e2(202, "Ganesh", 60000.0);

    // Displaying details
    e1.displayDetails();
    e2.displayDetails();

    return 0;
}
