package untitled;

import java.util.Scanner;

public class Untitled {

        public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double lowestScore = 999;
        int scoresEntered = 0;
        double score = 0;
        double totalScore = 0;

        String enterScore = "yes";
        while (enterScore.equalsIgnoreCase("yes")) {
            System.out.println("What test score would you like to enter?");
            score = keyboard.nextDouble();
            scoresEntered = scoresEntered + 1;
            totalScore = totalScore + score;

            if (score < lowestScore) {
                lowestScore = score;
            }

            System.out.println("Would you like to enter another score? (yes/no)");
            enterScore = keyboard.nextLine();
            while (!enterScore.equalsIgnoreCase("yes") &&
                    !enterScore.equalsIgnoreCase("no")) {
                enterScore = keyboard.nextLine();
            }
        }

        totalScore = totalScore - lowestScore;
        scoresEntered = scoresEntered - 1;

        double averageScoreExcludingLowest = totalScore / scoresEntered;

        System.out.println("Your test average excluding your lowest test score was " + averageScoreExcludingLowest);

    }
    }