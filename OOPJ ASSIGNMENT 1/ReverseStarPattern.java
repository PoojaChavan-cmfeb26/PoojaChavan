public class ReverseStarPattern {
    public static void main(String[] args) {
        int rows = 4; // number of lines

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}