package lab3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);

        System.out.println("Please enter five numeric values");
        double firstUserValue = keyboard.nextDouble();
        double secondUserValue = keyboard.nextDouble();
        double thirdUserValue = keyboard.nextDouble();
        double fourthUserValue = keyboard.nextDouble();
        double fifthUserValue = keyboard.nextDouble();

        double maxOfFirstTwoValues = Math.max(firstUserValue, secondUserValue);
        double maxOfFirstThreeValues = Math.max(maxOfFirstTwoValues, thirdUserValue);
        double maxOfFirstFourValues = Math.max(maxOfFirstThreeValues, fourthUserValue);
        double maxUserValue = Math.max(maxOfFirstFourValues, fifthUserValue);

        double minOfFirstTwoValues = Math.min(firstUserValue, secondUserValue);
        double minOfFirstThreeValues = Math.min(minOfFirstTwoValues, thirdUserValue);
        double minOfFirstFourValues = Math.min(minOfFirstThreeValues, fourthUserValue);
        double minUserValue = Math.min(minOfFirstFourValues, fifthUserValue);

        double averageOfUserValues = (firstUserValue + secondUserValue + thirdUserValue + fourthUserValue + fifthUserValue) / 5;

        double standardDeviationOfUserValues =
                Math.sqrt((Math.pow(firstUserValue - averageOfUserValues, 2)
                            + Math.pow(secondUserValue - averageOfUserValues, 2)
                            + Math.pow(thirdUserValue - averageOfUserValues, 2)
                            + Math.pow(fourthUserValue - averageOfUserValues, 2)
                            + Math.pow(fifthUserValue - averageOfUserValues, 2))
                                                                            / 5);

        String maxUserValueToThousandths = numberFormat.format(maxUserValue);
        String minUserValueToThousandths = numberFormat.format(minUserValue);
        String averageOfUserValuesToThousandths = numberFormat.format(averageOfUserValues);
        String standardDeviationOfUserValuesToThousandths = numberFormat.format(standardDeviationOfUserValues);

        System.out.println("The largest number of your five numbers is " + maxUserValueToThousandths);
        System.out.println("The smallest number of your five numbers is " + minUserValueToThousandths);
        System.out.println("The average of your five numbers is " +averageOfUserValuesToThousandths);
        System.out.println("The standard deviation of your five numbers is " + standardDeviationOfUserValuesToThousandths);

    }
}
