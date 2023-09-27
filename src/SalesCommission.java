import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();

        System.out.print("Enter Seller's Name: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();

        double commission = 0.0;

        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: £" + salesAmount);
        System.out.println("Salary Basic: £" + salaryBasic);
        System.out.println("Sales Commission: £" + commission);

        scanner.close();
    }
}
