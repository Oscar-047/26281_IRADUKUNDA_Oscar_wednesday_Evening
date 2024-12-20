package Assignment1_on_exp;

import java.util.Scanner;

public class Questionn_seven {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user if they want to create a string (yes/no)
        System.out.println("Do you want to create a string? (yes/no):");
        String userInput5 = scanner5.nextLine();

        String str5 = null;
        if ("yes".equalsIgnoreCase(userInput5)) {
            str5 = "My name is Oscar";
        }

        try {
            // Attempting to access the length of the string which might be null to trigger NullPointerException
            System.out.println("The length of the string is: " + str5.length());
        } catch (NullPointerException e) {
            // Handling the exception and printing a message
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
