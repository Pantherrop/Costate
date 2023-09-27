import java.util.Scanner;
public class PassFail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Student Details
        System.out.println("Please enter student name");
        String name = scanner.nextLine();
        System.out.println("Please enter roll number in digit");
        int rollnumber = scanner.nextInt();

        // Input marks fot three subjects
        System.out.println("Please enter Maths marks");
        int Maths = scanner.nextInt();
        System.out.println("Please enter Science marks");
        int Science = scanner.nextInt();
        System.out.println("Please enter English marks");
        int English = scanner.nextInt();

        // Calculate total Marks
        int totalMarks = Maths + Science + English;

        // Calculate percentage
        double percentage = (double) totalMarks / 300 * 100;

        // Pass or Fail
        String result;
        String grade;

        if (percentage >=35){
        result = "Pass" ;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60){
          grade = "A";
        } else if (percentage >= 50){
            grade = "B";
        } else{
            grade = "C";
        }
        }else {
            result = "Fail";
            grade = "F";
        }

        // Display student details and result
        System.out.println("\nStudent Details:");
        System.out.println("Name " + name);
        System.out.println("Roll Number"+" " + rollnumber);
        System.out.println("maths"+" " + Maths);
        System.out.println("science"+" "+ Science);
        System.out.println("english"+" " + English);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        scanner.close();

    }
}
