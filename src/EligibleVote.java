import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's age as an integer
        int age = scanner.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
