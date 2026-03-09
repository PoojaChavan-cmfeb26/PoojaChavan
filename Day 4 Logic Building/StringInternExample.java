public class StringInternExample {
    public static void main(String[] args) {
        // Create a string using the new keyword. This creates an object in the heap, 
        // not directly in the string constant pool.
        String str1 = new String("hello");
        
        // Call the intern() method. This checks if a string literal "hello" 
        // exists in the string constant pool.
        // If it exists, str2 points to the pool's object. 
        // If not, it adds "hello" to the pool and str2 points to that new pool entry.
        String str2 = str1.intern();
        
        // Create a string literal "hello". The JVM automatically places this 
        // string in the string constant pool.
        String str3 = "hello";
        
        // Check if str1 (heap object) and str2 (potential pool object) point to the same memory location.
        // This will almost always be false because new String() creates a separate heap object.
        System.out.println("Is str1 == str2? " + (str1 == str2)); // Output: false

        // Check if str2 (pool object) and str3 (pool object) point to the same memory location.
        // This will be true because both refer to the single "hello" instance in the string constant pool.
        System.out.println("Is str2 == str3? " + (str2 == str3)); // Output: true

        // Check if str1 (heap object) and str3 (pool object) point to the same memory location.
        // This will be false for the same reason as str1 == str2.
        System.out.println("Is str1 == str3? " + (str1 == str3)); // Output: false
    }
}
