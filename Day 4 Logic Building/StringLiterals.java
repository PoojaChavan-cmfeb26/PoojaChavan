public class StringLiterals {
    public static void main(String[] args) {
        // Create two string variables using string literals
        String str1 = "hello";
        String str2 = "hello";

        // Print whether both variables point to the same object
        // The `==` operator checks if the two variables refer to the same object in memory.
        System.out.println("Do str1 and str2 point to the same object? " + (str1 == str2));
    }
}
