import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks of 5 subjects
        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        int s5 = sc.nextInt();

        // Calculate total and percentage
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        // Print results
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Grade logic
        if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}