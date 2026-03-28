import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        // Loop until correct guess
        do {
            guess = sc.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        sc.close();
    }
}