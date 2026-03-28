public class TypeConversion {
    public static void main(String[] args) {
        int intNum = 42;
        double doubleNum = 9.75;

        // int → double (implicit widening conversion)
        double convertedDouble = intNum;

        // double → int (explicit narrowing conversion)
        int convertedInt = (int) doubleNum;

        // Printing results
        System.out.println("Original int: " + intNum);
        System.out.println("Converted to double: " + convertedDouble);

        System.out.println("Original double: " + doubleNum);
        System.out.println("Converted to int: " + convertedInt);
    }
}