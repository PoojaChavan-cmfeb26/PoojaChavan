class Employee {
    static int counter = 100; // starting ID
    int empId;
    String name;

    // Constructor assigns auto-incremented ID
    Employee(String name) {
        this.name = name;
        empId = ++counter;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

public class EmployeeIDGenerator {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi");
        Employee e2 = new Employee("Meena");
        Employee e3 = new Employee("Arjun");

        System.out.println("--- Employee Records ---");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}