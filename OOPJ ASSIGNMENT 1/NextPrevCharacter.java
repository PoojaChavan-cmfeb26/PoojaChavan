import java.util.Scanner;

public class NextPrevCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Find next and previous characters
        char nextChar = (char) (ch + 1);
        char prevChar = (char) (ch - 1);

        // Print results
        System.out.println("Entered character: " + ch);
        System.out.println("Next character: " + nextChar);
        System.out.println("Previous character: " + prevChar);

        sc.close();
    }
}