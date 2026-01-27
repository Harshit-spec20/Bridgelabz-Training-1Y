// Program to calculate Body Mass Index (BMI) of a person
import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Take input for weight in kilograms
        double weightInKg = input.nextDouble();
        // Take input for height in centimeters
        double heightInCm = input.nextDouble();
        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;
        // Calculate BMI using formula BMI = weight / (height * height)
        double bmiValue = weightInKg / (heightInMeter * heightInMeter);
        // Display BMI value
        System.out.println("BMI = " + bmiValue);
        // Determine weight status based on BMI table
        if (bmiValue <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmiValue >= 25.0 && bmiValue <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
