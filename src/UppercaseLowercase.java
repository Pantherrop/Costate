import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an uppercase alphabet
        System.out.print("Enter an uppercase alphabet: ");
        String uppercaseAlphabet = scanner.nextLine();

        // Convert it to lowercase
        String lowercaseAlphabet = uppercaseAlphabet.toLowerCase();

        // Print the lowercase alphabet
        System.out.println("Lowercase alphabet: " + lowercaseAlphabet);

        // Close the scanner
        scanner.close();
    }
}
