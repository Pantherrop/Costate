import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID in digit: ");
        int employeeId = input.nextInt();
        input.nextLine(); // Consume the newline character left in the buffer

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        // Calculate HRA, TA, DA, PF
        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;

        // Calculate Gross Salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Display the results
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);

        // Close the scanner
        input.close();
    }
}

