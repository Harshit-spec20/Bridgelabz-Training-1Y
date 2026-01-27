// Calculator program using switch-case
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
        double first = input.nextDouble();
		System.out.println("Enter second number: ");
        double second = input.nextDouble();
		System.out.println("Enter operator: ");
        String op = input.next();
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                System.out.println("Result = " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
