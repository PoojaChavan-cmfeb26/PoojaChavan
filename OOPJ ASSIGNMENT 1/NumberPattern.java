public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; // number of lines

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to next line
            System.out.println();
        }
    }
}