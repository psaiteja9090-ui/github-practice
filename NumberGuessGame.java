// Simple Number Guessing Game in Java
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        int guess = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again ");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again ");
            } else {
                System.out.println(" Congratulations! You guessed it in " + attempts + " attempts.");
            }
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
