import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character '" + ch + "' is a Vowel.");
            } else {
                System.out.println("The character '" + ch + "' is a Consonant.");
            }
        } else {
            System.out.println("The character entered is not an alphabet.");
        }

        sc.close();
    }
}