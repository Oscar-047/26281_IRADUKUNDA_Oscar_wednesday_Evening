package Assignment1_on_exp;

import java.util.Scanner;

public class Questionn_ten {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input a positive number
        System.out.println("Enter a positive number:");
        int number5 = scanner5.nextInt();

        try {
            // Attempting to validate the user input by passing it to a method
            validatePositiveNumber5(number5);
            System.out.println("The entered number is valid.");
        } catch (IllegalArgumentException e) {
            // Handling the exception and printing a message
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }

    // Method to validate that the number is positive
    public static void validatePositiveNumber5(int number5) {
        if (number5 <= 0) {
            // Throwing IllegalArgumentException if the number is not positive
            throw new IllegalArgumentException("Number must be positive.");
        }
    }
}
