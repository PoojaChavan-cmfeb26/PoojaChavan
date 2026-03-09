public class NumberPattern {
    public static void main(String[] args) {
        int maxRows = 5;

        // Growing phase (rows 1 to 5)
        for (int i = 1; i <= maxRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Shrinking phase (rows 4 to 1)
        for (int i = maxRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}