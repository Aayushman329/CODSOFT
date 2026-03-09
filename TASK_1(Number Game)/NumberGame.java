import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        while (playAgain) {

            int number = random.nextInt(100) + 1; // Random number between 1–100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println(" Hurray..! Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                }
                else if (guess > number) {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessed) {
                System.out.println(" X Out of attempts! The correct number was: " + number);
            }

            System.out.println("Your Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("---Thanks for playing!----");
        sc.close();
    }
}