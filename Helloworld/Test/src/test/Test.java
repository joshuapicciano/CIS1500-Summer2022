package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

                double userGrossPay = 100;
                double userTaxes = 0.1 * userGrossPay;
                double userNetPay = userGrossPay - userTaxes;

        System.out.println("Your gross pay is: $" + userGrossPay);
        System.out.println("You owe S" + userTaxes + " in taxes");
        System.out.println("Your net pay for this week is $" + userNetPay);
    }

}
