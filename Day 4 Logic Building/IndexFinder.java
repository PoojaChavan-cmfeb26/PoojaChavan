import java.util.Arrays;
import java.util.Scanner;

public class IndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Ask the user to input 5 integers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // The Arrays.binarySearch() method requires the array to be sorted
        Arrays.sort(numbers);

        // Ask the user to input the number to search
        System.out.println("Enter the number to search:");
        int searchKey = scanner.nextInt();

        // Use Arrays.binarySearch() to find the index
        int index = Arrays.binarySearch(numbers, searchKey);

        // Check the return value to determine if the number was found
        if (index >= 0) {
            System.out.println("The number " + searchKey + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
