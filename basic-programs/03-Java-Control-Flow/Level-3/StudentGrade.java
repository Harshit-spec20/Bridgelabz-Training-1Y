// Program to calculate average marks, grade and remarks
import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);
        // Take marks input for three subjects
        double physicsMarks = input.nextDouble();
        double chemistryMarks = input.nextDouble();
        double mathsMarks = input.nextDouble();
        // Calculate total marks
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        // Calculate average (percentage)
        double averageMarks = totalMarks / 3;
        // Display average marks
        System.out.println("Average Marks = " + averageMarks);
        // Determine grade and remarks based on given table
        if (averageMarks >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (averageMarks >= 70 && averageMarks <= 79) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (averageMarks >= 60 && averageMarks <= 69) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below but approaching agency-normalized standards");
        } else if (averageMarks >= 50 && averageMarks <= 59) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (averageMarks >= 40 && averageMarks <= 49) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
    }
}
