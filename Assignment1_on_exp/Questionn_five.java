package Assignment1_on_exp;

public class Questionn_five {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that does not exist to trigger ClassNotFoundException
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Handling the exception and printing a message
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
