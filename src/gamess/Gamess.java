
package gamess;

import java.util.Scanner;
import java.util.Random;

public class Gamess {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type 'exit' anytime to quit.\n");

        while (true) {
            System.out.print("Enter rock, paper, or scissors: ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("\nGame Over!");
                System.out.println("Your score: " + userScore);
                System.out.println("Computer score: " + computerScore);

                if (userScore > computerScore) {
                    System.out.println("🎉 You win overall!");
                } else if (userScore < computerScore) {
                    System.out.println("💻 Computer wins overall!");
                } else {
                    System.out.println("🤝 It's a tie overall!");
                }
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Try again.\n");
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!\n");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win this round!\n");
                userScore++;
            } else {
                System.out.println("Computer wins this round!\n");
                computerScore++;
            }
        }

        scanner.close();
    }
    
}
