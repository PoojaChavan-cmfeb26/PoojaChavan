import java.util.Scanner;

public class StudentMarksTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3]; // 3 students, 3 subjects
        int[] totals = new int[3];

        // Input marks
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                totals[i] += marks[i][j];
            }
        }

        // Display table
        System.out.println("\n--- Student Marks Table ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Sub1", "Sub2", "Sub3", "Total");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], totals[i]);
        }

        sc.close();
    }
}