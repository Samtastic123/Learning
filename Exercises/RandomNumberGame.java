package Exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (playAgain) {
            int min = 1;
            int max = 100;

            System.out.println("Choose a difficulty (1, 2, or 3):");
            System.out.println("1 = Easy (1-50)");
            System.out.println("2 = Medium (1-100)");
            System.out.println("3 = Hard (1-200)");

            int difficulty = scanner.nextInt();
            if (difficulty == 1) {
                max = 50;
            } else if (difficulty == 2) {
                max = 100;
            } else if (difficulty == 3) {
                max = 200;
            } else {
                System.out.println("Invalid difficulty, defaulting to Medium (1-100)");
            }

            int target = random.nextInt(max - min + 1) + min;
            int guesses = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between " + min + " and " + max);

            while (!guessedCorrectly) {
                int guess = scanner.nextInt();

                if (guess < min || guess > max) {
                    System.out.println("Please enter a number between " + min + " and " + max);
                    continue;
                }

                guesses++;

                if (guess < target) {
                    System.out.println("Higher!");
                } else if (guess > target) {
                    System.out.println("Lower!");
                } else {
                    System.out.println("You won! The number was: " + target);
                    System.out.println("Guesses: " + guesses);
                    guessedCorrectly = true;
                }
            }

            System.out.println("Play again? (yes or no)");
            scanner.nextLine();
            String play = scanner.nextLine();
            playAgain = play.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }
}