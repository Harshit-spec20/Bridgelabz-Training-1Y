import java.util.Scanner;
class SumUntilZeroOrNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double number;
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        while (true) {
            if (number == 0) {
                break;
            }
            sum = sum + number;
            System.out.println("Total = " + sum);
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }
    }
}
