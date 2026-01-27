import java.util.Scanner;
class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double number;
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        while (number != 0) {
            sum = sum + number;
			System.out.println("Total = " + sum);
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }
        
    }
}
