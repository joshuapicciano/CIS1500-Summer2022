package lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userSelection = "";
        while ( !userSelection.equalsIgnoreCase("rock") &&
                !userSelection.equalsIgnoreCase("paper") &&
                !userSelection.equalsIgnoreCase("scissors") &&
                !userSelection.equalsIgnoreCase("lizard") &&
                !userSelection.equalsIgnoreCase("spock")) {
            System.out.println("Pick either rock, paper, scissors, lizard, or spock");
            userSelection = keyboard.nextLine();}

        int randomValue = (int)(Math.random() * 5);

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int lizard = 4;
        int spock = 5;

        String computerSelection;
        if (randomValue == 1){
            computerSelection = "rock";}
        else if (randomValue == 2){
            computerSelection = "paper";}
        else if (randomValue == 3){
            computerSelection = "scissors";}
        else if (randomValue == 4){
            computerSelection = "lizard";}
        else {computerSelection = "spock";}

        System.out.println("The computer chose " + computerSelection);

        String gameResult;
        if (userSelection.equalsIgnoreCase("rock") &&
                computerSelection.equalsIgnoreCase("rock")){
            gameResult = "You tied with the computer.";}
        else if (userSelection.equalsIgnoreCase("rock") &&
                (computerSelection.equalsIgnoreCase("scissors") ||
                computerSelection.equalsIgnoreCase("lizard"))){
            gameResult = "Congratulations! You won the game!";}
        else if (userSelection.equalsIgnoreCase("rock") &&
                (computerSelection.equalsIgnoreCase("paper") ||
                computerSelection.equalsIgnoreCase("spock"))){
            gameResult = "aaa";}
//        else if (userSelection.equalsIgnoreCase(""))



//        else {gameResult = "bbb";}

        System.out.println(" " + gameResult);




    }
}