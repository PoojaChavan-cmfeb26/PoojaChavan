import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    /**
     * Checks if a string is a palindrome, ignoring non-alphanumeric characters and case.
     * 
     * @param str The input string.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // 1. Clean the string: remove non-alphanumeric characters and convert to lowercase
        // The regex "[^a-zA-Z0-9]" matches any character that is not a letter or a digit.
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // 2. Use a two-pointer approach to check for palindromic properties
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            // Compare characters at the left and right pointers
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            // Move the pointers inward
            left++;
            right--;
        }

        // If the loop completes without finding any mismatches, it is a palindrome
        return true;
    }
}
