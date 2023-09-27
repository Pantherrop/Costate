import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0-6) to represent the day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayName;

        if (dayNumber == 0) {
            dayName = "Sunday";
        } else if (dayNumber == 1) {
            dayName = "Monday";
        } else if (dayNumber == 2) {
            dayName = "Tuesday";
        } else if (dayNumber == 3) {
            dayName = "Wednesday";
        } else if (dayNumber == 4) {
            dayName = "Thursday";
        } else if (dayNumber == 5) {
            dayName = "Friday";
        } else if (dayNumber == 6) {
            dayName = "Saturday";
        } else {
            dayName = "Invalid input. Please enter a number between 0 and 6.";
        }

        System.out.println("The day of the week is: " + dayName);

        scanner.close();
    }
}
