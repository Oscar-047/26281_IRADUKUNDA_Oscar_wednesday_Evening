package Assignment1_on_exp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questionn_three{
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input the file name
        System.out.println("Enter the file name to read:");
        String fileName5 = scanner5.nextLine();

        try {
            // Attempting to read the file provided by user input
            File file5 = new File(fileName5);
            Scanner fileScanner5 = new Scanner(file5);

            while (true) {
                try {
                    // Reading lines from the file until no more lines are available
                    String line = fileScanner5.nextLine();
                    System.out.println(line);
                } catch (Exception e) {
                    // Handling the exception when reaching the end of file
                    System.out.println("Reached the end of the file unexpectedly: " + e.getMessage());
                    break;
                }
            }

            fileScanner5.close();
        } catch (FileNotFoundException e) {
            // Handling the exception when the file is not found
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
