package Assignment1_on_exp;

import java.util.Scanner;

public class Questionn_nine {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input a value as a String
        System.out.println("Enter a value:");
        String userInput5 = scanner5.nextLine();

        // Storing the user input in an Object reference
        Object obj5 = userInput5;

        try {
            // Attempting to cast the String input to Integer to trigger ClassCastException
            Integer num5 = (Integer) obj5;
            System.out.println("The integer value is: " + num5);
        } catch (ClassCastException e) {
            // Handling the exception and printing a message
            System.out.println("Caught ClassCastException: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner5.close();
        }
    }
}
