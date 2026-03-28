public class StarPattern {
    public static void main(String[] args) {
        // Number of rows
        int rows = 4;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}