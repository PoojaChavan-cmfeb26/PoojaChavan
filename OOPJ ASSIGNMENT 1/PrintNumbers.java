public class PrintNumbers {
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Numbers from 1 to 50 using for loop:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n"); // Line break

        // Using while loop
        System.out.println("Numbers from 1 to 50 using while loop:");
        int j = 1;
        while (j <= 50) {
            System.out.print(j + " ");
            j++;
        }
    }
}