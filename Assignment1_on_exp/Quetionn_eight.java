package Assignment1_on_exp;

import java.util.Scanner;

public class Quetionn_eight {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        // Asking user to input the size of the array
        System.out.println("Enter the size of the array:");
        int size5 = scanner5.nextInt();

        int[] array5 = new int[size5];

        // Populating the array with some values
        for (int i = 0; i < size5; i++) {
            array5[i] = i * 10;
        }

        // Asking user to input the index to access
        System.out.println("Enter the index to access:");
        int index5 = scanner5.nextInt();

        try {
            // Attempting to access the array at the specified index to trigger ArrayIndexOutOfBoundsException
            int value5 = array5[index5];
            System.out.println("The value at index " + index5 + " is: " + value5);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception and printing a message
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            scanner5.close();
        }
    }
}
