import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\nMenu-Driven Java Program");
            System.out.println("--------------------------");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit C-DAC M");
            System.out.print("Enter your choice: ");

            // Read user choice
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear the invalid input
                choice = 0; // Set choice to 0 to re-enter the loop
                continue;
            }

            // Use a switch statement to handle the choice
            switch (choice) {
                case 1:
                    gradeEvaluationSystem(scanner);
                    break;
                case 2:
                    leapYearCheck(scanner);
                    break;
                case 3:
                    dayOfTheWeek(scanner);
                    break;
                case 4:
                    identifyDefaultValues();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // --- Problem 1: Grade Evaluation System ---
    public static void gradeEvaluationSystem(Scanner scanner) {
        System.out.println("\n--- Problem 1: Grade Evaluation System ---");
        System.out.print("Enter a numerical grade (0-100): ");
        if (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            if (grade >= 90 && grade <= 100) {
                System.out.println("Grade: A");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("Grade: B");
            } else if (grade >= 70 && grade < 80) {
                System.out.println("Grade: C");
            } else if (grade >= 60 && grade < 70) {
                System.out.println("Grade: D");
            } else if (grade >= 0 && grade < 60) {
                System.out.println("Grade: F");
            } else {
                System.out.println("Invalid grade entered. Please enter a value between 0 and 100.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer grade.");
        }
        scanner.nextLine(); // Consume the newline
    }

    // --- Problem 2: Leap Year Check ---
    public static void leapYearCheck(Scanner scanner) {
        System.out.println("\n--- Problem 2: Leap Year Check ---");
        System.out.print("Enter a year: ");
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            boolean isLeap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        isLeap = true;
                    else
                        isLeap = false;
                } else
                    isLeap = true;
            } else {
                isLeap = false;
            }
            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer year.");
        }
        scanner.nextLine(); // Consume the newline
    }

    // --- Problem 3: Day of the week ---
    public static void dayOfTheWeek(Scanner scanner) {
        System.out.println("\n--- Problem 3: Day of the Week ---");
        System.out.print("Enter a number (1-7): ");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input. Number must be between 1 and 7.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer number.");
        }
        scanner.nextLine(); // Consume the newline
    }

    // --- Problem 4: Identify Default Values of Variables ---
    public static void identifyDefaultValues() {
        System.out.println("\n--- Problem 4: Identify Default Values of Variables ---");
        
        // Define a nested class to observe default values of instance variables
        class DefaultValues {
            byte b;
            short s;
            int i;
            long l;
            float f;
            double d;
            char c;
            boolean bool;
            String str; // Object type
        }

        DefaultValues dv = new DefaultValues();
        System.out.println("Default value of byte: " + dv.b);
        System.out.println("Default value of short: " + dv.s);
        System.out.println("Default value of int: " + dv.i);
        System.out.println("Default value of long: " + dv.l);
        System.out.println("Default value of float: " + dv.f);
        System.out.println("Default value of double: " + dv.d);
        System.out.println("Default value of char (ASCII 0, invisible): [" + dv.c + "]");
        System.out.println("Default value of boolean: " + dv.bool);
        System.out.println("Default value of String (Object): " + dv.str);
    }
}
