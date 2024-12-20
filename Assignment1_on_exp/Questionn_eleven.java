package Assignment1_on_exp;

import java.util.Scanner;

public class Questionn_eleven {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input a string that will be converted to an integer
        System.out.println("Enter a number in string format:");
        String userInput5 = scanner5.nextLine();

        try {
            // Attempting to convert the string input to an integer to trigger NumberFormatException
            int number5 = Integer.parseInt(userInput5);
            System.out.println("The converted number is: " + number5);
        } catch (NumberFormatException e) {
            // Handling the exception and printing a message
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
