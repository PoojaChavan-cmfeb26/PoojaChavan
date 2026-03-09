public class GradeEvaluation {
    public static void main(String[] args) {
        // Predefined Values
        double math = 80;
        double science = 85;
        double history = 90;

        // Calculate Average
        double average = (math + science + history) / 3;
        System.out.println("Average Marks: " + (int)average);

        // Determine Grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 30) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }
        System.out.println("Grade: " + grade);
    }
}
