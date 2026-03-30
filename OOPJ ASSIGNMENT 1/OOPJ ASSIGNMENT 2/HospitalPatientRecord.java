import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    String disease;

    // Constructor
    Patient(int patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // Method to check senior citizen
    boolean isSeniorCitizen() {
        return age >= 60;
    }

    // Display patient details
    void displayDetails() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println("Senior Citizen: " + (isSeniorCitizen() ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

public class HospitalPatientRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 patients
        Patient p1 = new Patient(101, "Ravi", 45, "Flu");
        Patient p2 = new Patient(102, "Meena", 62, "Diabetes");
        Patient p3 = new Patient(103, "Arjun", 30, "Asthma");

        System.out.println("\n--- Patient Records ---");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        sc.close();
    }
}