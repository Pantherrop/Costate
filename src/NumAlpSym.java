import java.util.Scanner;

public class NumAlpSym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                System.out.println("'" + ch + "' is a number (0-9).");
            } else if (Character.isLetter(ch)) {
                System.out.println("'" + ch + "' is an alphabet.");
            } else {
                System.out.println("'" + ch + "' is a symbol.");
            }
        }

        scanner.close();
    }
}
