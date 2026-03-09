/*String Concatenation and Object Creation 
Problem Statement: 
Write a Java program that concatenates two strings using the + operator. Print whether the 
concatenated string is a new object or a reference to an existing string object using the == 
operator. 
Code Example: 
String str1 = "hello"; 
String str2 = "world"; 
String str3 = str1 + str2; 
Expected Output: 
Is str3 pointing to the same object as str1? false*/

public class StringConcatCheck {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        // Concatenates str1 and str2 using the '+' operator, resulting in a new string object
        String str3 = str1 + str2; 

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3 (concatenation result): " + str3);

        // Check if str3 refers to the same object as "helloworld" literal in the string pool
        // This will be false because the '+' operator with at least one non-constant operand
        // creates the new string object on the heap at runtime.
        String strLiteral = "helloworld";
        System.out.println("\nUsing '==' operator:");
        System.out.println("Is str3 the same object as \"helloworld\" literal? " + (str3 == strLiteral));

        // Explanation of the result
        if (str3 == strLiteral) {
            System.out.println("The concatenated string is a reference to an existing string literal in the string pool.");
        } else {
            System.out.println("The concatenated string is a new object created in memory (on the heap).");
        }
    }
}
