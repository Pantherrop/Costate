import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        char userInput = scanner.next().charAt(0);

        if ((userInput >= 'a' && userInput <= 'z') || (userInput >= 'A' && userInput <= 'Z')) {
            // Check if the input is an alphabet character

            // Convert the character to lowercase to simplify vowel checking
            char lowercaseChar = Character.toLowerCase(userInput);

            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' ||
                    lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Input is not an alphabet character.");
        }

        scanner.close();
    }
}
