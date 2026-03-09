import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        // उपयोगकर्ता से इनपुट लेने के लिए Scanner क्लास का उपयोग
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // checkAgeCategory() मेथड को कॉल करना
        checkAgeCategory(age);

        scanner.close();
    }

    // आयु श्रेणी की जांच करने के लिए मेथड
    public static void checkAgeCategory(int age) {
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}