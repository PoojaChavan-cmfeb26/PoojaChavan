import java.util.Scanner;

public class WeeklyWorkHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assume 3 employees, each works different number of days
        int[][] workHours = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of days Employee " + (i + 1) + " worked: ");
            int days = sc.nextInt();
            workHours[i] = new int[days];

            for (int j = 0; j < days; j++) {
                System.out.print("Enter hours for Day " + (j + 1) + ": ");
                workHours[i][j] = sc.nextInt();
            }
        }

        // Display work hours
        System.out.println("\n--- Weekly Work Hours ---");
        for (int i = 0; i < workHours.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print(workHours[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}