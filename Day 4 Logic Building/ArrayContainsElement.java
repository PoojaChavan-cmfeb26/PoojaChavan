import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayContainsElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Prompt the user to enter 5 integers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Prompt the user to enter the number to search
        System.out.println("Enter the number to search:");
        int searchNum = scanner.nextInt();

        // Convert the int array to a List<Integer>
        // Note: Arrays.asList() does not work directly with primitive arrays (int[]).
        // We must first convert the primitive int stream to an Integer array or List.
        List<Integer> list = IntStream.of(numbers).boxed().collect(Collectors.toList());

        // Check if the list contains the search number
        if (list.contains(searchNum)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
