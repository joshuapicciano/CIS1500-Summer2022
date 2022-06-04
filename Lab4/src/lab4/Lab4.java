package lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

//        startGame(keyboard);

            String userSelection = "";
            while (!userSelection.equalsIgnoreCase("rock") &&
                    !userSelection.equalsIgnoreCase("paper") &&
                    !userSelection.equalsIgnoreCase("scissors") &&
                    !userSelection.equalsIgnoreCase("lizard") &&
                    !userSelection.equalsIgnoreCase("spock")) {
                System.out.println("Pick either rock, paper, scissors, lizard, or spock");
                userSelection = keyboard.nextLine();
            }

            int randomValue = (int) (Math.random() * 5);

            String computerSelection;
            if (randomValue == 1) {
                computerSelection = "rock";
            } else if (randomValue == 2) {
                computerSelection = "paper";
            } else if (randomValue == 3) {
                computerSelection = "scissors";
            } else if (randomValue == 4) {
                computerSelection = "lizard";
            } else {
                computerSelection = "spock";
            }

            System.out.println("The computer chose " + computerSelection);

            String gameResult;
            if ((userSelection.equalsIgnoreCase("rock") &&
                    (computerSelection.equalsIgnoreCase("scissors") ||
                            computerSelection.equalsIgnoreCase("lizard"))) ||

                    (userSelection.equalsIgnoreCase("paper") &&
                            (computerSelection.equalsIgnoreCase("rock") ||
                                    computerSelection.equalsIgnoreCase("spock"))) ||

                    (userSelection.equalsIgnoreCase("scissors") &&
                            (computerSelection.equalsIgnoreCase("paper") ||
                                    computerSelection.equalsIgnoreCase("lizard"))) ||

                    (userSelection.equalsIgnoreCase("lizard") &&
                            (computerSelection.equalsIgnoreCase("paper") ||
                                    computerSelection.equalsIgnoreCase("spock"))) ||

                    (userSelection.equalsIgnoreCase("spock") &&
                            (computerSelection.equalsIgnoreCase("rock") ||
                                    computerSelection.equalsIgnoreCase("scissors")))) {
                gameResult = "Congratulations! You won the game!";
            } else if ((userSelection.equalsIgnoreCase("rock") &&
                    (computerSelection.equalsIgnoreCase("paper") ||
                            computerSelection.equalsIgnoreCase("spock"))) ||

                    (userSelection.equalsIgnoreCase("paper") &&
                            (computerSelection.equalsIgnoreCase("scissors") ||
                                    computerSelection.equalsIgnoreCase("lizard"))) ||

                    (userSelection.equalsIgnoreCase("scissors") &&
                            (computerSelection.equalsIgnoreCase("rock") ||
                                    computerSelection.equalsIgnoreCase("spock"))) ||

                    (userSelection.equalsIgnoreCase("lizard") &&
                            (computerSelection.equalsIgnoreCase("rock") ||
                                    computerSelection.equalsIgnoreCase("scissors"))) ||

                    (userSelection.equalsIgnoreCase("spock") &&
                            (computerSelection.equalsIgnoreCase("paper") ||
                                    computerSelection.equalsIgnoreCase("lizard")))) {
                gameResult = "You lost! The computer has won the game!";
            } else {
                gameResult = "You tied with the computer!";
            }

            System.out.println(gameResult);
        }

        playAgain = "";
        while ( !playAgain.equalsIgnoreCase("y") &&
                !playAgain.equalsIgnoreCase("n"))
            {System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();}

//        if (playAgain.equalsIgnoreCase("y"))
//            {System.out.println();
//                startGame();}

//        else {System.out.println("Thanks for playing!");}

    }
}