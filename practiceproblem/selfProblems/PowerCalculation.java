import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println("Result: " + result);

        sc.close();
    }
}
