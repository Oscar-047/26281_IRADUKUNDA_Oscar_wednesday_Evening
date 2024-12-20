package Assignment1_on_exp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Questionn_one {
    public static void main(String[] args) {
        try {
            // Deliberately attempting to read a non-existent file to trigger IOException
            File file = new File("non_existent_file.txt");
            FileReader fr = new FileReader(file);

            // Close the file reader
            fr.close();
        } catch (IOException e) {
            // Handling the exception and printing a message
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
