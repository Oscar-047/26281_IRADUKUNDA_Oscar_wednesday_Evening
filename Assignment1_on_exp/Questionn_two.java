package Assignment1_on_exp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Questionn_two {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input the file name
        System.out.println("Enter the file name to read:");
        String fileName5 = scanner5.nextLine();

        try {
            // Attempting to read the file provided by user input
            File file5 = new File(fileName5);
            FileReader fr5 = new FileReader(file5);

            // Close the file reader (added here to ensure the code is clean and no resource leaks)
            fr5.close();
        } catch (IOException e) {
            // Handling the exception and printing a message
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
