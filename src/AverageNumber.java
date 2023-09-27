import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the sum and average
        double sum = 0;
        double average;

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        // Calculate the average
        average = sum / 5;

        // Display the result
        System.out.println("The average of the five numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}
