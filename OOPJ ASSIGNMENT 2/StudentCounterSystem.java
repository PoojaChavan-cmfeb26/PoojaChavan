class Student {
    String name;
    int rollNo;
    static int totalStudents = 0; // static counter

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        totalStudents++; // increment counter
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    // Static method to display count
    static void displayCount() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class StudentCounterSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 101);
        Student s2 = new Student("Meena", 102);
        Student s3 = new Student("Arjun", 103);

        System.out.println("--- Student Details ---");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.displayCount(); // show total students
    }
}