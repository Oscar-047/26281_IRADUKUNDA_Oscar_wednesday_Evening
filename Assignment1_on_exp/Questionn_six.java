package Assignment1_on_exp;

import java.util.Scanner;

public class Questionn_six {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input the first number
        System.out.println("Enter the first number:");
        int num15 = scanner5.nextInt();

        // Asking user to input the second number
        System.out.println("Enter the second number:");
        int num25 = scanner5.nextInt();

        try {
            // Attempting to divide the first number by the second number to trigger ArithmeticException
            int result5 = num15 / num25;
            System.out.println("The result of division is: " + result5);
        } catch (ArithmeticException e) {
            // Handling the exception and printing a message
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
