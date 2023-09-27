import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (a to f): ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a') {
            System.out.println("City name: amanda");
        } else if (alphabet == 'b') {
            System.out.println("City name: birmingham");
        } else if (alphabet == 'c') {
            System.out.println("City name: cardiff");
        } else if (alphabet == 'd') {
            System.out.println("City name: delhi");
        } else if (alphabet == 'e') {
            System.out.println("City name: edinburgh");
        } else if (alphabet == 'f') {
            System.out.println("City name: fanta");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from 'a' to 'f'.");
        }

        scanner.close();
    }
}
