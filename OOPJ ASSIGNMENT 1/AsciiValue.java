import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert character to ASCII (int)
        int asciiValue = (int) ch;

        // Print result
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);

        sc.close();
    }
}