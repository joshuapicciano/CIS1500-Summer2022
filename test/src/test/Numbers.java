package question17;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        int n = getUserN();
        int x = getUserX();
        int sumOfNumbersUpToNExceptMultiplesOfX = getSumOfNumbersUpToNExceptMultiplesOfX(n, x);

        }

        public static int getUserN(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What value would you like to calculate to?");
            int n = keyboard.nextInt();
            return n;
        }

        public static int getUserX(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What value do you want to ignore multiples of?");
            int x = keyboard.nextInt();
            return x;
        }

        public static int getSumOfNumbersUpToNExceptMultiplesOfX(int n, int x){

            int totalSum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % x != 0) {
                    totalSum += i;
                }
            }
            return totalSum;

        }
    }