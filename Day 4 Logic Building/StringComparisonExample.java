public class StringComparisonExample {
    public static void main(String[] args) {
        // Create two string objects using the new keyword with the same content
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Print whether both objects are the same using the == operator
        System.out.println("Using == : " + (str1 == str2));

        // Print whether both objects are the same using the .equals() method
        System.out.println("Using .equals(): " + str1.equals(str2));
    }
}
