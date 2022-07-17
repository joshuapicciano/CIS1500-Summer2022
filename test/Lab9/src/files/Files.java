package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files {

    public static void main(String[] args) {

        try {
            PrintWriter fileOutput = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("joshswishlist.txt")
                    )
            );

            fileOutput.println("Turbo Ford Mustang");
            fileOutput.println("Bench 225 lbs");
            fileOutput.println("Squat 315 lbs");
            fileOutput.println("Deadlift 405 lbs");
            fileOutput.println("Run sub 4.4s 40 yd dash");

            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);

        }
    }
}
