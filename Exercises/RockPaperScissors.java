package Exercises;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};

        boolean playAgain = true;

        while (playAgain) {
            int userPoints = 0;
            int computerPoints = 0;

            for (int round = 1; round <= 3; round++) {
                int whatComputerChose = random.nextInt(3);
                String computerChoice = choices[whatComputerChose];

                System.out.println("Round " + round + ": Choose Rock, Paper, or Scissors!");
                String whatUserChose = scanner.nextLine();
                System.out.println("The computer chose: " + computerChoice);

                if (whatUserChose.equalsIgnoreCase(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if (
                        whatUserChose.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors") ||
                                whatUserChose.equalsIgnoreCase("Paper") && computerChoice.equals("Rock") ||
                                whatUserChose.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")
                ) {
                    System.out.println("You win this round!");
                    userPoints++;
                } else {
                    System.out.println("Computer wins this round!");
                    computerPoints++;
                }

                System.out.println("Score: You = " + userPoints + ", Computer = " + computerPoints);
                System.out.println("--------------------------------------------------");
            }

            System.out.println("Final score:");
            System.out.println("You: " + userPoints + " | Computer: " + computerPoints);

            if (userPoints > computerPoints) {
                System.out.println("You won the match!");
            } else if (userPoints < computerPoints) {
                System.out.println("Computer won the match!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Play again? (yes or no)");
            String restart = scanner.nextLine().trim();
            playAgain = restart.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }
}